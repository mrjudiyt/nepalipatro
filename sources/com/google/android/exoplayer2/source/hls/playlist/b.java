package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a.c f7387h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Uri f7388i;

    public /* synthetic */ b(a.c cVar, Uri uri) {
        this.f7387h = cVar;
        this.f7388i = uri;
    }

    public final void run() {
        this.f7387h.n(this.f7388i);
    }
}
