package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import t0.c;

public final class PreferenceScreen extends PreferenceGroup {
    private boolean X = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, c.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    public void y() {
        if (k() == null && g() == null && L() != 0) {
            p();
            throw null;
        }
    }
}
