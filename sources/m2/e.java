package m2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.f;
import e2.g;
import f2.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: QMediaStoreUriLoader */
public final class e<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10199a;

    /* renamed from: b  reason: collision with root package name */
    private final n<File, DataT> f10200b;

    /* renamed from: c  reason: collision with root package name */
    private final n<Uri, DataT> f10201c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<DataT> f10202d;

    /* compiled from: QMediaStoreUriLoader */
    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f10203a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<DataT> f10204b;

        a(Context context, Class<DataT> cls) {
            this.f10203a = context;
            this.f10204b = cls;
        }

        public final n<Uri, DataT> a(r rVar) {
            return new e(this.f10203a, rVar.d(File.class, this.f10204b), rVar.d(Uri.class, this.f10204b), this.f10204b);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    private static final class d<DataT> implements f2.d<DataT> {

        /* renamed from: r  reason: collision with root package name */
        private static final String[] f10205r = {"_data"};

        /* renamed from: h  reason: collision with root package name */
        private final Context f10206h;

        /* renamed from: i  reason: collision with root package name */
        private final n<File, DataT> f10207i;

        /* renamed from: j  reason: collision with root package name */
        private final n<Uri, DataT> f10208j;

        /* renamed from: k  reason: collision with root package name */
        private final Uri f10209k;

        /* renamed from: l  reason: collision with root package name */
        private final int f10210l;

        /* renamed from: m  reason: collision with root package name */
        private final int f10211m;

        /* renamed from: n  reason: collision with root package name */
        private final g f10212n;

        /* renamed from: o  reason: collision with root package name */
        private final Class<DataT> f10213o;

        /* renamed from: p  reason: collision with root package name */
        private volatile boolean f10214p;

        /* renamed from: q  reason: collision with root package name */
        private volatile f2.d<DataT> f10215q;

        d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, g gVar, Class<DataT> cls) {
            this.f10206h = context.getApplicationContext();
            this.f10207i = nVar;
            this.f10208j = nVar2;
            this.f10209k = uri;
            this.f10210l = i10;
            this.f10211m = i11;
            this.f10212n = gVar;
            this.f10213o = cls;
        }

        private n.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f10207i.b(h(this.f10209k), this.f10210l, this.f10211m, this.f10212n);
            }
            return this.f10208j.b(g() ? MediaStore.setRequireOriginal(this.f10209k) : this.f10209k, this.f10210l, this.f10211m, this.f10212n);
        }

        private f2.d<DataT> f() {
            n.a c10 = c();
            if (c10 != null) {
                return c10.f9920c;
            }
            return null;
        }

        private boolean g() {
            return this.f10206h.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f10206h.getContentResolver().query(uri, f10205r, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        public Class<DataT> a() {
            return this.f10213o;
        }

        public void b() {
            f2.d<DataT> dVar = this.f10215q;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void cancel() {
            this.f10214p = true;
            f2.d<DataT> dVar = this.f10215q;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public void d(f fVar, d.a<? super DataT> aVar) {
            try {
                f2.d<DataT> f10 = f();
                if (f10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f10209k));
                    return;
                }
                this.f10215q = f10;
                if (this.f10214p) {
                    cancel();
                } else {
                    f10.d(fVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f10199a = context.getApplicationContext();
        this.f10200b = nVar;
        this.f10201c = nVar2;
        this.f10202d = cls;
    }

    /* renamed from: c */
    public n.a<DataT> b(Uri uri, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(uri), new d(this.f10199a, this.f10200b, this.f10201c, uri, i10, i11, gVar, this.f10202d));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && g2.b.b(uri);
    }
}
