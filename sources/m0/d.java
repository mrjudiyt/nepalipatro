package m0;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f10154a;

    /* renamed from: b  reason: collision with root package name */
    private final float f10155b;

    protected d(float[] fArr) {
        this.f10154a = fArr;
        this.f10155b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f10154a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f10155b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f10154a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
