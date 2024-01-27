package r9;

import i9.s2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;
import y8.l;
import y8.p;

/* compiled from: Semaphore.kt */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16425c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16426d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16427e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16428f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16429g;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    private final int f16430a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Throwable, q> f16431b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* compiled from: Semaphore.kt */
    /* synthetic */ class a extends j implements p<Long, f, f> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f16432h = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f c(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (f) obj2);
        }
    }

    /* compiled from: Semaphore.kt */
    static final class b extends n implements l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f16433h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f16433h = dVar;
        }

        public final void a(Throwable th) {
            this.f16433h.i();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    /* compiled from: Semaphore.kt */
    /* synthetic */ class c extends j implements p<Long, f, f> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f16434h = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f c(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (f) obj2);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<d> cls2 = d.class;
        f16425c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f16426d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f16427e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f16428f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f16429g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public d(int i10, int i11) {
        this.f16430a = i10;
        boolean z10 = true;
        if (i10 > 0) {
            if ((i11 < 0 || i11 > i10) ? false : z10) {
                f fVar = new f(0, (f) null, 2);
                this.head = fVar;
                this.tail = fVar;
                this._availablePermits = i10 - i11;
                this.f16431b = new b(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0051, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e(i9.s2 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f16427e
            java.lang.Object r3 = r2.get(r0)
            r9.f r3 = (r9.f) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f16428f
            long r4 = r4.getAndIncrement(r0)
            r9.d$a r6 = r9.d.a.f16432h
            int r7 = r9.e.f16440f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x001b:
            java.lang.Object r9 = n9.e.c(r3, r7, r6)
            boolean r10 = n9.h0.c(r9)
            if (r10 != 0) goto L_0x005e
            n9.g0 r10 = n9.h0.b(r9)
        L_0x0029:
            java.lang.Object r13 = r2.get(r0)
            n9.g0 r13 = (n9.g0) r13
            long r14 = r13.f15803j
            long r11 = r10.f15803j
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0039
        L_0x0037:
            r10 = 1
            goto L_0x0051
        L_0x0039:
            boolean r11 = r10.q()
            if (r11 != 0) goto L_0x0041
            r10 = 0
            goto L_0x0051
        L_0x0041:
            boolean r11 = androidx.concurrent.futures.b.a(r2, r0, r13, r10)
            if (r11 == 0) goto L_0x0054
            boolean r10 = r13.m()
            if (r10 == 0) goto L_0x0037
            r13.k()
            goto L_0x0037
        L_0x0051:
            if (r10 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0054:
            boolean r11 = r10.m()
            if (r11 == 0) goto L_0x0029
            r10.k()
            goto L_0x0029
        L_0x005e:
            n9.g0 r2 = n9.h0.b(r9)
            r9.f r2 = (r9.f) r2
            int r3 = r9.e.f16440f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.r()
            boolean r4 = r5.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L_0x007b
            r1.a(r2, r3)
            r1 = 1
            return r1
        L_0x007b:
            n9.j0 r4 = r9.e.f16436b
            n9.j0 r5 = r9.e.f16437c
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r2.r()
            boolean r4 = r6.compareAndSet(r3, r4, r5)
            if (r4 == 0) goto L_0x00c9
            boolean r2 = r1 instanceof i9.l
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.m.d(r1, r2)
            i9.l r1 = (i9.l) r1
            o8.q r2 = o8.q.f16189a
            y8.l<java.lang.Throwable, o8.q> r3 = r0.f16431b
            r1.d(r2, r3)
        L_0x009f:
            r1 = 1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1 instanceof q9.b
            if (r2 == 0) goto L_0x00ae
            q9.b r1 = (q9.b) r1
            o8.q r2 = o8.q.f16189a
            r1.d(r2)
            goto L_0x009f
        L_0x00ad:
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c9:
            r1 = 1
            boolean r4 = i9.p0.a()
            if (r4 == 0) goto L_0x00ea
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.r()
            java.lang.Object r2 = r2.get(r3)
            n9.j0 r3 = r9.e.f16438d
            if (r2 != r3) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r12 == 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00ea:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.d.e(i9.s2):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final void f() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f16429g
            int r1 = r0.get(r3)
            int r2 = r3.f16430a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.d.f():void");
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f16429g.getAndDecrement(this);
        } while (andDecrement > this.f16430a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (obj instanceof i9.l) {
            m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            i9.l lVar = (i9.l) obj;
            Object m10 = lVar.m(q.f16189a, (Object) null, this.f16431b);
            if (m10 == null) {
                return false;
            }
            lVar.p(m10);
            return true;
        } else if (obj instanceof q9.b) {
            return ((q9.b) obj).c(this, q.f16189a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean l() {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f16425c
            java.lang.Object r2 = r1.get(r0)
            r9.f r2 = (r9.f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f16426d
            long r3 = r3.getAndIncrement(r0)
            int r5 = r9.e.f16440f
            long r5 = (long) r5
            long r5 = r3 / r5
            r9.d$c r7 = r9.d.c.f16434h
        L_0x0019:
            java.lang.Object r8 = n9.e.c(r2, r5, r7)
            boolean r9 = n9.h0.c(r8)
            if (r9 != 0) goto L_0x005c
            n9.g0 r9 = n9.h0.b(r8)
        L_0x0027:
            java.lang.Object r12 = r1.get(r0)
            n9.g0 r12 = (n9.g0) r12
            long r13 = r12.f15803j
            long r10 = r9.f15803j
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 < 0) goto L_0x0037
        L_0x0035:
            r9 = 1
            goto L_0x004f
        L_0x0037:
            boolean r10 = r9.q()
            if (r10 != 0) goto L_0x003f
            r9 = 0
            goto L_0x004f
        L_0x003f:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r0, r12, r9)
            if (r10 == 0) goto L_0x0052
            boolean r9 = r12.m()
            if (r9 == 0) goto L_0x0035
            r12.k()
            goto L_0x0035
        L_0x004f:
            if (r9 == 0) goto L_0x0019
            goto L_0x005c
        L_0x0052:
            boolean r10 = r9.m()
            if (r10 == 0) goto L_0x0027
            r9.k()
            goto L_0x0027
        L_0x005c:
            n9.g0 r1 = n9.h0.b(r8)
            r9.f r1 = (r9.f) r1
            r1.b()
            long r7 = r1.f15803j
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            r2 = 0
            return r2
        L_0x006d:
            int r2 = r9.e.f16440f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            n9.j0 r3 = r9.e.f16436b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto L_0x00b0
            int r3 = r9.e.f16435a
            r10 = 0
        L_0x0087:
            if (r10 >= r3) goto L_0x009d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            n9.j0 r5 = r9.e.f16437c
            if (r4 != r5) goto L_0x0099
            r4 = 1
            return r4
        L_0x0099:
            r4 = 1
            int r10 = r10 + 1
            goto L_0x0087
        L_0x009d:
            r4 = 1
            n9.j0 r3 = r9.e.f16436b
            n9.j0 r5 = r9.e.f16438d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        L_0x00b0:
            n9.j0 r1 = r9.e.f16439e
            if (r3 != r1) goto L_0x00b8
            r1 = 0
            return r1
        L_0x00b8:
            boolean r1 = r0.k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.d.l():boolean");
    }

    /* access modifiers changed from: protected */
    public final void d(i9.l<? super q> lVar) {
        while (g() <= 0) {
            m.d(lVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((s2) lVar)) {
                return;
            }
        }
        lVar.d(q.f16189a, this.f16431b);
    }

    public int h() {
        return Math.max(f16429g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f16429g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f16430a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.l()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.f()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f16430a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.d.i():void");
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16429g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f16430a) {
                f();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
