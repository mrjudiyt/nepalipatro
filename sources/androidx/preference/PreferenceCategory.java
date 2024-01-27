package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import t0.c;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public boolean I() {
        return !super.u();
    }

    public boolean u() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.preferenceCategoryStyle, 16842892));
    }
}
