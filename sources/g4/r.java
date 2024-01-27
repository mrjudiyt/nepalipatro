package g4;

/* compiled from: AuxEffectInfo */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f8862a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8863b;

    public r(int i10, float f10) {
        this.f8862a = i10;
        this.f8863b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f8862a == rVar.f8862a && Float.compare(rVar.f8863b, this.f8863b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f8862a) * 31) + Float.floatToIntBits(this.f8863b);
    }
}
