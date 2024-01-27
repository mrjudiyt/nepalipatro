package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: GetTopicsRequest.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3899a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3900b;

    /* compiled from: GetTopicsRequest.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f3901a = "";

        /* renamed from: b  reason: collision with root package name */
        private boolean f3902b = true;

        public final b a() {
            if (this.f3901a.length() > 0) {
                return new b(this.f3901a, this.f3902b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final a b(String str) {
            m.f(str, "adsSdkName");
            this.f3901a = str;
            return this;
        }

        public final a c(boolean z10) {
            this.f3902b = z10;
            return this;
        }
    }

    public b() {
        this((String) null, false, 3, (g) null);
    }

    public b(String str, boolean z10) {
        m.f(str, "adsSdkName");
        this.f3899a = str;
        this.f3900b = z10;
    }

    public final String a() {
        return this.f3899a;
    }

    public final boolean b() {
        return this.f3900b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!m.a(this.f3899a, bVar.f3899a) || this.f3900b != bVar.f3900b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f3899a.hashCode() * 31) + a.a(this.f3900b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f3899a + ", shouldRecordObservation=" + this.f3900b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
