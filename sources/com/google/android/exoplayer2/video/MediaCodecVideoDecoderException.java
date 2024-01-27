package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.i;

public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* renamed from: j  reason: collision with root package name */
    public final int f7794j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f7795k;

    public MediaCodecVideoDecoderException(Throwable th, i iVar, Surface surface) {
        super(th, iVar);
        this.f7794j = System.identityHashCode(surface);
        this.f7795k = surface == null || surface.isValid();
    }
}
