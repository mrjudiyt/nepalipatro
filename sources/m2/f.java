package m2;

import java.io.InputStream;
import java.net.URL;
import l2.g;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: UrlLoader */
public class f implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final n<g, InputStream> f10216a;

    /* compiled from: UrlLoader */
    public static class a implements o<URL, InputStream> {
        public n<URL, InputStream> a(r rVar) {
            return new f(rVar.d(g.class, InputStream.class));
        }
    }

    public f(n<g, InputStream> nVar) {
        this.f10216a = nVar;
    }

    /* renamed from: c */
    public n.a<InputStream> b(URL url, int i10, int i11, e2.g gVar) {
        return this.f10216a.b(new g(url), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
