package n9;

import i9.p0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g;

/* compiled from: LockFreeTaskQueue.kt */
public final class w<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15858e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15859f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f15860g;

    /* renamed from: h  reason: collision with root package name */
    public static final j0 f15861h = new j0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    private final int f15862a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15863b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15864c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReferenceArray f15865d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15866a;

        public b(int i10) {
            this.f15866a = i10;
        }
    }

    static {
        Class<w> cls = w.class;
        f15859f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f15860g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public w(int i10, boolean z10) {
        this.f15862a = i10;
        this.f15863b = z10;
        int i11 = i10 - 1;
        this.f15864c = i11;
        this.f15865d = new AtomicReferenceArray(i10);
        boolean z11 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final w<E> b(long j10) {
        w<E> wVar = new w<>(this.f15862a * 2, this.f15863b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f15864c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f15865d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                wVar.f15865d.set(wVar.f15864c & i10, obj);
                i10++;
            } else {
                f15860g.set(wVar, f15858e.d(j10, 1152921504606846976L));
                return wVar;
            }
        }
    }

    private final w<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15859f;
        while (true) {
            w<E> wVar = (w) atomicReferenceFieldUpdater.get(this);
            if (wVar != null) {
                return wVar;
            }
            androidx.concurrent.futures.b.a(f15859f, this, (Object) null, b(j10));
        }
    }

    private final w<E> e(int i10, E e10) {
        Object obj = this.f15865d.get(this.f15864c & i10);
        if (!(obj instanceof b) || ((b) obj).f15866a != i10) {
            return null;
        }
        this.f15865d.set(i10 & this.f15864c, e10);
        return this;
    }

    private final long h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15860g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final w<E> k(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15860g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            aVar = f15858e;
            boolean z10 = false;
            i12 = (int) ((1073741823 & j10) >> 0);
            if (p0.a()) {
                if (i12 == i10) {
                    z10 = true;
                }
                if (!z10) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j10) != 0) {
                return i();
            }
        } while (!f15860g.compareAndSet(this, j10, aVar.b(j10, i11)));
        this.f15865d.set(this.f15864c & i12, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[LOOP:1: B:20:0x006d->B:23:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v3 n9.w) = (r0v2 n9.w), (r0v5 n9.w) binds: [B:19:0x0065, B:23:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f15860g
        L_0x0002:
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0016
            n9.w$a r15 = f15858e
            int r15 = r15.a(r3)
            return r15
        L_0x0016:
            n9.w$a r1 = f15858e
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r9 = 0
            long r5 = r5 >> r9
            int r2 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r10 = 30
            long r5 = r5 >> r10
            int r10 = (int) r5
            int r11 = r14.f15864c
            int r5 = r10 + 2
            r5 = r5 & r11
            r6 = r2 & r11
            r12 = 1
            if (r5 != r6) goto L_0x0034
            return r12
        L_0x0034:
            boolean r5 = r14.f15863b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.f15865d
            r13 = r10 & r11
            java.lang.Object r5 = r5.get(r13)
            if (r5 == 0) goto L_0x0053
            int r1 = r14.f15862a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L_0x0052
            int r10 = r10 - r2
            r2 = r10 & r6
            int r1 = r1 >> 1
            if (r2 <= r1) goto L_0x0002
        L_0x0052:
            return r12
        L_0x0053:
            int r2 = r10 + 1
            r2 = r2 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = f15860g
            long r12 = r1.c(r3, r2)
            r1 = r5
            r2 = r14
            r5 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0002
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f15865d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L_0x006d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f15860g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0084
            n9.w r0 = r0.i()
            n9.w r0 = r0.e(r10, r15)
            if (r0 != 0) goto L_0x006d
        L_0x0084:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.w.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15860g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j10 = f15860g.get(this);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean g() {
        long j10 = f15860g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final w<E> i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15860g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f15861h;
            }
            a aVar = f15858e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f15864c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f15865d.get(i12 & i10);
            if (obj == null) {
                if (this.f15863b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i13 = (i10 + 1) & 1073741823;
                if (f15860g.compareAndSet(this, j10, aVar.b(j10, i13))) {
                    this.f15865d.set(this.f15864c & i10, (Object) null);
                    return obj;
                } else if (this.f15863b) {
                    w wVar = this;
                    do {
                        wVar = wVar.k(i10, i13);
                    } while (wVar != null);
                    return obj;
                }
            }
        }
    }
}
