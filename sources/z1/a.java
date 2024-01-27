package z1;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f13121a;

    /* renamed from: z1.a$a  reason: collision with other inner class name */
    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class C0220a {

        /* renamed from: a  reason: collision with root package name */
        private String f13122a;

        /* synthetic */ C0220a(n nVar) {
        }

        public a a() {
            String str = this.f13122a;
            if (str != null) {
                a aVar = new a((b0) null);
                aVar.f13121a = str;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public C0220a b(String str) {
            this.f13122a = str;
            return this;
        }
    }

    /* synthetic */ a(b0 b0Var) {
    }

    public static C0220a b() {
        return new C0220a((n) null);
    }

    public String a() {
        return this.f13121a;
    }
}
