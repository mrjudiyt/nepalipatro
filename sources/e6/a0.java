package e6;

import e6.d;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class a0 extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private int f14245a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14246b;

    /* renamed from: c  reason: collision with root package name */
    private byte f14247c;

    a0() {
    }

    public final d a() {
        if (this.f14247c == 3) {
            return new c0(this.f14245a, this.f14246b, (b0) null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f14247c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f14247c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final d.a b(boolean z10) {
        this.f14246b = z10;
        this.f14247c = (byte) (this.f14247c | 2);
        return this;
    }

    public final d.a c(int i10) {
        this.f14245a = i10;
        this.f14247c = (byte) (this.f14247c | 1);
        return this;
    }
}
