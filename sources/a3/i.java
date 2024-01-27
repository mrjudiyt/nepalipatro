package a3;

/* compiled from: MultiClassKey */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f36a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f37b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f38c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f36a = cls;
        this.f37b = cls2;
        this.f38c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f36a.equals(iVar.f36a) && this.f37b.equals(iVar.f37b) && k.d(this.f38c, iVar.f38c);
    }

    public int hashCode() {
        int hashCode = ((this.f36a.hashCode() * 31) + this.f37b.hashCode()) * 31;
        Class<?> cls = this.f38c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f36a + ", second=" + this.f37b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
