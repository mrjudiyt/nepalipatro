package com.google.android.exoplayer2.mediacodec;

import a6.j0;
import a6.m0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.h;
import java.nio.ByteBuffer;
import w4.e;

/* compiled from: SynchronousMediaCodecAdapter */
public class o implements h {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f7004a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f7005b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f7006c;

    /* compiled from: SynchronousMediaCodecAdapter */
    public static class b implements h.b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.mediacodec.h a(com.google.android.exoplayer2.mediacodec.h.a r6) {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                a6.j0.a(r2)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f6982b     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f6984d     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f6985e     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                int r6 = r6.f6986f     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                a6.j0.c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                a6.j0.a(r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                a6.j0.c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                com.google.android.exoplayer2.mediacodec.o r6 = new com.google.android.exoplayer2.mediacodec.o     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r6.<init>(r1)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                return r6
            L_0x0029:
                r6 = move-exception
                goto L_0x002c
            L_0x002b:
                r6 = move-exception
            L_0x002c:
                r0 = r1
                goto L_0x0031
            L_0x002e:
                r6 = move-exception
                goto L_0x0031
            L_0x0030:
                r6 = move-exception
            L_0x0031:
                if (r0 == 0) goto L_0x0036
                r0.release()
            L_0x0036:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.o.b.a(com.google.android.exoplayer2.mediacodec.h$a):com.google.android.exoplayer2.mediacodec.h");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(h.a aVar) {
            a6.a.e(aVar.f6981a);
            String str = aVar.f6981a.f6988a;
            String valueOf = String.valueOf(str);
            j0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            j0.c();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(h.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    public boolean a() {
        return false;
    }

    public MediaFormat b() {
        return this.f7004a.getOutputFormat();
    }

    public void c(Bundle bundle) {
        this.f7004a.setParameters(bundle);
    }

    public void d(int i10, long j10) {
        this.f7004a.releaseOutputBuffer(i10, j10);
    }

    public int e() {
        return this.f7004a.dequeueInputBuffer(0);
    }

    public int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f7004a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && m0.f205a < 21) {
                this.f7006c = this.f7004a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void flush() {
        this.f7004a.flush();
    }

    public void g(h.c cVar, Handler handler) {
        this.f7004a.setOnFrameRenderedListener(new e(this, cVar), handler);
    }

    public void h(int i10, boolean z10) {
        this.f7004a.releaseOutputBuffer(i10, z10);
    }

    public void i(int i10) {
        this.f7004a.setVideoScalingMode(i10);
    }

    public ByteBuffer j(int i10) {
        if (m0.f205a >= 21) {
            return this.f7004a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) m0.j(this.f7005b))[i10];
    }

    public void k(Surface surface) {
        this.f7004a.setOutputSurface(surface);
    }

    public void l(int i10, int i11, int i12, long j10, int i13) {
        this.f7004a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public ByteBuffer m(int i10) {
        if (m0.f205a >= 21) {
            return this.f7004a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) m0.j(this.f7006c))[i10];
    }

    public void n(int i10, int i11, h4.b bVar, long j10, int i12) {
        this.f7004a.queueSecureInputBuffer(i10, i11, bVar.a(), j10, i12);
    }

    public void release() {
        this.f7005b = null;
        this.f7006c = null;
        this.f7004a.release();
    }

    private o(MediaCodec mediaCodec) {
        this.f7004a = mediaCodec;
        if (m0.f205a < 21) {
            this.f7005b = mediaCodec.getInputBuffers();
            this.f7006c = mediaCodec.getOutputBuffers();
        }
    }
}
