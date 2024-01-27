package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionResult extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f3836a;

    /* renamed from: b  reason: collision with root package name */
    long f3837b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f3838c;

    /* renamed from: d  reason: collision with root package name */
    MediaItem f3839d;

    /* renamed from: e  reason: collision with root package name */
    MediaItem f3840e;

    public SessionResult(int i10, Bundle bundle) {
        this(i10, bundle, (MediaItem) null, SystemClock.elapsedRealtime());
    }

    public void c() {
        this.f3839d = this.f3840e;
    }

    public void d(boolean z10) {
        MediaItem mediaItem = this.f3839d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f3840e == null) {
                    this.f3840e = b.c(this.f3839d);
                }
            }
        }
    }

    SessionResult() {
    }

    SessionResult(int i10, Bundle bundle, MediaItem mediaItem, long j10) {
        this.f3836a = i10;
        this.f3838c = bundle;
        this.f3839d = mediaItem;
        this.f3837b = j10;
    }
}
