package t;

import java.text.DecimalFormat;

/* compiled from: SplineSet */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected a f11500a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f11501b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f11502c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f11503d;

    /* renamed from: e  reason: collision with root package name */
    private String f11504e;

    public float a(float f10) {
        return (float) this.f11500a.a((double) f10, 0);
    }

    public String toString() {
        String str = this.f11504e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f11503d; i10++) {
            str = str + "[" + this.f11501b[i10] + " , " + decimalFormat.format((double) this.f11502c[i10]) + "] ";
        }
        return str;
    }
}
