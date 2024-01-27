package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.RemoteMessage;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class FlutterFirebaseMessagingBackgroundExecutor implements MethodChannel.MethodCallHandler {
    private static final String CALLBACK_HANDLE_KEY = "callback_handle";
    private static final String TAG = "FLTFireBGExecutor";
    private static final String USER_CALLBACK_HANDLE_KEY = "user_callback_handle";
    private MethodChannel backgroundChannel;
    private FlutterEngine backgroundFlutterEngine;
    private final AtomicBoolean isCallbackDispatcherReady = new AtomicBoolean(false);

    private long getPluginCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(CALLBACK_HANDLE_KEY, 0);
    }

    /* access modifiers changed from: private */
    public long getUserCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(USER_CALLBACK_HANDLE_KEY, 0);
    }

    private void initializeMethodChannel(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging_background");
        this.backgroundChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startBackgroundIsolate$0(FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j10) {
        String findAppBundlePath = flutterLoader.findAppBundlePath();
        AssetManager assets = ContextHolder.getApplicationContext().getAssets();
        if (isNotRunning()) {
            if (flutterShellArgs != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Creating background FlutterEngine instance, with args: ");
                sb.append(Arrays.toString(flutterShellArgs.toArray()));
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext(), flutterShellArgs.toArray());
            } else {
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
            DartExecutor dartExecutor = this.backgroundFlutterEngine.getDartExecutor();
            initializeMethodChannel(dartExecutor);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startBackgroundIsolate$1(FlutterLoader flutterLoader, Handler handler, FlutterShellArgs flutterShellArgs, long j10) {
        flutterLoader.startInitialization(ContextHolder.getApplicationContext());
        flutterLoader.ensureInitializationCompleteAsync(ContextHolder.getApplicationContext(), (String[]) null, handler, new b(this, flutterLoader, flutterShellArgs, j10));
    }

    private void onInitialized() {
        this.isCallbackDispatcherReady.set(true);
        FlutterFirebaseMessagingBackgroundService.onInitialized();
    }

    public static void setCallbackDispatcher(long j10) {
        ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(CALLBACK_HANDLE_KEY, j10).apply();
    }

    public static void setUserCallbackHandle(long j10) {
        ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(USER_CALLBACK_HANDLE_KEY, j10).apply();
    }

    public void executeDartCallbackInBackgroundIsolate(Intent intent, final CountDownLatch countDownLatch) {
        if (this.backgroundFlutterEngine != null) {
            AnonymousClass1 r02 = null;
            if (countDownLatch != null) {
                r02 = new MethodChannel.Result() {
                    public void error(String str, String str2, Object obj) {
                        countDownLatch.countDown();
                    }

                    public void notImplemented() {
                        countDownLatch.countDown();
                    }

                    public void success(Object obj) {
                        countDownLatch.countDown();
                    }
                };
            }
            RemoteMessage remoteMessage = (RemoteMessage) intent.getParcelableExtra("notification");
            if (remoteMessage != null) {
                this.backgroundChannel.invokeMethod("MessagingBackground#onMessage", new HashMap<String, Object>(FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessage)) {
                    final /* synthetic */ Map val$remoteMessageMap;

                    {
                        this.val$remoteMessageMap = r4;
                        put("userCallbackHandle", Long.valueOf(FlutterFirebaseMessagingBackgroundExecutor.this.getUserCallbackHandle()));
                        put("message", r4);
                    }
                }, r02);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isDartBackgroundHandlerRegistered() {
        return getPluginCallbackHandle() != 0;
    }

    public boolean isNotRunning() {
        return !this.isCallbackDispatcherReady.get();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (methodCall.method.equals("MessagingBackground#initialized")) {
                onInitialized();
                result.success(Boolean.TRUE);
                return;
            }
            result.notImplemented();
        } catch (PluginRegistrantException e10) {
            result.error("error", "Flutter FCM error: " + e10.getMessage(), (Object) null);
        }
    }

    public void startBackgroundIsolate() {
        if (isNotRunning()) {
            long pluginCallbackHandle = getPluginCallbackHandle();
            if (pluginCallbackHandle != 0) {
                startBackgroundIsolate(pluginCallbackHandle, (FlutterShellArgs) null);
            }
        }
    }

    public void startBackgroundIsolate(long j10, FlutterShellArgs flutterShellArgs) {
        if (this.backgroundFlutterEngine == null) {
            FlutterLoader flutterLoader = new FlutterLoader();
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new a(this, flutterLoader, handler, flutterShellArgs, j10));
        }
    }
}
