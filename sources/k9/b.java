package k9;

import i9.m;
import i9.o;
import i9.p0;
import i9.s2;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import n9.b0;
import n9.f;
import n9.g0;
import n9.h0;
import n9.i0;
import n9.j0;
import o8.l;
import o8.q;
import r8.d;
import y8.l;
import y8.p;

/* compiled from: BufferedChannel.kt */
public class b<E> implements d<E> {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f15483k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f15484l;

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f15485m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f15486n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15487o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15488p;

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15489q;

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15490r;

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15491s;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: h  reason: collision with root package name */
    private final int f15492h;

    /* renamed from: i  reason: collision with root package name */
    public final l<E, q> f15493i;

    /* renamed from: j  reason: collision with root package name */
    private final y8.q<q9.b<?>, Object, Object, l<Throwable, q>> f15494j;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* compiled from: BufferedChannel.kt */
    private final class a implements f<E>, s2 {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Object f15495h = c.f15519p;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public m<? super Boolean> f15496i;

        public a() {
        }

        private final Object f(i<E> iVar, int i10, long j10, d<? super Boolean> dVar) {
            Boolean a10;
            b<E> bVar = b.this;
            m b10 = o.b(c.b(dVar));
            try {
                this.f15496i = b10;
                Object u10 = bVar.A0(iVar, i10, j10, this);
                if (u10 == c.f15516m) {
                    bVar.l0(this, iVar, i10);
                } else {
                    l<Throwable, q> lVar = null;
                    if (u10 == c.f15518o) {
                        if (j10 < bVar.O()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f15488p.get(bVar);
                        while (true) {
                            if (bVar.V()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f15484l.getAndIncrement(bVar);
                            int i11 = c.f15505b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (iVar2.f15803j != j11) {
                                i a11 = bVar.H(j11, iVar2);
                                if (a11 != null) {
                                    iVar2 = a11;
                                }
                            }
                            Object u11 = bVar.A0(iVar2, i12, andIncrement, this);
                            if (u11 == c.f15516m) {
                                bVar.l0(this, iVar2, i12);
                                break;
                            } else if (u11 == c.f15518o) {
                                if (andIncrement < bVar.O()) {
                                    iVar2.b();
                                }
                            } else if (u11 != c.f15517n) {
                                iVar2.b();
                                this.f15495h = u11;
                                this.f15496i = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                l<E, q> lVar2 = bVar.f15493i;
                                if (lVar2 != null) {
                                    lVar = b0.a(lVar2, u11, b10.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        iVar.b();
                        this.f15495h = u10;
                        this.f15496i = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        l<E, q> lVar3 = bVar.f15493i;
                        if (lVar3 != null) {
                            lVar = b0.a(lVar3, u10, b10.getContext());
                        }
                    }
                    b10.d(a10, lVar);
                }
                Object w10 = b10.w();
                if (w10 == d.c()) {
                    h.c(dVar);
                }
                return w10;
            } catch (Throwable th) {
                b10.I();
                throw th;
            }
        }

        private final boolean g() {
            this.f15495h = c.z();
            Throwable K = b.this.K();
            if (K == null) {
                return false;
            }
            throw i0.j(K);
        }

        /* access modifiers changed from: private */
        public final void h() {
            m<? super Boolean> mVar = this.f15496i;
            kotlin.jvm.internal.m.c(mVar);
            this.f15496i = null;
            this.f15495h = c.z();
            Throwable K = b.this.K();
            if (K == null) {
                l.a aVar = o8.l.f16183h;
                mVar.resumeWith(o8.l.a(Boolean.FALSE));
                return;
            }
            if (p0.d() && (mVar instanceof e)) {
                K = i0.i(K, mVar);
            }
            l.a aVar2 = o8.l.f16183h;
            mVar.resumeWith(o8.l.a(o8.m.a(K)));
        }

        public void a(g0<?> g0Var, int i10) {
            m<? super Boolean> mVar = this.f15496i;
            if (mVar != null) {
                mVar.a(g0Var, i10);
            }
        }

        public Object b(d<? super Boolean> dVar) {
            i iVar;
            b<E> bVar = b.this;
            i iVar2 = (i) b.f15488p.get(bVar);
            while (!bVar.V()) {
                long andIncrement = b.f15484l.getAndIncrement(bVar);
                int i10 = c.f15505b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (iVar2.f15803j != j10) {
                    i a10 = bVar.H(j10, iVar2);
                    if (a10 == null) {
                        continue;
                    } else {
                        iVar = a10;
                    }
                } else {
                    iVar = iVar2;
                }
                Object u10 = bVar.A0(iVar, i11, andIncrement, (Object) null);
                if (u10 == c.f15516m) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (u10 == c.f15518o) {
                    if (andIncrement < bVar.O()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else if (u10 == c.f15517n) {
                    return f(iVar, i11, andIncrement, dVar);
                } else {
                    iVar.b();
                    this.f15495h = u10;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        public final boolean i(E e10) {
            m<? super Boolean> mVar = this.f15496i;
            kotlin.jvm.internal.m.c(mVar);
            y8.l<Throwable, q> lVar = null;
            this.f15496i = null;
            this.f15495h = e10;
            Boolean bool = Boolean.TRUE;
            y8.l<E, q> lVar2 = b.this.f15493i;
            if (lVar2 != null) {
                lVar = b0.a(lVar2, e10, mVar.getContext());
            }
            return c.B(mVar, bool, lVar);
        }

        public final void j() {
            m<? super Boolean> mVar = this.f15496i;
            kotlin.jvm.internal.m.c(mVar);
            this.f15496i = null;
            this.f15495h = c.z();
            Throwable K = b.this.K();
            if (K == null) {
                l.a aVar = o8.l.f16183h;
                mVar.resumeWith(o8.l.a(Boolean.FALSE));
                return;
            }
            if (p0.d() && (mVar instanceof e)) {
                K = i0.i(K, mVar);
            }
            l.a aVar2 = o8.l.f16183h;
            mVar.resumeWith(o8.l.a(o8.m.a(K)));
        }

        public E next() {
            E e10 = this.f15495h;
            if (e10 != c.f15519p) {
                this.f15495h = c.f15519p;
                if (e10 != c.z()) {
                    return e10;
                }
                throw i0.j(b.this.L());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: k9.b$b  reason: collision with other inner class name */
    /* compiled from: BufferedChannel.kt */
    private static final class C0259b implements s2 {

        /* renamed from: h  reason: collision with root package name */
        private final i9.l<Boolean> f15498h;

        /* renamed from: i  reason: collision with root package name */
        private final /* synthetic */ m<Boolean> f15499i;

        public void a(g0<?> g0Var, int i10) {
            this.f15499i.a(g0Var, i10);
        }

        public final i9.l<Boolean> b() {
            return this.f15498h;
        }
    }

    /* compiled from: BufferedChannel.kt */
    static final class c extends n implements y8.q<q9.b<?>, Object, Object, y8.l<? super Throwable, ? extends q>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b<E> f15500h;

        /* compiled from: BufferedChannel.kt */
        static final class a extends n implements y8.l<Throwable, q> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Object f15501h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ b<E> f15502i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ q9.b<?> f15503j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, q9.b<?> bVar2) {
                super(1);
                this.f15501h = obj;
                this.f15502i = bVar;
                this.f15503j = bVar2;
            }

            public final void a(Throwable th) {
                if (this.f15501h != c.z()) {
                    b0.b(this.f15502i.f15493i, this.f15501h, this.f15503j.getContext());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return q.f16189a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f15500h = bVar;
        }

        /* renamed from: a */
        public final y8.l<Throwable, q> invoke(q9.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.f15500h, bVar);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<b> cls2 = b.class;
        f15483k = AtomicLongFieldUpdater.newUpdater(cls2, "sendersAndCloseStatus");
        f15484l = AtomicLongFieldUpdater.newUpdater(cls2, "receivers");
        f15485m = AtomicLongFieldUpdater.newUpdater(cls2, "bufferEnd");
        f15486n = AtomicLongFieldUpdater.newUpdater(cls2, "completedExpandBuffersAndPauseFlag");
        f15487o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "sendSegment");
        f15488p = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "receiveSegment");
        f15489q = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "bufferEndSegment");
        f15490r = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_closeCause");
        f15491s = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "closeHandler");
    }

    public b(int i10, y8.l<? super E, q> lVar) {
        this.f15492h = i10;
        this.f15493i = lVar;
        if (i10 >= 0) {
            this.bufferEnd = c.A(i10);
            this.completedExpandBuffersAndPauseFlag = J();
            i iVar = new i(0, (i) null, this, 3);
            this.sendSegment = iVar;
            this.receiveSegment = iVar;
            if (Z()) {
                iVar = c.f15504a;
                kotlin.jvm.internal.m.d(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = iVar;
            this.f15494j = lVar != null ? new c(this) : null;
            this._closeCause = c.f15522s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* access modifiers changed from: private */
    public final Object A0(i<E> iVar, int i10, long j10, Object obj) {
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f15483k.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f15517n;
                }
                if (iVar.r(i10, w10, obj)) {
                    F();
                    return c.f15516m;
                }
            }
        } else if (w10 == c.f15507d && iVar.r(i10, w10, c.f15512i)) {
            F();
            return iVar.y(i10);
        }
        return B0(iVar, i10, j10, obj);
    }

    private final void B(long j10) {
        p0(C(j10));
    }

    private final Object B0(i<E> iVar, int i10, long j10, Object obj) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 == null || w10 == c.f15508e) {
                if (j10 < (f15483k.get(this) & 1152921504606846975L)) {
                    if (iVar.r(i10, w10, c.f15511h)) {
                        F();
                        return c.f15518o;
                    }
                } else if (obj == null) {
                    return c.f15517n;
                } else {
                    if (iVar.r(i10, w10, obj)) {
                        F();
                        return c.f15516m;
                    }
                }
            } else if (w10 == c.f15507d) {
                if (iVar.r(i10, w10, c.f15512i)) {
                    F();
                    return iVar.y(i10);
                }
            } else if (w10 == c.f15513j) {
                return c.f15518o;
            } else {
                if (w10 == c.f15511h) {
                    return c.f15518o;
                }
                if (w10 == c.z()) {
                    F();
                    return c.f15518o;
                } else if (w10 != c.f15510g && iVar.r(i10, w10, c.f15509f)) {
                    boolean z10 = w10 instanceof t;
                    if (z10) {
                        w10 = ((t) w10).f15546a;
                    }
                    if (x0(w10, iVar, i10)) {
                        iVar.A(i10, c.f15512i);
                        F();
                        return iVar.y(i10);
                    }
                    iVar.A(i10, c.f15513j);
                    iVar.x(i10, false);
                    if (z10) {
                        F();
                    }
                    return c.f15518o;
                }
            }
        }
    }

    private final i<E> C(long j10) {
        i<E> z10 = z();
        if (Y()) {
            long a02 = a0(z10);
            if (a02 != -1) {
                E(a02);
            }
        }
        y(z10, j10);
        return z10;
    }

    /* access modifiers changed from: private */
    public final int C0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        iVar.B(i10, e10);
        if (z10) {
            return D0(iVar, i10, e10, j10, obj, z10);
        }
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (w(j10)) {
                if (iVar.r(i10, (Object) null, c.f15507d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (iVar.r(i10, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (w10 instanceof s2) {
            iVar.s(i10);
            if (w0(w10, e10)) {
                iVar.A(i10, c.f15512i);
                j0();
                return 0;
            }
            if (iVar.t(i10, c.f15514k) != c.f15514k) {
                iVar.x(i10, true);
            }
            return 5;
        }
        return D0(iVar, i10, e10, j10, obj, z10);
    }

    private final void D() {
        o();
    }

    private final int D0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 == null) {
                if (!w(j10) || z10) {
                    if (z10) {
                        if (iVar.r(i10, (Object) null, c.f15513j)) {
                            iVar.x(i10, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (iVar.r(i10, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (iVar.r(i10, (Object) null, c.f15507d)) {
                    return 1;
                }
            } else if (w10 == c.f15508e) {
                if (iVar.r(i10, w10, c.f15507d)) {
                    return 1;
                }
            } else if (w10 == c.f15514k) {
                iVar.s(i10);
                return 5;
            } else if (w10 == c.f15511h) {
                iVar.s(i10);
                return 5;
            } else if (w10 == c.z()) {
                iVar.s(i10);
                D();
                return 4;
            } else {
                if (p0.a()) {
                    if (!((w10 instanceof s2) || (w10 instanceof t))) {
                        throw new AssertionError();
                    }
                }
                iVar.s(i10);
                if (w10 instanceof t) {
                    w10 = ((t) w10).f15546a;
                }
                if (w0(w10, e10)) {
                    iVar.A(i10, c.f15512i);
                    j0();
                    return 0;
                }
                if (iVar.t(i10, c.f15514k) != c.f15514k) {
                    iVar.x(i10, true);
                }
                return 5;
            }
        }
    }

    private final void E0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15484l;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10 || f15484l.compareAndSet(this, j11, j10)) {
            }
            j11 = atomicLongFieldUpdater.get(this);
            return;
        } while (f15484l.compareAndSet(this, j11, j10));
    }

    private final void F() {
        if (!Z()) {
            i iVar = (i) f15489q.get(this);
            while (true) {
                long andIncrement = f15485m.getAndIncrement(this);
                int i10 = c.f15505b;
                long j10 = andIncrement / ((long) i10);
                if (O() <= andIncrement) {
                    if (iVar.f15803j < j10 && iVar.e() != null) {
                        e0(j10, iVar);
                    }
                    R(this, 0, 1, (Object) null);
                    return;
                }
                if (iVar.f15803j != j10) {
                    i G = G(j10, iVar, andIncrement);
                    if (G == null) {
                        continue;
                    } else {
                        iVar = G;
                    }
                }
                if (y0(iVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                    R(this, 0, 1, (Object) null);
                    return;
                }
                R(this, 0, 1, (Object) null);
            }
        }
    }

    private final void F0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15483k;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f15483k.compareAndSet(this, j11, c.w(j12, (int) (j11 >> 60))));
    }

    private final i<E> G(long j10, i<E> iVar, long j11) {
        Object c10;
        boolean z10;
        boolean z11;
        long j12 = j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15489q;
        p pVar = (p) c.y();
        i<E> iVar2 = iVar;
        do {
            c10 = n9.e.c(iVar2, j12, pVar);
            z10 = false;
            if (h0.c(c10)) {
                break;
            }
            g0 b10 = h0.b(c10);
            while (true) {
                g0 g0Var = (g0) atomicReferenceFieldUpdater.get(this);
                if (g0Var.f15803j >= b10.f15803j) {
                    break;
                } else if (!b10.q()) {
                    z11 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g0Var, b10)) {
                    if (g0Var.m()) {
                        g0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z11 = true;
            continue;
        } while (!z11);
        if (h0.c(c10)) {
            D();
            e0(j10, iVar);
            R(this, 0, 1, (Object) null);
            return null;
        }
        i<E> iVar3 = (i) h0.b(c10);
        long j13 = iVar3.f15803j;
        if (j13 > j12) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15485m;
            int i10 = c.f15505b;
            if (atomicLongFieldUpdater.compareAndSet(this, j11 + 1, ((long) i10) * j13)) {
                Q((iVar3.f15803j * ((long) i10)) - j11);
                return null;
            }
            R(this, 0, 1, (Object) null);
            return null;
        }
        if (p0.a()) {
            if (iVar3.f15803j == j12) {
                z10 = true;
            }
            if (!z10) {
                throw new AssertionError();
            }
        }
        return iVar3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0040, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k9.i<E> H(long r13, k9.i<E> r15) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15488p
            e9.e r1 = k9.c.y()
            y8.p r1 = (y8.p) r1
        L_0x0008:
            java.lang.Object r2 = n9.e.c(r15, r13, r1)
            boolean r3 = n9.h0.c(r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x004d
            n9.g0 r3 = n9.h0.b(r2)
        L_0x0018:
            java.lang.Object r6 = r0.get(r12)
            n9.g0 r6 = (n9.g0) r6
            long r7 = r6.f15803j
            long r9 = r3.f15803j
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0040
        L_0x0028:
            boolean r7 = r3.q()
            if (r7 != 0) goto L_0x0030
            r3 = 0
            goto L_0x0040
        L_0x0030:
            boolean r7 = androidx.concurrent.futures.b.a(r0, r12, r6, r3)
            if (r7 == 0) goto L_0x0043
            boolean r3 = r6.m()
            if (r3 == 0) goto L_0x0026
            r6.k()
            goto L_0x0026
        L_0x0040:
            if (r3 == 0) goto L_0x0008
            goto L_0x004d
        L_0x0043:
            boolean r6 = r3.m()
            if (r6 == 0) goto L_0x0018
            r3.k()
            goto L_0x0018
        L_0x004d:
            boolean r0 = n9.h0.c(r2)
            r1 = 0
            if (r0 == 0) goto L_0x006b
            r12.D()
            long r13 = r15.f15803j
            int r0 = k9.c.f15505b
            long r2 = (long) r0
            long r13 = r13 * r2
            long r2 = r12.O()
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r15.b()
            goto L_0x00e9
        L_0x006b:
            n9.g0 r15 = n9.h0.b(r2)
            k9.i r15 = (k9.i) r15
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x00b3
            long r2 = r12.J()
            int r0 = k9.c.f15505b
            long r6 = (long) r0
            long r2 = r2 / r6
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15489q
        L_0x0085:
            java.lang.Object r2 = r0.get(r12)
            n9.g0 r2 = (n9.g0) r2
            long r6 = r2.f15803j
            long r8 = r15.f15803j
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b3
            boolean r3 = r15.q()
            if (r3 == 0) goto L_0x00b3
            boolean r3 = androidx.concurrent.futures.b.a(r0, r12, r2, r15)
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x00b3
            r2.k()
            goto L_0x00b3
        L_0x00a9:
            boolean r2 = r15.m()
            if (r2 == 0) goto L_0x0085
            r15.k()
            goto L_0x0085
        L_0x00b3:
            long r2 = r15.f15803j
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            int r13 = k9.c.f15505b
            long r4 = (long) r13
            long r2 = r2 * r4
            r12.E0(r2)
            long r2 = r15.f15803j
            long r13 = (long) r13
            long r2 = r2 * r13
            long r13 = r12.O()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r15.b()
            goto L_0x00e9
        L_0x00d2:
            boolean r0 = i9.p0.a()
            if (r0 == 0) goto L_0x00e8
            long r0 = r15.f15803j
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00df
            r4 = 1
        L_0x00df:
            if (r4 == 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00e8:
            r1 = r15
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.H(long, k9.i):k9.i");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0040, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k9.i<E> I(long r13, k9.i<E> r15) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15487o
            e9.e r1 = k9.c.y()
            y8.p r1 = (y8.p) r1
        L_0x0008:
            java.lang.Object r2 = n9.e.c(r15, r13, r1)
            boolean r3 = n9.h0.c(r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x004d
            n9.g0 r3 = n9.h0.b(r2)
        L_0x0018:
            java.lang.Object r6 = r0.get(r12)
            n9.g0 r6 = (n9.g0) r6
            long r7 = r6.f15803j
            long r9 = r3.f15803j
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0040
        L_0x0028:
            boolean r7 = r3.q()
            if (r7 != 0) goto L_0x0030
            r3 = 0
            goto L_0x0040
        L_0x0030:
            boolean r7 = androidx.concurrent.futures.b.a(r0, r12, r6, r3)
            if (r7 == 0) goto L_0x0043
            boolean r3 = r6.m()
            if (r3 == 0) goto L_0x0026
            r6.k()
            goto L_0x0026
        L_0x0040:
            if (r3 == 0) goto L_0x0008
            goto L_0x004d
        L_0x0043:
            boolean r6 = r3.m()
            if (r6 == 0) goto L_0x0018
            r3.k()
            goto L_0x0018
        L_0x004d:
            boolean r0 = n9.h0.c(r2)
            r1 = 0
            if (r0 == 0) goto L_0x006a
            r12.D()
            long r13 = r15.f15803j
            int r0 = k9.c.f15505b
            long r2 = (long) r0
            long r13 = r13 * r2
            long r2 = r12.M()
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            r15.b()
            goto L_0x00a6
        L_0x006a:
            n9.g0 r15 = n9.h0.b(r2)
            k9.i r15 = (k9.i) r15
            long r2 = r15.f15803j
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            int r13 = k9.c.f15505b
            long r4 = (long) r13
            long r2 = r2 * r4
            r12.F0(r2)
            long r2 = r15.f15803j
            long r13 = (long) r13
            long r2 = r2 * r13
            long r13 = r12.M()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            r15.b()
            goto L_0x00a6
        L_0x008f:
            boolean r0 = i9.p0.a()
            if (r0 == 0) goto L_0x00a5
            long r0 = r15.f15803j
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x009c
            r4 = 1
        L_0x009c:
            if (r4 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00a5:
            r1 = r15
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.I(long, k9.i):k9.i");
    }

    private final long J() {
        return f15485m.get(this);
    }

    /* access modifiers changed from: private */
    public final Throwable L() {
        Throwable K = K();
        return K == null ? new ClosedReceiveChannelException("Channel was closed") : K;
    }

    private final void Q(long j10) {
        boolean z10;
        if ((f15486n.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
                if ((f15486n.get(this) & 4611686018427387904L) != 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } while (z10);
        }
    }

    static /* synthetic */ void R(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.Q(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void S() {
        Object obj;
        j0 j0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15491s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                j0Var = c.f15520q;
            } else {
                j0Var = c.f15521r;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, j0Var));
        if (obj != null) {
            y8.l lVar = (y8.l) c0.b(obj, 1);
            ((y8.l) obj).invoke(K());
        }
    }

    private final boolean T(i<E> iVar, int i10, long j10) {
        Object w10;
        do {
            w10 = iVar.w(i10);
            if (w10 != null && w10 != c.f15508e) {
                if (w10 == c.f15507d) {
                    return true;
                }
                if (w10 == c.f15513j || w10 == c.z() || w10 == c.f15512i || w10 == c.f15511h) {
                    return false;
                }
                if (w10 == c.f15510g) {
                    return true;
                }
                if (w10 != c.f15509f && j10 == M()) {
                    return true;
                }
                return false;
            }
        } while (!iVar.r(i10, w10, c.f15511h));
        F();
        return false;
    }

    private final boolean U(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            C(j10 & 1152921504606846975L);
            return !z10 || !P();
        } else if (i10 == 3) {
            B(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
    }

    private final boolean W(long j10) {
        return U(j10, true);
    }

    /* access modifiers changed from: private */
    public final boolean X(long j10) {
        return U(j10, false);
    }

    private final boolean Z() {
        long J = J();
        return J == 0 || J == Long.MAX_VALUE;
    }

    private final long a0(i<E> iVar) {
        do {
            int i10 = c.f15505b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (iVar.f15803j * ((long) c.f15505b)) + ((long) i10);
                    if (j10 < M()) {
                        return -1;
                    }
                    while (true) {
                        Object w10 = iVar.w(i10);
                        if (w10 == null || w10 == c.f15508e) {
                            if (iVar.r(i10, w10, c.z())) {
                                iVar.p();
                                break;
                            }
                        } else if (w10 == c.f15507d) {
                            return j10;
                        }
                    }
                } else {
                    iVar = (i) iVar.g();
                }
            }
        } while (iVar != null);
        return -1;
    }

    private final void b0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15483k;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 1)));
    }

    private final void c0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15483k;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 3)));
    }

    private final void d0() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15483k;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                j11 = c.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                j11 = c.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
    }

    private final void e0(long j10, i<E> iVar) {
        boolean z10;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f15803j < j10 && (iVar3 = (i) iVar.e()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.h() || (iVar2 = (i) iVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15489q;
                while (true) {
                    g0 g0Var = (g0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (g0Var.f15803j >= iVar.f15803j) {
                        break;
                    } else if (!iVar.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g0Var, iVar)) {
                        if (g0Var.m()) {
                            g0Var.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void g0(i9.l<? super E> lVar) {
        l.a aVar = o8.l.f16183h;
        lVar.resumeWith(o8.l.a(o8.m.a(L())));
    }

    private final Object h0(E e10, d<? super q> dVar) {
        Throwable d10;
        m mVar = new m(c.b(dVar), 1);
        mVar.z();
        y8.l<E, q> lVar = this.f15493i;
        if (lVar == null || (d10 = b0.d(lVar, e10, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Throwable N = N();
            l.a aVar = o8.l.f16183h;
            if (p0.d()) {
                N = i0.i(N, mVar);
            }
            mVar.resumeWith(o8.l.a(o8.m.a(N)));
        } else {
            b.a(d10, N());
            l.a aVar2 = o8.l.f16183h;
            if (p0.d()) {
                d10 = i0.i(d10, mVar);
            }
            mVar.resumeWith(o8.l.a(o8.m.a(d10)));
        }
        Object w10 = mVar.w();
        if (w10 == d.c()) {
            h.c(dVar);
        }
        if (w10 == d.c()) {
            return w10;
        }
        return q.f16189a;
    }

    /* access modifiers changed from: private */
    public final void i0(E e10, i9.l<? super q> lVar) {
        y8.l<E, q> lVar2 = this.f15493i;
        if (lVar2 != null) {
            b0.b(lVar2, e10, lVar.getContext());
        }
        Throwable N = N();
        if (p0.d() && (lVar instanceof e)) {
            N = i0.i(N, (e) lVar);
        }
        l.a aVar = o8.l.f16183h;
        lVar.resumeWith(o8.l.a(o8.m.a(N)));
    }

    /* access modifiers changed from: private */
    public final void l0(s2 s2Var, i<E> iVar, int i10) {
        k0();
        s2Var.a(iVar, i10);
    }

    /* access modifiers changed from: private */
    public final void m0(s2 s2Var, i<E> iVar, int i10) {
        s2Var.a(iVar, i10 + c.f15505b);
    }

    static /* synthetic */ <E> Object n0(b<E> bVar, d<? super E> dVar) {
        i iVar = (i) f15488p.get(bVar);
        while (!bVar.V()) {
            long andIncrement = f15484l.getAndIncrement(bVar);
            int i10 = c.f15505b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (iVar.f15803j != j10) {
                i a10 = bVar.H(j10, iVar);
                if (a10 == null) {
                    continue;
                } else {
                    iVar = a10;
                }
            }
            Object u10 = bVar.A0(iVar, i11, andIncrement, (Object) null);
            if (u10 == c.f15516m) {
                throw new IllegalStateException("unexpected".toString());
            } else if (u10 == c.f15518o) {
                if (andIncrement < bVar.O()) {
                    iVar.b();
                }
            } else if (u10 == c.f15517n) {
                return bVar.o0(iVar, i11, andIncrement, dVar);
            } else {
                iVar.b();
                return u10;
            }
        }
        throw i0.j(bVar.L());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: i9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: q9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: y8.l<E, o8.q>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: y8.l<java.lang.Throwable, o8.q>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: q9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: q9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: y8.l<E, o8.q>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: y8.l<java.lang.Throwable, o8.q>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: q9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: q9.a} */
    /* JADX WARNING: type inference failed for: r7v2, types: [y8.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object o0(k9.i<E> r9, int r10, long r11, r8.d<? super E> r13) {
        /*
            r8 = this;
            r8.d r0 = s8.c.b(r13)
            i9.m r0 = i9.o.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.A0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            n9.j0 r2 = k9.c.f15516m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x001c
            r8.l0(r0, r9, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x001c:
            n9.j0 r10 = k9.c.f15518o     // Catch:{ all -> 0x00d1 }
            r7 = 0
            if (r1 != r10) goto L_0x00b3
            long r1 = r8.O()     // Catch:{ all -> 0x00d1 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002e
            r9.b()     // Catch:{ all -> 0x00d1 }
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f15488p     // Catch:{ all -> 0x00d1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00d1 }
            k9.i r9 = (k9.i) r9     // Catch:{ all -> 0x00d1 }
        L_0x0038:
            boolean r10 = r8.V()     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0043
            r8.g0(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f15484l     // Catch:{ all -> 0x00d1 }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x00d1 }
            int r12 = k9.c.f15505b     // Catch:{ all -> 0x00d1 }
            long r1 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x00d1 }
            long r3 = r9.f15803j     // Catch:{ all -> 0x00d1 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            k9.i r1 = r8.H(r1, r9)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0061
            goto L_0x0038
        L_0x0061:
            r9 = r1
        L_0x0062:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.A0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            n9.j0 r2 = k9.c.f15516m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x007c
            boolean r10 = r0 instanceof i9.s2     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0076
            r7 = r0
        L_0x0076:
            if (r7 == 0) goto L_0x00c3
            r8.l0(r7, r9, r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x007c:
            n9.j0 r12 = k9.c.f15518o     // Catch:{ all -> 0x00d1 }
            if (r1 != r12) goto L_0x008e
            long r1 = r8.O()     // Catch:{ all -> 0x00d1 }
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0038
            r9.b()     // Catch:{ all -> 0x00d1 }
            goto L_0x0038
        L_0x008e:
            n9.j0 r10 = k9.c.f15517n     // Catch:{ all -> 0x00d1 }
            if (r1 == r10) goto L_0x00a7
            r9.b()     // Catch:{ all -> 0x00d1 }
            y8.l<E, o8.q> r9 = r8.f15493i     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            r8.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            y8.l r7 = n9.b0.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            r0.d(r1, r7)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            r9.b()     // Catch:{ all -> 0x00d1 }
            y8.l<E, o8.q> r9 = r8.f15493i     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            r8.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            y8.l r7 = n9.b0.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a3
        L_0x00c3:
            java.lang.Object r9 = r0.w()
            java.lang.Object r10 = s8.d.c()
            if (r9 != r10) goto L_0x00d0
            kotlin.coroutines.jvm.internal.h.c(r13)
        L_0x00d0:
            return r9
        L_0x00d1:
            r9 = move-exception
            r0.I()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.o0(k9.i, int, long, r8.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        r13 = (k9.i) r13.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p0(k9.i<E> r13) {
        /*
            r12 = this;
            y8.l<E, o8.q> r0 = r12.f15493i
            r1 = 0
            r2 = 1
            java.lang.Object r3 = n9.p.b(r1, r2, r1)
        L_0x0008:
            int r4 = k9.c.f15505b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b4
            long r6 = r13.f15803j
            int r8 = k9.c.f15505b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0017:
            java.lang.Object r8 = r13.w(r4)
            n9.j0 r9 = k9.c.f15512i
            if (r8 == r9) goto L_0x00bc
            n9.j0 r9 = k9.c.f15507d
            if (r8 != r9) goto L_0x0049
            long r9 = r12.M()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            n9.j0 r9 = k9.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0041
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = n9.b0.c(r0, r5, r1)
        L_0x0041:
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x0049:
            n9.j0 r9 = k9.c.f15508e
            if (r8 == r9) goto L_0x00a3
            if (r8 != 0) goto L_0x0052
            goto L_0x00a3
        L_0x0052:
            boolean r9 = r8 instanceof i9.s2
            if (r9 != 0) goto L_0x006f
            boolean r9 = r8 instanceof k9.t
            if (r9 == 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            n9.j0 r9 = k9.c.f15510g
            if (r8 == r9) goto L_0x00bc
            n9.j0 r9 = k9.c.f15509f
            if (r8 != r9) goto L_0x0068
            goto L_0x00bc
        L_0x0068:
            n9.j0 r9 = k9.c.f15510g
            if (r8 == r9) goto L_0x0017
            goto L_0x00b0
        L_0x006f:
            long r9 = r12.M()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            boolean r9 = r8 instanceof k9.t
            if (r9 == 0) goto L_0x0081
            r9 = r8
            k9.t r9 = (k9.t) r9
            i9.s2 r9 = r9.f15546a
            goto L_0x0084
        L_0x0081:
            r9 = r8
            i9.s2 r9 = (i9.s2) r9
        L_0x0084:
            n9.j0 r10 = k9.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0098
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = n9.b0.c(r0, r5, r1)
        L_0x0098:
            java.lang.Object r3 = n9.p.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x00a3:
            n9.j0 r9 = k9.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            r13.p()
        L_0x00b0:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b4:
            n9.f r13 = r13.g()
            k9.i r13 = (k9.i) r13
            if (r13 != 0) goto L_0x0008
        L_0x00bc:
            if (r3 == 0) goto L_0x00e2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x00c8
            i9.s2 r3 = (i9.s2) r3
            r12.r0(r3)
            goto L_0x00e2
        L_0x00c8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.m.d(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        L_0x00d4:
            if (r5 >= r13) goto L_0x00e2
            java.lang.Object r0 = r3.get(r13)
            i9.s2 r0 = (i9.s2) r0
            r12.r0(r0)
            int r13 = r13 + -1
            goto L_0x00d4
        L_0x00e2:
            if (r1 != 0) goto L_0x00e5
            return
        L_0x00e5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.p0(k9.i):void");
    }

    private final void q0(s2 s2Var) {
        s0(s2Var, true);
    }

    private final void r0(s2 s2Var) {
        s0(s2Var, false);
    }

    private final void s0(s2 s2Var, boolean z10) {
        if (s2Var instanceof C0259b) {
            i9.l<Boolean> b10 = ((C0259b) s2Var).b();
            l.a aVar = o8.l.f16183h;
            b10.resumeWith(o8.l.a(Boolean.FALSE));
        } else if (s2Var instanceof i9.l) {
            d dVar = (d) s2Var;
            l.a aVar2 = o8.l.f16183h;
            dVar.resumeWith(o8.l.a(o8.m.a(z10 ? L() : N())));
        } else if (s2Var instanceof q) {
            m<h<? extends E>> mVar = ((q) s2Var).f15545h;
            l.a aVar3 = o8.l.f16183h;
            mVar.resumeWith(o8.l.a(h.b(h.f15528b.a(K()))));
        } else if (s2Var instanceof a) {
            ((a) s2Var).j();
        } else if (s2Var instanceof q9.b) {
            ((q9.b) s2Var).c(this, c.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + s2Var).toString());
        }
    }

    static /* synthetic */ <E> Object t0(b<E> bVar, E e10, d<? super q> dVar) {
        i iVar = (i) f15487o.get(bVar);
        while (true) {
            long andIncrement = f15483k.getAndIncrement(bVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean p10 = bVar.X(andIncrement);
            int i10 = c.f15505b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar.f15803j != j11) {
                i d10 = bVar.I(j11, iVar);
                if (d10 != null) {
                    iVar = d10;
                } else if (p10) {
                    Object h02 = bVar.h0(e10, dVar);
                    if (h02 == d.c()) {
                        return h02;
                    }
                }
            }
            int v10 = bVar.C0(iVar, i11, e10, j10, (Object) null, p10);
            if (v10 == 0) {
                iVar.b();
                break;
            } else if (v10 == 1) {
                break;
            } else if (v10 != 2) {
                if (v10 == 3) {
                    Object u02 = bVar.u0(iVar, i11, e10, j10, dVar);
                    if (u02 == d.c()) {
                        return u02;
                    }
                } else if (v10 == 4) {
                    if (j10 < bVar.M()) {
                        iVar.b();
                    }
                    Object h03 = bVar.h0(e10, dVar);
                    if (h03 == d.c()) {
                        return h03;
                    }
                } else if (v10 == 5) {
                    iVar.b();
                }
            } else if (p10) {
                iVar.p();
                Object h04 = bVar.h0(e10, dVar);
                if (h04 == d.c()) {
                    return h04;
                }
            } else if (p0.a()) {
                throw new AssertionError();
            }
        }
        return q.f16189a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object u0(k9.i<E> r21, int r22, E r23, long r24, r8.d<? super o8.q> r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            r8.d r1 = s8.c.b(r26)
            i9.m r10 = i9.o.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.C0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0101
            r11 = 1
            if (r1 == r11) goto L_0x00f8
            r12 = 2
            if (r1 == r12) goto L_0x00f0
            r13 = 4
            if (r1 == r13) goto L_0x00e3
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d9
            r21.b()     // Catch:{ all -> 0x0126 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f15487o     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0126 }
            k9.i r1 = (k9.i) r1     // Catch:{ all -> 0x0126 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f15483k     // Catch:{ all -> 0x0126 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0126 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.X(r2)     // Catch:{ all -> 0x0126 }
            int r2 = k9.c.f15505b     // Catch:{ all -> 0x0126 }
            long r3 = (long) r2     // Catch:{ all -> 0x0126 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0126 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0126 }
            long r5 = r1.f15803j     // Catch:{ all -> 0x0126 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006a
            k9.i r2 = r9.I(r3, r1)     // Catch:{ all -> 0x0126 }
            if (r2 != 0) goto L_0x0068
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.i0(r0, r10)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x0068:
            r7 = r2
            goto L_0x006b
        L_0x006a:
            r7 = r1
        L_0x006b:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.C0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x00cb
            if (r1 == r11) goto L_0x00bf
            if (r1 == r12) goto L_0x00a8
            r2 = 3
            if (r1 == r2) goto L_0x009e
            if (r1 == r13) goto L_0x0092
            if (r1 == r15) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r21.b()     // Catch:{ all -> 0x0126 }
        L_0x008f:
            r1 = r21
            goto L_0x0039
        L_0x0092:
            long r1 = r20.M()     // Catch:{ all -> 0x0126 }
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00a8:
            if (r18 == 0) goto L_0x00ae
            r21.p()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00ae:
            boolean r0 = r10 instanceof i9.s2     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00b4
            r0 = r10
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x010f
            r2 = r21
            r1 = r19
            r9.m0(r0, r2, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00bf:
            o8.l$a r0 = o8.l.f16183h     // Catch:{ all -> 0x0126 }
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = o8.l.a(r0)     // Catch:{ all -> 0x0126 }
        L_0x00c7:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00cb:
            r2 = r21
            r2.b()     // Catch:{ all -> 0x0126 }
            o8.l$a r0 = o8.l.f16183h     // Catch:{ all -> 0x0126 }
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = o8.l.a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00e3:
            long r1 = r20.M()     // Catch:{ all -> 0x0126 }
            int r3 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00f0:
            r0 = r21
            r1 = r22
            r9.m0(r10, r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00f8:
            o8.l$a r0 = o8.l.f16183h     // Catch:{ all -> 0x0126 }
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = o8.l.a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x0101:
            r0 = r21
            r21.b()     // Catch:{ all -> 0x0126 }
            o8.l$a r0 = o8.l.f16183h     // Catch:{ all -> 0x0126 }
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = o8.l.a(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x010f:
            java.lang.Object r0 = r10.w()
            java.lang.Object r1 = s8.d.c()
            if (r0 != r1) goto L_0x011c
            kotlin.coroutines.jvm.internal.h.c(r26)
        L_0x011c:
            java.lang.Object r1 = s8.d.c()
            if (r0 != r1) goto L_0x0123
            return r0
        L_0x0123:
            o8.q r0 = o8.q.f16189a
            return r0
        L_0x0126:
            r0 = move-exception
            r10.I()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.u0(k9.i, int, java.lang.Object, long, r8.d):java.lang.Object");
    }

    private final boolean v0(long j10) {
        if (X(j10)) {
            return false;
        }
        return !w(j10 & 1152921504606846975L);
    }

    private final boolean w(long j10) {
        return j10 < J() || j10 < M() + ((long) this.f15492h);
    }

    private final boolean w0(Object obj, E e10) {
        if (obj instanceof q9.b) {
            return ((q9.b) obj).c(this, e10);
        }
        y8.l<Throwable, q> lVar = null;
        if (obj instanceof q) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            q qVar = (q) obj;
            m<h<? extends E>> mVar = qVar.f15545h;
            h b10 = h.b(h.f15528b.c(e10));
            y8.l<E, q> lVar2 = this.f15493i;
            if (lVar2 != null) {
                lVar = b0.a(lVar2, e10, qVar.f15545h.getContext());
            }
            return c.B(mVar, b10, lVar);
        } else if (obj instanceof a) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        } else if (obj instanceof i9.l) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            i9.l lVar3 = (i9.l) obj;
            y8.l<E, q> lVar4 = this.f15493i;
            if (lVar4 != null) {
                lVar = b0.a(lVar4, e10, lVar3.getContext());
            }
            return c.B(lVar3, e10, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean x0(Object obj, i<E> iVar, int i10) {
        if (obj instanceof i9.l) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((i9.l) obj, q.f16189a, (y8.l) null, 2, (Object) null);
        } else if (obj instanceof q9.b) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            q9.d h10 = ((q9.a) obj).h(this, q.f16189a);
            if (h10 == q9.d.REREGISTER) {
                iVar.s(i10);
            }
            return h10 == q9.d.SUCCESSFUL;
        } else if (obj instanceof C0259b) {
            return c.C(((C0259b) obj).b(), Boolean.TRUE, (y8.l) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final void y(i<E> iVar, long j10) {
        Object b10 = n9.p.b((Object) null, 1, (g) null);
        loop0:
        while (iVar != null) {
            for (int i10 = c.f15505b - 1; -1 < i10; i10--) {
                if ((iVar.f15803j * ((long) c.f15505b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object w10 = iVar.w(i10);
                    if (w10 == null || w10 == c.f15508e) {
                        if (iVar.r(i10, w10, c.z())) {
                            iVar.p();
                            break;
                        }
                    } else if (w10 instanceof t) {
                        if (iVar.r(i10, w10, c.z())) {
                            b10 = n9.p.c(b10, ((t) w10).f15546a);
                            iVar.x(i10, true);
                            break;
                        }
                    } else if (!(w10 instanceof s2)) {
                        break;
                    } else if (iVar.r(i10, w10, c.z())) {
                        b10 = n9.p.c(b10, w10);
                        iVar.x(i10, true);
                        break;
                    }
                }
            }
            iVar = (i) iVar.g();
        }
        if (b10 == null) {
            return;
        }
        if (!(b10 instanceof ArrayList)) {
            q0((s2) b10);
            return;
        }
        kotlin.jvm.internal.m.d(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) b10;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            q0((s2) arrayList.get(size));
        }
    }

    private final boolean y0(i<E> iVar, int i10, long j10) {
        Object w10 = iVar.w(i10);
        if (!(w10 instanceof s2) || j10 < f15484l.get(this) || !iVar.r(i10, w10, c.f15510g)) {
            return z0(iVar, i10, j10);
        }
        if (x0(w10, iVar, i10)) {
            iVar.A(i10, c.f15507d);
            return true;
        }
        iVar.A(i10, c.f15513j);
        iVar.x(i10, false);
        return false;
    }

    private final i<E> z() {
        i iVar = f15489q.get(this);
        i iVar2 = (i) f15487o.get(this);
        if (iVar2.f15803j > ((i) iVar).f15803j) {
            iVar = iVar2;
        }
        i iVar3 = (i) f15488p.get(this);
        if (iVar3.f15803j > ((i) iVar).f15803j) {
            iVar = iVar3;
        }
        return (i) n9.e.b((f) iVar);
    }

    private final boolean z0(i<E> iVar, int i10, long j10) {
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 instanceof s2) {
                if (j10 < f15484l.get(this)) {
                    if (iVar.r(i10, w10, new t((s2) w10))) {
                        return true;
                    }
                } else if (iVar.r(i10, w10, c.f15510g)) {
                    if (x0(w10, iVar, i10)) {
                        iVar.A(i10, c.f15507d);
                        return true;
                    }
                    iVar.A(i10, c.f15513j);
                    iVar.x(i10, false);
                    return false;
                }
            } else if (w10 == c.f15513j) {
                return false;
            } else {
                if (w10 == null) {
                    if (iVar.r(i10, w10, c.f15508e)) {
                        return true;
                    }
                } else if (w10 == c.f15507d || w10 == c.f15511h || w10 == c.f15512i || w10 == c.f15514k || w10 == c.z()) {
                    return true;
                } else {
                    if (w10 != c.f15509f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean A(Throwable th, boolean z10) {
        if (z10) {
            b0();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f15490r, this, c.f15522s, th);
        if (z10) {
            c0();
        } else {
            d0();
        }
        D();
        f0();
        if (a10) {
            S();
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public final void E(long j10) {
        UndeliveredElementException d10;
        if (!p0.a() || Y()) {
            i iVar = (i) f15488p.get(this);
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f15484l;
                long j11 = atomicLongFieldUpdater.get(this);
                if (j10 >= Math.max(((long) this.f15492h) + j11, J())) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                        int i10 = c.f15505b;
                        long j12 = j11 / ((long) i10);
                        int i11 = (int) (j11 % ((long) i10));
                        if (iVar.f15803j != j12) {
                            i H = H(j12, iVar);
                            if (H == null) {
                                continue;
                            } else {
                                iVar = H;
                            }
                        }
                        Object A0 = A0(iVar, i11, j11, (Object) null);
                        if (A0 != c.f15518o) {
                            iVar.b();
                            y8.l<E, q> lVar = this.f15493i;
                            if (!(lVar == null || (d10 = b0.d(lVar, A0, (UndeliveredElementException) null, 2, (Object) null)) == null)) {
                                throw d10;
                            }
                        } else if (j11 < O()) {
                            iVar.b();
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public final void G0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (!Z()) {
            do {
            } while (J() <= j10);
            int g10 = c.f15506c;
            int i10 = 0;
            while (i10 < g10) {
                long J = J();
                if (J != (f15486n.get(this) & 4611686018427387903L) || J != J()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15486n;
            do {
                j11 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, c.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long J2 = J();
                atomicLongFieldUpdater = f15486n;
                long j13 = atomicLongFieldUpdater.get(this);
                long j14 = j13 & 4611686018427387903L;
                boolean z10 = (4611686018427387904L & j13) != 0;
                if (J2 == j14 && J2 == J()) {
                    break;
                } else if (!z10) {
                    atomicLongFieldUpdater.compareAndSet(this, j13, c.v(j14, true));
                }
            }
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, c.v(j12 & 4611686018427387903L, false)));
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable K() {
        return (Throwable) f15490r.get(this);
    }

    public final long M() {
        return f15484l.get(this);
    }

    /* access modifiers changed from: protected */
    public final Throwable N() {
        Throwable K = K();
        return K == null ? new ClosedSendChannelException("Channel was closed") : K;
    }

    public final long O() {
        return f15483k.get(this) & 1152921504606846975L;
    }

    public final boolean P() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15488p;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long M = M();
            if (O() <= M) {
                return false;
            }
            int i10 = c.f15505b;
            long j10 = M / ((long) i10);
            if (iVar.f15803j == j10 || (iVar = H(j10, iVar)) != null) {
                iVar.b();
                if (T(iVar, (int) (M % ((long) i10)), M)) {
                    return true;
                }
                f15484l.compareAndSet(this, M, M + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f15803j < j10) {
                return false;
            }
        }
    }

    public boolean V() {
        return W(f15483k.get(this));
    }

    /* access modifiers changed from: protected */
    public boolean Y() {
        return false;
    }

    public Object b() {
        i iVar;
        long j10 = f15484l.get(this);
        long j11 = f15483k.get(this);
        if (W(j11)) {
            return h.f15528b.a(K());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return h.f15528b.b();
        }
        j0 i10 = c.f15514k;
        i iVar2 = (i) f15488p.get(this);
        while (!V()) {
            long andIncrement = f15484l.getAndIncrement(this);
            int i11 = c.f15505b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (iVar2.f15803j != j12) {
                i a10 = H(j12, iVar2);
                if (a10 == null) {
                    continue;
                } else {
                    iVar = a10;
                }
            } else {
                iVar = iVar2;
            }
            Object u10 = A0(iVar, i12, andIncrement, i10);
            if (u10 == c.f15516m) {
                s2 s2Var = i10 instanceof s2 ? (s2) i10 : null;
                if (s2Var != null) {
                    l0(s2Var, iVar, i12);
                }
                G0(andIncrement);
                iVar.p();
                return h.f15528b.b();
            } else if (u10 == c.f15518o) {
                if (andIncrement < O()) {
                    iVar.b();
                }
                iVar2 = iVar;
            } else if (u10 != c.f15517n) {
                iVar.b();
                return h.f15528b.c(u10);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return h.f15528b.a(K());
    }

    public Object c(E e10, d<? super q> dVar) {
        return t0(this, e10, dVar);
    }

    public Object e(d<? super E> dVar) {
        return n0(this, dVar);
    }

    public void f(y8.l<? super Throwable, q> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15491s;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != c.f15520q) {
                    if (obj == c.f15521r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f15491s, this, c.f15520q, c.f15521r));
            lVar.invoke(K());
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
    }

    public boolean g(Throwable th) {
        return A(th, false);
    }

    public f<E> iterator() {
        return new a();
    }

    public final void j(CancellationException cancellationException) {
        x(cancellationException);
    }

    /* access modifiers changed from: protected */
    public void j0() {
    }

    /* access modifiers changed from: protected */
    public void k0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return k9.h.f15528b.a(N());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f15483k
            long r0 = r0.get(r14)
            boolean r0 = r14.v0(r0)
            if (r0 == 0) goto L_0x0013
            k9.h$b r15 = k9.h.f15528b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0013:
            n9.j0 r8 = k9.c.f15513j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15487o
            java.lang.Object r0 = r0.get(r14)
            k9.i r0 = (k9.i) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f15483k
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.X(r1)
            int r1 = k9.c.f15505b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f15803j
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            k9.i r1 = r14.I(r2, r0)
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0021
            goto L_0x008e
        L_0x004c:
            r13 = r1
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.C0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            if (r0 == r1) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 4
            if (r0 == r1) goto L_0x0071
            r1 = 5
            if (r0 == r1) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r13.b()
        L_0x006f:
            r0 = r13
            goto L_0x0021
        L_0x0071:
            long r0 = r14.M()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            r13.b()
            goto L_0x008e
        L_0x007d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0089:
            if (r11 == 0) goto L_0x0099
            r13.p()
        L_0x008e:
            k9.h$b r15 = k9.h.f15528b
            java.lang.Throwable r0 = r14.N()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bb
        L_0x0099:
            boolean r15 = r8 instanceof i9.s2
            if (r15 == 0) goto L_0x00a0
            i9.s2 r8 = (i9.s2) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r14.m0(r8, r13, r12)
        L_0x00a6:
            r13.p()
            k9.h$b r15 = k9.h.f15528b
            java.lang.Object r15 = r15.b()
            goto L_0x00bb
        L_0x00b0:
            r13.b()
        L_0x00b3:
            k9.h$b r15 = k9.h.f15528b
            o8.q r0 = o8.q.f16189a
            java.lang.Object r15 = r15.c(r0)
        L_0x00bb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.n(java.lang.Object):java.lang.Object");
    }

    public boolean o() {
        return X(f15483k.get(this));
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [n9.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e0, code lost:
        r3 = r3.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e7, code lost:
        if (r3 != null) goto L_0x0208;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f15483k
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r3 = (int) r2
            r2 = 3
            r4 = 2
            if (r3 == r4) goto L_0x001e
            if (r3 == r2) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r3 = "cancelled,"
            r1.append(r3)
            goto L_0x0023
        L_0x001e:
            java.lang.String r3 = "closed,"
            r1.append(r3)
        L_0x0023:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "capacity="
            r3.append(r5)
            int r5 = r0.f15492h
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "data=["
            r1.append(r3)
            k9.i[] r2 = new k9.i[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15488p
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15487o
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15489q
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = p8.p.g(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r2.next()
            r8 = r4
            k9.i r8 = (k9.i) r8
            k9.i r9 = k9.c.f15504a
            if (r8 == r9) goto L_0x0081
            r8 = 1
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x006c
            r3.add(r4)
            goto L_0x006c
        L_0x0088:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020c
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009d
            goto L_0x00b7
        L_0x009d:
            r4 = r3
            k9.i r4 = (k9.i) r4
            long r8 = r4.f15803j
        L_0x00a2:
            java.lang.Object r4 = r2.next()
            r10 = r4
            k9.i r10 = (k9.i) r10
            long r10 = r10.f15803j
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b1
            r3 = r4
            r8 = r10
        L_0x00b1:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a2
        L_0x00b7:
            k9.i r3 = (k9.i) r3
            long r10 = r16.M()
            long r12 = r16.O()
        L_0x00c1:
            int r2 = k9.c.f15505b
            r4 = 0
        L_0x00c4:
            if (r4 >= r2) goto L_0x01e0
            long r8 = r3.f15803j
            int r14 = k9.c.f15505b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d7
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e9
        L_0x00d7:
            java.lang.Object r15 = r3.w(r4)
            java.lang.Object r6 = r3.v(r4)
            boolean r7 = r15 instanceof i9.l
            if (r7 == 0) goto L_0x00f9
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ed
            if (r14 < 0) goto L_0x00ed
            java.lang.String r7 = "receive"
            goto L_0x01a6
        L_0x00ed:
            if (r14 >= 0) goto L_0x00f5
            if (r7 < 0) goto L_0x00f5
            java.lang.String r7 = "send"
            goto L_0x01a6
        L_0x00f5:
            java.lang.String r7 = "cont"
            goto L_0x01a6
        L_0x00f9:
            boolean r7 = r15 instanceof q9.b
            if (r7 == 0) goto L_0x0113
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0107
            if (r14 < 0) goto L_0x0107
            java.lang.String r7 = "onReceive"
            goto L_0x01a6
        L_0x0107:
            if (r14 >= 0) goto L_0x010f
            if (r7 < 0) goto L_0x010f
            java.lang.String r7 = "onSend"
            goto L_0x01a6
        L_0x010f:
            java.lang.String r7 = "select"
            goto L_0x01a6
        L_0x0113:
            boolean r7 = r15 instanceof k9.q
            if (r7 == 0) goto L_0x011b
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a6
        L_0x011b:
            boolean r7 = r15 instanceof k9.b.C0259b
            if (r7 == 0) goto L_0x0123
            java.lang.String r7 = "sendBroadcast"
            goto L_0x01a6
        L_0x0123:
            boolean r7 = r15 instanceof k9.t
            if (r7 == 0) goto L_0x013f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a6
        L_0x013f:
            n9.j0 r7 = k9.c.f15509f
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
            if (r7 == 0) goto L_0x014b
            r7 = 1
            goto L_0x0153
        L_0x014b:
            n9.j0 r7 = k9.c.f15510g
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0153:
            if (r7 == 0) goto L_0x0158
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a6
        L_0x0158:
            if (r15 != 0) goto L_0x015c
            r7 = 1
            goto L_0x0164
        L_0x015c:
            n9.j0 r7 = k9.c.f15508e
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0164:
            if (r7 == 0) goto L_0x0168
            r7 = 1
            goto L_0x0170
        L_0x0168:
            n9.j0 r7 = k9.c.f15512i
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0170:
            if (r7 == 0) goto L_0x0174
            r7 = 1
            goto L_0x017c
        L_0x0174:
            n9.j0 r7 = k9.c.f15511h
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x017c:
            if (r7 == 0) goto L_0x0180
            r7 = 1
            goto L_0x0188
        L_0x0180:
            n9.j0 r7 = k9.c.f15514k
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0188:
            if (r7 == 0) goto L_0x018c
            r7 = 1
            goto L_0x0194
        L_0x018c:
            n9.j0 r7 = k9.c.f15513j
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x0194:
            if (r7 == 0) goto L_0x0198
            r7 = 1
            goto L_0x01a0
        L_0x0198:
            n9.j0 r7 = k9.c.z()
            boolean r7 = kotlin.jvm.internal.m.a(r15, r7)
        L_0x01a0:
            if (r7 != 0) goto L_0x01da
            java.lang.String r7 = r15.toString()
        L_0x01a6:
            if (r6 == 0) goto L_0x01c8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01da
        L_0x01c8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01da:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c4
        L_0x01e0:
            n9.f r2 = r3.e()
            r3 = r2
            k9.i r3 = (k9.i) r3
            if (r3 != 0) goto L_0x0208
        L_0x01e9:
            char r2 = g9.s.s0(r1)
            if (r2 != r5) goto L_0x01fe
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.m.e(r2, r3)
        L_0x01fe:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0208:
            r6 = 0
            r7 = 1
            goto L_0x00c1
        L_0x020c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.toString():java.lang.String");
    }

    public boolean x(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return A(th, true);
    }
}
