package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.x;
import androidx.core.widget.i;
import f.a;

/* compiled from: AppCompatEditText */
public class j extends EditText implements x {

    /* renamed from: h  reason: collision with root package name */
    private final e f1129h;

    /* renamed from: i  reason: collision with root package name */
    private final w f1130i;

    /* renamed from: j  reason: collision with root package name */
    private final v f1131j;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.A);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1129h;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f1130i;
        if (wVar != null) {
            wVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1129h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1129h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1131j) == null) {
            return super.getTextClassifier();
        }
        return vVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1129h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1129h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1129h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1129h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f1130i;
        if (wVar != null) {
            wVar.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1131j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            vVar.b(textClassifier);
        }
    }

    public j(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f1129h = eVar;
        eVar.e(attributeSet, i10);
        w wVar = new w(this);
        this.f1130i = wVar;
        wVar.m(attributeSet, i10);
        wVar.b();
        this.f1131j = new v(this);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
