package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import h.a;

/* compiled from: AppCompatCheckedTextView */
public class g extends CheckedTextView {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1069i = {16843016};

    /* renamed from: h  reason: collision with root package name */
    private final w f1070h;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f1070h;
        if (wVar != null) {
            wVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(a.d(getContext(), i10));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f1070h;
        if (wVar != null) {
            wVar.q(context, i10);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(r0.b(context), attributeSet, i10);
        p0.a(this, getContext());
        w wVar = new w(this);
        this.f1070h = wVar;
        wVar.m(attributeSet, i10);
        wVar.b();
        u0 u10 = u0.u(getContext(), attributeSet, f1069i, i10, 0);
        setCheckMarkDrawable(u10.f(0));
        u10.v();
    }
}
