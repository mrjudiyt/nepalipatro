package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AndroidExecutors.kt */
public final class AndroidExecutors {
    /* access modifiers changed from: private */
    public static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final AndroidExecutors INSTANCE = new AndroidExecutors();
    private static final long KEEP_ALIVE_TIME = 1;
    /* access modifiers changed from: private */
    public static final int MAX_POOL_SIZE;
    /* access modifiers changed from: private */
    public final Executor uiThread = new UIThreadExecutor();

    /* compiled from: AndroidExecutors.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.CORE_POOL_SIZE, AndroidExecutors.MAX_POOL_SIZE, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        public final Executor uiThread() {
            return AndroidExecutors.INSTANCE.uiThread;
        }
    }

    /* compiled from: AndroidExecutors.kt */
    private static final class UIThreadExecutor implements Executor {
        public void execute(Runnable runnable) {
            m.f(runnable, "command");
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAX_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    public static final ExecutorService newCachedThreadPool() {
        return Companion.newCachedThreadPool();
    }

    public static final Executor uiThread() {
        return Companion.uiThread();
    }
}
