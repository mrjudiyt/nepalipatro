package e7;

import com.google.zxing.b;
import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f14297a;

    /* renamed from: b  reason: collision with root package name */
    private l f14298b;

    /* renamed from: c  reason: collision with root package name */
    private b f14299c;

    /* renamed from: d  reason: collision with root package name */
    private b f14300d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f14301e;

    /* renamed from: f  reason: collision with root package name */
    int f14302f;

    /* renamed from: g  reason: collision with root package name */
    private int f14303g;

    /* renamed from: h  reason: collision with root package name */
    private k f14304h;

    /* renamed from: i  reason: collision with root package name */
    private int f14305i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 != '?' || str.charAt(i10) == '?') {
                sb.append(c10);
                i10++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f14297a = sb.toString();
        this.f14298b = l.FORCE_NONE;
        this.f14301e = new StringBuilder(str.length());
        this.f14303g = -1;
    }

    private int h() {
        return this.f14297a.length() - this.f14305i;
    }

    public int a() {
        return this.f14301e.length();
    }

    public StringBuilder b() {
        return this.f14301e;
    }

    public char c() {
        return this.f14297a.charAt(this.f14302f);
    }

    public String d() {
        return this.f14297a;
    }

    public int e() {
        return this.f14303g;
    }

    public int f() {
        return h() - this.f14302f;
    }

    public k g() {
        return this.f14304h;
    }

    public boolean i() {
        return this.f14302f < h();
    }

    public void j() {
        this.f14303g = -1;
    }

    public void k() {
        this.f14304h = null;
    }

    public void l(b bVar, b bVar2) {
        this.f14299c = bVar;
        this.f14300d = bVar2;
    }

    public void m(int i10) {
        this.f14305i = i10;
    }

    public void n(l lVar) {
        this.f14298b = lVar;
    }

    public void o(int i10) {
        this.f14303g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f14304h;
        if (kVar == null || i10 > kVar.a()) {
            this.f14304h = k.l(i10, this.f14298b, this.f14299c, this.f14300d, true);
        }
    }

    public void r(char c10) {
        this.f14301e.append(c10);
    }

    public void s(String str) {
        this.f14301e.append(str);
    }
}
