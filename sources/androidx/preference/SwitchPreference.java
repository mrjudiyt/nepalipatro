package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.k;
import t0.c;
import t0.g;

public class SwitchPreference extends TwoStatePreference {
    private final a T;
    private CharSequence U;
    private CharSequence V;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreference.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreference.this.L(z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.J0, i10, i11);
        O(k.o(obtainStyledAttributes, g.R0, g.K0));
        N(k.o(obtainStyledAttributes, g.Q0, g.L0));
        R(k.o(obtainStyledAttributes, g.T0, g.N0));
        Q(k.o(obtainStyledAttributes, g.S0, g.O0));
        M(k.b(obtainStyledAttributes, g.P0, g.M0, false));
        obtainStyledAttributes.recycle();
    }

    private void S(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z10) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.U);
            switchR.setTextOff(this.V);
            switchR.setOnCheckedChangeListener(this.T);
        }
    }

    private void T(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(16908352));
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

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.switchPreferenceStyle, 16843629));
    }
}
