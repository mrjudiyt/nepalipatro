package v7;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import w7.h;

/* compiled from: ConnectionSpec */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    private static final g[] f16845e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f16846f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f16847g;

    /* renamed from: h  reason: collision with root package name */
    public static final j f16848h = new b(false).e();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16849a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16850b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String[] f16851c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f16852d;

    static {
        g[] gVarArr = {g.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, g.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, g.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, g.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, g.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, g.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, g.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, g.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, g.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, g.TLS_RSA_WITH_AES_128_GCM_SHA256, g.TLS_RSA_WITH_AES_128_CBC_SHA, g.TLS_RSA_WITH_AES_256_CBC_SHA, g.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f16845e = gVarArr;
        b g10 = new b(true).g(gVarArr);
        a0 a0Var = a0.TLS_1_0;
        j e10 = g10.j(a0.TLS_1_2, a0.TLS_1_1, a0Var).h(true).e();
        f16846f = e10;
        f16847g = new b(e10).j(a0Var).h(true).e();
    }

    private static boolean h(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String f10 : strArr) {
                if (h.f(strArr2, f10)) {
                    return true;
                }
            }
        }
        return false;
    }

    private j i(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        Class<String> cls = String.class;
        String[] strArr3 = this.f16851c;
        if (strArr3 != null) {
            strArr = (String[]) h.n(cls, strArr3, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr4 = this.f16852d;
        if (strArr4 != null) {
            strArr2 = (String[]) h.n(cls, strArr4, sSLSocket.getEnabledProtocols());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        if (z10 && h.f(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
            strArr = h.e(strArr, "TLS_FALLBACK_SCSV");
        }
        return new b(this).f(strArr).i(strArr2).e();
    }

    /* access modifiers changed from: package-private */
    public void e(SSLSocket sSLSocket, boolean z10) {
        j i10 = i(sSLSocket, z10);
        String[] strArr = i10.f16852d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = i10.f16851c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f16849a;
        if (z10 != jVar.f16849a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f16851c, jVar.f16851c) && Arrays.equals(this.f16852d, jVar.f16852d) && this.f16850b == jVar.f16850b);
    }

    public List<g> f() {
        String[] strArr = this.f16851c;
        if (strArr == null) {
            return null;
        }
        g[] gVarArr = new g[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f16851c;
            if (i10 >= strArr2.length) {
                return h.k(gVarArr);
            }
            gVarArr[i10] = g.a(strArr2[i10]);
            i10++;
        }
    }

    public boolean g(SSLSocket sSLSocket) {
        if (!this.f16849a) {
            return false;
        }
        String[] strArr = this.f16852d;
        if (strArr != null && !h(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f16851c;
        if (strArr2 == null || h(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f16849a) {
            return ((((527 + Arrays.hashCode(this.f16851c)) * 31) + Arrays.hashCode(this.f16852d)) * 31) + (this.f16850b ^ true ? 1 : 0);
        }
        return 17;
    }

    public boolean j() {
        return this.f16850b;
    }

    public List<a0> k() {
        String[] strArr = this.f16852d;
        if (strArr == null) {
            return null;
        }
        a0[] a0VarArr = new a0[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f16852d;
            if (i10 >= strArr2.length) {
                return h.k(a0VarArr);
            }
            a0VarArr[i10] = a0.a(strArr2[i10]);
            i10++;
        }
    }

    public String toString() {
        if (!this.f16849a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f16851c != null ? f().toString() : str;
        if (this.f16852d != null) {
            str = k().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f16850b + ")";
    }

    /* compiled from: ConnectionSpec */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f16853a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String[] f16854b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String[] f16855c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f16856d;

        b(boolean z10) {
            this.f16853a = z10;
        }

        public j e() {
            return new j(this);
        }

        public b f(String... strArr) {
            if (!this.f16853a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f16854b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public b g(g... gVarArr) {
            if (this.f16853a) {
                String[] strArr = new String[gVarArr.length];
                for (int i10 = 0; i10 < gVarArr.length; i10++) {
                    strArr[i10] = gVarArr[i10].f16836h;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public b h(boolean z10) {
            if (this.f16853a) {
                this.f16856d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public b i(String... strArr) {
            if (!this.f16853a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f16855c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public b j(a0... a0VarArr) {
            if (this.f16853a) {
                String[] strArr = new String[a0VarArr.length];
                for (int i10 = 0; i10 < a0VarArr.length; i10++) {
                    strArr[i10] = a0VarArr[i10].f16755h;
                }
                return i(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public b(j jVar) {
            this.f16853a = jVar.f16849a;
            this.f16854b = jVar.f16851c;
            this.f16855c = jVar.f16852d;
            this.f16856d = jVar.f16850b;
        }
    }

    private j(b bVar) {
        this.f16849a = bVar.f16853a;
        this.f16851c = bVar.f16854b;
        this.f16852d = bVar.f16855c;
        this.f16850b = bVar.f16856d;
    }
}
