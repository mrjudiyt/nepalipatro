package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.HashSet;
import java.util.Set;
import t0.c;
import t0.g;

public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] U;
    private CharSequence[] V;
    private Set<String> W;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.W = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.D, i10, i11);
        this.U = k.q(obtainStyledAttributes, g.G, g.E);
        this.V = k.q(obtainStyledAttributes, g.H, g.F);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.dialogPreferenceStyle, 16842897));
    }
}
