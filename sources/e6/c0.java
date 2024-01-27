package e6;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class c0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f14248a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14249b;

    /* synthetic */ c0(int i10, boolean z10, b0 b0Var) {
        this.f14248a = i10;
        this.f14249b = z10;
    }

    public final boolean a() {
        return this.f14249b;
    }

    public final int b() {
        return this.f14248a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f14248a == dVar.b() && this.f14249b == dVar.a();
        }
    }

    public final int hashCode() {
        return ((this.f14248a ^ 1000003) * 1000003) ^ (true != this.f14249b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f14248a;
        boolean z10 = this.f14249b;
        return "AppUpdateOptions{appUpdateType=" + i10 + ", allowAssetPackDeletion=" + z10 + "}";
    }
}
