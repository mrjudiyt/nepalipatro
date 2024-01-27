package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: n  reason: collision with root package name */
    static final PorterDuff.Mode f2340n = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    private int f2341h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f2342i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2343j;

    /* renamed from: k  reason: collision with root package name */
    f f2344k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2345l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f2346m;

    d(f fVar, Resources resources) {
        this.f2344k = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f2344k);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f2344k;
        if (fVar != null && (constantState = fVar.f2349b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f2344k;
        ColorStateList colorStateList = fVar.f2350c;
        PorterDuff.Mode mode = fVar.f2351d;
        if (colorStateList == null || mode == null) {
            this.f2343j = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2343j && colorForState == this.f2341h && mode == this.f2342i)) {
                setColorFilter(colorForState, mode);
                this.f2341h = colorForState;
                this.f2342i = mode;
                this.f2343j = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2346m;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2346m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f2344k;
            if (fVar != null) {
                fVar.f2349b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f2346m;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2346m.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f2344k;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2346m.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f2344k;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f2344k.f2348a = getChangingConfigurations();
        return this.f2344k;
    }

    public Drawable getCurrent() {
        return this.f2346m.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2346m.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2346m.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.e(this.f2346m);
    }

    public int getMinimumHeight() {
        return this.f2346m.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2346m.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2346m.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2346m.getPadding(rect);
    }

    public int[] getState() {
        return this.f2346m.getState();
    }

    public Region getTransparentRegion() {
        return this.f2346m.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.g(this.f2346m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2344k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f2344k
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2350c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2346m
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f2346m.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2345l && super.mutate() == this) {
            this.f2344k = d();
            Drawable drawable = this.f2346m;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f2344k;
            if (fVar != null) {
                Drawable drawable2 = this.f2346m;
                fVar.f2349b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2345l = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2346m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return a.l(this.f2346m, i10);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f2346m.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f2346m.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.i(this.f2346m, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f2346m.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2346m.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f2346m.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f2346m.setFilterBitmap(z10);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2346m.setState(iArr);
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2344k.f2350c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2344k.f2351d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f2346m.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    d(Drawable drawable) {
        this.f2344k = d();
        a(drawable);
    }
}
