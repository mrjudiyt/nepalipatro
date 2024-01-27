package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
class e extends d {

    /* renamed from: o  reason: collision with root package name */
    private static Method f2347o;

    e(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f2347o == null) {
            try {
                f2347o = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2346m;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2346m.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2346m.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2346m;
        if (!(drawable == null || (method = f2347o) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f10, float f11) {
        this.f2346m.setHotspot(f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f2346m.setHotspotBounds(i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f2346m.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2346m.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f2346m.setTintMode(mode);
        }
    }

    e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }
}
