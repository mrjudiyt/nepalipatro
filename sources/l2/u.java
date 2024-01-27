package l2;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import e2.g;
import java.io.File;
import java.io.InputStream;
import l2.n;

/* compiled from: StringLoader */
public class u<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f9950a;

    /* compiled from: StringLoader */
    public static final class a implements o<String, AssetFileDescriptor> {
        public n<String, AssetFileDescriptor> a(r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class b implements o<String, ParcelFileDescriptor> {
        public n<String, ParcelFileDescriptor> a(r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class c implements o<String, InputStream> {
        public n<String, InputStream> a(r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f9950a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public n.a<Data> b(String str, int i10, int i11, g gVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f9950a.a(e10)) {
            return null;
        }
        return this.f9950a.b(e10, i10, i11, gVar);
    }

    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
