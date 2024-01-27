package androidx.window.layout;

import kotlin.jvm.internal.g;

/* compiled from: FoldingFeature.kt */
public interface j extends e {

    /* compiled from: FoldingFeature.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0080a f4612b = new C0080a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f4613c = new a("NONE");

        /* renamed from: d  reason: collision with root package name */
        public static final a f4614d = new a("FULL");

        /* renamed from: a  reason: collision with root package name */
        private final String f4615a;

        /* renamed from: androidx.window.layout.j$a$a  reason: collision with other inner class name */
        /* compiled from: FoldingFeature.kt */
        public static final class C0080a {
            private C0080a() {
            }

            public /* synthetic */ C0080a(g gVar) {
                this();
            }
        }

        private a(String str) {
            this.f4615a = str;
        }

        public String toString() {
            return this.f4615a;
        }
    }

    /* compiled from: FoldingFeature.kt */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f4616b = new a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final b f4617c = new b("FLAT");

        /* renamed from: d  reason: collision with root package name */
        public static final b f4618d = new b("HALF_OPENED");

        /* renamed from: a  reason: collision with root package name */
        private final String f4619a;

        /* compiled from: FoldingFeature.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        private b(String str) {
            this.f4619a = str;
        }

        public String toString() {
            return this.f4619a;
        }
    }

    b d();

    a e();
}
