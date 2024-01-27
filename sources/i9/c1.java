package i9;

import o8.q;

/* compiled from: CancellableContinuation.kt */
final class c1 extends j {

    /* renamed from: h  reason: collision with root package name */
    private final b1 f14922h;

    public c1(b1 b1Var) {
        this.f14922h = b1Var;
    }

    public void f(Throwable th) {
        this.f14922h.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return q.f16189a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f14922h + ']';
    }
}
