package com.google.android.exoplayer2.audio;

import a6.a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: Sonic */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f6394a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6395b;

    /* renamed from: c  reason: collision with root package name */
    private final float f6396c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6397d;

    /* renamed from: e  reason: collision with root package name */
    private final float f6398e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6399f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6400g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6401h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f6402i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f6403j;

    /* renamed from: k  reason: collision with root package name */
    private int f6404k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f6405l;

    /* renamed from: m  reason: collision with root package name */
    private int f6406m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f6407n;

    /* renamed from: o  reason: collision with root package name */
    private int f6408o;

    /* renamed from: p  reason: collision with root package name */
    private int f6409p;

    /* renamed from: q  reason: collision with root package name */
    private int f6410q;

    /* renamed from: r  reason: collision with root package name */
    private int f6411r;

    /* renamed from: s  reason: collision with root package name */
    private int f6412s;

    /* renamed from: t  reason: collision with root package name */
    private int f6413t;

    /* renamed from: u  reason: collision with root package name */
    private int f6414u;

    /* renamed from: v  reason: collision with root package name */
    private int f6415v;

    public j(int i10, int i11, float f10, float f11, int i12) {
        this.f6394a = i10;
        this.f6395b = i11;
        this.f6396c = f10;
        this.f6397d = f11;
        this.f6398e = ((float) i10) / ((float) i12);
        this.f6399f = i10 / 400;
        int i13 = i10 / 65;
        this.f6400g = i13;
        int i14 = i13 * 2;
        this.f6401h = i14;
        this.f6402i = new short[i14];
        this.f6403j = new short[(i14 * i11)];
        this.f6405l = new short[(i14 * i11)];
        this.f6407n = new short[(i14 * i11)];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f6406m != i10) {
            int i13 = this.f6394a;
            int i14 = (int) (((float) i13) / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            o(i10);
            int i15 = 0;
            while (true) {
                int i16 = this.f6408o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f6409p;
                        int i17 = (i11 + 1) * i14;
                        i12 = this.f6410q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f6405l = f(this.f6405l, this.f6406m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f6395b;
                            if (i18 >= i19) {
                                break;
                            }
                            this.f6405l[(this.f6406m * i19) + i18] = n(this.f6407n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                        this.f6410q++;
                        this.f6406m++;
                    }
                    int i20 = i11 + 1;
                    this.f6409p = i20;
                    if (i20 == i13) {
                        this.f6409p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        a.f(z10);
                        this.f6410q = 0;
                    }
                    i15++;
                } else {
                    u(i16 - 1);
                    return;
                }
            }
        }
    }

    private void b(float f10) {
        int m10;
        int i10 = this.f6404k;
        if (i10 >= this.f6401h) {
            int i11 = 0;
            do {
                if (this.f6411r > 0) {
                    m10 = c(i11);
                } else {
                    int g10 = g(this.f6403j, i11);
                    if (((double) f10) > 1.0d) {
                        m10 = g10 + w(this.f6403j, i11, f10, g10);
                    } else {
                        m10 = m(this.f6403j, i11, f10, g10);
                    }
                }
                i11 += m10;
            } while (this.f6401h + i11 <= i10);
            v(i11);
        }
    }

    private int c(int i10) {
        int min = Math.min(this.f6401h, this.f6411r);
        d(this.f6403j, i10, min);
        this.f6411r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f6405l, this.f6406m, i11);
        this.f6405l = f10;
        int i12 = this.f6395b;
        System.arraycopy(sArr, i10 * i12, f10, this.f6406m * i12, i12 * i11);
        this.f6406m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f6401h / i11;
        int i13 = this.f6395b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f6402i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f6395b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f6394a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f6395b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f6399f, this.f6400g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f6402i, 0, this.f6399f / i13, this.f6400g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f6399f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f6400g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f6395b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f6402i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f6414u, this.f6415v) ? this.f6412s : i11;
        this.f6413t = this.f6414u;
        this.f6412s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f6395b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f6414u = i14 / i16;
        this.f6415v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((((float) i11) * f10) / (1.0f - f10));
        } else {
            this.f6411r = (int) ((((float) i11) * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f6405l, this.f6406m, i13);
        this.f6405l = f11;
        int i14 = this.f6395b;
        System.arraycopy(sArr, i10 * i14, f11, this.f6406m * i14, i14 * i11);
        p(i12, this.f6395b, this.f6405l, this.f6406m + i11, sArr, i10 + i11, sArr, i10);
        this.f6406m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f6395b];
        int i13 = this.f6410q * i11;
        int i14 = this.f6409p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f6406m - i10;
        short[] f10 = f(this.f6407n, this.f6408o, i11);
        this.f6407n = f10;
        short[] sArr = this.f6405l;
        int i12 = this.f6395b;
        System.arraycopy(sArr, i10 * i12, f10, this.f6408o * i12, i12 * i11);
        this.f6406m = i10;
        this.f6408o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        if (i10 == 0 || this.f6412s == 0 || i11 > i10 * 3 || i10 * 2 <= this.f6413t * 3) {
            return false;
        }
        return true;
    }

    private void r() {
        int i10 = this.f6406m;
        float f10 = this.f6396c;
        float f11 = this.f6397d;
        float f12 = f10 / f11;
        float f13 = this.f6398e * f11;
        double d10 = (double) f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f6403j, 0, this.f6404k);
            this.f6404k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f6407n;
            int i11 = this.f6395b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f6408o - i10) * i11);
            this.f6408o -= i10;
        }
    }

    private void v(int i10) {
        int i11 = this.f6404k - i10;
        short[] sArr = this.f6403j;
        int i12 = this.f6395b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f6404k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (((float) i11) / (f10 - 1.0f));
        } else {
            this.f6411r = (int) ((((float) i11) * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f6405l, this.f6406m, i12);
        this.f6405l = f11;
        p(i12, this.f6395b, f11, this.f6406m, sArr, i10, sArr, i10 + i11);
        this.f6406m += i12;
        return i12;
    }

    public void i() {
        this.f6404k = 0;
        this.f6406m = 0;
        this.f6408o = 0;
        this.f6409p = 0;
        this.f6410q = 0;
        this.f6411r = 0;
        this.f6412s = 0;
        this.f6413t = 0;
        this.f6414u = 0;
        this.f6415v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6395b, this.f6406m);
        shortBuffer.put(this.f6405l, 0, this.f6395b * min);
        int i10 = this.f6406m - min;
        this.f6406m = i10;
        short[] sArr = this.f6405l;
        int i11 = this.f6395b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f6406m * this.f6395b * 2;
    }

    public int l() {
        return this.f6404k * this.f6395b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f6404k;
        float f10 = this.f6396c;
        float f11 = this.f6397d;
        int i12 = this.f6406m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) this.f6408o)) / (this.f6398e * f11)) + 0.5f));
        this.f6403j = f(this.f6403j, i11, (this.f6401h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f6401h;
            int i14 = this.f6395b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f6403j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f6404k += i10 * 2;
        r();
        if (this.f6406m > i12) {
            this.f6406m = i12;
        }
        this.f6404k = 0;
        this.f6411r = 0;
        this.f6408o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f6395b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f6403j, this.f6404k, i11);
        this.f6403j = f10;
        shortBuffer.get(f10, this.f6404k * this.f6395b, ((i10 * i11) * 2) / 2);
        this.f6404k += i11;
        r();
    }
}
