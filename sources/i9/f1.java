package i9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import n9.p0;
import n9.q0;
import n9.w;
import o8.q;
import r8.g;

/* compiled from: EventLoop.common.kt */
public abstract class f1 extends g1 implements v0 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14937m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14938n;

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14939o;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    public static abstract class a implements Runnable, Comparable<a>, b1, q0 {
        private volatile Object _heap;

        /* renamed from: h  reason: collision with root package name */
        public long f14940h;

        /* renamed from: i  reason: collision with root package name */
        private int f14941i;

        public p0<?> a() {
            Object obj = this._heap;
            if (obj instanceof p0) {
                return (p0) obj;
            }
            return null;
        }

        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj != i1.f14948a) {
                    b bVar = obj instanceof b ? (b) obj : null;
                    if (bVar != null) {
                        bVar.g(this);
                    }
                    this._heap = i1.f14948a;
                    q qVar = q.f16189a;
                }
            }
        }

        public int e() {
            return this.f14941i;
        }

        public void f(int i10) {
            this.f14941i = i10;
        }

        public void g(p0<?> p0Var) {
            if (this._heap != i1.f14948a) {
                this._heap = p0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: k */
        public int compareTo(a aVar) {
            int i10 = ((this.f14940h - aVar.f14940h) > 0 ? 1 : ((this.f14940h - aVar.f14940h) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final int l(long j10, b bVar, f1 f1Var) {
            synchronized (this) {
                if (this._heap == i1.f14948a) {
                    return 2;
                }
                synchronized (bVar) {
                    a aVar = (a) bVar.b();
                    if (f1Var.h1()) {
                        return 1;
                    }
                    if (aVar == null) {
                        bVar.f14942c = j10;
                    } else {
                        long j11 = aVar.f14940h;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - bVar.f14942c > 0) {
                            bVar.f14942c = j10;
                        }
                    }
                    long j12 = this.f14940h;
                    long j13 = bVar.f14942c;
                    if (j12 - j13 < 0) {
                        this.f14940h = j13;
                    }
                    bVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean m(long j10) {
            return j10 - this.f14940h >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f14940h + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class b extends p0<a> {

        /* renamed from: c  reason: collision with root package name */
        public long f14942c;

        public b(long j10) {
            this.f14942c = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<f1> cls2 = f1.class;
        f14937m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f14938n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
        f14939o = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleted");
    }

    private final void d1() {
        if (!p0.a() || h1()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14937m;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    if (androidx.concurrent.futures.b.a(f14937m, this, (Object) null, i1.f14949b)) {
                        return;
                    }
                } else if (obj instanceof w) {
                    ((w) obj).d();
                    return;
                } else if (obj != i1.f14949b) {
                    w wVar = new w(8, true);
                    m.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    wVar.a((Runnable) obj);
                    if (androidx.concurrent.futures.b.a(f14937m, this, obj, wVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable e1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14937m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof w) {
                m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                w wVar = (w) obj;
                Object j10 = wVar.j();
                if (j10 != w.f15861h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f14937m, this, obj, wVar.i());
            } else if (obj == i1.f14949b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f14937m, this, obj, (Object) null)) {
                    m.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean g1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14937m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h1()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f14937m, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof w) {
                m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                w wVar = (w) obj;
                int a10 = wVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f14937m, this, obj, wVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == i1.f14949b) {
                return false;
            } else {
                w wVar2 = new w(8, true);
                m.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                wVar2.a((Runnable) obj);
                wVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f14937m, this, obj, wVar2)) {
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean h1() {
        return f14939o.get(this) != 0;
    }

    private final void j1() {
        a aVar;
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f14938n.get(this);
            if (bVar != null && (aVar = (a) bVar.i()) != null) {
                a1(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: i9.f1$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m1(long r4, i9.f1.a r6) {
        /*
            r3 = this;
            boolean r0 = r3.h1()
            if (r0 == 0) goto L_0x0008
            r4 = 1
            return r4
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f14938n
            java.lang.Object r1 = r0.get(r3)
            i9.f1$b r1 = (i9.f1.b) r1
            if (r1 != 0) goto L_0x0025
            r1 = 0
            i9.f1$b r2 = new i9.f1$b
            r2.<init>(r4)
            androidx.concurrent.futures.b.a(r0, r3, r1, r2)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.m.c(r0)
            r1 = r0
            i9.f1$b r1 = (i9.f1.b) r1
        L_0x0025:
            int r4 = r6.l(r4, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.f1.m1(long, i9.f1$a):int");
    }

    private final void n1(boolean z10) {
        f14939o.set(this, z10 ? 1 : 0);
    }

    private final boolean o1(a aVar) {
        b bVar = (b) f14938n.get(this);
        return (bVar != null ? (a) bVar.e() : null) == aVar;
    }

    public final void K0(g gVar, Runnable runnable) {
        f1(runnable);
    }

    /* access modifiers changed from: protected */
    public long R0() {
        a aVar;
        if (super.R0() == 0) {
            return 0;
        }
        Object obj = f14937m.get(this);
        if (obj != null) {
            if (obj instanceof w) {
                if (!((w) obj).g()) {
                    return 0;
                }
            } else if (obj == i1.f14949b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        b bVar = (b) f14938n.get(this);
        if (bVar == null || (aVar = (a) bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = aVar.f14940h;
        c.a();
        return l.b(j10 - System.nanoTime(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long W0() {
        /*
            r9 = this;
            boolean r0 = r9.X0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f14938n
            java.lang.Object r0 = r0.get(r9)
            i9.f1$b r0 = (i9.f1.b) r0
            if (r0 == 0) goto L_0x0049
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0049
            i9.c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            n9.q0 r5 = r0.b()     // Catch:{ all -> 0x0046 }
            r6 = 0
            if (r5 != 0) goto L_0x002a
            monitor-exit(r0)
            goto L_0x0041
        L_0x002a:
            i9.f1$a r5 = (i9.f1.a) r5     // Catch:{ all -> 0x0046 }
            boolean r7 = r5.m(r3)     // Catch:{ all -> 0x0046 }
            r8 = 0
            if (r7 == 0) goto L_0x0038
            boolean r5 = r9.g1(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            n9.q0 r5 = r0.h(r8)     // Catch:{ all -> 0x0046 }
            r6 = r5
        L_0x0040:
            monitor-exit(r0)
        L_0x0041:
            i9.f1$a r6 = (i9.f1.a) r6
            if (r6 != 0) goto L_0x0020
            goto L_0x0049
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0049:
            java.lang.Runnable r0 = r9.e1()
            if (r0 == 0) goto L_0x0053
            r0.run()
            return r1
        L_0x0053:
            long r0 = r9.R0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.f1.W0():long");
    }

    public void f1(Runnable runnable) {
        if (g1(runnable)) {
            b1();
        } else {
            r0.f14983p.f1(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean i1() {
        if (!V0()) {
            return false;
        }
        b bVar = (b) f14938n.get(this);
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = f14937m.get(this);
        if (obj != null) {
            if (obj instanceof w) {
                return ((w) obj).g();
            }
            if (obj == i1.f14949b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void k1() {
        f14937m.set(this, (Object) null);
        f14938n.set(this, (Object) null);
    }

    public final void l1(long j10, a aVar) {
        int m12 = m1(j10, aVar);
        if (m12 != 0) {
            if (m12 == 1) {
                a1(j10, aVar);
            } else if (m12 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (o1(aVar)) {
            b1();
        }
    }

    public void shutdown() {
        o2.f14972a.c();
        n1(true);
        d1();
        do {
        } while (W0() <= 0);
        j1();
    }
}
