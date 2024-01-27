package com.google.android.exoplayer2.mediacodec;

import a6.a;
import a6.l;
import a6.m0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback */
final class e extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6962a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f6963b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f6964c;

    /* renamed from: d  reason: collision with root package name */
    private final l f6965d;

    /* renamed from: e  reason: collision with root package name */
    private final l f6966e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f6967f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f6968g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f6969h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f6970i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f6971j;

    /* renamed from: k  reason: collision with root package name */
    private long f6972k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6973l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f6974m;

    e(HandlerThread handlerThread) {
        this.f6963b = handlerThread;
        this.f6965d = new l();
        this.f6966e = new l();
        this.f6967f = new ArrayDeque<>();
        this.f6968g = new ArrayDeque<>();
    }

    private void b(MediaFormat mediaFormat) {
        this.f6966e.a(-2);
        this.f6968g.add(mediaFormat);
    }

    private void f() {
        if (!this.f6968g.isEmpty()) {
            this.f6970i = this.f6968g.getLast();
        }
        this.f6965d.b();
        this.f6966e.b();
        this.f6967f.clear();
        this.f6968g.clear();
        this.f6971j = null;
    }

    private boolean i() {
        return this.f6972k > 0 || this.f6973l;
    }

    private void k() {
        l();
        m();
    }

    private void l() {
        IllegalStateException illegalStateException = this.f6974m;
        if (illegalStateException != null) {
            this.f6974m = null;
            throw illegalStateException;
        }
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f6971j;
        if (codecException != null) {
            this.f6971j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void j(Runnable runnable) {
        synchronized (this.f6962a) {
            o(runnable);
        }
    }

    private void o(Runnable runnable) {
        if (!this.f6973l) {
            long j10 = this.f6972k - 1;
            this.f6972k = j10;
            if (j10 <= 0) {
                if (j10 < 0) {
                    p(new IllegalStateException());
                    return;
                }
                f();
                try {
                    runnable.run();
                } catch (IllegalStateException e10) {
                    p(e10);
                } catch (Exception e11) {
                    p(new IllegalStateException(e11));
                }
            }
        }
    }

    private void p(IllegalStateException illegalStateException) {
        synchronized (this.f6962a) {
            this.f6974m = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6962a
            monitor-enter(r0)
            boolean r1 = r3.i()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.k()     // Catch:{ all -> 0x0020 }
            a6.l r1 = r3.f6965d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.d()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            a6.l r1 = r3.f6965d     // Catch:{ all -> 0x0020 }
            int r2 = r1.e()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.e.c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f6962a
            monitor-enter(r0)
            boolean r1 = r9.i()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.k()     // Catch:{ all -> 0x004a }
            a6.l r1 = r9.f6966e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.d()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            a6.l r1 = r9.f6966e     // Catch:{ all -> 0x004a }
            int r1 = r1.e()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f6969h     // Catch:{ all -> 0x004a }
            a6.a.h(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f6967f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f6968g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f6969h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.e.d(android.media.MediaCodec$BufferInfo):int");
    }

    public void e(Runnable runnable) {
        synchronized (this.f6962a) {
            this.f6972k++;
            ((Handler) m0.j(this.f6964c)).post(new d(this, runnable));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f6962a) {
            mediaFormat = this.f6969h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        a.f(this.f6964c == null);
        this.f6963b.start();
        Handler handler = new Handler(this.f6963b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f6964c = handler;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6962a) {
            this.f6971j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f6962a) {
            this.f6965d.a(i10);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f6962a) {
            MediaFormat mediaFormat = this.f6970i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f6970i = null;
            }
            this.f6966e.a(i10);
            this.f6967f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6962a) {
            b(mediaFormat);
            this.f6970i = null;
        }
    }

    public void q() {
        synchronized (this.f6962a) {
            this.f6973l = true;
            this.f6963b.quit();
            f();
        }
    }
}
