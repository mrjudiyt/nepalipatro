package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.z;
import androidx.core.widget.e;
import f.j;
import h.a;

/* compiled from: AppCompatImageHelper */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1149a;

    /* renamed from: b  reason: collision with root package name */
    private s0 f1150b;

    /* renamed from: c  reason: collision with root package name */
    private s0 f1151c;

    /* renamed from: d  reason: collision with root package name */
    private s0 f1152d;

    public m(ImageView imageView) {
        this.f1149a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1152d == null) {
            this.f1152d = new s0();
        }
        s0 s0Var = this.f1152d;
        s0Var.a();
        ColorStateList a10 = e.a(this.f1149a);
        if (a10 != null) {
            s0Var.f1224d = true;
            s0Var.f1221a = a10;
        }
        PorterDuff.Mode b10 = e.b(this.f1149a);
        if (b10 != null) {
            s0Var.f1223c = true;
            s0Var.f1222b = b10;
        }
        if (!s0Var.f1224d && !s0Var.f1223c) {
            return false;
        }
        i.i(drawable, s0Var, this.f1149a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f1150b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1149a.getDrawable();
        if (drawable != null) {
            c0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            s0 s0Var = this.f1151c;
            if (s0Var != null) {
                i.i(drawable, s0Var, this.f1149a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f1150b;
            if (s0Var2 != null) {
                i.i(drawable, s0Var2, this.f1149a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        s0 s0Var = this.f1151c;
        if (s0Var != null) {
            return s0Var.f1221a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        s0 s0Var = this.f1151c;
        if (s0Var != null) {
            return s0Var.f1222b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1149a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i10) {
        int m10;
        Context context = this.f1149a.getContext();
        int[] iArr = j.R;
        u0 u10 = u0.u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1149a;
        z.Q(imageView, imageView.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            Drawable drawable = this.f1149a.getDrawable();
            if (!(drawable != null || (m10 = u10.m(j.S, -1)) == -1 || (drawable = a.d(this.f1149a.getContext(), m10)) == null)) {
                this.f1149a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.b(drawable);
            }
            int i11 = j.T;
            if (u10.r(i11)) {
                e.c(this.f1149a, u10.c(i11));
            }
            int i12 = j.U;
            if (u10.r(i12)) {
                e.d(this.f1149a, c0.e(u10.j(i12, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u10.v();
        }
    }

    public void g(int i10) {
        if (i10 != 0) {
            Drawable d10 = a.d(this.f1149a.getContext(), i10);
            if (d10 != null) {
                c0.b(d10);
            }
            this.f1149a.setImageDrawable(d10);
        } else {
            this.f1149a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f1151c == null) {
            this.f1151c = new s0();
        }
        s0 s0Var = this.f1151c;
        s0Var.f1221a = colorStateList;
        s0Var.f1224d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f1151c == null) {
            this.f1151c = new s0();
        }
        s0 s0Var = this.f1151c;
        s0Var.f1222b = mode;
        s0Var.f1223c = true;
        b();
    }
}
