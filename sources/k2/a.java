package k2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: GlideExecutor */
public final class a implements ExecutorService {

    /* renamed from: i  reason: collision with root package name */
    private static final long f9493i = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: j  reason: collision with root package name */
    private static volatile int f9494j;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f9495h;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    /* compiled from: GlideExecutor */
    public static final class C0156a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f9496a;

        /* renamed from: b  reason: collision with root package name */
        private int f9497b;

        /* renamed from: c  reason: collision with root package name */
        private int f9498c;

        /* renamed from: d  reason: collision with root package name */
        private c f9499d = c.f9510d;

        /* renamed from: e  reason: collision with root package name */
        private String f9500e;

        /* renamed from: f  reason: collision with root package name */
        private long f9501f;

        C0156a(boolean z10) {
            this.f9496a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f9500e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f9497b, this.f9498c, this.f9501f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f9500e, this.f9499d, this.f9496a));
                if (this.f9501f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f9500e);
        }

        public C0156a b(String str) {
            this.f9500e = str;
            return this;
        }

        public C0156a c(int i10) {
            this.f9497b = i10;
            this.f9498c = i10;
            return this;
        }
    }

    /* compiled from: GlideExecutor */
    private static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f9502a;

        /* renamed from: b  reason: collision with root package name */
        final c f9503b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f9504c;

        /* renamed from: d  reason: collision with root package name */
        private int f9505d;

        /* renamed from: k2.a$b$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        class C0157a extends Thread {
            C0157a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f9504c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f9503b.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z10) {
            this.f9502a = str;
            this.f9503b = cVar;
            this.f9504c = z10;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0157a aVar;
            aVar = new C0157a(runnable, "glide-" + this.f9502a + "-thread-" + this.f9505d);
            this.f9505d = this.f9505d + 1;
            return aVar;
        }
    }

    /* compiled from: GlideExecutor */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f9507a = new C0158a();

        /* renamed from: b  reason: collision with root package name */
        public static final c f9508b;

        /* renamed from: c  reason: collision with root package name */
        public static final c f9509c = new C0159c();

        /* renamed from: d  reason: collision with root package name */
        public static final c f9510d;

        /* renamed from: k2.a$c$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        class C0158a implements c {
            C0158a() {
            }

            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor */
        class b implements c {
            b() {
            }

            public void a(Throwable th) {
            }
        }

        /* renamed from: k2.a$c$c  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        class C0159c implements c {
            C0159c() {
            }

            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f9508b = bVar;
            f9510d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f9495h = executorService;
    }

    public static int a() {
        if (f9494j == 0) {
            f9494j = Math.min(4, b.a());
        }
        return f9494j;
    }

    public static C0156a b() {
        return new C0156a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static C0156a d() {
        return new C0156a(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static C0156a f() {
        return new C0156a(false).c(a()).b("source");
    }

    public static a g() {
        return f().a();
    }

    public static a h() {
        return new a(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, f9493i, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f9510d, false)));
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f9495h.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f9495h.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f9495h.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f9495h.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f9495h.isShutdown();
    }

    public boolean isTerminated() {
        return this.f9495h.isTerminated();
    }

    public void shutdown() {
        this.f9495h.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f9495h.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f9495h.submit(runnable);
    }

    public String toString() {
        return this.f9495h.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f9495h.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f9495h.invokeAny(collection, j10, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f9495h.submit(runnable, t10);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f9495h.submit(callable);
    }
}
