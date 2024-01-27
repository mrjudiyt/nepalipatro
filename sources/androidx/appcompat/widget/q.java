package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.view.x;
import androidx.core.widget.j;
import f.a;

/* compiled from: AppCompatRadioButton */
public class q extends RadioButton implements j, x {

    /* renamed from: h  reason: collision with root package name */
    private final h f1212h;

    /* renamed from: i  reason: collision with root package name */
    private final e f1213i;

    /* renamed from: j  reason: collision with root package name */
    private final w f1214j;

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.E);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1213i;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f1214j;
        if (wVar != null) {
            wVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f1212h;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1213i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1213i;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f1212h;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f1212h;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1213i;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1213i;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f1212h;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1213i;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1213i;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f1212h;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1212h;
        if (hVar != null) {
            hVar.h(mode);
        }
    }

    public q(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        h hVar = new h(this);
        this.f1212h = hVar;
        hVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1213i = eVar;
        eVar.e(attributeSet, i10);
        w wVar = new w(this);
        this.f1214j = wVar;
        wVar.m(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(h.a.d(getContext(), i10));
    }
}
