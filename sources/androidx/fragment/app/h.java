package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.j0;
import androidx.core.view.z;
import java.util.ArrayList;
import l0.c;

/* compiled from: FragmentContainerView */
public final class h extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<View> f3200h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<View> f3201i;

    /* renamed from: j  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f3202j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3203k = true;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f9815h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f9816i) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f9817j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h02 = nVar.h0(id);
        if (classAttribute != null && h02 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = nVar.q0().a(context.getClassLoader(), classAttribute);
            a10.onInflate(context, attributeSet, (Bundle) null);
            nVar.m().m(true).c(this, a10, string).i();
        }
        nVar.U0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f3201i;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f3200h == null) {
                this.f3200h = new ArrayList<>();
            }
            this.f3200h.add(view);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.z0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (n.z0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        j0 j0Var;
        j0 v10 = j0.v(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3202j;
        if (onApplyWindowInsetsListener != null) {
            j0Var = j0.v(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            j0Var = z.K(this, v10);
        }
        if (!j0Var.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                z.f(getChildAt(i10), j0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3203k && this.f3200h != null) {
            for (int i10 = 0; i10 < this.f3200h.size(); i10++) {
                super.drawChild(canvas, this.f3200h.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f3203k || (arrayList = this.f3200h) == null || arrayList.size() <= 0 || !this.f3200h.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3201i;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3200h;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3203k = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f3203k = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3202j = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3201i == null) {
                this.f3201i = new ArrayList<>();
            }
            this.f3201i.add(view);
        }
        super.startViewTransition(view);
    }
}
