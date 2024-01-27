package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor */
class h {

    /* compiled from: RequestExecutor */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f2445a;

        /* renamed from: b  reason: collision with root package name */
        private int f2446b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* compiled from: RequestExecutor */
        private static class C0037a extends Thread {

            /* renamed from: h  reason: collision with root package name */
            private final int f2447h;

            C0037a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f2447h = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f2447h);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f2445a = str;
            this.f2446b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0037a(runnable, this.f2445a, this.f2446b);
        }
    }

    /* compiled from: RequestExecutor */
    private static class b<T> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private Callable<T> f2448h;

        /* renamed from: i  reason: collision with root package name */
        private androidx.core.util.a<T> f2449i;

        /* renamed from: j  reason: collision with root package name */
        private Handler f2450j;

        /* compiled from: RequestExecutor */
        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f2451h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Object f2452i;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2451h = aVar;
                this.f2452i = obj;
            }

            public void run() {
                this.f2451h.accept(this.f2452i);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f2448h = callable;
            this.f2449i = aVar;
            this.f2450j = handler;
        }

        public void run() {
            T t10;
            try {
                t10 = this.f2448h.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f2450j.post(new a(this.f2449i, t10));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
