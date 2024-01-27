package i9;

import o8.l;
import o8.m;
import o8.q;

/* compiled from: JobSupport.kt */
final class j2<T> extends z1 {

    /* renamed from: l  reason: collision with root package name */
    private final m<T> f14952l;

    public j2(m<? super T> mVar) {
        this.f14952l = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        t((Throwable) obj);
        return q.f16189a;
    }

    public void t(Throwable th) {
        Object X = u().X();
        if (p0.a() && !(!(X instanceof p1))) {
            throw new AssertionError();
        } else if (X instanceof z) {
            m<T> mVar = this.f14952l;
            l.a aVar = l.f16183h;
            mVar.resumeWith(l.a(m.a(((z) X).f15006a)));
        } else {
            m<T> mVar2 = this.f14952l;
            l.a aVar2 = l.f16183h;
            mVar2.resumeWith(l.a(b2.h(X)));
        }
    }
}
