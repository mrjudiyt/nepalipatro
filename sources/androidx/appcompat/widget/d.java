package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.view.x;
import androidx.core.widget.i;
import f.a;

/* compiled from: AppCompatAutoCompleteTextView */
public class d extends AutoCompleteTextView implements x {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1030j = {16843126};

    /* renamed from: h  reason: collision with root package name */
    private final e f1031h;

    /* renamed from: i  reason: collision with root package name */
    private final w f1032i;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f8199p);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1031h;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f1032i;
        if (wVar != null) {
            wVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1031h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1031h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1031h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1031h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(h.a.d(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1031h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1031h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f1032i;
        if (wVar != null) {
            wVar.q(context, i10);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        u0 u10 = u0.u(getContext(), attributeSet, f1030j, i10, 0);
        if (u10.r(0)) {
            setDropDownBackgroundDrawable(u10.f(0));
        }
        u10.v();
        e eVar = new e(this);
        this.f1031h = eVar;
        eVar.e(attributeSet, i10);
        w wVar = new w(this);
        this.f1032i = wVar;
        wVar.m(attributeSet, i10);
        wVar.b();
    }
}
