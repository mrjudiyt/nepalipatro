package ea;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;

/* compiled from: SegmentPool.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final int f14400a = 65536;

    /* renamed from: b  reason: collision with root package name */
    private static final u f14401b = new u(new byte[0], 0, 0, false, false);

    /* renamed from: c  reason: collision with root package name */
    private static final int f14402c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<u>[] f14403d;

    /* renamed from: e  reason: collision with root package name */
    public static final v f14404e = new v();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f14402c = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f14403d = atomicReferenceArr;
    }

    private v() {
    }

    private final AtomicReference<u> a() {
        Thread currentThread = Thread.currentThread();
        m.b(currentThread, "Thread.currentThread()");
        return f14403d[(int) (currentThread.getId() & (((long) f14402c) - 1))];
    }

    public static final void b(u uVar) {
        AtomicReference<u> a10;
        u uVar2;
        m.g(uVar, "segment");
        if (!(uVar.f14398f == null && uVar.f14399g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.f14396d && (uVar2 = a10.get()) != f14401b) {
            int i10 = uVar2 != null ? uVar2.f14395c : 0;
            if (i10 < f14400a) {
                uVar.f14398f = uVar2;
                uVar.f14394b = 0;
                uVar.f14395c = i10 + 8192;
                if (!(a10 = f14404e.a()).compareAndSet(uVar2, uVar)) {
                    uVar.f14398f = null;
                }
            }
        }
    }

    public static final u c() {
        AtomicReference<u> a10 = f14404e.a();
        u uVar = f14401b;
        u andSet = a10.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            a10.set((Object) null);
            return new u();
        }
        a10.set(andSet.f14398f);
        andSet.f14398f = null;
        andSet.f14395c = 0;
        return andSet;
    }
}
