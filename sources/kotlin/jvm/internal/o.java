package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
public final class o implements d {

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f15570h;

    /* renamed from: i  reason: collision with root package name */
    private final String f15571i;

    public o(Class<?> cls, String str) {
        m.f(cls, "jClass");
        m.f(str, "moduleName");
        this.f15570h = cls;
        this.f15571i = str;
    }

    public Class<?> c() {
        return this.f15570h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && m.a(c(), ((o) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
