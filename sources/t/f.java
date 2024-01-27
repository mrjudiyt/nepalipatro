package t;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    protected a f11505a;

    /* renamed from: b  reason: collision with root package name */
    protected int f11506b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f11507c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f11508d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e  reason: collision with root package name */
    protected int f11509e;

    /* renamed from: f  reason: collision with root package name */
    protected String f11510f;

    /* renamed from: g  reason: collision with root package name */
    protected float[] f11511g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f11512h = false;

    /* renamed from: i  reason: collision with root package name */
    protected long f11513i;

    /* renamed from: j  reason: collision with root package name */
    protected float f11514j = Float.NaN;

    public String toString() {
        String str = this.f11510f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f11509e; i10++) {
            str = str + "[" + this.f11507c[i10] + " , " + decimalFormat.format(this.f11508d[i10]) + "] ";
        }
        return str;
    }
}
