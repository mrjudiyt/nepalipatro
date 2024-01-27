package v1;

/* compiled from: SystemIdInfo */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f12232a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12233b;

    public g(String str, int i10) {
        this.f12232a = str;
        this.f12233b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12233b != gVar.f12233b) {
            return false;
        }
        return this.f12232a.equals(gVar.f12232a);
    }

    public int hashCode() {
        return (this.f12232a.hashCode() * 31) + this.f12233b;
    }
}
