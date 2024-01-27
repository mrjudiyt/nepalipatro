package l2;

import android.net.Uri;
import e2.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l2.n;

/* compiled from: UrlUriLoader */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f9959b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    private final n<g, Data> f9960a;

    /* compiled from: UrlUriLoader */
    public static class a implements o<Uri, InputStream> {
        public n<Uri, InputStream> a(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f9960a = nVar;
    }

    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, g gVar) {
        return this.f9960a.b(new g(uri.toString()), i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return f9959b.contains(uri.getScheme());
    }
}
