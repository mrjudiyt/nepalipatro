package i1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f9138a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f9139b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9140c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f9141d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f9142e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f9143f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f9138a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f9139b = pathMeasure;
        this.f9140c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f9143f);
    }

    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f9143f = f10.floatValue();
        this.f9139b.getPosTan(this.f9140c * f10.floatValue(), this.f9141d, (float[]) null);
        PointF pointF = this.f9142e;
        float[] fArr = this.f9141d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f9138a.set(t10, pointF);
    }
}
