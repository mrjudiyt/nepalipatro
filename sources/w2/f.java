package w2;

import a3.k;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x2.c;
import x2.d;
import y2.b;

/* compiled from: RequestFutureTarget */
public class f<R> implements c<R>, g<R> {

    /* renamed from: r  reason: collision with root package name */
    private static final a f12696r = new a();

    /* renamed from: h  reason: collision with root package name */
    private final int f12697h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12698i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f12699j;

    /* renamed from: k  reason: collision with root package name */
    private final a f12700k;

    /* renamed from: l  reason: collision with root package name */
    private R f12701l;

    /* renamed from: m  reason: collision with root package name */
    private d f12702m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12703n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12704o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12705p;

    /* renamed from: q  reason: collision with root package name */
    private GlideException f12706q;

    /* compiled from: RequestFutureTarget */
    static class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: package-private */
        public void b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f12696r);
    }

    private synchronized R k(Long l10) {
        if (this.f12699j && !isDone()) {
            k.a();
        }
        if (this.f12703n) {
            throw new CancellationException();
        } else if (this.f12705p) {
            throw new ExecutionException(this.f12706q);
        } else if (this.f12704o) {
            return this.f12701l;
        } else {
            if (l10 == null) {
                this.f12700k.b(this, 0);
            } else if (l10.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l10.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f12700k.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f12705p) {
                throw new ExecutionException(this.f12706q);
            } else if (this.f12703n) {
                throw new CancellationException();
            } else if (this.f12704o) {
                return this.f12701l;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public void a(c cVar) {
        cVar.e(this.f12697h, this.f12698i);
    }

    public synchronized void b(R r10, b<? super R> bVar) {
    }

    public synchronized void c(d dVar) {
        this.f12702m = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f12703n = r0     // Catch:{ all -> 0x0021 }
            w2.f$a r1 = r2.f12700k     // Catch:{ all -> 0x0021 }
            r1.a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            w2.d r3 = r2.f12702m     // Catch:{ all -> 0x0021 }
            r2.f12702m = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.cancel(boolean):boolean");
    }

    public synchronized boolean d(GlideException glideException, Object obj, d<R> dVar, boolean z10) {
        this.f12705p = true;
        this.f12706q = glideException;
        this.f12700k.a(this);
        return false;
    }

    public synchronized boolean e(R r10, Object obj, d<R> dVar, e2.a aVar, boolean z10) {
        this.f12704o = true;
        this.f12701l = r10;
        this.f12700k.a(this);
        return false;
    }

    public synchronized void f(Drawable drawable) {
    }

    public void g(c cVar) {
    }

    public R get() {
        try {
            return k((Long) null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    public void h(Drawable drawable) {
    }

    public synchronized d i() {
        return this.f12702m;
    }

    public synchronized boolean isCancelled() {
        return this.f12703n;
    }

    public synchronized boolean isDone() {
        return this.f12703n || this.f12704o || this.f12705p;
    }

    public void j(Drawable drawable) {
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    f(int i10, int i11, boolean z10, a aVar) {
        this.f12697h = i10;
        this.f12698i = i11;
        this.f12699j = z10;
        this.f12700k = aVar;
    }

    public R get(long j10, TimeUnit timeUnit) {
        return k(Long.valueOf(timeUnit.toMillis(j10)));
    }
}
