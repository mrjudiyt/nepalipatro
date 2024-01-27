package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f6932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.c f6933b;

    public /* synthetic */ a(b bVar, h.c cVar) {
        this.f6932a = bVar;
        this.f6933b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f6932a.w(this.f6933b, mediaCodec, j10, j11);
    }
}
