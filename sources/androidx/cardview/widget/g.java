package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import r.b;
import r.c;

/* compiled from: RoundRectDrawableWithShadow */
class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    private static final double f1399q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    static a f1400r;

    /* renamed from: a  reason: collision with root package name */
    private final int f1401a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f1402b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f1403c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f1404d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f1405e;

    /* renamed from: f  reason: collision with root package name */
    private float f1406f;

    /* renamed from: g  reason: collision with root package name */
    private Path f1407g;

    /* renamed from: h  reason: collision with root package name */
    private float f1408h;

    /* renamed from: i  reason: collision with root package name */
    private float f1409i;

    /* renamed from: j  reason: collision with root package name */
    private float f1410j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f1411k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1412l = true;

    /* renamed from: m  reason: collision with root package name */
    private final int f1413m;

    /* renamed from: n  reason: collision with root package name */
    private final int f1414n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1415o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1416p = false;

    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f1413m = resources.getColor(b.f10785d);
        this.f1414n = resources.getColor(b.f10784c);
        this.f1401a = resources.getDimensionPixelSize(c.f10786a);
        this.f1402b = new Paint(5);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1403c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1406f = (float) ((int) (f10 + 0.5f));
        this.f1405e = new RectF();
        Paint paint2 = new Paint(this.f1403c);
        this.f1404d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f1408h;
        float f11 = 1.5f * f10;
        this.f1405e.set(((float) rect.left) + f10, ((float) rect.top) + f11, ((float) rect.right) - f10, ((float) rect.bottom) - f11);
        b();
    }

    private void b() {
        float f10 = this.f1406f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f1409i;
        rectF2.inset(-f11, -f11);
        Path path = this.f1407g;
        if (path == null) {
            this.f1407g = new Path();
        } else {
            path.reset();
        }
        this.f1407g.setFillType(Path.FillType.EVEN_ODD);
        this.f1407g.moveTo(-this.f1406f, 0.0f);
        this.f1407g.rLineTo(-this.f1409i, 0.0f);
        this.f1407g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1407g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1407g.close();
        float f12 = this.f1406f;
        float f13 = f12 / (this.f1409i + f12);
        Paint paint = this.f1403c;
        float f14 = this.f1406f + this.f1409i;
        int i10 = this.f1413m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f1414n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1404d;
        float f15 = this.f1406f;
        float f16 = this.f1409i;
        int i11 = this.f1413m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f1414n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1404d.setAntiAlias(false);
    }

    static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f1399q) * ((double) f11))) : f10;
    }

    static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f1399q) * ((double) f11))) : f10 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f10 = this.f1406f;
        float f11 = (-f10) - this.f1409i;
        float f12 = f10 + ((float) this.f1401a) + (this.f1410j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f1405e.width() - f13 > 0.0f;
        boolean z11 = this.f1405e.height() - f13 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1405e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f1407g, this.f1403c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f1405e.width() - f13, -this.f1406f, this.f1404d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1405e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1407g, this.f1403c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f1405e.width() - f13, (-this.f1406f) + this.f1409i, this.f1404d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1405e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1407g, this.f1403c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f1405e.height() - f13, -this.f1406f, this.f1404d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1405e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1407g, this.f1403c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f1405e.height() - f13, -this.f1406f, this.f1404d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1411k = colorStateList;
        this.f1402b.setColor(colorStateList.getColorForState(getState(), this.f1411k.getDefaultColor()));
    }

    private void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            float t10 = (float) t(f10);
            float t11 = (float) t(f11);
            if (t10 > t11) {
                if (!this.f1416p) {
                    this.f1416p = true;
                }
                t10 = t11;
            }
            if (this.f1410j != t10 || this.f1408h != t11) {
                this.f1410j = t10;
                this.f1408h = t11;
                this.f1409i = (float) ((int) ((t10 * 1.5f) + ((float) this.f1401a) + 0.5f));
                this.f1412l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    private int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    public void draw(Canvas canvas) {
        if (this.f1412l) {
            a(getBounds());
            this.f1412l = false;
        }
        canvas.translate(0.0f, this.f1410j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f1410j) / 2.0f);
        f1400r.a(canvas, this.f1405e, this.f1406f, this.f1402b);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f1411k;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f1406f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.f1408h, this.f1406f, this.f1415o));
        int ceil2 = (int) Math.ceil((double) c(this.f1408h, this.f1406f, this.f1415o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f1408h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1411k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    public float j() {
        float f10 = this.f1408h;
        return (Math.max(f10, this.f1406f + ((float) this.f1401a) + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1408h * 1.5f) + ((float) this.f1401a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        float f10 = this.f1408h;
        return (Math.max(f10, this.f1406f + ((float) this.f1401a) + (f10 / 2.0f)) * 2.0f) + ((this.f1408h + ((float) this.f1401a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f1410j;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f1415o = z10;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1412l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1411k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1402b.getColor() == colorForState) {
            return false;
        }
        this.f1402b.setColor(colorForState);
        this.f1412l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (float) ((int) (f10 + 0.5f));
            if (this.f1406f != f11) {
                this.f1406f = f11;
                this.f1412l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void q(float f10) {
        s(this.f1410j, f10);
    }

    /* access modifiers changed from: package-private */
    public void r(float f10) {
        s(f10, this.f1408h);
    }

    public void setAlpha(int i10) {
        this.f1402b.setAlpha(i10);
        this.f1403c.setAlpha(i10);
        this.f1404d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1402b.setColorFilter(colorFilter);
    }
}
