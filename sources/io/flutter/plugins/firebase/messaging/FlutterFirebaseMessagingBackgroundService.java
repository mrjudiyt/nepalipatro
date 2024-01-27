package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.firebase.messaging.RemoteMessage;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public class FlutterFirebaseMessagingBackgroundService extends JobIntentService {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "FLTFireMsgService";
    private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
    private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());

    static {
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
    }

    public static void enqueueMessageProcessing(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        Bundle bundle = extras;
        Class<FlutterFirebaseMessagingBackgroundService> cls = FlutterFirebaseMessagingBackgroundService.class;
        boolean z10 = true;
        if (((RemoteMessage) extras.get("notification")).getOriginalPriority() != 1) {
            z10 = false;
        }
        JobIntentService.enqueueWork(context, (Class) cls, 2020, intent, z10);
    }

    static void onInitialized() {
        List<Intent> list = messagingQueue;
        synchronized (list) {
            for (Intent executeDartCallbackInBackgroundIsolate : list) {
                flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(executeDartCallbackInBackgroundIsolate, (CountDownLatch) null);
            }
            messagingQueue.clear();
        }
    }

    public static void setCallbackDispatcher(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(j10);
    }

    public static void setUserCallbackHandle(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(j10);
    }

    public static void startBackgroundIsolate(long j10, FlutterShellArgs flutterShellArgs) {
        if (flutterBackgroundExecutor == null) {
            FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
            flutterBackgroundExecutor = flutterFirebaseMessagingBackgroundExecutor;
            flutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(j10, flutterShellArgs);
        }
    }

    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (flutterBackgroundExecutor == null) {
            flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        }
        flutterBackgroundExecutor.startBackgroundIsolate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        if (flutterBackgroundExecutor.isDartBackgroundHandlerRegistered()) {
            List<Intent> list = messagingQueue;
            synchronized (list) {
                if (flutterBackgroundExecutor.isNotRunning()) {
                    list.add(intent);
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new c(intent, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z10) {
        super.setInterruptIfStopped(z10);
    }
}
