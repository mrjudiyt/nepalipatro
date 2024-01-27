package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.g0;
import com.google.android.gms.common.api.Api;

public class ActionMenuView extends g0 implements e.b, k {
    private c A;
    private j.a B;
    e.a C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    e H;

    /* renamed from: w  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f861w;

    /* renamed from: x  reason: collision with root package name */
    private Context f862x;

    /* renamed from: y  reason: collision with root package name */
    private int f863y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f864z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends g0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f865c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f866d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f867e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f868f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f869g;

        /* renamed from: h  reason: collision with root package name */
        boolean f870h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f865c = cVar.f865c;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f865c = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.H;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.C;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int J(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.f();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f865c || !z11) {
            z10 = false;
        }
        cVar.f868f = z10;
        cVar.f866d = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    private void K(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i16 = size - paddingLeft;
        int i17 = this.F;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = i17 + (i19 / i18);
        int childCount = getChildCount();
        int i21 = 0;
        int i22 = 0;
        boolean z14 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i26 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i27 = i23 + 1;
                if (z15) {
                    int i28 = this.G;
                    i15 = i27;
                    z13 = false;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    i15 = i27;
                    z13 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f870h = z13;
                cVar.f867e = z13 ? 1 : 0;
                cVar.f866d = z13;
                cVar.f868f = z13;
                cVar.leftMargin = z13;
                cVar.rightMargin = z13;
                cVar.f869g = z15 && ((ActionMenuItemView) childAt).f();
                int J = J(childAt, i20, cVar.f865c ? 1 : i18, childMeasureSpec, paddingTop);
                i24 = Math.max(i24, J);
                if (cVar.f868f) {
                    i25++;
                }
                if (cVar.f865c) {
                    z14 = true;
                }
                i18 -= J;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (J == 1) {
                    j10 |= (long) (1 << i22);
                    i21 = i21;
                } else {
                    int i29 = i21;
                }
                i23 = i15;
            }
            i22++;
            size2 = i26;
        }
        int i30 = size2;
        boolean z16 = z14 && i23 == 2;
        boolean z17 = false;
        while (true) {
            if (i25 <= 0 || i18 <= 0) {
                i14 = mode;
                i12 = i16;
                z10 = z17;
                i13 = i21;
            } else {
                int i31 = 0;
                int i32 = 0;
                int i33 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                long j11 = 0;
                while (i32 < childCount) {
                    boolean z18 = z17;
                    c cVar2 = (c) getChildAt(i32).getLayoutParams();
                    int i34 = i21;
                    if (cVar2.f868f) {
                        int i35 = cVar2.f866d;
                        if (i35 < i33) {
                            j11 = 1 << i32;
                            i33 = i35;
                            i31 = 1;
                        } else if (i35 == i33) {
                            i31++;
                            j11 |= 1 << i32;
                        }
                    }
                    i32++;
                    i21 = i34;
                    z17 = z18;
                }
                z10 = z17;
                i13 = i21;
                j10 |= j11;
                if (i31 > i18) {
                    i14 = mode;
                    i12 = i16;
                    break;
                }
                int i36 = i33 + 1;
                int i37 = 0;
                while (i37 < childCount) {
                    View childAt2 = getChildAt(i37);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i38 = i16;
                    int i39 = mode;
                    long j12 = (long) (1 << i37);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f866d == i36) {
                            j10 |= j12;
                        }
                        z12 = z16;
                    } else {
                        if (!z16 || !cVar3.f869g || i18 != 1) {
                            z12 = z16;
                        } else {
                            int i40 = this.G;
                            z12 = z16;
                            childAt2.setPadding(i40 + i20, 0, i40, 0);
                        }
                        cVar3.f866d++;
                        cVar3.f870h = true;
                        i18--;
                    }
                    i37++;
                    mode = i39;
                    i16 = i38;
                    z16 = z12;
                }
                i21 = i13;
                z17 = true;
            }
        }
        boolean z19 = !z14 && i23 == 1;
        if (i18 <= 0 || j10 == 0 || (i18 >= i23 - 1 && !z19 && i24 <= 1)) {
            z11 = z10;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f869g) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & ((long) (1 << i41))) != 0 && !((c) getChildAt(i41).getLayoutParams()).f869g) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) (((float) (i18 * i20)) / bitCount) : 0;
            z11 = z10;
            for (int i43 = 0; i43 < childCount; i43++) {
                if ((j10 & ((long) (1 << i43))) != 0) {
                    View childAt3 = getChildAt(i43);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f867e = i42;
                        cVar4.f870h = true;
                        if (i43 == 0 && !cVar4.f869g) {
                            cVar4.leftMargin = (-i42) / 2;
                        }
                    } else if (cVar4.f865c) {
                        cVar4.f867e = i42;
                        cVar4.f870h = true;
                        cVar4.rightMargin = (-i42) / 2;
                    } else {
                        if (i43 != 0) {
                            cVar4.leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            cVar4.rightMargin = i42 / 2;
                        }
                    }
                    z11 = true;
                }
            }
        }
        if (z11) {
            for (int i44 = 0; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f870h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f866d * i20) + cVar5.f867e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i30);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public c k() {
        c cVar = new c(-2, -2);
        cVar.f1087b = 16;
        return cVar;
    }

    /* renamed from: B */
    public c l(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return k();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.f1087b <= 0) {
            cVar.f1087b = 16;
        }
        return cVar;
    }

    public c D() {
        c A2 = k();
        A2.f865c = true;
        return A2;
    }

    /* access modifiers changed from: protected */
    public boolean E(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean F() {
        c cVar = this.A;
        return cVar != null && cVar.B();
    }

    public boolean G() {
        c cVar = this.A;
        return cVar != null && cVar.D();
    }

    public boolean H() {
        c cVar = this.A;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        return this.f864z;
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f861w;
    }

    public void M(j.a aVar, e.a aVar2) {
        this.B = aVar;
        this.C = aVar2;
    }

    public boolean N() {
        c cVar = this.A;
        return cVar != null && cVar.K();
    }

    public boolean a(g gVar) {
        return this.f861w.L(gVar, 0);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f861w = eVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f861w == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f861w = eVar;
            eVar.R(new d());
            c cVar = new c(context);
            this.A = cVar;
            cVar.J(true);
            c cVar2 = this.A;
            j.a aVar = this.B;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.g(aVar);
            this.f861w.c(this.A, this.f862x);
            this.A.H(this);
        }
        return this.f861w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.A.A();
    }

    public int getPopupTheme() {
        return this.f863y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.A;
        if (cVar != null) {
            cVar.c(false);
            if (this.A.E()) {
                this.A.B();
                this.A.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.D) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = a1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f865c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    E(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f865c) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f865c) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.D;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.D = z11;
        if (z10 != z11) {
            this.E = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.D || (eVar = this.f861w) == null || size == this.E)) {
            this.E = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.D || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        K(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.A.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.H = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.A.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f864z = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f863y != i10) {
            this.f863y = i10;
            if (i10 == 0) {
                this.f862x = getContext();
            } else {
                this.f862x = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.A = cVar;
        cVar.H(this);
    }

    public void z() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.F = (int) (56.0f * f10);
        this.G = (int) (f10 * 4.0f);
        this.f862x = context;
        this.f863y = 0;
    }
}
