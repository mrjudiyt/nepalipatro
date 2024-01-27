package v7;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import w7.b;
import w7.g;
import w7.h;
import y7.q;

/* compiled from: ConnectionPool */
public final class i {

    /* renamed from: g  reason: collision with root package name */
    private static final i f16837g;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16838a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16839b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16840c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f16841d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<z7.a> f16842e;

    /* renamed from: f  reason: collision with root package name */
    final g f16843f;

    /* compiled from: ConnectionPool */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                v7.i r0 = v7.i.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                v7.i r2 = v7.i.this
                monitor-enter(r2)
                v7.i r3 = v7.i.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v7.i.a.run():void");
        }
    }

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000;
        if (property != null && !Boolean.parseBoolean(property)) {
            f16837g = new i(0, parseLong);
        } else if (property3 != null) {
            f16837g = new i(Integer.parseInt(property3), parseLong);
        } else {
            f16837g = new i(5, parseLong);
        }
    }

    public i(int i10, long j10) {
        this(i10, j10, TimeUnit.MILLISECONDS);
    }

    public static i d() {
        return f16837g;
    }

    private int e(z7.a aVar, long j10) {
        List<Reference<q>> list = aVar.f17542j;
        int i10 = 0;
        while (i10 < list.size()) {
            if (list.get(i10).get() != null) {
                i10++;
            } else {
                Logger logger = b.f16990a;
                logger.warning("A connection to " + aVar.a().a().m() + " was leaked. Did you forget to close a response body?");
                list.remove(i10);
                aVar.f17543k = true;
                if (list.isEmpty()) {
                    aVar.f17544l = j10 - this.f16840c;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j10) {
        synchronized (this) {
            int i10 = 0;
            long j11 = Long.MIN_VALUE;
            z7.a aVar = null;
            int i11 = 0;
            for (z7.a next : this.f16842e) {
                if (e(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - next.f17544l;
                    if (j12 > j11) {
                        aVar = next;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f16840c;
            if (j11 < j13) {
                if (i10 <= this.f16839b) {
                    if (i10 > 0) {
                        long j14 = j13 - j11;
                        return j14;
                    } else if (i11 > 0) {
                        return j13;
                    } else {
                        return -1;
                    }
                }
            }
            this.f16842e.remove(aVar);
            h.d(aVar.i());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(z7.a aVar) {
        if (aVar.f17543k || this.f16839b == 0) {
            this.f16842e.remove(aVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public z7.a c(a aVar, q qVar) {
        for (z7.a next : this.f16842e) {
            if (next.f17542j.size() < next.b() && aVar.equals(next.a().f16964a) && !next.f17543k) {
                qVar.a(next);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(z7.a aVar) {
        if (this.f16842e.isEmpty()) {
            this.f16838a.execute(this.f16841d);
        }
        this.f16842e.add(aVar);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f16838a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), h.r("OkHttp ConnectionPool", true));
        this.f16841d = new a();
        this.f16842e = new ArrayDeque();
        this.f16843f = new g();
        this.f16839b = i10;
        this.f16840c = timeUnit.toNanos(j10);
        if (j10 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
        }
    }
}
