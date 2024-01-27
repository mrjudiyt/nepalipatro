package androidx.core.content.res;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: ViewingConditions */
final class l {

    /* renamed from: k  reason: collision with root package name */
    static final l f2304k = k(b.f2270c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f2305a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2306b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2307c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2308d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2309e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2310f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f2311g;

    /* renamed from: h  reason: collision with root package name */
    private final float f2312h;

    /* renamed from: i  reason: collision with root package name */
    private final float f2313i;

    /* renamed from: j  reason: collision with root package name */
    private final float f2314j;

    private l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f2310f = f10;
        this.f2305a = f11;
        this.f2306b = f12;
        this.f2307c = f13;
        this.f2308d = f14;
        this.f2309e = f15;
        this.f2311g = fArr;
        this.f2312h = f16;
        this.f2313i = f17;
        this.f2314j = f18;
    }

    static l k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14 = f10;
        float[][] fArr2 = b.f2268a;
        float f15 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f16 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f17 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f18 = (f12 / 10.0f) + 0.8f;
        float d10 = ((double) f18) >= 0.9d ? b.d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = (1.0f - (((float) Math.exp((double) (((-f14) - 42.0f) / 92.0f))) * 0.2777778f)) * f18;
        }
        double d11 = (double) f13;
        if (d11 > 1.0d) {
            f13 = 1.0f;
        } else if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            f13 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f15) * f13) + 1.0f) - f13, (((100.0f / f16) * f13) + 1.0f) - f13, (((100.0f / f17) * f13) + 1.0f) - f13};
        float f19 = 1.0f / ((5.0f * f14) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (f20 * f14) + (0.1f * f21 * f21 * ((float) Math.cbrt(((double) f14) * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = (double) h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f17)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(h10, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d10, f18, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f2305a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f2308d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f2312h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f2313i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f2310f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f2306b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f2309e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f2307c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f2311g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f2314j;
    }
}
