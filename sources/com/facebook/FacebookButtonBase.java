package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.d;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.m;

@SuppressLint({"ResourceType"})
/* compiled from: FacebookButtonBase.kt */
public abstract class FacebookButtonBase extends Button {
    private final String analyticsButtonCreatedEventName;
    private final String analyticsButtonTappedEventName;
    private final int defaultStyleResource;
    private View.OnClickListener externalOnClickListener;
    private View.OnClickListener internalOnClickListener;
    private boolean overrideCompoundPadding;
    private int overrideCompoundPaddingLeft;
    private int overrideCompoundPaddingRight;
    private FragmentWrapper parentFragment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FacebookButtonBase(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, 0);
        m.f(context, "context");
        m.f(str, "analyticsButtonCreatedEventName");
        m.f(str2, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        configureButton(context, attributeSet, i10, i11 == 0 ? R.style.com_facebook_button : i11);
        this.analyticsButtonCreatedEventName = str;
        this.analyticsButtonTappedEventName = str2;
        setClickable(true);
        setFocusable(true);
    }

    private final void parseBackgroundAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (!isInEditMode()) {
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i10, i11);
                    m.e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                    if (obtainStyledAttributes.hasValue(0)) {
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        if (resourceId != 0) {
                            setBackgroundResource(resourceId);
                        } else {
                            setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                        }
                    } else {
                        setBackgroundColor(a.d(context, R.color.com_facebook_blue));
                    }
                    obtainStyledAttributes.recycle();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    private final void parseCompoundDrawableAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i10, i11);
                m.e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                obtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void parseContentAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i10, i11);
                m.e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void parseTextAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        TypedArray obtainStyledAttributes3;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i10, i11);
                m.e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i10, i11);
                m.e(obtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
                int i12 = obtainStyledAttributes2.getInt(0, 17);
                obtainStyledAttributes2.recycle();
                setGravity(i12);
                obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i10, i11);
                m.e(obtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                setTypeface(Typeface.create(getTypeface(), 1));
                String string = obtainStyledAttributes3.getString(2);
                obtainStyledAttributes3.recycle();
                setText(string);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void setupOnClickListener() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.setOnClickListener(new e(this));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setupOnClickListener$lambda-0  reason: not valid java name */
    public static final void m4setupOnClickListener$lambda0(FacebookButtonBase facebookButtonBase, View view) {
        if (!CrashShieldHandler.isObjectCrashing(FacebookButtonBase.class)) {
            try {
                m.f(facebookButtonBase, "this$0");
                facebookButtonBase.logButtonTapped(facebookButtonBase.getContext());
                View.OnClickListener onClickListener = facebookButtonBase.internalOnClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                View.OnClickListener onClickListener2 = facebookButtonBase.externalOnClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookButtonBase.class);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void callExternalOnClickListener(View view) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                View.OnClickListener onClickListener = this.externalOnClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void configureButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(context, "context");
                parseBackgroundAttributes(context, attributeSet, i10, i11);
                parseCompoundDrawableAttributes(context, attributeSet, i10, i11);
                parseContentAttributes(context, attributeSet, i10, i11);
                parseTextAttributes(context, attributeSet, i10, i11);
                setupOnClickListener();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonCreatedEventName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.analyticsButtonCreatedEventName;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonTappedEventName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.analyticsButtonTappedEventName;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final d getAndroidxActivityResultRegistryOwner() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Activity activity = getActivity();
            if (activity instanceof d) {
                return (d) activity;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public int getCompoundPaddingLeft() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            if (this.overrideCompoundPadding) {
                return this.overrideCompoundPaddingLeft;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            if (this.overrideCompoundPadding) {
                return this.overrideCompoundPaddingRight;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.defaultStyleResource;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final Fragment getFragment() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.parentFragment;
            if (fragmentWrapper == null) {
                return null;
            }
            return fragmentWrapper.getSupportFragment();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.parentFragment;
            if (fragmentWrapper == null) {
                return null;
            }
            return fragmentWrapper.getNativeFragment();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void logButtonCreated(Context context) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                InternalAppEventsLogger.Companion.createInstance(context, (String) null).logEventImplicitly(this.analyticsButtonCreatedEventName);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void logButtonTapped(Context context) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                InternalAppEventsLogger.Companion.createInstance(context, (String) null).logEventImplicitly(this.analyticsButtonTappedEventName);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int measureTextWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil((double) getPaint().measureText(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    logButtonCreated(getContext());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(canvas, "canvas");
                if ((getGravity() & 1) != 0) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - measureTextWidth(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.overrideCompoundPaddingLeft = compoundPaddingLeft - min;
                    this.overrideCompoundPaddingRight = compoundPaddingRight + min;
                    this.overrideCompoundPadding = true;
                }
                super.onDraw(canvas);
                this.overrideCompoundPadding = false;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(fragment, "fragment");
                this.parentFragment = new FragmentWrapper(fragment);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.internalOnClickListener = onClickListener;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.externalOnClickListener = onClickListener;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setFragment(Fragment fragment) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(fragment, "fragment");
                this.parentFragment = new FragmentWrapper(fragment);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
