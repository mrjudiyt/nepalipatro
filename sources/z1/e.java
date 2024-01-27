package z1;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f13123a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f13124a;

        /* synthetic */ a(x xVar) {
        }

        public e a() {
            String str = this.f13124a;
            if (str != null) {
                e eVar = new e((y) null);
                eVar.f13123a = str;
                return eVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.f13124a = str;
            return this;
        }
    }

    /* synthetic */ e(y yVar) {
    }

    public static a b() {
        return new a((x) null);
    }

    public String a() {
        return this.f13123a;
    }
}
