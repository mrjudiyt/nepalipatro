package v7;

import ea.e;

/* compiled from: FormEncodingBuilder */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final s f16863b = s.c("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    private final e f16864a = new e();

    public n a(String str, String str2) {
        if (this.f16864a.w0() > 0) {
            this.f16864a.G(38);
        }
        q.g(this.f16864a, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true, true);
        this.f16864a.G(61);
        q.g(this.f16864a, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true, true);
        return this;
    }

    public w b() {
        return w.c(f16863b, this.f16864a.y0());
    }
}
