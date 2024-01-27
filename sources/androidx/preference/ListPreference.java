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

public class ListPreference extends DialogPreference {
    private CharSequence[] U;
    private CharSequence[] V;
    private String W;
    private String X;
    private boolean Y;

    public static final class a implements Preference.e<ListPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f3871a;

        private a() {
        }

        public static a b() {
            if (f3871a == null) {
                f3871a = new a();
            }
            return f3871a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.M())) {
                return listPreference.e().getString(f.not_set);
            }
            return listPreference.M();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11566x, i10, i11);
        this.U = k.q(obtainStyledAttributes, g.A, g.f11568y);
        this.V = k.q(obtainStyledAttributes, g.B, g.f11570z);
        int i12 = g.C;
        if (k.b(obtainStyledAttributes, i12, i12, false)) {
            H(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.I, i10, i11);
        this.X = k.o(obtainStyledAttributes2, g.f11553q0, g.Q);
        obtainStyledAttributes2.recycle();
    }

    private int P() {
        return K(this.W);
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public int K(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.V) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.V[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] L() {
        return this.U;
    }

    public CharSequence M() {
        CharSequence[] charSequenceArr;
        int P = P();
        if (P < 0 || (charSequenceArr = this.U) == null) {
            return null;
        }
        return charSequenceArr[P];
    }

    public CharSequence[] N() {
        return this.V;
    }

    public String O() {
        return this.W;
    }

    public void Q(String str) {
        boolean z10 = !TextUtils.equals(this.W, str);
        if (z10 || !this.Y) {
            this.W = str;
            this.Y = true;
            G(str);
            if (z10) {
                w();
            }
        }
    }

    public CharSequence q() {
        if (r() != null) {
            return r().a(this);
        }
        Object M = M();
        CharSequence q10 = super.q();
        String str = this.X;
        if (str == null) {
            return q10;
        }
        Object[] objArr = new Object[1];
        if (M == null) {
            M = "";
        }
        objArr[0] = M;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, q10) ? q10 : format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.dialogPreferenceStyle, 16842897));
    }
}
