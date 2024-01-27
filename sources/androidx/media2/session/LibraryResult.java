package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

public class LibraryResult extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f3804a;

    /* renamed from: b  reason: collision with root package name */
    long f3805b;

    /* renamed from: c  reason: collision with root package name */
    MediaItem f3806c;

    /* renamed from: d  reason: collision with root package name */
    MediaItem f3807d;

    /* renamed from: e  reason: collision with root package name */
    MediaLibraryService$LibraryParams f3808e;

    /* renamed from: f  reason: collision with root package name */
    List<MediaItem> f3809f;

    /* renamed from: g  reason: collision with root package name */
    ParcelImplListSlice f3810g;

    LibraryResult() {
    }

    public void c() {
        this.f3806c = this.f3807d;
        this.f3809f = b.b(this.f3810g);
    }

    public void d(boolean z10) {
        MediaItem mediaItem = this.f3806c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f3807d == null) {
                    this.f3807d = b.c(this.f3806c);
                }
            }
        }
        List<MediaItem> list = this.f3809f;
        if (list != null) {
            synchronized (list) {
                if (this.f3810g == null) {
                    this.f3810g = b.a(this.f3809f);
                }
            }
        }
    }
}
