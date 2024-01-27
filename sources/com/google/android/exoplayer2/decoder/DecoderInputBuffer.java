package com.google.android.exoplayer2.decoder;

import h4.a;
import h4.b;
import java.nio.ByteBuffer;

public class DecoderInputBuffer extends a {

    /* renamed from: i  reason: collision with root package name */
    public final b f6468i;

    /* renamed from: j  reason: collision with root package name */
    public ByteBuffer f6469j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6470k;

    /* renamed from: l  reason: collision with root package name */
    public long f6471l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f6472m;

    /* renamed from: n  reason: collision with root package name */
    private final int f6473n;

    /* renamed from: o  reason: collision with root package name */
    private final int f6474o;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* renamed from: h  reason: collision with root package name */
        public final int f6475h;

        /* renamed from: i  reason: collision with root package name */
        public final int f6476i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f6475h = r3
                r2.f6476i = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    private ByteBuffer s(int i10) {
        int i11 = this.f6473n;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f6469j;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer w() {
        return new DecoderInputBuffer(0);
    }

    public void k() {
        super.k();
        ByteBuffer byteBuffer = this.f6469j;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6472m;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6470k = false;
    }

    public void t(int i10) {
        int i11 = i10 + this.f6474o;
        ByteBuffer byteBuffer = this.f6469j;
        if (byteBuffer == null) {
            this.f6469j = s(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f6469j = byteBuffer;
            return;
        }
        ByteBuffer s10 = s(i12);
        s10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            s10.put(byteBuffer);
        }
        this.f6469j = s10;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.f6469j;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6472m;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean v() {
        return m(1073741824);
    }

    public void x(int i10) {
        ByteBuffer byteBuffer = this.f6472m;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f6472m = ByteBuffer.allocate(i10);
        } else {
            this.f6472m.clear();
        }
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f6468i = new b();
        this.f6473n = i10;
        this.f6474o = i11;
    }
}
