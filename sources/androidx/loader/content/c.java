package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask */
abstract class c<Params, Progress, Result> {

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadFactory f3564m;

    /* renamed from: n  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f3565n;

    /* renamed from: o  reason: collision with root package name */
    public static final Executor f3566o;

    /* renamed from: p  reason: collision with root package name */
    private static f f3567p;

    /* renamed from: q  reason: collision with root package name */
    private static volatile Executor f3568q;

    /* renamed from: h  reason: collision with root package name */
    private final h<Params, Result> f3569h;

    /* renamed from: i  reason: collision with root package name */
    private final FutureTask<Result> f3570i;

    /* renamed from: j  reason: collision with root package name */
    private volatile g f3571j = g.PENDING;

    /* renamed from: k  reason: collision with root package name */
    final AtomicBoolean f3572k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    final AtomicBoolean f3573l = new AtomicBoolean();

    /* compiled from: ModernAsyncTask */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f3574a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f3574a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask */
    class b extends h<Params, Result> {
        b() {
        }

        public Result call() {
            c.this.f3573l.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = c.this.b(this.f3584a);
                Binder.flushPendingCommands();
                c.this.l(result);
                return result;
            } catch (Throwable th) {
                c.this.l(result);
                throw th;
            }
        }
    }

    /* renamed from: androidx.loader.content.c$c  reason: collision with other inner class name */
    /* compiled from: ModernAsyncTask */
    class C0060c extends FutureTask<Result> {
        C0060c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (CancellationException unused2) {
                c.this.m(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3577a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.c$g[] r0 = androidx.loader.content.c.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3577a = r0
                androidx.loader.content.c$g r1 = androidx.loader.content.c.g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3577a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.c$g r1 = androidx.loader.content.c.g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.c.d.<clinit>():void");
        }
    }

    /* compiled from: ModernAsyncTask */
    private static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final c f3578a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f3579b;

        e(c cVar, Data... dataArr) {
            this.f3578a = cVar;
            this.f3579b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f3578a.d(eVar.f3579b[0]);
            } else if (i10 == 2) {
                eVar.f3578a.k(eVar.f3579b);
            }
        }
    }

    /* compiled from: ModernAsyncTask */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f3584a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f3564m = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f3565n = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f3566o = threadPoolExecutor;
        f3568q = threadPoolExecutor;
    }

    c() {
        b bVar = new b();
        this.f3569h = bVar;
        this.f3570i = new C0060c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (f3567p == null) {
                f3567p = new f();
            }
            fVar = f3567p;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f3572k.set(true);
        return this.f3570i.cancel(z10);
    }

    /* access modifiers changed from: protected */
    public abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f3571j != g.PENDING) {
            int i10 = d.f3577a[this.f3571j.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f3571j = g.RUNNING;
            j();
            this.f3569h.f3584a = paramsArr;
            executor.execute(this.f3570i);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f3571j = g.FINISHED;
    }

    public final boolean f() {
        return this.f3572k.get();
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(Result result) {
        g();
    }

    /* access modifiers changed from: protected */
    public void i(Result result) {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k(Progress... progressArr) {
    }

    /* access modifiers changed from: package-private */
    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    public void m(Result result) {
        if (!this.f3573l.get()) {
            l(result);
        }
    }
}
