package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    protected boolean O;
    private CharSequence P;
    private CharSequence Q;
    private boolean R;
    private boolean S;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    public boolean I() {
        if ((this.S ? this.O : !this.O) || super.I()) {
            return true;
        }
        return false;
    }

    public boolean K() {
        return this.O;
    }

    public void L(boolean z10) {
        boolean z11 = this.O != z10;
        if (z11 || !this.R) {
            this.O = z10;
            this.R = true;
            E(z10);
            if (z11) {
                x(I());
                w();
            }
        }
    }

    public void M(boolean z10) {
        this.S = z10;
    }

    public void N(CharSequence charSequence) {
        this.Q = charSequence;
        if (!K()) {
            w();
        }
    }

    public void O(CharSequence charSequence) {
        this.P = charSequence;
        if (K()) {
            w();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.O
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.P
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.P
            r5.setText(r0)
        L_0x001a:
            r0 = 0
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.O
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.Q
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.q()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = 0
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = 8
        L_0x0045:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004e
            r5.setVisibility(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.P(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        boolean z10 = !K();
        if (a(Boolean.valueOf(z10))) {
            L(z10);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
