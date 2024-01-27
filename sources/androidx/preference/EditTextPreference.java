package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.preference.Preference;
import t0.c;
import t0.f;
import t0.g;

public class EditTextPreference extends DialogPreference {
    private String U;

    public static final class a implements Preference.e<EditTextPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f3870a;

        private a() {
        }

        public static a b() {
            if (f3870a == null) {
                f3870a = new a();
            }
            return f3870a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.K())) {
                return editTextPreference.e().getString(f.not_set);
            }
            return editTextPreference.K();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11562v, i10, i11);
        int i12 = g.f11564w;
        if (k.b(obtainStyledAttributes, i12, i12, false)) {
            H(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public boolean I() {
        return TextUtils.isEmpty(this.U) || super.I();
    }

    public String K() {
        return this.U;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.editTextPreferenceStyle, 16842898));
    }
}
