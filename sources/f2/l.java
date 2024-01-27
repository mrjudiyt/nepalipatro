package f2;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.f;
import e2.a;
import f2.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher */
public abstract class l<T> implements d<T> {

    /* renamed from: h  reason: collision with root package name */
    private final Uri f8494h;

    /* renamed from: i  reason: collision with root package name */
    private final ContentResolver f8495i;

    /* renamed from: j  reason: collision with root package name */
    private T f8496j;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f8495i = contentResolver;
        this.f8494h = uri;
    }

    public void b() {
        T t10 = this.f8496j;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(T t10);

    public void cancel() {
    }

    public final void d(f fVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f8494h, this.f8495i);
            this.f8496j = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            aVar.c(e10);
        }
    }

    public a e() {
        return a.LOCAL;
    }

    /* access modifiers changed from: protected */
    public abstract T f(Uri uri, ContentResolver contentResolver);
}
