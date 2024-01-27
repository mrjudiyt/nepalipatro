package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.core.view.f0;
import androidx.core.view.z;
import f.f;
import f.g;
import f.j;
import l.b;

public class ActionBarContextView extends a {

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f826p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f827q;

    /* renamed from: r  reason: collision with root package name */
    private View f828r;

    /* renamed from: s  reason: collision with root package name */
    private View f829s;

    /* renamed from: t  reason: collision with root package name */
    private LinearLayout f830t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f831u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f832v;

    /* renamed from: w  reason: collision with root package name */
    private int f833w;

    /* renamed from: x  reason: collision with root package name */
    private int f834x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f835y;

    /* renamed from: z  reason: collision with root package name */
    private int f836z;

    class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f837h;

        a(b bVar) {
            this.f837h = bVar;
        }

        public void onClick(View view) {
            this.f837h.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.f830t == null) {
            LayoutInflater.from(getContext()).inflate(g.f8283a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f830t = linearLayout;
            this.f831u = (TextView) linearLayout.findViewById(f.f8261e);
            this.f832v = (TextView) this.f830t.findViewById(f.f8260d);
            if (this.f833w != 0) {
                this.f831u.setTextAppearance(getContext(), this.f833w);
            }
            if (this.f834x != 0) {
                this.f832v.setTextAppearance(getContext(), this.f834x);
            }
        }
        this.f831u.setText(this.f826p);
        this.f832v.setText(this.f827q);
        boolean z10 = !TextUtils.isEmpty(this.f826p);
        boolean z11 = !TextUtils.isEmpty(this.f827q);
        int i10 = 0;
        this.f832v.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f830t;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f830t.getParent() == null) {
            addView(this.f830t);
        }
    }

    public /* bridge */ /* synthetic */ f0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f828r == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f827q;
    }

    public CharSequence getTitle() {
        return this.f826p;
    }

    public void h(b bVar) {
        View view = this.f828r;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f836z, this, false);
            this.f828r = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f828r);
        }
        this.f828r.findViewById(f.f8265i).setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        c cVar = this.f998k;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f998k = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f998k, this.f996i);
        ActionMenuView actionMenuView = (ActionMenuView) this.f998k.o(this);
        this.f997j = actionMenuView;
        z.T(actionMenuView, (Drawable) null);
        addView(this.f997j, layoutParams);
    }

    public boolean j() {
        return this.f835y;
    }

    public void k() {
        removeAllViews();
        this.f829s = null;
        this.f997j = null;
    }

    public boolean l() {
        c cVar = this.f998k;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f998k;
        if (cVar != null) {
            cVar.B();
            this.f998k.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f826p);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = a1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f828r;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f828r.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = a.d(paddingRight, i14, b10);
            paddingRight = a.d(d10 + e(this.f828r, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f830t;
        if (!(linearLayout == null || this.f829s != null || linearLayout.getVisibility() == 8)) {
            i16 += e(this.f830t, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f829s;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f997j;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f999l;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f828r;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f828r.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f997j;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f997j, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f830t;
            if (linearLayout != null && this.f829s == null) {
                if (this.f835y) {
                    this.f830t.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f830t.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f830t.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f829s;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f829s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f999l <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f999l = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f829s;
        if (view2 != null) {
            removeView(view2);
        }
        this.f829s = view;
        if (!(view == null || (linearLayout = this.f830t) == null)) {
            removeView(linearLayout);
            this.f830t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f827q = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f826p = charSequence;
        i();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f835y) {
            requestLayout();
        }
        this.f835y = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f8193j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u0 u10 = u0.u(context, attributeSet, j.f8439y, i10, 0);
        z.T(this, u10.f(j.f8444z));
        this.f833w = u10.m(j.D, 0);
        this.f834x = u10.m(j.C, 0);
        this.f999l = u10.l(j.B, 0);
        this.f836z = u10.m(j.A, g.f8286d);
        u10.v();
    }
}
