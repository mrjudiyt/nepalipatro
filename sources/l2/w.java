package l2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import e2.g;
import f2.i;
import f2.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l2.n;

/* compiled from: UriLoader */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f9954b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", FirebaseAnalytics.Param.CONTENT})));

    /* renamed from: a  reason: collision with root package name */
    private final c<Data> f9955a;

    /* compiled from: UriLoader */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f9956a;

        public a(ContentResolver contentResolver) {
            this.f9956a = contentResolver;
        }

        public n<Uri, AssetFileDescriptor> a(r rVar) {
            return new w(this);
        }

        public f2.d<AssetFileDescriptor> b(Uri uri) {
            return new f2.a(this.f9956a, uri);
        }
    }

    /* compiled from: UriLoader */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f9957a;

        public b(ContentResolver contentResolver) {
            this.f9957a = contentResolver;
        }

        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new w(this);
        }

        public f2.d<ParcelFileDescriptor> b(Uri uri) {
            return new i(this.f9957a, uri);
        }
    }

    /* compiled from: UriLoader */
    public interface c<Data> {
        f2.d<Data> b(Uri uri);
    }

    /* compiled from: UriLoader */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f9958a;

        public d(ContentResolver contentResolver) {
            this.f9958a = contentResolver;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new w(this);
        }

        public f2.d<InputStream> b(Uri uri) {
            return new o(this.f9958a, uri);
        }
    }

    public w(c<Data> cVar) {
        this.f9955a = cVar;
    }

    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(uri), this.f9955a.b(uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return f9954b.contains(uri.getScheme());
    }
}
