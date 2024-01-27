package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;

public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: h  reason: collision with root package name */
    public final i f6884h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6885i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecDecoderException(java.lang.Throwable r5, com.google.android.exoplayer2.mediacodec.i r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0007
        L_0x0005:
            java.lang.String r1 = r6.f6988a
        L_0x0007:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.String r3 = "Decoder failed: "
            if (r2 == 0) goto L_0x0018
            java.lang.String r1 = r3.concat(r1)
            goto L_0x001d
        L_0x0018:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x001d:
            r4.<init>(r1, r5)
            r4.f6884h = r6
            int r6 = a6.m0.f205a
            r1 = 21
            if (r6 < r1) goto L_0x002c
            java.lang.String r0 = a(r5)
        L_0x002c:
            r4.f6885i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, com.google.android.exoplayer2.mediacodec.i):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
