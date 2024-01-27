package com.google.android.exoplayer2.mediacodec;

import a6.j0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.h;
import java.nio.ByteBuffer;
import java.util.Objects;
import l6.u;
import w4.c;

/* compiled from: AsynchronousMediaCodecAdapter */
final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f6934a;

    /* renamed from: b  reason: collision with root package name */
    private final e f6935b;

    /* renamed from: c  reason: collision with root package name */
    private final c f6936c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6937d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6938e;

    /* renamed from: f  reason: collision with root package name */
    private int f6939f;

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b  reason: collision with other inner class name */
    /* compiled from: AsynchronousMediaCodecAdapter */
    public static final class C0112b implements h.b {

        /* renamed from: b  reason: collision with root package name */
        private final u<HandlerThread> f6940b;

        /* renamed from: c  reason: collision with root package name */
        private final u<HandlerThread> f6941c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f6942d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f6943e;

        public C0112b(int i10, boolean z10, boolean z11) {
            this(new w4.b(i10), new c(i10), z10, z11);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.s(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.t(i10));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.mediacodec.b a(com.google.android.exoplayer2.mediacodec.h.a r11) {
            /*
                r10 = this;
                com.google.android.exoplayer2.mediacodec.i r0 = r11.f6981a
                java.lang.String r0 = r0.f6988a
                r1 = 0
                java.lang.String r2 = "createCodec:"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0055 }
                int r4 = r3.length()     // Catch:{ Exception -> 0x0055 }
                if (r4 == 0) goto L_0x0016
                java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0055 }
                goto L_0x001c
            L_0x0016:
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0055 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x0055 }
                r2 = r3
            L_0x001c:
                a6.j0.a(r2)     // Catch:{ Exception -> 0x0055 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0055 }
                com.google.android.exoplayer2.mediacodec.b r2 = new com.google.android.exoplayer2.mediacodec.b     // Catch:{ Exception -> 0x0053 }
                l6.u<android.os.HandlerThread> r3 = r10.f6940b     // Catch:{ Exception -> 0x0053 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0053 }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0053 }
                l6.u<android.os.HandlerThread> r3 = r10.f6941c     // Catch:{ Exception -> 0x0053 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0053 }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0053 }
                boolean r7 = r10.f6942d     // Catch:{ Exception -> 0x0053 }
                boolean r8 = r10.f6943e     // Catch:{ Exception -> 0x0053 }
                r9 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0053 }
                a6.j0.c()     // Catch:{ Exception -> 0x0050 }
                android.media.MediaFormat r1 = r11.f6982b     // Catch:{ Exception -> 0x0050 }
                android.view.Surface r3 = r11.f6984d     // Catch:{ Exception -> 0x0050 }
                android.media.MediaCrypto r4 = r11.f6985e     // Catch:{ Exception -> 0x0050 }
                int r11 = r11.f6986f     // Catch:{ Exception -> 0x0050 }
                r2.v(r1, r3, r4, r11)     // Catch:{ Exception -> 0x0050 }
                return r2
            L_0x0050:
                r11 = move-exception
                r1 = r2
                goto L_0x0057
            L_0x0053:
                r11 = move-exception
                goto L_0x0057
            L_0x0055:
                r11 = move-exception
                r0 = r1
            L_0x0057:
                if (r1 != 0) goto L_0x005f
                if (r0 == 0) goto L_0x0062
                r0.release()
                goto L_0x0062
            L_0x005f:
                r1.release()
            L_0x0062:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.b.C0112b.a(com.google.android.exoplayer2.mediacodec.h$a):com.google.android.exoplayer2.mediacodec.b");
        }

        C0112b(u<HandlerThread> uVar, u<HandlerThread> uVar2, boolean z10, boolean z11) {
            this.f6940b = uVar;
            this.f6941c = uVar2;
            this.f6942d = z10;
            this.f6943e = z11;
        }
    }

    /* access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f6935b.h(this.f6934a);
        j0.a("configureCodec");
        this.f6934a.configure(mediaFormat, surface, mediaCrypto, i10);
        j0.c();
        this.f6936c.s();
        j0.a("startCodec");
        this.f6934a.start();
        j0.c();
        this.f6939f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(h.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void x() {
        if (this.f6937d) {
            try {
                this.f6936c.t();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public boolean a() {
        return false;
    }

    public MediaFormat b() {
        return this.f6935b.g();
    }

    public void c(Bundle bundle) {
        x();
        this.f6934a.setParameters(bundle);
    }

    public void d(int i10, long j10) {
        this.f6934a.releaseOutputBuffer(i10, j10);
    }

    public int e() {
        return this.f6935b.c();
    }

    public int f(MediaCodec.BufferInfo bufferInfo) {
        return this.f6935b.d(bufferInfo);
    }

    public void flush() {
        this.f6936c.i();
        this.f6934a.flush();
        e eVar = this.f6935b;
        MediaCodec mediaCodec = this.f6934a;
        Objects.requireNonNull(mediaCodec);
        eVar.e(new w4.a(mediaCodec));
    }

    public void g(h.c cVar, Handler handler) {
        x();
        this.f6934a.setOnFrameRenderedListener(new a(this, cVar), handler);
    }

    public void h(int i10, boolean z10) {
        this.f6934a.releaseOutputBuffer(i10, z10);
    }

    public void i(int i10) {
        x();
        this.f6934a.setVideoScalingMode(i10);
    }

    public ByteBuffer j(int i10) {
        return this.f6934a.getInputBuffer(i10);
    }

    public void k(Surface surface) {
        x();
        this.f6934a.setOutputSurface(surface);
    }

    public void l(int i10, int i11, int i12, long j10, int i13) {
        this.f6936c.n(i10, i11, i12, j10, i13);
    }

    public ByteBuffer m(int i10) {
        return this.f6934a.getOutputBuffer(i10);
    }

    public void n(int i10, int i11, h4.b bVar, long j10, int i12) {
        this.f6936c.o(i10, i11, bVar, j10, i12);
    }

    public void release() {
        try {
            if (this.f6939f == 1) {
                this.f6936c.r();
                this.f6935b.q();
            }
            this.f6939f = 2;
        } finally {
            if (!this.f6938e) {
                this.f6934a.release();
                this.f6938e = true;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f6934a = mediaCodec;
        this.f6935b = new e(handlerThread);
        this.f6936c = new c(mediaCodec, handlerThread2, z10);
        this.f6937d = z11;
        this.f6939f = 0;
    }
}
