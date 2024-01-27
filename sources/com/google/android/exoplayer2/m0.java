package com.google.android.exoplayer2;

import a6.a;
import com.google.android.exoplayer2.source.k;

/* compiled from: MediaPeriodInfo */
final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f6875a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6876b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6877c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6878d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6879e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6880f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6881g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6882h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6883i;

    m0(k.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z10;
        boolean z15 = z11;
        boolean z16 = z12;
        boolean z17 = z13;
        boolean z18 = false;
        a.a(!z17 || z15);
        a.a(!z16 || z15);
        if (!z14 || (!z15 && !z16 && !z17)) {
            z18 = true;
        }
        a.a(z18);
        this.f6875a = aVar;
        this.f6876b = j10;
        this.f6877c = j11;
        this.f6878d = j12;
        this.f6879e = j13;
        this.f6880f = z14;
        this.f6881g = z15;
        this.f6882h = z16;
        this.f6883i = z17;
    }

    public m0 a(long j10) {
        if (j10 == this.f6877c) {
            return this;
        }
        return new m0(this.f6875a, this.f6876b, j10, this.f6878d, this.f6879e, this.f6880f, this.f6881g, this.f6882h, this.f6883i);
    }

    public m0 b(long j10) {
        if (j10 == this.f6876b) {
            return this;
        }
        return new m0(this.f6875a, j10, this.f6877c, this.f6878d, this.f6879e, this.f6880f, this.f6881g, this.f6882h, this.f6883i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f6876b == m0Var.f6876b && this.f6877c == m0Var.f6877c && this.f6878d == m0Var.f6878d && this.f6879e == m0Var.f6879e && this.f6880f == m0Var.f6880f && this.f6881g == m0Var.f6881g && this.f6882h == m0Var.f6882h && this.f6883i == m0Var.f6883i && a6.m0.c(this.f6875a, m0Var.f6875a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f6875a.hashCode()) * 31) + ((int) this.f6876b)) * 31) + ((int) this.f6877c)) * 31) + ((int) this.f6878d)) * 31) + ((int) this.f6879e)) * 31) + (this.f6880f ? 1 : 0)) * 31) + (this.f6881g ? 1 : 0)) * 31) + (this.f6882h ? 1 : 0)) * 31) + (this.f6883i ? 1 : 0);
    }
}
