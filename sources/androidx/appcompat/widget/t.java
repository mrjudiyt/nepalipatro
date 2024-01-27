package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.z;
import f.j;

/* compiled from: AppCompatSeekBarHelper */
class t extends p {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1225d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1226e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1227f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1228g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1229h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1230i = false;

    t(SeekBar seekBar) {
        super(seekBar);
        this.f1225d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1226e;
        if (drawable == null) {
            return;
        }
        if (this.f1229h || this.f1230i) {
            Drawable q10 = a.q(drawable.mutate());
            this.f1226e = q10;
            if (this.f1229h) {
                a.n(q10, this.f1227f);
            }
            if (this.f1230i) {
                a.o(this.f1226e, this.f1228g);
            }
            if (this.f1226e.isStateful()) {
                this.f1226e.setState(this.f1225d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1225d.getContext();
        int[] iArr = j.V;
        u0 u10 = u0.u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1225d;
        z.Q(seekBar, seekBar.getContext(), iArr, attributeSet, u10.q(), i10, 0);
        Drawable g10 = u10.g(j.W);
        if (g10 != null) {
            this.f1225d.setThumb(g10);
        }
        j(u10.f(j.X));
        int i11 = j.Z;
        if (u10.r(i11)) {
            this.f1228g = c0.e(u10.j(i11, -1), this.f1228g);
            this.f1230i = true;
        }
        int i12 = j.Y;
        if (u10.r(i12)) {
            this.f1227f = u10.c(i12);
            this.f1229h = true;
        }
        u10.v();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1226e != null) {
            int max = this.f1225d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1226e.getIntrinsicWidth();
                int intrinsicHeight = this.f1226e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1226e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1225d.getWidth() - this.f1225d.getPaddingLeft()) - this.f1225d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1225d.getPaddingLeft(), (float) (this.f1225d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1226e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1226e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1225d.getDrawableState())) {
            this.f1225d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1226e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1226e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1226e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1225d);
            a.l(drawable, z.t(this.f1225d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1225d.getDrawableState());
            }
            f();
        }
        this.f1225d.invalidate();
    }
}
