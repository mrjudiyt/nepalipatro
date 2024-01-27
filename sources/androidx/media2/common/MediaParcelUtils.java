package androidx.media2.common;

import android.annotation.SuppressLint;
import androidx.versionedparcelable.ParcelImpl;
import j1.a;
import j1.b;

public class MediaParcelUtils {

    @SuppressLint({"RestrictedApi"})
    private static class MediaItemParcelImpl extends ParcelImpl {

        /* renamed from: i  reason: collision with root package name */
        private final MediaItem f3757i;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super((b) new MediaItem(mediaItem));
            this.f3757i = mediaItem;
        }

        /* renamed from: c */
        public MediaItem b() {
            return this.f3757i;
        }
    }

    public static <T extends b> T a(ParcelImpl parcelImpl) {
        return a.a(parcelImpl);
    }

    public static ParcelImpl b(b bVar) {
        if (bVar instanceof MediaItem) {
            return new MediaItemParcelImpl((MediaItem) bVar);
        }
        return (ParcelImpl) a.d(bVar);
    }
}
