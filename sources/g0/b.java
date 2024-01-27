package g0;

import kotlin.jvm.internal.g;

/* compiled from: SingleProcessDataStore.kt */
final class b<T> extends m<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f8676a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8677b;

    public b(T t10, int i10) {
        super((g) null);
        this.f8676a = t10;
        this.f8677b = i10;
    }

    public final void a() {
        T t10 = this.f8676a;
        boolean z10 = false;
        if ((t10 != null ? t10.hashCode() : 0) == this.f8677b) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f8676a;
    }
}
