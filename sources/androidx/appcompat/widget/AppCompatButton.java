package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.x;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import f.a;

public class AppCompatButton extends Button implements x, b, k {

    /* renamed from: h  reason: collision with root package name */
    private final e f873h;

    /* renamed from: i  reason: collision with root package name */
    private final w f874i;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f8200q);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f873h;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f2665a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f874i;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f2665a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f874i;
        if (wVar != null) {
            return wVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f2665a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f874i;
        if (wVar != null) {
            return wVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f2665a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f874i;
        return wVar != null ? wVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.f2665a) {
            w wVar = this.f874i;
            if (wVar != null) {
                return wVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f873h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f873h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f874i.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f874i.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        w wVar = this.f874i;
        if (wVar != null && !b.f2665a && wVar.l()) {
            this.f874i.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.s(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.t(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.u(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f873h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f873h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.r(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f873h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f873h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f874i.v(colorStateList);
        this.f874i.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f874i.w(mode);
        this.f874i.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (b.f2665a) {
            super.setTextSize(i10, f10);
            return;
        }
        w wVar = this.f874i;
        if (wVar != null) {
            wVar.z(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f873h = eVar;
        eVar.e(attributeSet, i10);
        w wVar = new w(this);
        this.f874i = wVar;
        wVar.m(attributeSet, i10);
        wVar.b();
    }
}
