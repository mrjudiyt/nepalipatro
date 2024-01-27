package g2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.f;
import f2.d;
import f2.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher */
public class c implements d<InputStream> {

    /* renamed from: h  reason: collision with root package name */
    private final Uri f8810h;

    /* renamed from: i  reason: collision with root package name */
    private final e f8811i;

    /* renamed from: j  reason: collision with root package name */
    private InputStream f8812j;

    /* compiled from: ThumbFetcher */
    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f8813b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f8814a;

        a(ContentResolver contentResolver) {
            this.f8814a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f8814a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f8813b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* compiled from: ThumbFetcher */
    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f8815b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f8816a;

        b(ContentResolver contentResolver) {
            this.f8816a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f8816a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f8815b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    c(Uri uri, e eVar) {
        this.f8810h = uri;
        this.f8811i = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d10 = this.f8811i.d(this.f8810h);
        int a10 = d10 != null ? this.f8811i.a(this.f8810h) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f8812j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    public void d(f fVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.f8812j = h10;
            aVar.f(h10);
        } catch (FileNotFoundException e10) {
            aVar.c(e10);
        }
    }

    public e2.a e() {
        return e2.a.LOCAL;
    }
}
