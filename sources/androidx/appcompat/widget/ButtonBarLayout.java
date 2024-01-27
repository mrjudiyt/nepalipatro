package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.z;
import f.f;
import f.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: h  reason: collision with root package name */
    private boolean f877h;

    /* renamed from: i  reason: collision with root package name */
    private int f878i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f879j = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j.O0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        z.Q(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f877h = obtainStyledAttributes.getBoolean(j.P0, true);
        obtainStyledAttributes.recycle();
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z10) {
        setOrientation(z10 ? 1 : 0);
        setGravity(z10 ? 5 : 80);
        View findViewById = findViewById(f.G);
        if (findViewById != null) {
            findViewById.setVisibility(z10 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f879j, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f877h) {
            if (size > this.f878i && b()) {
                setStacked(false);
            }
            this.f878i = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f877h && !b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (z.u(this) != i13) {
            setMinimumHeight(i13);
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f877h != z10) {
            this.f877h = z10;
            if (!z10 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
