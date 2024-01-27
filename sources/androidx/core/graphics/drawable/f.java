package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f2348a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f2349b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f2350c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f2351d = d.f2340n;

    f(f fVar) {
        if (fVar != null) {
            this.f2348a = fVar.f2348a;
            this.f2349b = fVar.f2349b;
            this.f2350c = fVar.f2350c;
            this.f2351d = fVar.f2351d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f2349b != null;
    }

    public int getChangingConfigurations() {
        int i10 = this.f2348a;
        Drawable.ConstantState constantState = this.f2349b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
