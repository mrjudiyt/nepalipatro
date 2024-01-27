package m2;

import android.content.Context;
import android.net.Uri;
import e2.g;
import g2.b;
import java.io.InputStream;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: MediaStoreImageThumbLoader */
public class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10195a;

    /* compiled from: MediaStoreImageThumbLoader */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f10196a;

        public a(Context context) {
            this.f10196a = context;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new c(this.f10196a);
        }
    }

    public c(Context context) {
        this.f10195a = context.getApplicationContext();
    }

    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, g gVar) {
        if (b.d(i10, i11)) {
            return new n.a<>(new z2.b(uri), g2.c.f(this.f10195a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.a(uri);
    }
}
