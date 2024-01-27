package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.Preconditions;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private AccessibilityDelegate accessibilityDelegate;
    private DeferredComponentManager deferredComponentManager;
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private LocalizationPlugin localizationPlugin;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private PlatformMessageHandler platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr);

        void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);
    }

    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j10);
    }

    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j10) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 != null) {
            asyncWaitForVsyncDelegate2.asyncWaitForVsync(j10);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new a(j10));
            } catch (IOException e10) {
                Log.e(TAG, "Failed to decode image", e10);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i10, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler2 = this.platformMessageHandler;
        if (platformMessageHandler2 != null) {
            platformMessageHandler2.handlePlatformMessageResponse(i10, byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j10, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j10, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j10);

    private native void nativeDeferredComponentInstallFailure(int i10, String str, boolean z10);

    private native void nativeDestroy(long j10);

    private native void nativeDispatchEmptyPlatformMessage(long j10, String str, int i10);

    private native void nativeDispatchPlatformMessage(long j10, String str, ByteBuffer byteBuffer, int i10, int i11);

    private native void nativeDispatchPointerDataPacket(long j10, ByteBuffer byteBuffer, int i10);

    private native void nativeDispatchSemanticsAction(long j10, int i10, int i11, ByteBuffer byteBuffer, int i12);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i10);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i10);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i10);

    private native Bitmap nativeGetBitmap(long j10);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j10, int i10, int i11);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j10);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j10, int i10);

    private native void nativeInvokePlatformMessageResponseCallback(long j10, int i10, ByteBuffer byteBuffer, int i11);

    private native void nativeLoadDartDeferredLibrary(long j10, int i10, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j10);

    private native void nativeMarkTextureFrameAvailable(long j10, long j11);

    private native void nativeNotifyLowMemoryWarning(long j10);

    private native void nativeOnVsync(long j10, long j11, long j12);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterTexture(long j10, long j11, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j10, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeSetAccessibilityFeatures(long j10, int i10);

    private native void nativeSetSemanticsEnabled(long j10, boolean z10);

    private native void nativeSetViewportMetrics(long j10, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j10, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j10, int i10, int i11);

    private native void nativeSurfaceCreated(long j10, Surface surface);

    private native void nativeSurfaceDestroyed(long j10);

    private native void nativeSurfaceWindowChanged(long j10, Surface surface);

    private native void nativeUnregisterTexture(long j10, long j11);

    private native void nativeUpdateDisplayMetrics(long j10);

    private native void nativeUpdateJavaAssetManager(long j10, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        for (FlutterEngine.EngineLifecycleListener onPreEngineRestart : this.engineLifecycleListeners) {
            onPreEngineRestart.onPreEngineRestart();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate2 = this.accessibilityDelegate;
        if (accessibilityDelegate2 != null) {
            accessibilityDelegate2.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate2 = this.accessibilityDelegate;
        if (accessibilityDelegate2 != null) {
            accessibilityDelegate2.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j10) {
        nativeCleanupMessageData(j10);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10 += 3) {
            String str = strArr[i10 + 0];
            String str2 = strArr[i10 + 1];
            String str3 = strArr[i10 + 2];
            if (Build.VERSION.SDK_INT >= 21) {
                Locale.Builder builder = new Locale.Builder();
                if (!str.isEmpty()) {
                    builder.setLanguage(str);
                }
                if (!str2.isEmpty()) {
                    builder.setRegion(str2);
                }
                if (!str3.isEmpty()) {
                    builder.setScript(str3);
                }
                arrayList.add(builder.build());
            } else {
                arrayList.add(new Locale(str, str2));
            }
        }
        Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        if (resolveNativeLocale == null) {
            return new String[0];
        }
        String[] strArr2 = new String[3];
        strArr2[0] = resolveNativeLocale.getLanguage();
        strArr2[1] = resolveNativeLocale.getCountry();
        if (Build.VERSION.SDK_INT >= 21) {
            strArr2[2] = resolveNativeLocale.getScript();
        } else {
            strArr2[2] = "";
        }
        return strArr2;
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i10, String str, boolean z10) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i10, str, z10);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.destroyOverlaySurfaces();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i10);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i10);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i10, int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i10, i11);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i11);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i10, action, (Object) null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i10, long j10) {
        PlatformMessageHandler platformMessageHandler2 = this.platformMessageHandler;
        if (platformMessageHandler2 != null) {
            platformMessageHandler2.handleMessageFromDart(str, byteBuffer, i10, j10);
        } else {
            nativeCleanupMessageData(j10);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j10) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j10);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i10) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i10);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i10, byteBuffer, i11);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
                }
            } finally {
                this.shellHolderLock.readLock().unlock();
            }
        } else {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i10) {
        return nativeFlutterTextUtilsIsEmoji(i10);
    }

    public boolean isCodePointEmojiModifier(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifier(i10);
    }

    public boolean isCodePointEmojiModifierBase(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i10);
    }

    public boolean isCodePointRegionalIndicator(int i10) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i10);
    }

    public boolean isCodePointVariantSelector(int i10) {
        return nativeFlutterTextUtilsIsVariationSelector(i10);
    }

    public void loadDartDeferredLibrary(int i10, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i10, strArr);
    }

    public void loadLibrary() {
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        System.loadLibrary("flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j10);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onBeginFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayOverlaySurface(i10, i11, i12, i13, i14);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayPlatformView(i10, i11, i12, i13, i14, i15, i16, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onEndFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener onFlutterUiDisplayed : this.flutterUiDisplayListeners) {
            onFlutterUiDisplayed.onFlutterUiDisplayed();
        }
    }

    /* access modifiers changed from: package-private */
    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : this.flutterUiDisplayListeners) {
            onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i10, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i10, i11);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j10, long j11, long j12) {
        nativeOnVsync(j10, j11, j12);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerTexture(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void requestDartDeferredLibrary(int i10) {
        DeferredComponentManager deferredComponentManager2 = this.deferredComponentManager;
        if (deferredComponentManager2 != null) {
            deferredComponentManager2.installDeferredComponent(i10, (String) null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate2) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate2;
    }

    public void setAccessibilityFeatures(int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i10);
    }

    public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager2) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager2;
        if (deferredComponentManager2 != null) {
            deferredComponentManager2.setJNI(this);
        }
    }

    public void setLocalizationPlugin(LocalizationPlugin localizationPlugin2) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin2;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler2) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler2;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController2;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z10);
    }

    public void setViewportMetrics(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l10 = nativeSpawn.nativeShellHolderId;
        Preconditions.checkState((l10 == null || l10.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void unregisterTexture(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j10);
    }

    public void updateDisplayMetrics(int i10, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i11;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i11 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i11 = 0;
        }
        dispatchSemanticsAction(i10, action.value, byteBuffer, i11);
    }

    public void dispatchSemanticsAction(int i10, int i11, ByteBuffer byteBuffer, int i12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i10, i11, byteBuffer, i12);
    }
}
