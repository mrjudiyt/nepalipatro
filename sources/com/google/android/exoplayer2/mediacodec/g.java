package com.google.android.exoplayer2.mediacodec;

import a6.a;
import a6.p;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import e4.j;
import g4.u;
import java.nio.ByteBuffer;

/* compiled from: C2Mp3TimestampTracker */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private long f6978a;

    /* renamed from: b  reason: collision with root package name */
    private long f6979b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6980c;

    g() {
    }

    private long a(j jVar) {
        return (this.f6978a * 1000000) / ((long) jVar.G);
    }

    public void b() {
        this.f6978a = 0;
        this.f6979b = 0;
        this.f6980c = false;
    }

    public long c(j jVar, DecoderInputBuffer decoderInputBuffer) {
        if (this.f6980c) {
            return decoderInputBuffer.f6471l;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a.e(decoderInputBuffer.f6469j);
        byte b10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            b10 = (b10 << 8) | (byteBuffer.get(i10) & 255);
        }
        int m10 = u.m(b10);
        if (m10 == -1) {
            this.f6980c = true;
            p.h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.f6471l;
        } else if (this.f6978a == 0) {
            long j10 = decoderInputBuffer.f6471l;
            this.f6979b = j10;
            this.f6978a = ((long) m10) - 529;
            return j10;
        } else {
            long a10 = a(jVar);
            this.f6978a += (long) m10;
            return this.f6979b + a10;
        }
    }
}
