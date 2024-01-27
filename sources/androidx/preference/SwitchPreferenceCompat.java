package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.k;
import t0.c;
import t0.d;
import t0.g;

public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a T;
    private CharSequence U;
    private CharSequence V;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreferenceCompat.this.L(z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.U0, i10, i11);
        O(k.o(obtainStyledAttributes, g.f11523c1, g.V0));
        N(k.o(obtainStyledAttributes, g.f11520b1, g.W0));
        R(k.o(obtainStyledAttributes, g.f11529e1, g.Y0));
        Q(k.o(obtainStyledAttributes, g.f11526d1, g.Z0));
        M(k.b(obtainStyledAttributes, g.f11517a1, g.X0, false));
        obtainStyledAttributes.recycle();
    }

    private void S(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.U);
            switchCompat.setTextOff(this.V);
            switchCompat.setOnCheckedChangeListener(this.T);
        }
    }

    private void T(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(d.switchWidget));
            P(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void D(View view) {
        super.D(view);
        T(view);
    }

    public void Q(CharSequence charSequence) {
        this.V = charSequence;
        w();
    }

    public void R(CharSequence charSequence) {
        this.U = charSequence;
        w();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.switchPreferenceCompatStyle);
    }
}
