package g9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.m;

/* compiled from: Charsets.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14758a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f14759b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f14760c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f14761d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f14762e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f14763f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f14764g;

    static {
        Charset forName = Charset.forName("UTF-8");
        m.e(forName, "forName(\"UTF-8\")");
        f14759b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        m.e(forName2, "forName(\"UTF-16\")");
        f14760c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        m.e(forName3, "forName(\"UTF-16BE\")");
        f14761d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        m.e(forName4, "forName(\"UTF-16LE\")");
        f14762e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        m.e(forName5, "forName(\"US-ASCII\")");
        f14763f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        m.e(forName6, "forName(\"ISO-8859-1\")");
        f14764g = forName6;
    }

    private d() {
    }
}
