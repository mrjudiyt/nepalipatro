package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.h;
import java.util.List;

/* compiled from: FontRequest */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2416a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2417b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2418c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f2419d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2420e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2421f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2416a = (String) h.b(str);
        this.f2417b = (String) h.b(str2);
        this.f2418c = (String) h.b(str3);
        this.f2419d = (List) h.b(list);
        this.f2421f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f2419d;
    }

    public int c() {
        return this.f2420e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f2421f;
    }

    public String e() {
        return this.f2416a;
    }

    public String f() {
        return this.f2417b;
    }

    public String g() {
        return this.f2418c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2416a + ", mProviderPackage: " + this.f2417b + ", mQuery: " + this.f2418c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f2419d.size(); i10++) {
            sb.append(" [");
            List list = this.f2419d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2420e);
        return sb.toString();
    }
}
