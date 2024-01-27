package f5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.h;
import f5.a;
import java.io.InputStream;
import java.util.List;

/* compiled from: FilteringManifestParser */
public final class b<T extends a<T>> implements h.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h.a<? extends T> f8527a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f8528b;

    public b(h.a<? extends T> aVar, List<c> list) {
        this.f8527a = aVar;
        this.f8528b = list;
    }

    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) {
        T t10 = (a) this.f8527a.a(uri, inputStream);
        List<c> list = this.f8528b;
        return (list == null || list.isEmpty()) ? t10 : (a) t10.a(this.f8528b);
    }
}
