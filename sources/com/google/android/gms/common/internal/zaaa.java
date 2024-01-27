package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.a;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    private static final int zab(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i10);
        throw new IllegalStateException(sb.toString());
    }

    public final void zaa(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = R.drawable.common_google_signin_btn_icon_dark;
        int i14 = R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i11, i13, i14, i14);
        int i15 = R.drawable.common_google_signin_btn_text_dark;
        int i16 = R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            zab = zab2;
        } else if (i10 != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i10);
            throw new IllegalStateException(sb.toString());
        }
        Drawable q10 = a.q(resources.getDrawable(zab));
        a.n(q10, resources.getColorStateList(R.color.common_google_signin_btn_tint));
        a.o(q10, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(q10);
        int i17 = R.color.common_google_signin_btn_text_dark;
        int i18 = R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i10 == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i10 == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i10);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
