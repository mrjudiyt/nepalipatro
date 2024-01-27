package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f1388a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1389b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1390c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1391d;

    /* renamed from: e  reason: collision with root package name */
    private float f1392e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1393f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1394g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1395h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1396i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1397j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1398k = PorterDuff.Mode.SRC_IN;

    f(ColorStateList colorStateList, float f10) {
        this.f1388a = f10;
        this.f1389b = new Paint(5);
        e(colorStateList);
        this.f1390c = new RectF();
        this.f1391d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1395h = colorStateList;
        this.f1389b.setColor(colorStateList.getColorForState(getState(), this.f1395h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1390c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1391d.set(rect);
        if (this.f1393f) {
            float d10 = g.d(this.f1392e, this.f1388a, this.f1394g);
            this.f1391d.inset((int) Math.ceil((double) g.c(this.f1392e, this.f1388a, this.f1394g)), (int) Math.ceil((double) d10));
            this.f1390c.set(this.f1391d);
        }
    }

    public ColorStateList b() {
        return this.f1395h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1392e;
    }

    public float d() {
        return this.f1388a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1389b;
        if (this.f1396i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1396i);
            z10 = true;
        }
        RectF rectF = this.f1390c;
        float f10 = this.f1388a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f1392e || this.f1393f != z10 || this.f1394g != z11) {
            this.f1392e = f10;
            this.f1393f = z10;
            this.f1394g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1391d, this.f1388a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f1388a) {
            this.f1388a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1395h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1397j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1395h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1395h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1389b.getColor();
        if (z10) {
            this.f1389b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1397j;
        if (colorStateList2 == null || (mode = this.f1398k) == null) {
            return z10;
        }
        this.f1396i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f1389b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1389b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1397j = colorStateList;
        this.f1396i = a(colorStateList, this.f1398k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1398k = mode;
        this.f1396i = a(this.f1397j, mode);
        invalidateSelf();
    }
}
