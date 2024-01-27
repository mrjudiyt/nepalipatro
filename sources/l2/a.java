package l2;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e2.g;
import f2.d;
import f2.h;
import f2.n;
import java.io.InputStream;
import l2.n;

/* compiled from: AssetUriLoader */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    private static final int f9868c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f9869a;

    /* renamed from: b  reason: collision with root package name */
    private final C0163a<Data> f9870b;

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    /* compiled from: AssetUriLoader */
    public interface C0163a<Data> {
        d<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader */
    public static class b implements o<Uri, ParcelFileDescriptor>, C0163a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f9871a;

        public b(AssetManager assetManager) {
            this.f9871a = assetManager;
        }

        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new a(this.f9871a, this);
        }

        public d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    /* compiled from: AssetUriLoader */
    public static class c implements o<Uri, InputStream>, C0163a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f9872a;

        public c(AssetManager assetManager) {
            this.f9872a = assetManager;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new a(this.f9872a, this);
        }

        public d<InputStream> b(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0163a<Data> aVar) {
        this.f9869a = assetManager;
        this.f9870b = aVar;
    }

    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(uri), this.f9870b.b(this.f9869a, uri.toString().substring(f9868c)));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
