package com.google.android.exoplayer2;

import a6.m0;
import android.os.SystemClock;
import com.google.android.exoplayer2.j0;
import e4.c;

/* compiled from: DefaultLivePlaybackSpeedControl */
public final class f implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f6655a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6656b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6657c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6658d;

    /* renamed from: e  reason: collision with root package name */
    private final long f6659e;

    /* renamed from: f  reason: collision with root package name */
    private final long f6660f;

    /* renamed from: g  reason: collision with root package name */
    private final float f6661g;

    /* renamed from: h  reason: collision with root package name */
    private long f6662h;

    /* renamed from: i  reason: collision with root package name */
    private long f6663i;

    /* renamed from: j  reason: collision with root package name */
    private long f6664j;

    /* renamed from: k  reason: collision with root package name */
    private long f6665k;

    /* renamed from: l  reason: collision with root package name */
    private long f6666l;

    /* renamed from: m  reason: collision with root package name */
    private long f6667m;

    /* renamed from: n  reason: collision with root package name */
    private float f6668n;

    /* renamed from: o  reason: collision with root package name */
    private float f6669o;

    /* renamed from: p  reason: collision with root package name */
    private float f6670p;

    /* renamed from: q  reason: collision with root package name */
    private long f6671q;

    /* renamed from: r  reason: collision with root package name */
    private long f6672r;

    /* renamed from: s  reason: collision with root package name */
    private long f6673s;

    /* compiled from: DefaultLivePlaybackSpeedControl */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f6674a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f6675b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f6676c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f6677d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f6678e = c.d(20);

        /* renamed from: f  reason: collision with root package name */
        private long f6679f = c.d(500);

        /* renamed from: g  reason: collision with root package name */
        private float f6680g = 0.999f;

        public f a() {
            return new f(this.f6674a, this.f6675b, this.f6676c, this.f6677d, this.f6678e, this.f6679f, this.f6680g);
        }

        public b b(float f10) {
            a6.a.a(f10 >= 1.0f);
            this.f6675b = f10;
            return this;
        }

        public b c(float f10) {
            a6.a.a(0.0f < f10 && f10 <= 1.0f);
            this.f6674a = f10;
            return this;
        }

        public b d(long j10) {
            a6.a.a(j10 > 0);
            this.f6678e = c.d(j10);
            return this;
        }

        public b e(float f10) {
            a6.a.a(f10 >= 0.0f && f10 < 1.0f);
            this.f6680g = f10;
            return this;
        }

        public b f(long j10) {
            a6.a.a(j10 > 0);
            this.f6676c = j10;
            return this;
        }

        public b g(float f10) {
            a6.a.a(f10 > 0.0f);
            this.f6677d = f10 / 1000000.0f;
            return this;
        }

        public b h(long j10) {
            a6.a.a(j10 >= 0);
            this.f6679f = c.d(j10);
            return this;
        }
    }

    private void f(long j10) {
        long j11 = this.f6672r + (this.f6673s * 3);
        if (this.f6667m > j11) {
            float d10 = (float) c.d(this.f6657c);
            this.f6667m = n6.f.c(j11, this.f6664j, this.f6667m - (((long) ((this.f6670p - 1.0f) * d10)) + ((long) ((this.f6668n - 1.0f) * d10))));
            return;
        }
        long s10 = m0.s(j10 - ((long) (Math.max(0.0f, this.f6670p - 1.0f) / this.f6658d)), this.f6667m, j11);
        this.f6667m = s10;
        long j12 = this.f6666l;
        if (j12 != -9223372036854775807L && s10 > j12) {
            this.f6667m = j12;
        }
    }

    private void g() {
        long j10 = this.f6662h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f6663i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f6665k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f6666l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f6664j != j10) {
            this.f6664j = j10;
            this.f6667m = j10;
            this.f6672r = -9223372036854775807L;
            this.f6673s = -9223372036854775807L;
            this.f6671q = -9223372036854775807L;
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f6672r;
        if (j13 == -9223372036854775807L) {
            this.f6672r = j12;
            this.f6673s = 0;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f6661g));
        this.f6672r = max;
        this.f6673s = h(this.f6673s, Math.abs(j12 - max), this.f6661g);
    }

    public void a(j0.f fVar) {
        this.f6662h = c.d(fVar.f6792a);
        this.f6665k = c.d(fVar.f6793b);
        this.f6666l = c.d(fVar.f6794c);
        float f10 = fVar.f6795d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f6655a;
        }
        this.f6669o = f10;
        float f11 = fVar.f6796e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f6656b;
        }
        this.f6668n = f11;
        g();
    }

    public float b(long j10, long j11) {
        if (this.f6662h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f6671q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f6671q < this.f6657c) {
            return this.f6670p;
        }
        this.f6671q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f6667m;
        if (Math.abs(j12) < this.f6659e) {
            this.f6670p = 1.0f;
        } else {
            this.f6670p = m0.q((this.f6658d * ((float) j12)) + 1.0f, this.f6669o, this.f6668n);
        }
        return this.f6670p;
    }

    public long c() {
        return this.f6667m;
    }

    public void d() {
        long j10 = this.f6667m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f6660f;
            this.f6667m = j11;
            long j12 = this.f6666l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f6667m = j12;
            }
            this.f6671q = -9223372036854775807L;
        }
    }

    public void e(long j10) {
        this.f6663i = j10;
        g();
    }

    private f(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f6655a = f10;
        this.f6656b = f11;
        this.f6657c = j10;
        this.f6658d = f12;
        this.f6659e = j11;
        this.f6660f = j12;
        this.f6661g = f13;
        this.f6662h = -9223372036854775807L;
        this.f6663i = -9223372036854775807L;
        this.f6665k = -9223372036854775807L;
        this.f6666l = -9223372036854775807L;
        this.f6669o = f10;
        this.f6668n = f11;
        this.f6670p = 1.0f;
        this.f6671q = -9223372036854775807L;
        this.f6664j = -9223372036854775807L;
        this.f6667m = -9223372036854775807L;
        this.f6672r = -9223372036854775807L;
        this.f6673s = -9223372036854775807L;
    }
}
