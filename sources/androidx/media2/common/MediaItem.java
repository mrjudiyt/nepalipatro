package androidx.media2.common;

import androidx.core.util.d;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class MediaItem extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3743a;

    /* renamed from: b  reason: collision with root package name */
    MediaMetadata f3744b;

    /* renamed from: c  reason: collision with root package name */
    long f3745c;

    /* renamed from: d  reason: collision with root package name */
    long f3746d;

    /* renamed from: e  reason: collision with root package name */
    private final List<d<Object, Executor>> f3747e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        MediaMetadata f3748a;

        /* renamed from: b  reason: collision with root package name */
        long f3749b = 0;

        /* renamed from: c  reason: collision with root package name */
        long f3750c = 576460752303423487L;

        public MediaItem a() {
            return new MediaItem(this);
        }

        public a b(long j10) {
            if (j10 < 0) {
                j10 = 576460752303423487L;
            }
            this.f3750c = j10;
            return this;
        }

        public a c(MediaMetadata mediaMetadata) {
            this.f3748a = mediaMetadata;
            return this;
        }

        public a d(long j10) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f3749b = j10;
            return this;
        }
    }

    MediaItem() {
        this.f3743a = new Object();
        this.f3745c = 0;
        this.f3746d = 576460752303423487L;
        this.f3747e = new ArrayList();
    }

    public void d(boolean z10) {
        if (getClass() == MediaItem.class) {
            super.d(z10);
            return;
        }
        throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
    }

    public long e() {
        return this.f3746d;
    }

    public String f() {
        String g10;
        synchronized (this.f3743a) {
            MediaMetadata mediaMetadata = this.f3744b;
            g10 = mediaMetadata != null ? mediaMetadata.g("android.media.metadata.MEDIA_ID") : null;
        }
        return g10;
    }

    public MediaMetadata g() {
        MediaMetadata mediaMetadata;
        synchronized (this.f3743a) {
            mediaMetadata = this.f3744b;
        }
        return mediaMetadata;
    }

    public long h() {
        return this.f3745c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f3743a) {
            sb.append("{Media Id=");
            sb.append(f());
            sb.append(", mMetadata=");
            sb.append(this.f3744b);
            sb.append(", mStartPositionMs=");
            sb.append(this.f3745c);
            sb.append(", mEndPositionMs=");
            sb.append(this.f3746d);
            sb.append('}');
        }
        return sb.toString();
    }

    MediaItem(a aVar) {
        this(aVar.f3748a, aVar.f3749b, aVar.f3750c);
    }

    MediaItem(MediaItem mediaItem) {
        this(mediaItem.f3744b, mediaItem.f3745c, mediaItem.f3746d);
    }

    MediaItem(MediaMetadata mediaMetadata, long j10, long j11) {
        this.f3743a = new Object();
        this.f3745c = 0;
        this.f3746d = 576460752303423487L;
        this.f3747e = new ArrayList();
        if (j10 <= j11) {
            if (mediaMetadata != null && mediaMetadata.e("android.media.metadata.DURATION")) {
                long f10 = mediaMetadata.f("android.media.metadata.DURATION");
                if (!(f10 == Long.MIN_VALUE || j11 == 576460752303423487L || j11 <= f10)) {
                    throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j11 + ", durationMs=" + f10);
                }
            }
            this.f3744b = mediaMetadata;
            this.f3745c = j10;
            this.f3746d = j11;
            return;
        }
        throw new IllegalStateException("Illegal start/end position: " + j10 + " : " + j11);
    }
}
