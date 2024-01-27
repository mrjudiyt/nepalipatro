package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.media2.session.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

class ConnectionResult extends CustomVersionedParcelable {
    MediaMetadata A;
    int B;

    /* renamed from: a  reason: collision with root package name */
    int f3776a;

    /* renamed from: b  reason: collision with root package name */
    a f3777b;

    /* renamed from: c  reason: collision with root package name */
    IBinder f3778c;

    /* renamed from: d  reason: collision with root package name */
    PendingIntent f3779d;

    /* renamed from: e  reason: collision with root package name */
    int f3780e;

    /* renamed from: f  reason: collision with root package name */
    MediaItem f3781f;

    /* renamed from: g  reason: collision with root package name */
    MediaItem f3782g;

    /* renamed from: h  reason: collision with root package name */
    long f3783h;

    /* renamed from: i  reason: collision with root package name */
    long f3784i;

    /* renamed from: j  reason: collision with root package name */
    float f3785j;

    /* renamed from: k  reason: collision with root package name */
    long f3786k;

    /* renamed from: l  reason: collision with root package name */
    MediaController$PlaybackInfo f3787l;

    /* renamed from: m  reason: collision with root package name */
    int f3788m;

    /* renamed from: n  reason: collision with root package name */
    int f3789n;

    /* renamed from: o  reason: collision with root package name */
    ParcelImplListSlice f3790o;

    /* renamed from: p  reason: collision with root package name */
    SessionCommandGroup f3791p;

    /* renamed from: q  reason: collision with root package name */
    int f3792q;

    /* renamed from: r  reason: collision with root package name */
    int f3793r;

    /* renamed from: s  reason: collision with root package name */
    int f3794s;

    /* renamed from: t  reason: collision with root package name */
    Bundle f3795t;

    /* renamed from: u  reason: collision with root package name */
    VideoSize f3796u;

    /* renamed from: v  reason: collision with root package name */
    List<SessionPlayer$TrackInfo> f3797v;

    /* renamed from: w  reason: collision with root package name */
    SessionPlayer$TrackInfo f3798w;

    /* renamed from: x  reason: collision with root package name */
    SessionPlayer$TrackInfo f3799x;

    /* renamed from: y  reason: collision with root package name */
    SessionPlayer$TrackInfo f3800y;

    /* renamed from: z  reason: collision with root package name */
    SessionPlayer$TrackInfo f3801z;

    ConnectionResult() {
    }

    public void c() {
        this.f3777b = a.C0065a.z0(this.f3778c);
        this.f3781f = this.f3782g;
    }

    public void d(boolean z10) {
        synchronized (this.f3777b) {
            if (this.f3778c == null) {
                this.f3778c = (IBinder) this.f3777b;
                this.f3782g = b.c(this.f3781f);
            }
        }
    }
}
