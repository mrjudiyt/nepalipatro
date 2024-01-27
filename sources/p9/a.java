package p9;

import com.google.android.gms.common.api.Api;
import i9.p0;
import i9.q0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import n9.e0;
import n9.j0;
import o8.q;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: o  reason: collision with root package name */
    public static final C0268a f16218o = new C0268a((g) null);

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16219p = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16220q = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16221r = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: s  reason: collision with root package name */
    public static final j0 f16222s = new j0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: h  reason: collision with root package name */
    public final int f16223h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16224i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16225j;

    /* renamed from: k  reason: collision with root package name */
    public final String f16226k;

    /* renamed from: l  reason: collision with root package name */
    public final d f16227l;

    /* renamed from: m  reason: collision with root package name */
    public final d f16228m;

    /* renamed from: n  reason: collision with root package name */
    public final e0<c> f16229n;
    private volatile long parkedWorkersStack;

    /* renamed from: p9.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C0268a {
        private C0268a() {
        }

        public /* synthetic */ C0268a(g gVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16230a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                p9.a$d[] r0 = p9.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p9.a$d r1 = p9.a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p9.a$d r1 = p9.a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p9.a$d r1 = p9.a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p9.a$d r1 = p9.a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                p9.a$d r1 = p9.a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f16230a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.a.b.<clinit>():void");
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f16223h = i10;
        this.f16224i = i11;
        this.f16225j = j10;
        this.f16226k = str;
        boolean z10 = true;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.f16227l = new d();
                        this.f16228m = new d();
                        this.f16229n = new e0<>((i10 + 1) * 2);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    public static /* synthetic */ void E(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f16265g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.w(runnable, iVar, z10);
    }

    private final int J(c cVar) {
        Object i10 = cVar.i();
        while (i10 != f16222s) {
            if (i10 == null) {
                return 0;
            }
            c cVar2 = (c) i10;
            int h10 = cVar2.h();
            if (h10 != 0) {
                return h10;
            }
            i10 = cVar2.i();
        }
        return -1;
    }

    private final c L() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16219p;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f16229n.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int J = J(b10);
            if (J >= 0) {
                if (f16219p.compareAndSet(this, j10, ((long) J) | j11)) {
                    b10.r(f16222s);
                    return b10;
                }
            }
        }
    }

    private final boolean h(h hVar) {
        boolean z10 = true;
        if (hVar.f16256i.b() != 1) {
            z10 = false;
        }
        if (z10) {
            return this.f16228m.a(hVar);
        }
        return this.f16227l.a(hVar);
    }

    private final void h0(long j10, boolean z10) {
        if (!z10 && !s0() && !o0(j10)) {
            s0();
        }
    }

    private final int j() {
        synchronized (this.f16229n) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16220q;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            boolean z10 = false;
            int a10 = l.a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (a10 >= this.f16223h) {
                return 0;
            }
            if (i10 >= this.f16224i) {
                return 0;
            }
            int i11 = ((int) (f16220q.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f16229n.b(i11) == null) {
                c cVar = new c(this, i11);
                this.f16229n.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    int i12 = a10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final h l0(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f16234j == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f16256i.b() == 0 && cVar.f16234j == d.BLOCKING) {
            return hVar;
        }
        cVar.f16238n = true;
        return cVar.f16232h.a(hVar, z10);
    }

    private final boolean o0(long j10) {
        if (l.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f16223h) {
            int j11 = j();
            if (j11 == 1 && this.f16223h > 1) {
                j();
            }
            if (j11 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean r0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f16220q.get(aVar);
        }
        return aVar.o0(j10);
    }

    private final boolean s0() {
        c L;
        do {
            L = L();
            if (L == null) {
                return false;
            }
        } while (!c.j().compareAndSet(L, -1, 0));
        LockSupport.unpark(L);
        return true;
    }

    private final c u() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !m.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final boolean W(c cVar) {
        long j10;
        long j11;
        int h10;
        if (cVar.i() != f16222s) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16219p;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & -2097152;
            h10 = cVar.h();
            if (p0.a()) {
                if (!(h10 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.r(this.f16229n.b(i10));
        } while (!f16219p.compareAndSet(this, j10, ((long) h10) | j11));
        return true;
    }

    public final void Y(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16219p;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? J(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f16219p.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void c0(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            i9.c.a();
            throw th;
        }
        i9.c.a();
    }

    public void close() {
        g0(10000);
    }

    public void execute(Runnable runnable) {
        E(this, runnable, (i) null, false, 6, (Object) null);
    }

    public final void g0(long j10) {
        int i10;
        h hVar;
        boolean z10 = false;
        if (f16221r.compareAndSet(this, 0, 1)) {
            c u10 = u();
            synchronized (this.f16229n) {
                i10 = (int) (f16220q.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f16229n.b(i11);
                    m.c(b10);
                    c cVar = b10;
                    if (cVar != u10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f16234j;
                        if (p0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f16232h.f(this.f16228m);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f16228m.b();
            this.f16227l.b();
            while (true) {
                if (u10 != null) {
                    hVar = u10.g(true);
                    if (hVar != null) {
                        continue;
                        c0(hVar);
                    }
                }
                hVar = (h) this.f16227l.d();
                if (hVar == null && (hVar = (h) this.f16228m.d()) == null) {
                    break;
                }
                c0(hVar);
            }
            if (u10 != null) {
                u10.u(d.TERMINATED);
            }
            if (p0.a()) {
                if (((int) ((f16220q.get(this) & 9223367638808264704L) >> 42)) == this.f16223h) {
                    z10 = true;
                }
                if (!z10) {
                    throw new AssertionError();
                }
            }
            f16219p.set(this, 0);
            f16220q.set(this, 0);
        }
    }

    public final boolean isTerminated() {
        return f16221r.get(this) != 0;
    }

    public final void k0() {
        if (!s0() && !r0(this, 0, 1, (Object) null)) {
            s0();
        }
    }

    public final h q(Runnable runnable, i iVar) {
        long a10 = l.f16264f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a10, iVar);
        }
        h hVar = (h) runnable;
        hVar.f16255h = a10;
        hVar.f16256i = iVar;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f16229n.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f16229n.b(i15);
            if (b10 != null) {
                int e10 = b10.f16232h.e();
                int i16 = b.f16230a[b10.f16234j.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e10);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (e10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f16220q.get(this);
        return this.f16226k + '@' + q0.b(this) + "[Pool Size {core = " + this.f16223h + ", max = " + this.f16224i + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f16227l.c() + ", global blocking queue size = " + this.f16228m.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f16223h - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void w(Runnable runnable, i iVar, boolean z10) {
        i9.c.a();
        h q10 = q(runnable, iVar);
        boolean z11 = false;
        boolean z12 = q10.f16256i.b() == 1;
        long addAndGet = z12 ? f16220q.addAndGet(this, 2097152) : 0;
        c u10 = u();
        h l02 = l0(u10, q10, z10);
        if (l02 == null || h(l02)) {
            if (z10 && u10 != null) {
                z11 = true;
            }
            if (z12) {
                h0(addAndGet, z11);
            } else if (!z11) {
                k0();
            }
        } else {
            throw new RejectedExecutionException(this.f16226k + " was terminated");
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class c extends Thread {

        /* renamed from: p  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f16231p = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: h  reason: collision with root package name */
        public final n f16232h;

        /* renamed from: i  reason: collision with root package name */
        private final y<h> f16233i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public d f16234j;

        /* renamed from: k  reason: collision with root package name */
        private long f16235k;

        /* renamed from: l  reason: collision with root package name */
        private long f16236l;

        /* renamed from: m  reason: collision with root package name */
        private int f16237m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f16238n;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f16232h = new n();
            this.f16233i = new y<>();
            this.f16234j = d.DORMANT;
            this.nextParkedWorker = a.f16222s;
            this.f16237m = b9.c.f13332h.c();
        }

        private final void b(int i10) {
            if (i10 != 0) {
                a.f16220q.addAndGet(a.this, -2097152);
                d dVar = this.f16234j;
                if (dVar != d.TERMINATED) {
                    if (p0.a()) {
                        if (!(dVar == d.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f16234j = d.DORMANT;
                }
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.k0();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f16256i.b();
            k(b10);
            c(b10);
            a.this.c0(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h o10;
            h o11;
            if (z10) {
                boolean z11 = m(a.this.f16223h * 2) == 0;
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f16232h.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f16232h.h();
            if (h10 != null) {
                return h10;
            }
            h hVar = (h) a.this.f16228m.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f16231p;
        }

        private final void k(int i10) {
            this.f16235k = 0;
            if (this.f16234j == d.PARKING) {
                if (p0.a()) {
                    boolean z10 = true;
                    if (i10 != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                this.f16234j = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f16222s;
        }

        private final void n() {
            if (this.f16235k == 0) {
                this.f16235k = System.nanoTime() + a.this.f16225j;
            }
            LockSupport.parkNanos(a.this.f16225j);
            if (System.nanoTime() - this.f16235k >= 0) {
                this.f16235k = 0;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f16227l.d();
                if (hVar != null) {
                    return hVar;
                }
                return (h) a.this.f16228m.d();
            }
            h hVar2 = (h) a.this.f16228m.d();
            if (hVar2 != null) {
                return hVar2;
            }
            return (h) a.this.f16227l.d();
        }

        private final void p() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f16234j != d.TERMINATED) {
                    h g10 = g(this.f16238n);
                    if (g10 != null) {
                        this.f16236l = 0;
                        d(g10);
                    } else {
                        this.f16238n = false;
                        if (this.f16236l == 0) {
                            t();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f16236l);
                            this.f16236l = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f16234j != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater a10 = a.f16220q;
                while (true) {
                    long j10 = a10.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f16220q.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f16234j = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.W(this);
                return;
            }
            f16231p.set(this, -1);
            while (l() && f16231p.get(this) == -1 && !a.this.isTerminated() && this.f16234j != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f16220q.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c b10 = aVar.f16229n.b(m10);
                if (b10 == null || b10 == this) {
                    int i13 = i10;
                } else {
                    long n10 = b10.f16232h.n(i10, this.f16233i);
                    if (n10 == -1) {
                        y<h> yVar = this.f16233i;
                        h hVar = (h) yVar.f15575h;
                        yVar.f15575h = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f16236l = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f16229n) {
                if (!aVar.isTerminated()) {
                    if (((int) (a.f16220q.get(aVar) & 2097151)) > aVar.f16223h) {
                        if (f16231p.compareAndSet(this, -1, 1)) {
                            int i10 = this.indexInArray;
                            q(0);
                            aVar.Y(this, i10, 0);
                            int andDecrement = (int) (a.f16220q.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i10) {
                                c b10 = aVar.f16229n.b(andDecrement);
                                m.c(b10);
                                c cVar = b10;
                                aVar.f16229n.c(i10, cVar);
                                cVar.q(i10);
                                aVar.Y(cVar, andDecrement, i10);
                            }
                            aVar.f16229n.c(andDecrement, null);
                            q qVar = q.f16189a;
                            this.f16234j = d.TERMINATED;
                        }
                    }
                }
            }
        }

        public final h g(boolean z10) {
            if (s()) {
                return e(z10);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f16237m;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f16237m = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f16226k);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f16234j;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f16220q.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f16234j = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }
    }
}
