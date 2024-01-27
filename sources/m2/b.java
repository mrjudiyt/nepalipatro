package m2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l2.g;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: HttpUriLoader */
public class b implements n<Uri, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f10193b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    private final n<g, InputStream> f10194a;

    /* compiled from: HttpUriLoader */
    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> a(r rVar) {
            return new b(rVar.d(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.f10194a = nVar;
    }

    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, e2.g gVar) {
        return this.f10194a.b(new g(uri.toString()), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return f10193b.contains(uri.getScheme());
    }
}
