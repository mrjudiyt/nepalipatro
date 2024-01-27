package i9;

import o8.q;
import y8.l;

/* compiled from: CancellableContinuationImpl.kt */
final class r1 extends j {

    /* renamed from: h  reason: collision with root package name */
    private final l<Throwable, q> f14985h;

    public r1(l<? super Throwable, q> lVar) {
        this.f14985h = lVar;
    }

    public void f(Throwable th) {
        this.f14985h.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return q.f16189a;
    }

    public String toString() {
        return "InvokeOnCancel[" + q0.a(this.f14985h) + '@' + q0.b(this) + ']';
    }
}
