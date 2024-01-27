package com.google.android.exoplayer2.mediacodec;

import a6.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* compiled from: BatchBuffer */
final class f extends DecoderInputBuffer {

    /* renamed from: p  reason: collision with root package name */
    private long f6975p;

    /* renamed from: q  reason: collision with root package name */
    private int f6976q;

    /* renamed from: r  reason: collision with root package name */
    private int f6977r = 32;

    public f() {
        super(2);
    }

    private boolean z(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!D()) {
            return true;
        }
        if (this.f6976q >= this.f6977r || decoderInputBuffer.o() != o()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f6469j;
        if (byteBuffer2 == null || (byteBuffer = this.f6469j) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public long A() {
        return this.f6471l;
    }

    public long B() {
        return this.f6975p;
    }

    public int C() {
        return this.f6976q;
    }

    public boolean D() {
        return this.f6976q > 0;
    }

    public void E(int i10) {
        a.a(i10 > 0);
        this.f6977r = i10;
    }

    public void k() {
        super.k();
        this.f6976q = 0;
    }

    public boolean y(DecoderInputBuffer decoderInputBuffer) {
        a.a(!decoderInputBuffer.v());
        a.a(!decoderInputBuffer.n());
        a.a(!decoderInputBuffer.p());
        if (!z(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f6976q;
        this.f6976q = i10 + 1;
        if (i10 == 0) {
            this.f6471l = decoderInputBuffer.f6471l;
            if (decoderInputBuffer.q()) {
                r(1);
            }
        }
        if (decoderInputBuffer.o()) {
            r(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f6469j;
        if (byteBuffer != null) {
            t(byteBuffer.remaining());
            this.f6469j.put(byteBuffer);
        }
        this.f6975p = decoderInputBuffer.f6471l;
        return true;
    }
}
