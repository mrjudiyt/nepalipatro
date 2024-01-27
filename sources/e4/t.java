package e4;

/* compiled from: RendererConfiguration */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final t f8137b = new t(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8138a;

    public t(boolean z10) {
        this.f8138a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass() && this.f8138a == ((t) obj).f8138a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8138a ^ true ? 1 : 0;
    }
}
