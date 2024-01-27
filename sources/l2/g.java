package l2;

import a3.j;
import android.net.Uri;
import android.text.TextUtils;
import e2.e;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl */
public class g implements e {

    /* renamed from: b  reason: collision with root package name */
    private final h f9890b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f9891c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9892d;

    /* renamed from: e  reason: collision with root package name */
    private String f9893e;

    /* renamed from: f  reason: collision with root package name */
    private URL f9894f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f9895g;

    /* renamed from: h  reason: collision with root package name */
    private int f9896h;

    public g(URL url) {
        this(url, h.f9898b);
    }

    private byte[] d() {
        if (this.f9895g == null) {
            this.f9895g = c().getBytes(e.f7997a);
        }
        return this.f9895g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f9893e)) {
            String str = this.f9892d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) j.d(this.f9891c)).toString();
            }
            this.f9893e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f9893e;
    }

    private URL g() {
        if (this.f9894f == null) {
            this.f9894f = new URL(f());
        }
        return this.f9894f;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f9892d;
        return str != null ? str : ((URL) j.d(this.f9891c)).toString();
    }

    public Map<String, String> e() {
        return this.f9890b.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.f9890b.equals(gVar.f9890b)) {
            return false;
        }
        return true;
    }

    public URL h() {
        return g();
    }

    public int hashCode() {
        if (this.f9896h == 0) {
            int hashCode = c().hashCode();
            this.f9896h = hashCode;
            this.f9896h = (hashCode * 31) + this.f9890b.hashCode();
        }
        return this.f9896h;
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f9898b);
    }

    public g(URL url, h hVar) {
        this.f9891c = (URL) j.d(url);
        this.f9892d = null;
        this.f9890b = (h) j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f9891c = null;
        this.f9892d = j.b(str);
        this.f9890b = (h) j.d(hVar);
    }
}
