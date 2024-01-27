package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PlatformViewsController implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController";
    /* access modifiers changed from: private */
    public static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {SurfaceView.class};
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private AndroidTouchProcessor androidTouchProcessor;
    private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new PlatformViewsChannel.PlatformViewsHandler() {
        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$resize$0(VirtualDisplayController virtualDisplayController, float f10, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            PlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            if (PlatformViewsController.this.context != null) {
                f10 = PlatformViewsController.this.getDisplayDensity();
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels((double) virtualDisplayController.getBufferWidth(), f10), PlatformViewsController.this.toLogicalPixels((double) virtualDisplayController.getBufferHeight(), f10)));
        }

        public void clearFocus(int i10) {
            View view;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
            } else {
                PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
                if (platformView == null) {
                    Log.e(PlatformViewsController.TAG, "Clearing focus on an unknown view with id: " + i10);
                    return;
                }
                view = platformView.getView();
            }
            if (view == null) {
                Log.e(PlatformViewsController.TAG, "Clearing focus on a null view with id: " + i10);
                return;
            }
            view.clearFocus();
        }

        @TargetApi(19)
        public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController.this.enforceMinimumAndroidApiVersion(19);
            PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            PlatformViewsController.this.configureForHybridComposition(PlatformViewsController.this.createPlatformView(platformViewCreationRequest, false), platformViewCreationRequest);
        }

        @TargetApi(20)
        public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            int i10 = platformViewCreationRequest.viewId;
            if (PlatformViewsController.this.viewWrappers.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            } else if (PlatformViewsController.this.textureRegistry == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            } else if (PlatformViewsController.this.flutterView != null) {
                boolean z10 = true;
                PlatformView createPlatformView = PlatformViewsController.this.createPlatformView(platformViewCreationRequest, true);
                View view = createPlatformView.getView();
                if (view.getParent() == null) {
                    if (Build.VERSION.SDK_INT < 23 || ViewUtils.hasChildViewOfType(view, PlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY)) {
                        z10 = false;
                    }
                    if (!z10) {
                        if (platformViewCreationRequest.displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                            PlatformViewsController.this.configureForHybridComposition(createPlatformView, platformViewCreationRequest);
                            return -2;
                        } else if (!PlatformViewsController.this.usesSoftwareRendering) {
                            return PlatformViewsController.this.configureForVirtualDisplay(createPlatformView, platformViewCreationRequest);
                        }
                    }
                    return PlatformViewsController.this.configureForTextureLayerComposition(createPlatformView, platformViewCreationRequest);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            }
        }

        public void dispose(int i10) {
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Disposing unknown platform view with id: " + i10);
                return;
            }
            PlatformViewsController.this.platformViews.remove(i10);
            try {
                platformView.dispose();
            } catch (RuntimeException e10) {
                Log.e(PlatformViewsController.TAG, "Disposing platform view threw an exception", e10);
            }
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                View view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
                if (view != null) {
                    PlatformViewsController.this.contextToEmbeddedView.remove(view.getContext());
                }
                PlatformViewsController.this.vdControllers.remove(Integer.valueOf(i10));
                return;
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(platformViewWrapper);
                }
                PlatformViewsController.this.viewWrappers.remove(i10);
                return;
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController.this.platformViewParent.get(i10);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController.this.platformViewParent.remove(i10);
            }
        }

        public void offset(int i10, double d10, double d11) {
            if (!PlatformViewsController.this.usesVirtualDisplay(i10)) {
                PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
                if (platformViewWrapper == null) {
                    Log.e(PlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i10);
                    return;
                }
                int access$1200 = PlatformViewsController.this.toPhysicalPixels(d10);
                int access$12002 = PlatformViewsController.this.toPhysicalPixels(d11);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
                layoutParams.topMargin = access$1200;
                layoutParams.leftMargin = access$12002;
                platformViewWrapper.setLayoutParams(layoutParams);
            }
        }

        public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i10 = platformViewTouch.viewId;
            float f10 = PlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f10, platformViewTouch, true));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                Log.e(PlatformViewsController.TAG, "Sending touch to a null view with id: " + i10);
                return;
            }
            view.dispatchTouchEvent(PlatformViewsController.this.toMotionEvent(f10, platformViewTouch, false));
        }

        public void resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            int access$1200 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int access$12002 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            int i10 = platformViewResizeRequest.viewId;
            if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                float access$1300 = PlatformViewsController.this.getDisplayDensity();
                VirtualDisplayController virtualDisplayController = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10));
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(access$1200, access$12002, new h(this, virtualDisplayController, access$1300, platformViewBufferResized));
                return;
            }
            PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) PlatformViewsController.this.viewWrappers.get(i10);
            if (platformView == null || platformViewWrapper == null) {
                Log.e(PlatformViewsController.TAG, "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (access$1200 > platformViewWrapper.getBufferWidth() || access$12002 > platformViewWrapper.getBufferHeight()) {
                platformViewWrapper.setBufferSize(access$1200, access$12002);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = access$1200;
            layoutParams.height = access$12002;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = platformView.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = access$1200;
                layoutParams2.height = access$12002;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferWidth()), PlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferHeight())));
        }

        @TargetApi(17)
        public void setDirection(int i10, int i11) {
            View view;
            if (PlatformViewsController.validateDirection(i11)) {
                if (PlatformViewsController.this.usesVirtualDisplay(i10)) {
                    view = PlatformViewsController.this.vdControllers.get(Integer.valueOf(i10)).getView();
                } else {
                    PlatformView platformView = (PlatformView) PlatformViewsController.this.platformViews.get(i10);
                    if (platformView == null) {
                        Log.e(PlatformViewsController.TAG, "Setting direction to an unknown view with id: " + i10);
                        return;
                    }
                    view = platformView.getView();
                }
                if (view == null) {
                    Log.e(PlatformViewsController.TAG, "Setting direction to a null view with id: " + i10);
                    return;
                }
                view.setLayoutDirection(i11);
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
        }

        public void synchronizeToNativeViewHierarchy(boolean z10) {
            boolean unused = PlatformViewsController.this.synchronizeToNativeViewHierarchy = z10;
        }
    };
    /* access modifiers changed from: private */
    public Context context;
    final HashMap<Context, View> contextToEmbeddedView = new HashMap<>();
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    /* access modifiers changed from: private */
    public FlutterView flutterView;
    private boolean flutterViewConvertedToImageView = false;
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();
    private int nextOverlayLayerId = 0;
    private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private PlatformViewsChannel platformViewsChannel;
    private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    /* access modifiers changed from: private */
    public boolean synchronizeToNativeViewHierarchy = true;
    private TextInputPlugin textInputPlugin;
    /* access modifiers changed from: private */
    public TextureRegistry textureRegistry;
    /* access modifiers changed from: private */
    public boolean usesSoftwareRendering = false;
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap<>();
    /* access modifiers changed from: private */
    public final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();

    /* access modifiers changed from: private */
    public void configureForHybridComposition(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(19);
        Log.i(TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.viewId);
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    public long configureForTextureLayerComposition(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        long j10;
        PlatformViewWrapper platformViewWrapper;
        enforceMinimumAndroidApiVersion(23);
        Log.i(TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.viewId);
        int physicalPixels = toPhysicalPixels(platformViewCreationRequest.logicalWidth);
        int physicalPixels2 = toPhysicalPixels(platformViewCreationRequest.logicalHeight);
        if (this.usesSoftwareRendering) {
            platformViewWrapper = new PlatformViewWrapper(this.context);
            j10 = -1;
        } else {
            TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.textureRegistry.createSurfaceTexture();
            PlatformViewWrapper platformViewWrapper2 = new PlatformViewWrapper(this.context, createSurfaceTexture);
            long id = createSurfaceTexture.id();
            platformViewWrapper = platformViewWrapper2;
            j10 = id;
        }
        platformViewWrapper.setTouchProcessor(this.androidTouchProcessor);
        platformViewWrapper.setBufferSize(physicalPixels, physicalPixels2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
        int physicalPixels3 = toPhysicalPixels(platformViewCreationRequest.logicalTop);
        int physicalPixels4 = toPhysicalPixels(platformViewCreationRequest.logicalLeft);
        layoutParams.topMargin = physicalPixels3;
        layoutParams.leftMargin = physicalPixels4;
        platformViewWrapper.setLayoutParams(layoutParams);
        View view = platformView.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
        view.setImportantForAccessibility(4);
        platformViewWrapper.addView(view);
        platformViewWrapper.setOnDescendantFocusChangeListener(new f(this, platformViewCreationRequest));
        this.flutterView.addView(platformViewWrapper);
        this.viewWrappers.append(platformViewCreationRequest.viewId, platformViewWrapper);
        maybeInvokeOnFlutterViewAttached(platformView);
        return j10;
    }

    /* access modifiers changed from: private */
    public long configureForVirtualDisplay(PlatformView platformView, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(20);
        Log.i(TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.viewId);
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.textureRegistry.createSurfaceTexture();
        PlatformView platformView2 = platformView;
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = createSurfaceTexture;
        VirtualDisplayController create = VirtualDisplayController.create(this.context, this.accessibilityEventsDelegate, platformView2, surfaceTextureEntry, toPhysicalPixels(platformViewCreationRequest.logicalWidth), toPhysicalPixels(platformViewCreationRequest.logicalHeight), platformViewCreationRequest.viewId, (Object) null, new e(this, platformViewCreationRequest));
        if (create != null) {
            this.vdControllers.put(Integer.valueOf(platformViewCreationRequest.viewId), create);
            View view = platformView.getView();
            this.contextToEmbeddedView.put(view.getContext(), view);
            return createSurfaceTexture.id();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    /* access modifiers changed from: private */
    public void enforceMinimumAndroidApiVersion(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10) {
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }
    }

    /* access modifiers changed from: private */
    public void ensureValidRequest(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        if (!validateDirection(platformViewCreationRequest.direction)) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + platformViewCreationRequest.viewId + ")");
        }
    }

    private void finishFrame(boolean z10) {
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            int keyAt = this.overlayLayerViews.keyAt(i10);
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i10);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(keyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(valueAt);
                z10 &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
                this.flutterView.removeView(valueAt);
            }
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            int keyAt2 = this.platformViewParent.keyAt(i11);
            View view = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(keyAt2)) || (!z10 && this.synchronizeToNativeViewHierarchy)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (this.synchronizeToNativeViewHierarchy && !this.flutterViewConvertedToImageView) {
            this.flutterView.convertToImageView();
            this.flutterViewConvertedToImageView = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$configureForTextureLayerComposition$1(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z10) {
        if (z10) {
            this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            return;
        }
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.clearPlatformViewClient(platformViewCreationRequest.viewId);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$configureForVirtualDisplay$0(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean z10) {
        if (z10) {
            this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$2(int i10, View view, boolean z10) {
        if (z10) {
            this.platformViewsChannel.invokeViewFocused(i10);
            return;
        }
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.clearPlatformViewClient(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onEndFrame$3() {
        finishFrame(false);
    }

    /* access modifiers changed from: private */
    public void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.lockPlatformViewInputConnection();
            virtualDisplayController.onInputConnectionLocked();
        }
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 == null) {
            Log.i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView2);
        }
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerCoords : (List) obj) {
            arrayList.add(parsePointerCoords(parsePointerCoords, f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerProperties : (List) obj) {
            arrayList.add(parsePointerProperties(parsePointerProperties));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i10));
        }
        this.overlayLayerViews.clear();
    }

    /* access modifiers changed from: private */
    public int toLogicalPixels(double d10, float f10) {
        return (int) Math.round(d10 / ((double) f10));
    }

    /* access modifiers changed from: private */
    public int toPhysicalPixels(double d10) {
        return (int) Math.round(d10 * ((double) getDisplayDensity()));
    }

    /* access modifiers changed from: private */
    public void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.unlockPlatformViewInputConnection();
            virtualDisplayController.onInputConnectionUnlocked();
        }
    }

    /* access modifiers changed from: private */
    public static boolean validateDirection(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void attach(Context context2, TextureRegistry textureRegistry2, DartExecutor dartExecutor) {
        if (this.context == null) {
            this.context = context2;
            this.textureRegistry = textureRegistry2;
            PlatformViewsChannel platformViewsChannel2 = new PlatformViewsChannel(dartExecutor);
            this.platformViewsChannel = platformViewsChannel2;
            platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin2) {
        this.textInputPlugin = textInputPlugin2;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView2) {
        this.flutterView = flutterView2;
        for (int i10 = 0; i10 < this.viewWrappers.size(); i10++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewAttached(this.flutterView);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface createOverlaySurface(PlatformOverlayView platformOverlayView) {
        int i10 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i10 + 1;
        this.overlayLayerViews.put(i10, platformOverlayView);
        return new FlutterOverlaySurface(i10, platformOverlayView.getSurface());
    }

    @TargetApi(19)
    public PlatformView createPlatformView(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z10) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory != null) {
            Object obj = null;
            if (platformViewCreationRequest.params != null) {
                obj = factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
            }
            PlatformView create = factory.create(z10 ? new MutableContextWrapper(this.context) : this.context, platformViewCreationRequest.viewId, obj);
            View view = create.getView();
            if (view != null) {
                view.setLayoutDirection(platformViewCreationRequest.direction);
                this.platformViews.put(platformViewCreationRequest.viewId, create);
                maybeInvokeOnFlutterViewAttached(create);
                return create;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
    }

    public void destroyOverlaySurfaces() {
        for (int i10 = 0; i10 < this.overlayLayerViews.size(); i10++) {
            PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i10);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void detach() {
        PlatformViewsChannel platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler((PlatformViewsChannel.PlatformViewsHandler) null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge((AccessibilityBridge) null);
    }

    public void detachFromView() {
        for (int i10 = 0; i10 < this.viewWrappers.size(); i10++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViewParent.size(); i11++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i11));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i12 = 0; i12 < this.platformViews.size(); i12++) {
            this.platformViews.valueAt(i12).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i10) {
        this.channelHandler.dispose(i10);
    }

    public SparseArray<PlatformOverlayView> getOverlayLayerViews() {
        return this.overlayLayerViews;
    }

    public View getPlatformViewById(int i10) {
        if (usesVirtualDisplay(i10)) {
            return this.vdControllers.get(Integer.valueOf(i10)).getView();
        }
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(19)
    public void initializePlatformViewIfNeeded(int i10) {
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.platformViewParent.get(i10) == null) {
            View view = platformView.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (view.getParent() == null) {
                Context context2 = this.context;
                FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context2, context2.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
                flutterMutatorView.setOnDescendantFocusChangeListener(new d(this, i10));
                this.platformViewParent.put(i10, flutterMutatorView);
                view.setImportantForAccessibility(4);
                flutterMutatorView.addView(view);
                this.flutterView.addView(flutterMutatorView);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void onAttachedToJNI() {
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        if (this.overlayLayerViews.get(i10) != null) {
            initializeRootImageViewIfNeeded();
            PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i10);
            if (platformOverlayView.getParent() == null) {
                this.flutterView.addView(platformOverlayView);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i12;
            platformOverlayView.setLayoutParams(layoutParams);
            platformOverlayView.setVisibility(0);
            platformOverlayView.bringToFront();
            this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
    }

    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        initializePlatformViewIfNeeded(i10);
        FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i10);
        flutterMutatorView.readyToDisplay(flutterMutatorsStack, i11, i12, i13, i14);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View view = this.platformViews.get(i10).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i10));
    }

    public void onEndFrame() {
        boolean z10 = false;
        if (!this.flutterViewConvertedToImageView || !this.currentFrameUsedPlatformViewIds.isEmpty()) {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z10 = true;
            }
            finishFrame(z10);
            return;
        }
        this.flutterViewConvertedToImageView = false;
        this.flutterView.revertImageView(new g(this));
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setSoftwareRendering(boolean z10) {
        this.usesSoftwareRendering = z10;
    }

    public MotionEvent toMotionEvent(float f10, PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z10) {
        PlatformViewsChannel.PlatformViewTouch platformViewTouch2 = platformViewTouch;
        MotionEvent pop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch2.motionEventId));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch2.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch2.pointerCount]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch2.rawPointerCoords, f10).toArray(new MotionEvent.PointerCoords[platformViewTouch2.pointerCount]);
        if (!z10 && pop != null) {
            return MotionEvent.obtain(pop.getDownTime(), pop.getEventTime(), platformViewTouch2.action, platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, pop.getMetaState(), pop.getButtonState(), pop.getXPrecision(), pop.getYPrecision(), pop.getDeviceId(), pop.getEdgeFlags(), pop.getSource(), pop.getFlags());
        }
        return MotionEvent.obtain(platformViewTouch2.downTime.longValue(), platformViewTouch2.eventTime.longValue(), platformViewTouch2.action, platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, platformViewTouch2.metaState, platformViewTouch2.buttonState, platformViewTouch2.xPrecision, platformViewTouch2.yPrecision, platformViewTouch2.deviceId, platformViewTouch2.edgeFlags, platformViewTouch2.source, platformViewTouch2.flags);
    }

    public boolean usesVirtualDisplay(int i10) {
        return this.vdControllers.containsKey(Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public int toLogicalPixels(double d10) {
        return toLogicalPixels(d10, getDisplayDensity());
    }

    @TargetApi(19)
    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
    }
}
