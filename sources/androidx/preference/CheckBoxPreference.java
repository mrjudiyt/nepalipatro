package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.k;
import t0.c;
import t0.g;

public class CheckBoxPreference extends TwoStatePreference {
    private final a T;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                CheckBoxPreference.this.L(z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void Q(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.O);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.T);
        }
    }

    private void R(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            Q(view.findViewById(16908289));
            P(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void D(View view) {
        super.D(view);
        R(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11518b, i10, i11);
        O(k.o(obtainStyledAttributes, g.f11534h, g.f11521c));
        N(k.o(obtainStyledAttributes, g.f11532g, g.f11524d));
        M(k.b(obtainStyledAttributes, g.f11530f, g.f11527e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.checkBoxPreferenceStyle, 16842895));
    }
}
