package m2;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.y;
import e2.g;
import g2.b;
import g2.c;
import java.io.InputStream;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: MediaStoreVideoThumbLoader */
public class d implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10197a;

    /* compiled from: MediaStoreVideoThumbLoader */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f10198a;

        public a(Context context) {
            this.f10198a = context;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new d(this.f10198a);
        }
    }

    public d(Context context) {
        this.f10197a = context.getApplicationContext();
    }

    private boolean e(g gVar) {
        Long l10 = (Long) gVar.c(y.f5934d);
        return l10 != null && l10.longValue() == -1;
    }

    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, g gVar) {
        if (!b.d(i10, i11) || !e(gVar)) {
            return null;
        }
        return new n.a<>(new z2.b(uri), c.g(this.f10197a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.c(uri);
    }
}
