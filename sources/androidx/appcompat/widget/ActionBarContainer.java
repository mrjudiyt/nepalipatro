package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;
import f.f;
import f.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private boolean f816h;

    /* renamed from: i  reason: collision with root package name */
    private View f817i;

    /* renamed from: j  reason: collision with root package name */
    private View f818j;

    /* renamed from: k  reason: collision with root package name */
    private View f819k;

    /* renamed from: l  reason: collision with root package name */
    Drawable f820l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f821m;

    /* renamed from: n  reason: collision with root package name */
    Drawable f822n;

    /* renamed from: o  reason: collision with root package name */
    boolean f823o;

    /* renamed from: p  reason: collision with root package name */
    boolean f824p;

    /* renamed from: q  reason: collision with root package name */
    private int f825q;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z.T(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8319a);
        this.f820l = obtainStyledAttributes.getDrawable(j.f8324b);
        this.f821m = obtainStyledAttributes.getDrawable(j.f8334d);
        this.f825q = obtainStyledAttributes.getDimensionPixelSize(j.f8364j, -1);
        boolean z10 = true;
        if (getId() == f.H) {
            this.f823o = true;
            this.f822n = obtainStyledAttributes.getDrawable(j.f8329c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f823o ? !(this.f820l == null && this.f821m == null) : this.f822n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f820l;
        if (drawable != null && drawable.isStateful()) {
            this.f820l.setState(getDrawableState());
        }
        Drawable drawable2 = this.f821m;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f821m.setState(getDrawableState());
        }
        Drawable drawable3 = this.f822n;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f822n.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f817i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f820l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f821m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f822n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f818j = findViewById(f.f8257a);
        this.f819k = findViewById(f.f8262f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f816h || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f817i;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f823o) {
            Drawable drawable2 = this.f822n;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f820l != null) {
                if (this.f818j.getVisibility() == 0) {
                    this.f820l.setBounds(this.f818j.getLeft(), this.f818j.getTop(), this.f818j.getRight(), this.f818j.getBottom());
                } else {
                    View view2 = this.f819k;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f820l.setBounds(0, 0, 0, 0);
                    } else {
                        this.f820l.setBounds(this.f819k.getLeft(), this.f819k.getTop(), this.f819k.getRight(), this.f819k.getBottom());
                    }
                }
                z12 = true;
            }
            this.f824p = z13;
            if (!z13 || (drawable = this.f821m) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f818j == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f825q) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f818j != null) {
            int mode = View.MeasureSpec.getMode(i11);
            View view = this.f817i;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f818j)) {
                    i12 = a(this.f818j);
                } else {
                    i12 = !b(this.f819k) ? a(this.f819k) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i12 + a(this.f817i), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f820l;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f820l);
        }
        this.f820l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f818j;
            if (view != null) {
                this.f820l.setBounds(view.getLeft(), this.f818j.getTop(), this.f818j.getRight(), this.f818j.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f823o ? !(this.f820l == null && this.f821m == null) : this.f822n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f822n;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f822n);
        }
        this.f822n = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f823o && (drawable2 = this.f822n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f823o ? this.f820l == null && this.f821m == null : this.f822n == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f821m;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f821m);
        }
        this.f821m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f824p && (drawable2 = this.f821m) != null) {
                drawable2.setBounds(this.f817i.getLeft(), this.f817i.getTop(), this.f817i.getRight(), this.f817i.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f823o ? !(this.f820l == null && this.f821m == null) : this.f822n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(n0 n0Var) {
        View view = this.f817i;
        if (view != null) {
            removeView(view);
        }
        this.f817i = n0Var;
        if (n0Var != null) {
            addView(n0Var);
            ViewGroup.LayoutParams layoutParams = n0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            n0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f816h = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f820l;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f821m;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f822n;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f820l && !this.f823o) || (drawable == this.f821m && this.f824p) || ((drawable == this.f822n && this.f823o) || super.verifyDrawable(drawable));
    }
}
