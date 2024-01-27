package io.flutter.plugins.googlesignin;

import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.h;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class BackgroundTaskRunner {
    private final ThreadPoolExecutor executor;

    public interface Callback<T> {
        void run(Future<T> future);
    }

    public BackgroundTaskRunner(int i10) {
        int i11 = i10;
        int i12 = i10;
        this.executor = new ThreadPoolExecutor(i11, i12, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public <T> void runInBackground(Callable<T> callable, final Callback<T> callback) {
        final e<T> runInBackground = runInBackground(callable);
        runInBackground.addListener(new Runnable() {
            public void run() {
                callback.run(runInBackground);
            }
        }, Executors.uiThreadExecutor());
    }

    public <T> e<T> runInBackground(final Callable<T> callable) {
        final h C = h.C();
        this.executor.execute(new Runnable() {
            public void run() {
                if (!C.isCancelled()) {
                    try {
                        C.A(callable.call());
                    } catch (Throwable th) {
                        C.B(th);
                    }
                }
            }
        });
        return C;
    }
}
