package z1;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f13129a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f13130a;

        /* synthetic */ a(j0 j0Var) {
        }

        public l a() {
            if (this.f13130a != null) {
                return new l(this, (k0) null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f13130a = str;
            return this;
        }
    }

    /* synthetic */ l(a aVar, k0 k0Var) {
        this.f13129a = aVar.f13130a;
    }

    public static a a() {
        return new a((j0) null);
    }

    public final String b() {
        return this.f13129a;
    }
}
