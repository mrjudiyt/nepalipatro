package com.google.android.exoplayer2.source.dash;

import a6.m0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import e4.j;
import e4.k;
import g5.t;
import k5.f;
import z4.c;

/* compiled from: EventSampleStream */
final class d implements t {

    /* renamed from: h  reason: collision with root package name */
    private final j f7249h;

    /* renamed from: i  reason: collision with root package name */
    private final c f7250i = new c();

    /* renamed from: j  reason: collision with root package name */
    private long[] f7251j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7252k;

    /* renamed from: l  reason: collision with root package name */
    private f f7253l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7254m;

    /* renamed from: n  reason: collision with root package name */
    private int f7255n;

    /* renamed from: o  reason: collision with root package name */
    private long f7256o = -9223372036854775807L;

    public d(f fVar, j jVar, boolean z10) {
        this.f7249h = jVar;
        this.f7253l = fVar;
        this.f7251j = fVar.f9674b;
        d(fVar, z10);
    }

    public void a() {
    }

    public String b() {
        return this.f7253l.a();
    }

    public void c(long j10) {
        boolean z10 = true;
        int e10 = m0.e(this.f7251j, j10, true, false);
        this.f7255n = e10;
        if (!this.f7252k || e10 != this.f7251j.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f7256o = j10;
    }

    public void d(f fVar, boolean z10) {
        int i10 = this.f7255n;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f7251j[i10 - 1];
        this.f7252k = z10;
        this.f7253l = fVar;
        long[] jArr = fVar.f9674b;
        this.f7251j = jArr;
        long j11 = this.f7256o;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f7255n = m0.e(jArr, j10, false, false);
        }
    }

    public boolean e() {
        return true;
    }

    public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = this.f7255n;
        boolean z10 = i11 == this.f7251j.length;
        if (z10 && !this.f7252k) {
            decoderInputBuffer.r(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f7254m) {
            kVar.f8131b = this.f7249h;
            this.f7254m = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            this.f7255n = i11 + 1;
            byte[] a10 = this.f7250i.a(this.f7253l.f9673a[i11]);
            decoderInputBuffer.t(a10.length);
            decoderInputBuffer.f6469j.put(a10);
            decoderInputBuffer.f6471l = this.f7251j[i11];
            decoderInputBuffer.r(1);
            return -4;
        }
    }

    public int o(long j10) {
        int max = Math.max(this.f7255n, m0.e(this.f7251j, j10, true, false));
        int i10 = max - this.f7255n;
        this.f7255n = max;
        return i10;
    }
}
