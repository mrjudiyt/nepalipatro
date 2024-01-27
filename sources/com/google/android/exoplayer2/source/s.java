package com.google.android.exoplayer2.source;

import a6.m0;
import a6.y;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.u;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.b0;
import z5.b;
import z5.g;

/* compiled from: SampleDataQueue */
class s {

    /* renamed from: a  reason: collision with root package name */
    private final b f7536a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7537b;

    /* renamed from: c  reason: collision with root package name */
    private final y f7538c = new y(32);

    /* renamed from: d  reason: collision with root package name */
    private a f7539d;

    /* renamed from: e  reason: collision with root package name */
    private a f7540e;

    /* renamed from: f  reason: collision with root package name */
    private a f7541f;

    /* renamed from: g  reason: collision with root package name */
    private long f7542g;

    /* compiled from: SampleDataQueue */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f7543a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7544b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7545c;

        /* renamed from: d  reason: collision with root package name */
        public z5.a f7546d;

        /* renamed from: e  reason: collision with root package name */
        public a f7547e;

        public a(long j10, int i10) {
            this.f7543a = j10;
            this.f7544b = j10 + ((long) i10);
        }

        public a a() {
            this.f7546d = null;
            a aVar = this.f7547e;
            this.f7547e = null;
            return aVar;
        }

        public void b(z5.a aVar, a aVar2) {
            this.f7546d = aVar;
            this.f7547e = aVar2;
            this.f7545c = true;
        }

