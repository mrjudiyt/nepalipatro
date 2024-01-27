package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat */
public class g implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f4494a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f4495b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f4494a = new float[min];
            this.f4495b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((((float) i11) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f4494a[i11] = fArr[0];
                this.f4495b[i11] = fArr[1];
            }
            if (((double) Math.abs(this.f4494a[0])) <= 1.0E-5d && ((double) Math.abs(this.f4495b[0])) <= 1.0E-5d) {
                int i12 = min - 1;
                if (((double) Math.abs(this.f4494a[i12] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f4495b[i12] - 1.0f)) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f4494a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f4494a[0]);
            sb.append(",");
            sb.append(this.f4495b[0]);
            sb.append(" end:");
            int i15 = min - 1;
            sb.append(this.f4494a[i15]);
            sb.append(",");
            sb.append(this.f4495b[i15]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (k.r(xmlPullParser, "pathData")) {
            String m10 = k.m(typedArray, xmlPullParser, "pathData", 4);
            Path e10 = d.e(m10);
            if (e10 != null) {
                b(e10);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m10);
        } else if (!k.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (k.r(xmlPullParser, "controlY1")) {
            float j10 = k.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j11 = k.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r10 = k.r(xmlPullParser, "controlX2");
            if (r10 != k.r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r10) {
                c(j10, j11);
            } else {
                a(j10, j11, k.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), k.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f4494a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f4494a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f4494a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f4495b[i10];
        }
        float[] fArr2 = this.f4495b;
        float f12 = fArr2[i10];
        return f12 + (((f10 - fArr[i10]) / f11) * (fArr2[length] - f12));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s10 = k.s(resources, theme, attributeSet, a.f4478l);
        d(s10, xmlPullParser);
        s10.recycle();
    }
}
