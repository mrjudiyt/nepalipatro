package z1;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f13131a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f13132a;

        /* synthetic */ a(l0 l0Var) {
        }

        public m a() {
            if (this.f13132a != null) {
                return new m(this, (m0) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f13132a = str;
            return this;
        }
    }

    /* synthetic */ m(a aVar, m0 m0Var) {
        this.f13131a = aVar.f13132a;
    }

    public static a a() {
        return new a((l0) null);
    }

    public final String b() {
        return this.f13131a;
    }
}
