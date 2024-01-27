package p9;

import androidx.concurrent.futures.b;
import i9.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.y;

/* compiled from: WorkQueue.kt */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16268b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16269c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16270d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16271e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f16272a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<n> cls = n.class;
        f16268b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f16269c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f16270d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f16271e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        boolean z10 = true;
        if (hVar.f16256i.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f16271e.incrementAndGet(this);
        }
        int i10 = f16269c.get(this) & 127;
        while (this.f16272a.get(i10) != null) {
            Thread.yield();
        }
        this.f16272a.lazySet(i10, hVar);
        f16269c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            boolean z10 = false;
            if (hVar.f16256i.b() == 1) {
                int decrementAndGet = f16271e.decrementAndGet(this);
                if (p0.a()) {
                    if (decrementAndGet >= 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final int d() {
        return f16269c.get(this) - f16270d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16270d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f16269c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f16272a.getAndSet(i11, (Object) null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f16268b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z11 = true;
                if (hVar.f16256i.b() != 1) {
                    z11 = false;
                }
                if (z11 == z10) {
                }
            }
            int i10 = f16270d.get(this);
            int i11 = f16269c.get(this);
            while (i10 != i11) {
                if (z10 && f16271e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z10);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f16270d.get(this);
        int i12 = f16269c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f16271e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z10);
            if (m10 != null) {
                return m10;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f16272a.get(i11);
        if (hVar != null) {
            boolean z11 = true;
            if (hVar.f16256i.b() != 1) {
                z11 = false;
            }
            if (z11 == z10 && this.f16272a.compareAndSet(i11, hVar, (Object) null)) {
                if (z10) {
                    f16271e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i10, y<h> yVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t10;
        do {
            atomicReferenceFieldUpdater = f16268b;
            t10 = (h) atomicReferenceFieldUpdater.get(this);
            if (t10 == null) {
                return -2;
            }
            int i11 = 1;
            if (!(t10.f16256i.b() == 1)) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2;
            }
            long a10 = l.f16264f.a() - t10.f16255h;
            long j10 = l.f16260b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, t10, (Object) null));
        yVar.f15575h = t10;
        return -1;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f16268b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f16268b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f16268b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f16268b.getAndSet(this, (Object) null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i10, y<h> yVar) {
        T t10;
        if (i10 == 3) {
            t10 = i();
        } else {
            t10 = l(i10);
        }
        if (t10 == null) {
            return o(i10, yVar);
        }
        yVar.f15575h = t10;
        return -1;
    }
}
