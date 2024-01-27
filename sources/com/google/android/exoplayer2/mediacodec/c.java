package com.google.android.exoplayer2.mediacodec;

import a6.e;
import a6.m0;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
class c {

    /* renamed from: h  reason: collision with root package name */
    private static final ArrayDeque<b> f6944h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f6945i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f6946a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f6947b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f6948c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f6949d;

    /* renamed from: e  reason: collision with root package name */
    private final e f6950e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6951f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6952g;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            c.this.f(message);
        }
    }

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6954a;

        /* renamed from: b  reason: collision with root package name */
        public int f6955b;

        /* renamed from: c  reason: collision with root package name */
        public int f6956c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f6957d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f6958e;

        /* renamed from: f  reason: collision with root package name */
        public int f6959f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f6954a = i10;
            this.f6955b = i11;
            this.f6956c = i12;
            this.f6958e = j10;
            this.f6959f = i13;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new e());
    }

    private void b() {
        this.f6950e.c();
        ((Handler) m0.j(this.f6948c)).obtainMessage(2).sendToTarget();
        this.f6950e.a();
    }

    private static void c(h4.b bVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = bVar.f8947f;
        cryptoInfo.numBytesOfClearData = e(bVar.f8945d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(bVar.f8946e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) a6.a.e(d(bVar.f8943b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) a6.a.e(d(bVar.f8942a, cryptoInfo.iv));
        cryptoInfo.mode = bVar.f8944c;
        if (m0.f205a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f8948g, bVar.f8949h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* access modifiers changed from: private */
    public void f(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f6954a, bVar.f6955b, bVar.f6956c, bVar.f6958e, bVar.f6959f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f6950e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            h(bVar.f6954a, bVar.f6955b, bVar.f6957d, bVar.f6958e, bVar.f6959f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f6946a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            q(e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            if (this.f6951f) {
                synchronized (f6945i) {
                    this.f6946a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                }
                return;
            }
            this.f6946a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
        } catch (RuntimeException e10) {
            q(e10);
        }
    }

    private void j() {
        ((Handler) m0.j(this.f6948c)).removeCallbacksAndMessages((Object) null);
        b();
        l();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f6944h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                b bVar = new b();
                return bVar;
            }
            b removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    private void l() {
        RuntimeException andSet = this.f6949d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static boolean m() {
        String e10 = l6.c.e(m0.f207c);
        return e10.contains("samsung") || e10.contains("motorola");
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f6944h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f6952g) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void n(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) m0.j(this.f6948c)).obtainMessage(0, k10).sendToTarget();
    }

    public void o(int i10, int i11, h4.b bVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(bVar, k10.f6957d);
        ((Handler) m0.j(this.f6948c)).obtainMessage(1, k10).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void q(RuntimeException runtimeException) {
        this.f6949d.set(runtimeException);
    }

    public void r() {
        if (this.f6952g) {
            i();
            this.f6947b.quit();
        }
        this.f6952g = false;
    }

    public void s() {
        if (!this.f6952g) {
            this.f6947b.start();
            this.f6948c = new a(this.f6947b.getLooper());
            this.f6952g = true;
        }
    }

    public void t() {
        b();
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, e eVar) {
        this.f6946a = mediaCodec;
        this.f6947b = handlerThread;
        this.f6950e = eVar;
        this.f6949d = new AtomicReference<>();
        this.f6951f = z10 || m();
    }
}
