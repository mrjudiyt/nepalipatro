package g0;

import kotlin.jvm.internal.m;

/* compiled from: SingleProcessDataStore.kt */
final class g<T> extends m<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f8697a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Throwable th) {
        super((kotlin.jvm.internal.g) null);
        m.f(th, "finalException");
        this.f8697a = th;
    }

    public final Throwable a() {
        return this.f8697a;
    }
}
