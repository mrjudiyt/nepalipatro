package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.e;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import b0.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView */
public class x extends TextView implements androidx.core.view.x, k, b {

    /* renamed from: h  reason: collision with root package name */
    private final e f1300h;

    /* renamed from: i  reason: collision with root package name */
    private final w f1301i;

    /* renamed from: j  reason: collision with root package name */
    private final v f1302j;

    /* renamed from: k  reason: collision with root package name */
    private Future<a> f1303k;

    public x(Context context) {
        this(context, (AttributeSet) null);
    }

    private void e() {
        Future<a> future = this.f1303k;
        if (future != null) {
            try {
                this.f1303k = null;
                i.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1300h;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f2665a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f2665a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            return wVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f2665a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            return wVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f2665a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f1301i;
        return wVar != null ? wVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.f2665a) {
            w wVar = this.f1301i;
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

    public int getFirstBaselineToTopHeight() {
        return i.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1300h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1300h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1301i.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1301i.k();
    }

    public CharSequence getText() {
        e();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1302j) == null) {
            return super.getTextClassifier();
        }
        return vVar.a();
    }

    public a.C0092a getTextMetricsParamsCompat() {
        return i.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        w wVar = this.f1301i;
        if (wVar != null && !b.f2665a && wVar.l()) {
            this.f1301i.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.s(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.t(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.f2665a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.u(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1300h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1300h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            i.h(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            i.i(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.j(this, i10);
    }

    public void setPrecomputedText(a aVar) {
        i.k(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1300h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1300h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1301i.v(colorStateList);
        this.f1301i.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1301i.w(mode);
        this.f1301i.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1302j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            vVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<a> future) {
        this.f1303k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0092a aVar) {
        i.l(this, aVar);
    }

    public void setTextSize(int i10, float f10) {
        if (b.f2665a) {
            super.setTextSize(i10, f10);
            return;
        }
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.z(i10, f10);
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        Typeface a10 = (typeface == null || i10 <= 0) ? null : e.a(getContext(), typeface, i10);
        if (a10 != null) {
            typeface = a10;
        }
        super.setTypeface(typeface, i10);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public x(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f1300h = eVar;
        eVar.e(attributeSet, i10);
        w wVar = new w(this);
        this.f1301i = wVar;
        wVar.m(attributeSet, i10);
        wVar.b();
        this.f1302j = new v(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d10 = i10 != 0 ? h.a.d(context, i10) : null;
        Drawable d11 = i11 != 0 ? h.a.d(context, i11) : null;
        Drawable d12 = i12 != 0 ? h.a.d(context, i12) : null;
        if (i13 != 0) {
            drawable = h.a.d(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d10, d11, d12, drawable);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d10 = i10 != 0 ? h.a.d(context, i10) : null;
        Drawable d11 = i11 != 0 ? h.a.d(context, i11) : null;
        Drawable d12 = i12 != 0 ? h.a.d(context, i12) : null;
        if (i13 != 0) {
            drawable = h.a.d(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(d10, d11, d12, drawable);
        w wVar = this.f1301i;
        if (wVar != null) {
            wVar.p();
        }
    }
}
