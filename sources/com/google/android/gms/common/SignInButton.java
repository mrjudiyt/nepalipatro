package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void zaa(Context context) {
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = zaz.zaa(context, this.zaa, this.zab);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i10 = this.zaa;
            int i11 = this.zab;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.zaa(context.getResources(), i10, i11);
            this.zac = zaaa;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener != null && view == this.zac) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        setStyle(this.zaa, i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.zac.setEnabled(z10);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i10) {
        setStyle(i10, this.zab);
    }

    public void setStyle(int i10, int i11) {
        this.zaa = i10;
        this.zab = i11;
        zaa(getContext());
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i10, int i11, Scope[] scopeArr) {
        setStyle(i10, i11);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zad = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignInButton, 0, 0);
        try {
            this.zaa = obtainStyledAttributes.getInt(R.styleable.SignInButton_buttonSize, 0);
            this.zab = obtainStyledAttributes.getInt(R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
