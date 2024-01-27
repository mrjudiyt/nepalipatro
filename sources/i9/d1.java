package i9;

/* compiled from: JobSupport.kt */
final class d1 implements p1 {

    /* renamed from: h  reason: collision with root package name */
    private final boolean f14925h;

    public d1(boolean z10) {
        this.f14925h = z10;
    }

    public boolean a() {
        return this.f14925h;
    }

    public f2 c() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
