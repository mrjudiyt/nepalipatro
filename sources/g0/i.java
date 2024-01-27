package g0;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SingleProcessDataStore.kt */
final class i<T> extends m<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f8698a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Throwable th) {
        super((g) null);
        m.f(th, "readException");
        this.f8698a = th;
    }

    public final Throwable a() {
        return this.f8698a;
    }
}
