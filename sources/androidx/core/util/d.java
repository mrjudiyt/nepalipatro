package androidx.core.util;

/* compiled from: Pair */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f2454a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2455b;

    public d(F f10, S s10) {
        this.f2454a = f10;
        this.f2455b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f2454a, this.f2454a) || !c.a(dVar.f2455b, this.f2455b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f10 = this.f2454a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f2455b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f2454a + " " + this.f2455b + "}";
    }
}
