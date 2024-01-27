package l9;

import androidx.concurrent.futures.b;
import i9.m;
import i9.p0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import m9.c;
import o8.l;
import o8.q;
import r8.d;

/* compiled from: StateFlow.kt */
final class r extends c<p<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15706a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean a(p<?> pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15706a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, q.f15704a);
        return true;
    }

    public final Object e(d<? super q> dVar) {
        boolean z10 = true;
        m mVar = new m(c.b(dVar), 1);
        mVar.z();
        if (!p0.a() || (!(f15706a.get(this) instanceof m))) {
            if (!b.a(f15706a, this, q.f15704a, mVar)) {
                if (p0.a()) {
                    if (f15706a.get(this) != q.f15705b) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                l.a aVar = l.f16183h;
                mVar.resumeWith(l.a(q.f16189a));
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
        throw new AssertionError();
    }

    /* renamed from: f */
    public d<q>[] b(p<?> pVar) {
        f15706a.set(this, (Object) null);
        return m9.b.f15746a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15706a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != q.f15705b) {
                if (obj == q.f15704a) {
                    if (b.a(f15706a, this, obj, q.f15705b)) {
                        return;
                    }
                } else if (b.a(f15706a, this, obj, q.f15704a)) {
                    l.a aVar = l.f16183h;
                    ((m) obj).resumeWith(l.a(q.f16189a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f15706a.getAndSet(this, q.f15704a);
        kotlin.jvm.internal.m.c(andSet);
        if (p0.a() && !(!(andSet instanceof m))) {
            throw new AssertionError();
        } else if (andSet == q.f15705b) {
            return true;
        } else {
            return false;
        }
    }
}
