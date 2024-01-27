package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ToolTipPopup.kt */
public final class ToolTipPopup {
    public static final Companion Companion = new Companion((g) null);
    public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000;
    private final WeakReference<View> anchorViewRef;
    private final Context context;
    private long nuxDisplayTime = DEFAULT_POPUP_DISPLAY_TIME;
    private PopupContentView popupContent;
    private PopupWindow popupWindow;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener = new g(this);
    private Style style = Style.BLUE;
    private final String text;

    /* compiled from: ToolTipPopup.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: ToolTipPopup.kt */
    private final class PopupContentView extends FrameLayout {
        private final View bodyFrame;
        private final ImageView bottomArrow;
        final /* synthetic */ ToolTipPopup this$0;
        private final ImageView topArrow;
        private final ImageView xOut;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PopupContentView(ToolTipPopup toolTipPopup, Context context) {
            super(context);
            m.f(toolTipPopup, "this$0");
            m.f(context, "context");
            this.this$0 = toolTipPopup;
            LayoutInflater.from(context).inflate(R.layout.com_facebook_tooltip_bubble, this);
            View findViewById = findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.topArrow = (ImageView) findViewById;
            View findViewById2 = findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.bottomArrow = (ImageView) findViewById2;
            View findViewById3 = findViewById(R.id.com_facebook_body_frame);
            m.e(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.bodyFrame = findViewById3;
            View findViewById4 = findViewById(R.id.com_facebook_button_xout);
            Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.xOut = (ImageView) findViewById4;
        }

        public final View getBodyFrame() {
            return this.bodyFrame;
        }

        public final ImageView getBottomArrow() {
            return this.bottomArrow;
        }

        public final ImageView getTopArrow() {
            return this.topArrow;
        }

        public final ImageView getXOut() {
            return this.xOut;
        }

        public final void showBottomArrow() {
            this.topArrow.setVisibility(4);
            this.bottomArrow.setVisibility(0);
        }

        public final void showTopArrow() {
            this.topArrow.setVisibility(0);
            this.bottomArrow.setVisibility(4);
        }
    }

    /* compiled from: ToolTipPopup.kt */
    public enum Style {
        BLUE,
        BLACK
    }

    public ToolTipPopup(String str, View view) {
        m.f(str, ViewHierarchyConstants.TEXT_KEY);
        m.f(view, "anchor");
        this.text = str;
        this.anchorViewRef = new WeakReference<>(view);
        Context context2 = view.getContext();
        m.e(context2, "anchor.context");
        this.context = context2;
    }

    private final void registerObserver() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                unregisterObserver();
                View view = (View) this.anchorViewRef.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnScrollChangedListener(this.scrollListener);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: scrollListener$lambda-1  reason: not valid java name */
    public static final void m152scrollListener$lambda1(ToolTipPopup toolTipPopup) {
        Class<ToolTipPopup> cls = ToolTipPopup.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(toolTipPopup, "this$0");
                if (toolTipPopup.anchorViewRef.get() != null) {
                    PopupWindow popupWindow2 = toolTipPopup.popupWindow;
                    if (popupWindow2 != null) {
                        if (!popupWindow2.isShowing()) {
                            return;
                        }
                        if (popupWindow2.isAboveAnchor()) {
                            PopupContentView popupContentView = toolTipPopup.popupContent;
                            if (popupContentView != null) {
                                popupContentView.showBottomArrow();
                                return;
                            }
                            return;
                        }
                        PopupContentView popupContentView2 = toolTipPopup.popupContent;
                        if (popupContentView2 != null) {
                            popupContentView2.showTopArrow();
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: show$lambda-2  reason: not valid java name */
    public static final void m153show$lambda2(ToolTipPopup toolTipPopup) {
        Class<ToolTipPopup> cls = ToolTipPopup.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(toolTipPopup, "this$0");
                toolTipPopup.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: show$lambda-3  reason: not valid java name */
    public static final void m154show$lambda3(ToolTipPopup toolTipPopup, View view) {
        Class<ToolTipPopup> cls = ToolTipPopup.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(toolTipPopup, "this$0");
                toolTipPopup.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void unregisterObserver() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                View view = (View) this.anchorViewRef.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnScrollChangedListener(this.scrollListener);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void updateArrows() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                PopupWindow popupWindow2 = this.popupWindow;
                if (popupWindow2 != null) {
                    if (!popupWindow2.isShowing()) {
                        return;
                    }
                    if (popupWindow2.isAboveAnchor()) {
                        PopupContentView popupContentView = this.popupContent;
                        if (popupContentView != null) {
                            popupContentView.showBottomArrow();
                            return;
                        }
                        return;
                    }
                    PopupContentView popupContentView2 = this.popupContent;
                    if (popupContentView2 != null) {
                        popupContentView2.showTopArrow();
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void dismiss() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                unregisterObserver();
                PopupWindow popupWindow2 = this.popupWindow;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setNuxDisplayTime(long j10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.nuxDisplayTime = j10;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setStyle(Style style2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(style2, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                this.style = style2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void show() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (this.anchorViewRef.get() != null) {
                    PopupContentView popupContentView = new PopupContentView(this, this.context);
                    this.popupContent = popupContentView;
                    View findViewById = popupContentView.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body);
                    if (findViewById != null) {
                        ((TextView) findViewById).setText(this.text);
                        if (this.style == Style.BLUE) {
                            popupContentView.getBodyFrame().setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                            popupContentView.getBottomArrow().setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                            popupContentView.getTopArrow().setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                            popupContentView.getXOut().setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
                        } else {
                            popupContentView.getBodyFrame().setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                            popupContentView.getBottomArrow().setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                            popupContentView.getTopArrow().setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                            popupContentView.getXOut().setImageResource(R.drawable.com_facebook_tooltip_black_xout);
                        }
                        View decorView = ((Activity) this.context).getWindow().getDecorView();
                        m.e(decorView, "window.decorView");
                        int width = decorView.getWidth();
                        int height = decorView.getHeight();
                        registerObserver();
                        popupContentView.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                        PopupWindow popupWindow2 = new PopupWindow(popupContentView, popupContentView.getMeasuredWidth(), popupContentView.getMeasuredHeight());
                        this.popupWindow = popupWindow2;
                        popupWindow2.showAsDropDown((View) this.anchorViewRef.get());
                        updateArrows();
                        if (this.nuxDisplayTime > 0) {
                            popupContentView.postDelayed(new h(this), this.nuxDisplayTime);
                        }
                        popupWindow2.setTouchable(true);
                        popupContentView.setOnClickListener(new f(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
