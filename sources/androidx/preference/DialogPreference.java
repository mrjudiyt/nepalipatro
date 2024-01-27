package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import t0.c;
import t0.g;

public abstract class DialogPreference extends Preference {
    private CharSequence O;
    private CharSequence P;
    private Drawable Q;
    private CharSequence R;
    private CharSequence S;
    private int T;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11536i, i10, i11);
        String o10 = k.o(obtainStyledAttributes, g.f11556s, g.f11538j);
        this.O = o10;
        if (o10 == null) {
            this.O = s();
        }
        this.P = k.o(obtainStyledAttributes, g.f11554r, g.f11540k);
        this.Q = k.c(obtainStyledAttributes, g.f11550p, g.f11542l);
        this.R = k.o(obtainStyledAttributes, g.f11560u, g.f11544m);
        this.S = k.o(obtainStyledAttributes, g.f11558t, g.f11546n);
        this.T = k.n(obtainStyledAttributes, g.f11552q, g.f11548o, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void y() {
        p();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.dialogPreferenceStyle, 16842897));
    }
}
