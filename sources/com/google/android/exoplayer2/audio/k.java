package com.google.android.exoplayer2.audio;

import a6.a;
import a6.m0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: SonicAudioProcessor */
public final class k implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    private int f6416b;

    /* renamed from: c  reason: collision with root package name */
    private float f6417c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f6418d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private AudioProcessor.a f6419e;

    /* renamed from: f  reason: collision with root package name */
    private AudioProcessor.a f6420f;

    /* renamed from: g  reason: collision with root package name */
    private AudioProcessor.a f6421g;

    /* renamed from: h  reason: collision with root package name */
    private AudioProcessor.a f6422h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6423i;

    /* renamed from: j  reason: collision with root package name */
    private j f6424j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f6425k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f6426l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f6427m;

    /* renamed from: n  reason: collision with root package name */
    private long f6428n;

    /* renamed from: o  reason: collision with root package name */
    private long f6429o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6430p;

    public k() {
        AudioProcessor.a aVar = AudioProcessor.a.f6263e;
        this.f6419e = aVar;
        this.f6420f = aVar;
        this.f6421g = aVar;
        this.f6422h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f6262a;
        this.f6425k = byteBuffer;
        this.f6426l = byteBuffer.asShortBuffer();
        this.f6427m = byteBuffer;
        this.f6416b = -1;
    }

    public boolean a() {
        return this.f6420f.f6264a != -1 && (Math.abs(this.f6417c - 1.0f) >= 1.0E-4f || Math.abs(this.f6418d - 1.0f) >= 1.0E-4f || this.f6420f.f6264a != this.f6419e.f6264a);
    }

    public ByteBuffer b() {
        int k10;
        j jVar = this.f6424j;
        if (jVar != null && (k10 = jVar.k()) > 0) {
            if (this.f6425k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f6425k = order;
                this.f6426l = order.asShortBuffer();
            } else {
                this.f6425k.clear();
                this.f6426l.clear();
            }
            jVar.j(this.f6426l);
            this.f6429o += (long) k10;
            this.f6425k.limit(k10);
            this.f6427m = this.f6425k;
        }
        ByteBuffer byteBuffer = this.f6427m;
        this.f6427m = AudioProcessor.f6262a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6424j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r1 = this;
            boolean r0 = r1.f6430p
            if (r0 == 0) goto L_0x0010
            com.google.android.exoplayer2.audio.j r0 = r1.f6424j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.k.c():boolean");
    }

    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f6428n += (long) remaining;
            ((j) a.e(this.f6424j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public AudioProcessor.a e(AudioProcessor.a aVar) {
        if (aVar.f6266c == 2) {
            int i10 = this.f6416b;
            if (i10 == -1) {
                i10 = aVar.f6264a;
            }
            this.f6419e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f6265b, 2);
            this.f6420f = aVar2;
            this.f6423i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    public void f() {
        j jVar = this.f6424j;
        if (jVar != null) {
            jVar.s();
        }
        this.f6430p = true;
    }

    public void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f6419e;
            this.f6421g = aVar;
            AudioProcessor.a aVar2 = this.f6420f;
            this.f6422h = aVar2;
            if (this.f6423i) {
                this.f6424j = new j(aVar.f6264a, aVar.f6265b, this.f6417c, this.f6418d, aVar2.f6264a);
            } else {
                j jVar = this.f6424j;
                if (jVar != null) {
                    jVar.i();
                }
            }
        }
        this.f6427m = AudioProcessor.f6262a;
        this.f6428n = 0;
        this.f6429o = 0;
        this.f6430p = false;
    }

    public long g(long j10) {
        if (this.f6429o < 1024) {
            return (long) (((double) this.f6417c) * ((double) j10));
        }
        long l10 = this.f6428n - ((long) ((j) a.e(this.f6424j)).l());
        int i10 = this.f6422h.f6264a;
        int i11 = this.f6421g.f6264a;
        if (i10 == i11) {
            return m0.C0(j10, l10, this.f6429o);
        }
        return m0.C0(j10, l10 * ((long) i10), this.f6429o * ((long) i11));
    }

    public void h(float f10) {
        if (this.f6418d != f10) {
            this.f6418d = f10;
            this.f6423i = true;
        }
    }

    public void i(float f10) {
        if (this.f6417c != f10) {
            this.f6417c = f10;
            this.f6423i = true;
        }
    }

    public void reset() {
        this.f6417c = 1.0f;
        this.f6418d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f6263e;
        this.f6419e = aVar;
        this.f6420f = aVar;
        this.f6421g = aVar;
        this.f6422h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f6262a;
        this.f6425k = byteBuffer;
        this.f6426l = byteBuffer.asShortBuffer();
        this.f6427m = byteBuffer;
        this.f6416b = -1;
        this.f6423i = false;
        this.f6424j = null;
        this.f6428n = 0;
        this.f6429o = 0;
        this.f6430p = false;
    }
}
