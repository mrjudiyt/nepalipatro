package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.share.internal.ShareConstants;

public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f3761a;

    /* renamed from: b  reason: collision with root package name */
    int f3762b;

    /* renamed from: c  reason: collision with root package name */
    MediaFormat f3763c;

    /* renamed from: d  reason: collision with root package name */
    boolean f3764d;

    /* renamed from: e  reason: collision with root package name */
    Bundle f3765e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3766f = new Object();

    SessionPlayer$TrackInfo() {
    }

    private static void e(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putInt(str, mediaFormat.getInteger(str));
        }
    }

    private static void f(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putString(str, mediaFormat.getString(str));
        }
    }

    private static void g(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setInteger(str, bundle.getInt(str));
        }
    }

    private static void h(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setString(str, bundle.getString(str));
        }
    }

    public void c() {
        Bundle bundle = this.f3765e;
        if (bundle != null && !bundle.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f3763c = mediaFormat;
            h("language", mediaFormat, this.f3765e);
            h("mime", this.f3763c, this.f3765e);
            g("is-forced-subtitle", this.f3763c, this.f3765e);
            g("is-autoselect", this.f3763c, this.f3765e);
            g("is-default", this.f3763c, this.f3765e);
        }
        Bundle bundle2 = this.f3765e;
        if (bundle2 == null || !bundle2.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            boolean z10 = true;
            if (this.f3762b == 1) {
                z10 = false;
            }
            this.f3764d = z10;
            return;
        }
        this.f3764d = this.f3765e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
    }

    public void d(boolean z10) {
        synchronized (this.f3766f) {
            Bundle bundle = new Bundle();
            this.f3765e = bundle;
            bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", this.f3763c == null);
            MediaFormat mediaFormat = this.f3763c;
            if (mediaFormat != null) {
                f("language", mediaFormat, this.f3765e);
                f("mime", this.f3763c, this.f3765e);
                e("is-forced-subtitle", this.f3763c, this.f3765e);
                e("is-autoselect", this.f3763c, this.f3765e);
                e("is-default", this.f3763c, this.f3765e);
            }
            this.f3765e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", this.f3764d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SessionPlayer$TrackInfo) && this.f3761a == ((SessionPlayer$TrackInfo) obj).f3761a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3761a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getName());
        sb.append('#');
        sb.append(this.f3761a);
        sb.append('{');
        int i10 = this.f3762b;
        if (i10 == 1) {
            sb.append(ShareConstants.VIDEO_URL);
        } else if (i10 == 2) {
            sb.append("AUDIO");
        } else if (i10 == 4) {
            sb.append(ShareConstants.SUBTITLE);
        } else if (i10 != 5) {
            sb.append("UNKNOWN");
        } else {
            sb.append("METADATA");
        }
        sb.append(", ");
        sb.append(this.f3763c);
        sb.append(", isSelectable=");
        sb.append(this.f3764d);
        sb.append("}");
        return sb.toString();
    }
}
