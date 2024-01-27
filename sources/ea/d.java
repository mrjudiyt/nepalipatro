package ea;

import com.facebook.internal.NativeProtocol;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: AsyncTimeout.kt */
public class d extends a0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final long f14350i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final long f14351j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static d f14352k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f14353l = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private boolean f14354f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f14355g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f14356h;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d i10 = d.f14352k; i10 != null; i10 = i10.f14355g) {
                    if (i10.f14355g == dVar) {
                        i10.f14355g = dVar.f14355g;
                        dVar.f14355g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        public final void e(d dVar, long j10, boolean z10) {
            Class<d> cls = d.class;
            synchronized (cls) {
                if (d.f14352k == null) {
                    d.f14352k = new d();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i10 != 0 && z10) {
                    dVar.f14356h = Math.min(j10, dVar.c() - nanoTime) + nanoTime;
                } else if (i10 != 0) {
                    dVar.f14356h = j10 + nanoTime;
                } else if (z10) {
                    dVar.f14356h = dVar.c();
                } else {
                    throw new AssertionError();
                }
                long n10 = dVar.u(nanoTime);
                d i11 = d.f14352k;
                if (i11 == null) {
                    m.r();
                }
                while (true) {
                    if (i11.f14355g == null) {
                        break;
                    }
                    d l10 = i11.f14355g;
                    if (l10 == null) {
                        m.r();
                    }
                    if (n10 < l10.u(nanoTime)) {
                        break;
                    }
                    i11 = i11.f14355g;
                    if (i11 == null) {
                        m.r();
                    }
                }
                dVar.f14355g = i11.f14355g;
                i11.f14355g = dVar;
                if (i11 == d.f14352k) {
                    cls.notify();
                }
                q qVar = q.f16189a;
            }
        }

        public final d c() {
            Class<d> cls = d.class;
            d i10 = d.f14352k;
            if (i10 == null) {
                m.r();
            }
            d l10 = i10.f14355g;
            if (l10 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(d.f14350i);
                d i11 = d.f14352k;
                if (i11 == null) {
                    m.r();
                }
                if (i11.f14355g != null || System.nanoTime() - nanoTime < d.f14351j) {
                    return null;
                }
                return d.f14352k;
            }
            long n10 = l10.u(System.nanoTime());
            if (n10 > 0) {
                long j10 = n10 / 1000000;
                cls.wait(j10, (int) (n10 - (1000000 * j10)));
                return null;
            }
            d i12 = d.f14352k;
            if (i12 == null) {
                m.r();
            }
            i12.f14355g = l10.f14355g;
            l10.f14355g = null;
            return l10;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.x();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<ea.d> r0 = ea.d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                ea.d$a r1 = ea.d.f14353l     // Catch:{ all -> 0x001e }
                ea.d r1 = r1.c()     // Catch:{ all -> 0x001e }
                ea.d r2 = ea.d.f14352k     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                ea.d.f14352k = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                o8.q r2 = o8.q.f16189a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.x()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.d.b.run():void");
        }
    }

    /* compiled from: AsyncTimeout.kt */
    public static final class c implements x {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f14357h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ x f14358i;

        c(d dVar, x xVar) {
            this.f14357h = dVar;
            this.f14358i = xVar;
        }

        public void F0(e eVar, long j10) {
            m.g(eVar, "source");
            c.b(eVar.w0(), 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    u uVar = eVar.f14361h;
                    if (uVar == null) {
                        m.r();
                    }
                    while (true) {
                        if (j11 >= ((long) NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST)) {
                            break;
                        }
                        j11 += (long) (uVar.f14395c - uVar.f14394b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        uVar = uVar.f14398f;
                        if (uVar == null) {
                            m.r();
                        }
                    }
                    d dVar = this.f14357h;
                    dVar.r();
                    try {
                        this.f14358i.F0(eVar, j11);
                        q qVar = q.f16189a;
                        if (!dVar.s()) {
                            j10 -= j11;
                        } else {
                            throw dVar.m((IOException) null);
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (dVar.s()) {
                            e = dVar.m(e);
                        }
                        throw e;
                    } finally {
                        boolean s10 = dVar.s();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public d d() {
            return this.f14357h;
        }

        public void close() {
            d dVar = this.f14357h;
            dVar.r();
            try {
                this.f14358i.close();
                q qVar = q.f16189a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s10 = dVar.s();
            }
        }

        public void flush() {
            d dVar = this.f14357h;
            dVar.r();
            try {
                this.f14358i.flush();
                q qVar = q.f16189a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s10 = dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f14358i + ')';
        }
    }

    /* renamed from: ea.d$d  reason: collision with other inner class name */
    /* compiled from: AsyncTimeout.kt */
    public static final class C0249d implements z {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f14359h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ z f14360i;

        C0249d(d dVar, z zVar) {
            this.f14359h = dVar;
            this.f14360i = zVar;
        }

        public long S(e eVar, long j10) {
            m.g(eVar, "sink");
            d dVar = this.f14359h;
            dVar.r();
            try {
                long S = this.f14360i.S(eVar, j10);
                if (!dVar.s()) {
                    return S;
                }
                throw dVar.m((IOException) null);
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s10 = dVar.s();
            }
        }

        /* renamed from: a */
        public d d() {
            return this.f14359h;
        }

        public void close() {
            d dVar = this.f14359h;
            dVar.r();
            try {
                this.f14360i.close();
                q qVar = q.f16189a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s10 = dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f14360i + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f14350i = millis;
        f14351j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long u(long j10) {
        return this.f14356h - j10;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!this.f14354f) {
            long h10 = h();
            boolean e10 = e();
            if (h10 != 0 || e10) {
                this.f14354f = true;
                f14353l.e(this, h10, e10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean s() {
        if (!this.f14354f) {
            return false;
        }
        this.f14354f = false;
        return f14353l.d(this);
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final x v(x xVar) {
        m.g(xVar, "sink");
        return new c(this, xVar);
    }

    public final z w(z zVar) {
        m.g(zVar, "source");
        return new C0249d(this, zVar);
    }

    /* access modifiers changed from: protected */
    public void x() {
    }
}