        public int c(long j10) {
            return ((int) (j10 - this.f7543a)) + this.f7546d.f13197b;
        }
    }

    public s(b bVar) {
        this.f7536a = bVar;
        int e10 = bVar.e();
        this.f7537b = e10;
        a aVar = new a(0, e10);
        this.f7539d = aVar;
        this.f7540e = aVar;
        this.f7541f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f7545c) {
            a aVar2 = this.f7541f;
            int i10 = (aVar2.f7545c ? 1 : 0) + (((int) (aVar2.f7543a - aVar.f7543a)) / this.f7537b);
            z5.a[] aVarArr = new z5.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f7546d;
                aVar = aVar.a();
            }
            this.f7536a.a(aVarArr);
        }
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f7544b) {
            aVar = aVar.f7547e;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f7542g + ((long) i10);
        this.f7542g = j10;
        a aVar = this.f7541f;
        if (j10 == aVar.f7544b) {
            this.f7541f = aVar.f7547e;
        }
    }

    private int h(int i10) {
        a aVar = this.f7541f;
        if (!aVar.f7545c) {
            aVar.b(this.f7536a.b(), new a(this.f7541f.f7544b, this.f7537b));
        }
        return Math.min(i10, (int) (this.f7541f.f7544b - this.f7542g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f7544b - j10));
            byteBuffer.put(d10.f7546d.f13196a, d10.c(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == d10.f7544b) {
                d10 = d10.f7547e;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f7544b - j10));
            System.arraycopy(d10.f7546d.f13196a, d10.c(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == d10.f7544b) {
                d10 = d10.f7547e;
            }
        }
        return d10;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, u.b bVar, y yVar) {
        int i10;
        u.b bVar2 = bVar;
        y yVar2 = yVar;
        long j10 = bVar2.f7583b;
        yVar2.K(1);
        a j11 = j(aVar, j10, yVar.d(), 1);
        long j12 = j10 + 1;
        byte b10 = yVar.d()[0];
        boolean z10 = (b10 & 128) != 0;
        byte b11 = b10 & Byte.MAX_VALUE;
        h4.b bVar3 = decoderInputBuffer.f6468i;
        byte[] bArr = bVar3.f8942a;
        if (bArr == null) {
            bVar3.f8942a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, bVar3.f8942a, b11);
        long j14 = j12 + ((long) b11);
        if (z10) {
            yVar2.K(2);
            j13 = j(j13, j14, yVar.d(), 2);
            j14 += 2;
            i10 = yVar.I();
        } else {
            i10 = 1;
        }
        int[] iArr = bVar3.f8945d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar3.f8946e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i11 = i10 * 6;
            yVar2.K(i11);
            j13 = j(j13, j14, yVar.d(), i11);
            j14 += (long) i11;
            yVar2.O(0);
            for (int i12 = 0; i12 < i10; i12++) {
                iArr2[i12] = yVar.I();
                iArr4[i12] = yVar.G();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f7582a - ((int) (j14 - bVar2.f7583b));
        }
        b0.a aVar2 = (b0.a) m0.j(bVar2.f7584c);
        bVar3.c(i10, iArr2, iArr4, aVar2.f9536b, bVar3.f8942a, aVar2.f9535a, aVar2.f9537c, aVar2.f9538d);
        long j15 = bVar2.f7583b;
        int i13 = (int) (j14 - j15);
        bVar2.f7583b = j15 + ((long) i13);
        bVar2.f7582a -= i13;
        return j13;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, u.b bVar, y yVar) {
        if (decoderInputBuffer.v()) {
            aVar = k(aVar, decoderInputBuffer, bVar, yVar);
        }
        if (decoderInputBuffer.n()) {
            yVar.K(4);
            a j10 = j(aVar, bVar.f7583b, yVar.d(), 4);
            int G = yVar.G();
            bVar.f7583b += 4;
            bVar.f7582a -= 4;
            decoderInputBuffer.t(G);
            a i10 = i(j10, bVar.f7583b, decoderInputBuffer.f6469j, G);
            bVar.f7583b += (long) G;
            int i11 = bVar.f7582a - G;
            bVar.f7582a = i11;
            decoderInputBuffer.x(i11);
            return i(i10, bVar.f7583b, decoderInputBuffer.f6472m, bVar.f7582a);
        }
        decoderInputBuffer.t(bVar.f7582a);
        return i(aVar, bVar.f7583b, decoderInputBuffer.f6469j, bVar.f7582a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f7539d;
                if (j10 < aVar.f7544b) {
                    break;
                }
                this.f7536a.d(aVar.f7546d);
                this.f7539d = this.f7539d.a();
            }
            if (this.f7540e.f7543a < aVar.f7543a) {
                this.f7540e = aVar;
            }
        }
    }

    public void c(long j10) {
        this.f7542g = j10;
        if (j10 != 0) {
            a aVar = this.f7539d;
            if (j10 != aVar.f7543a) {
                while (this.f7542g > aVar.f7544b) {
                    aVar = aVar.f7547e;
                }
                a aVar2 = aVar.f7547e;
                a(aVar2);
                a aVar3 = new a(aVar.f7544b, this.f7537b);
                aVar.f7547e = aVar3;
                if (this.f7542g == aVar.f7544b) {
                    aVar = aVar3;
                }
                this.f7541f = aVar;
                if (this.f7540e == aVar2) {
                    this.f7540e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f7539d);
        a aVar4 = new a(this.f7542g, this.f7537b);
        this.f7539d = aVar4;
        this.f7540e = aVar4;
        this.f7541f = aVar4;
    }

    public long e() {
        return this.f7542g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, u.b bVar) {
        l(this.f7540e, decoderInputBuffer, bVar, this.f7538c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, u.b bVar) {
        this.f7540e = l(this.f7540e, decoderInputBuffer, bVar, this.f7538c);
    }

    public void n() {
        a(this.f7539d);
        a aVar = new a(0, this.f7537b);
        this.f7539d = aVar;
        this.f7540e = aVar;
        this.f7541f = aVar;
        this.f7542g = 0;
        this.f7536a.c();
    }

    public void o() {
        this.f7540e = this.f7539d;
    }

    public int p(g gVar, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f7541f;
        int read = gVar.read(aVar.f7546d.f13196a, aVar.c(this.f7542g), h10);
        if (read != -1) {
            g(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(y yVar, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f7541f;
            yVar.j(aVar.f7546d.f13196a, aVar.c(this.f7542g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
