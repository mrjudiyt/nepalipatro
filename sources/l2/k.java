package l2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.f;
import e2.g;
import f2.d;
import java.io.File;
import java.io.FileNotFoundException;
import l2.n;

/* compiled from: MediaStoreFileLoader */
public final class k implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9907a;

    /* compiled from: MediaStoreFileLoader */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9908a;

        public a(Context context) {
            this.f9908a = context;
        }

        public n<Uri, File> a(r rVar) {
            return new k(this.f9908a);
        }
    }

    /* compiled from: MediaStoreFileLoader */
    private static class b implements d<File> {

        /* renamed from: j  reason: collision with root package name */
        private static final String[] f9909j = {"_data"};

        /* renamed from: h  reason: collision with root package name */
        private final Context f9910h;

        /* renamed from: i  reason: collision with root package name */
        private final Uri f9911i;

        b(Context context, Uri uri) {
            this.f9910h = context;
            this.f9911i = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public void d(f fVar, d.a<? super File> aVar) {
            Cursor query = this.f9910h.getContentResolver().query(this.f9911i, f9909j, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f9911i));
                return;
            }
            aVar.f(new File(str));
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    public k(Context context) {
        this.f9907a = context;
    }

    /* renamed from: c */
    public n.a<File> b(Uri uri, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(uri), new b(this.f9907a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return g2.b.b(uri);
    }
}
