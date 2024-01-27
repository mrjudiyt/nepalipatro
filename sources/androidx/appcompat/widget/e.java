package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.z;
import f.j;

/* compiled from: AppCompatBackgroundHelper */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1049a;

    /* renamed from: b  reason: collision with root package name */
    private final i f1050b;

    /* renamed from: c  reason: collision with root package name */
    private int f1051c = -1;

    /* renamed from: d  reason: collision with root package name */
    private s0 f1052d;

    /* renamed from: e  reason: collision with root package name */
    private s0 f1053e;

    /* renamed from: f  reason: collision with root package name */
    private s0 f1054f;

    e(View view) {
        this.f1049a = view;
        this.f1050b = i.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f1054f == null) {
            this.f1054f = new s0();
        }
        s0 s0Var = this.f1054f;
        s0Var.a();
        ColorStateList m10 = z.m(this.f1049a);
        if (m10 != null) {
            s0Var.f1224d = true;
            s0Var.f1221a = m10;
        }
        PorterDuff.Mode n10 = z.n(this.f1049a);
        if (n10 != null) {
            s0Var.f1223c = true;
            s0Var.f1222b = n10;
        }
        if (!s0Var.f1224d && !s0Var.f1223c) {
            return false;
        }
        i.i(drawable, s0Var, this.f1049a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f1052d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1049a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            s0 s0Var = this.f1053e;
            if (s0Var != null) {
                i.i(background, s0Var, this.f1049a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f1052d;
            if (s0Var2 != null) {
                i.i(background, s0Var2, this.f1049a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        s0 s0Var = this.f1053e;
        if (s0Var != null) {
            return s0Var.f1221a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        s0 s0Var = this.f1053e;
        if (s0Var != null) {
            return s0Var.f1222b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1049a.getContext();
        int[] iArr = j.R3;
        u0 u10 = u0.u(context, attributeSet, iArr, i10, 0);
        View view = this.f1049a;
        z.Q(view, view.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        try {
            int i11 = j.S3;
            if (u10.r(i11)) {
                this.f1051c = u10.m(i11, -1);
                ColorStateList f10 = this.f1050b.f(this.f1049a.getContext(), this.f1051c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = j.T3;
            if (u10.r(i12)) {
                z.U(this.f1049a, u10.c(i12));
            }
            int i13 = j.U3;
            if (u10.r(i13)) {
                z.V(this.f1049a, c0.e(u10.j(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u10.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1051c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1051c = i10;
        i iVar = this.f1050b;
        h(iVar != null ? iVar.f(this.f1049a.getContext(), i10) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1052d == null) {
                this.f1052d = new s0();
            }
            s0 s0Var = this.f1052d;
            s0Var.f1221a = colorStateList;
            s0Var.f1224d = true;
        } else {
            this.f1052d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1053e == null) {
            this.f1053e = new s0();
        }
        s0 s0Var = this.f1053e;
        s0Var.f1221a = colorStateList;
        s0Var.f1224d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1053e == null) {
            this.f1053e = new s0();
        }
        s0 s0Var = this.f1053e;
        s0Var.f1222b = mode;
        s0Var.f1223c = true;
        b();
    }
}
