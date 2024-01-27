package i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapper */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: h  reason: collision with root package name */
    private Drawable f9055h;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f9055h;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f9055h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f9055h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f9055h.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f9055h.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f9055h.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9055h.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9055h.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f9055h.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9055h.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9055h.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9055h.getPadding(rect);
    }

    public int[] getState() {
        return this.f9055h.getState();
    }

    public Region getTransparentRegion() {
        return this.f9055h.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.g(this.f9055h);
    }

    public boolean isStateful() {
        return this.f9055h.isStateful();
    }

    public void jumpToCurrentState() {
        this.f9055h.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9055h.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f9055h.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f9055h.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.i(this.f9055h, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f9055h.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9055h.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f9055h.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f9055h.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        a.j(this.f9055h, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.k(this.f9055h, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f9055h.setState(iArr);
    }

    public void setTint(int i10) {
        a.m(this.f9055h, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.n(this.f9055h, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.o(this.f9055h, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f9055h.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
