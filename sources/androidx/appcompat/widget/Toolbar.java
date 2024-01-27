package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.z;
import g.a;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private m0 A;
    private int B;
    private int C;
    private int D;
    private CharSequence E;
    private CharSequence F;
    private ColorStateList G;
    private ColorStateList H;
    private boolean I;
    private boolean J;
    private final ArrayList<View> K;
    private final ArrayList<View> L;
    private final int[] M;
    f N;
    private final ActionMenuView.e O;
    private v0 P;
    private c Q;
    private d R;
    private j.a S;
    private e.a T;
    private boolean U;
    private final Runnable V;

    /* renamed from: h  reason: collision with root package name */
    private ActionMenuView f962h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f963i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f964j;

    /* renamed from: k  reason: collision with root package name */
    private ImageButton f965k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f966l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f967m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f968n;

    /* renamed from: o  reason: collision with root package name */
    ImageButton f969o;

    /* renamed from: p  reason: collision with root package name */
    View f970p;

    /* renamed from: q  reason: collision with root package name */
    private Context f971q;

    /* renamed from: r  reason: collision with root package name */
    private int f972r;

    /* renamed from: s  reason: collision with root package name */
    private int f973s;

    /* renamed from: t  reason: collision with root package name */
    private int f974t;

    /* renamed from: u  reason: collision with root package name */
    int f975u;

    /* renamed from: v  reason: collision with root package name */
    private int f976v;

    /* renamed from: w  reason: collision with root package name */
    private int f977w;

    /* renamed from: x  reason: collision with root package name */
    private int f978x;

    /* renamed from: y  reason: collision with root package name */
    private int f979y;

    /* renamed from: z  reason: collision with root package name */
    private int f980z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.N;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements j {

        /* renamed from: h  reason: collision with root package name */
        androidx.appcompat.view.menu.e f984h;

        /* renamed from: i  reason: collision with root package name */
        androidx.appcompat.view.menu.g f985i;

        d() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public void c(boolean z10) {
            if (this.f985i != null) {
                androidx.appcompat.view.menu.e eVar = this.f984h;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f984h.getItem(i10) == this.f985i) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    e(this.f984h, this.f985i);
                }
            }
        }

        public boolean d() {
            return false;
        }

        public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f970p;
            if (view instanceof l.c) {
                ((l.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f970p);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f969o);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f970p = null;
            toolbar3.a();
            this.f985i = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f969o.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f969o);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f969o);
            }
            Toolbar.this.f970p = gVar.getActionView();
            this.f985i = gVar;
            ViewParent parent2 = Toolbar.this.f970p.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f970p);
                }
                e m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f8532a = 8388611 | (toolbar4.f975u & 112);
                m10.f987b = 2;
                toolbar4.f970p.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f970p);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f970p;
            if (view instanceof l.c) {
                ((l.c) view).c();
            }
            return true;
        }

        public void h(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f984h;
            if (!(eVar2 == null || (gVar = this.f985i) == null)) {
                eVar2.f(gVar);
            }
            this.f984h = eVar;
        }

        public boolean j(m mVar) {
            return false;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.M);
    }

    private int B(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.V);
        post(this.V);
    }

    private boolean L() {
        if (!this.U) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = z.t(this) == 1;
        int childCount = getChildCount();
        int a10 = androidx.core.view.d.a(i10, z.t(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f987b == 0 && M(childAt) && p(eVar.f8532a) == a10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f987b == 0 && M(childAt2) && p(eVar2.f8532a) == a10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f987b = 1;
        if (!z10 || this.f970p == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.L.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new l.g(getContext());
    }

    private void h() {
        if (this.A == null) {
            this.A = new m0();
        }
    }

    private void i() {
        if (this.f966l == null) {
            this.f966l = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f962h.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f962h.getMenu();
            if (this.R == null) {
                this.R = new d();
            }
            this.f962h.setExpandedActionViewsExclusive(true);
            eVar.c(this.R, this.f971q);
        }
    }

    private void k() {
        if (this.f962h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f962h = actionMenuView;
            actionMenuView.setPopupTheme(this.f972r);
            this.f962h.setOnMenuItemClickListener(this.O);
            this.f962h.M(this.S, this.T);
            e m10 = generateDefaultLayoutParams();
            m10.f8532a = 8388613 | (this.f975u & 112);
            this.f962h.setLayoutParams(m10);
            c(this.f962h, false);
        }
    }

    private void l() {
        if (this.f965k == null) {
            this.f965k = new l(getContext(), (AttributeSet) null, f.a.L);
            e m10 = generateDefaultLayoutParams();
            m10.f8532a = 8388611 | (this.f975u & 112);
            this.f965k.setLayoutParams(m10);
        }
    }

    private int p(int i10) {
        int t10 = z.t(this);
        int a10 = androidx.core.view.d.a(i10, t10) & 7;
        if (a10 == 1 || a10 == 3 || a10 == 5) {
            return a10;
        }
        return t10 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f8532a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = eVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = eVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.D & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.g.b(marginLayoutParams) + androidx.core.view.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = eVar.leftMargin - i10;
            int i15 = eVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f962h;
        return actionMenuView != null && actionMenuView.H();
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f987b == 2 || childAt == this.f962h)) {
                removeViewAt(childCount);
                this.L.add(childAt);
            }
        }
    }

    public void H(int i10, int i11) {
        h();
        this.A.g(i10, i11);
    }

    public void I(androidx.appcompat.view.menu.e eVar, c cVar) {
        if (eVar != null || this.f962h != null) {
            k();
            androidx.appcompat.view.menu.e L2 = this.f962h.L();
            if (L2 != eVar) {
                if (L2 != null) {
                    L2.O(this.Q);
                    L2.O(this.R);
                }
                if (this.R == null) {
                    this.R = new d();
                }
                cVar.G(true);
                if (eVar != null) {
                    eVar.c(cVar, this.f971q);
                    eVar.c(this.R, this.f971q);
                } else {
                    cVar.h(this.f971q, (androidx.appcompat.view.menu.e) null);
                    this.R.h(this.f971q, (androidx.appcompat.view.menu.e) null);
                    cVar.c(true);
                    this.R.c(true);
                }
                this.f962h.setPopupTheme(this.f972r);
                this.f962h.setPresenter(cVar);
                this.Q = cVar;
            }
        }
    }

    public void J(Context context, int i10) {
        this.f974t = i10;
        TextView textView = this.f964j;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void K(Context context, int i10) {
        this.f973s = i10;
        TextView textView = this.f963i;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f962h;
        return actionMenuView != null && actionMenuView.N();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.L.size() - 1; size >= 0; size--) {
            addView(this.L.get(size));
        }
        this.L.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f962h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f962h
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.I()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        androidx.appcompat.view.menu.g gVar;
        d dVar = this.R;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f985i;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f962h;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f969o == null) {
            l lVar = new l(getContext(), (AttributeSet) null, f.a.L);
            this.f969o = lVar;
            lVar.setImageDrawable(this.f967m);
            this.f969o.setContentDescription(this.f968n);
            e m10 = generateDefaultLayoutParams();
            m10.f8532a = 8388611 | (this.f975u & 112);
            m10.f987b = 2;
            this.f969o.setLayoutParams(m10);
            this.f969o.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f969o;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f969o;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m0 m0Var = this.A;
        if (m0Var != null) {
            return m0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m0 m0Var = this.A;
        if (m0Var != null) {
            return m0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        m0 m0Var = this.A;
        if (m0Var != null) {
            return m0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        m0 m0Var = this.A;
        if (m0Var != null) {
            return m0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.B;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f962h
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.L()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.C
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (z.t(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (z.t(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.B, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f966l;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f966l;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f962h.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f965k;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f965k;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f962h.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f971q;
    }

    public int getPopupTheme() {
        return this.f972r;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f964j;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.f980z;
    }

    public int getTitleMarginEnd() {
        return this.f978x;
    }

    public int getTitleMarginStart() {
        return this.f977w;
    }

    public int getTitleMarginTop() {
        return this.f979y;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f963i;
    }

    public b0 getWrapper() {
        if (this.P == null) {
            this.P = new v0(this, true);
        }
        return this.P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0133a) {
            return new e((a.C0133a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.z.t(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.M
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.z.u(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f965k
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f965k
            int r13 = r0.C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f965k
            int r13 = r0.B(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f969o
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f969o
            int r14 = r0.C(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f969o
            int r13 = r0.B(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f962h
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f962h
            int r13 = r0.B(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f962h
            int r14 = r0.C(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f970p
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f970p
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f970p
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f966l
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f966l
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f966l
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f963i
            boolean r13 = r0.M(r13)
            android.widget.TextView r14 = r0.f964j
            boolean r14 = r0.M(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f963i
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f963i
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f964j
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f964j
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f963i
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f964j
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f964j
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f963i
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f963i
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f964j
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.D
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f979y
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f980z
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f980z
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f979y
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f977w
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f963i
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f963i
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f963i
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f963i
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f978x
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f964j
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f964j
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f964j
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f964j
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f978x
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f977w
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f963i
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f963i
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f963i
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f963i
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f978x
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f964j
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f964j
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f964j
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f964j
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f978x
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.K
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.K
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.K
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.K
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.K
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.K
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.K
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.K
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.K
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.M;
        char b10 = a1.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (M(this.f965k)) {
            E(this.f965k, i10, 0, i11, 0, this.f976v);
            i14 = this.f965k.getMeasuredWidth() + s(this.f965k);
            i13 = Math.max(0, this.f965k.getMeasuredHeight() + t(this.f965k));
            i12 = View.combineMeasuredStates(0, this.f965k.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (M(this.f969o)) {
            E(this.f969o, i10, 0, i11, 0, this.f976v);
            i14 = this.f969o.getMeasuredWidth() + s(this.f969o);
            i13 = Math.max(i13, this.f969o.getMeasuredHeight() + t(this.f969o));
            i12 = View.combineMeasuredStates(i12, this.f969o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (M(this.f962h)) {
            E(this.f962h, i10, max, i11, 0, this.f976v);
            i15 = this.f962h.getMeasuredWidth() + s(this.f962h);
            i13 = Math.max(i13, this.f962h.getMeasuredHeight() + t(this.f962h));
            i12 = View.combineMeasuredStates(i12, this.f962h.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (M(this.f970p)) {
            max2 += D(this.f970p, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f970p.getMeasuredHeight() + t(this.f970p));
            i12 = View.combineMeasuredStates(i12, this.f970p.getMeasuredState());
        }
        if (M(this.f966l)) {
            max2 += D(this.f966l, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f966l.getMeasuredHeight() + t(this.f966l));
            i12 = View.combineMeasuredStates(i12, this.f966l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f987b == 0 && M(childAt)) {
                max2 += D(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f979y + this.f980z;
        int i22 = this.f977w + this.f978x;
        if (M(this.f963i)) {
            D(this.f963i, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f963i.getMeasuredWidth() + s(this.f963i);
            i16 = this.f963i.getMeasuredHeight() + t(this.f963i);
            i18 = View.combineMeasuredStates(i12, this.f963i.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i18 = i12;
            i17 = 0;
            i16 = 0;
        }
        if (M(this.f964j)) {
            int i23 = i16 + i21;
            i17 = Math.max(i17, D(this.f964j, i10, max2 + i22, i11, i23, iArr));
            i16 += this.f964j.getMeasuredHeight() + t(this.f964j);
            i18 = View.combineMeasuredStates(i18, this.f964j.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!L()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.b());
        ActionMenuView actionMenuView = this.f962h;
        androidx.appcompat.view.menu.e L2 = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = gVar.f988j;
        if (!(i10 == 0 || this.R == null || L2 == null || (findItem = L2.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f989k) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        h();
        m0 m0Var = this.A;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        m0Var.f(z10);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.R;
        if (!(dVar == null || (gVar = dVar.f985i) == null)) {
            gVar2.f988j = gVar.getItemId();
        }
        gVar2.f989k = A();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.d(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.U = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.B) {
            this.B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(h.a.d(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.d(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f965k.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.N = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f962h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f972r != i10) {
            this.f972r = i10;
            if (i10 == 0) {
                this.f971q = getContext();
            } else {
                this.f971q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f980z = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f978x = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f977w = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f979y = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        d dVar = this.R;
        return (dVar == null || dVar.f985i == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f962h;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f962h;
        return actionMenuView != null && actionMenuView.G();
    }

    public static class e extends a.C0133a {

        /* renamed from: b  reason: collision with root package name */
        int f987b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f8532a = 8388627;
        }

        public e(e eVar) {
            super((a.C0133a) eVar);
            this.f987b = eVar.f987b;
        }

        public e(a.C0133a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = 8388627;
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.M = new int[2];
        this.O = new a();
        this.V = new b();
        Context context2 = getContext();
        int[] iArr = f.j.f8373k3;
        u0 u10 = u0.u(context2, attributeSet, iArr, i10, 0);
        z.Q(this, context, iArr, attributeSet, u10.q(), i10, 0);
        this.f973s = u10.m(f.j.M3, 0);
        this.f974t = u10.m(f.j.D3, 0);
        this.D = u10.k(f.j.f8378l3, this.D);
        this.f975u = u10.k(f.j.f8383m3, 48);
        int d10 = u10.d(f.j.G3, 0);
        int i11 = f.j.L3;
        d10 = u10.r(i11) ? u10.d(i11, d10) : d10;
        this.f980z = d10;
        this.f979y = d10;
        this.f978x = d10;
        this.f977w = d10;
        int d11 = u10.d(f.j.J3, -1);
        if (d11 >= 0) {
            this.f977w = d11;
        }
        int d12 = u10.d(f.j.I3, -1);
        if (d12 >= 0) {
            this.f978x = d12;
        }
        int d13 = u10.d(f.j.K3, -1);
        if (d13 >= 0) {
            this.f979y = d13;
        }
        int d14 = u10.d(f.j.H3, -1);
        if (d14 >= 0) {
            this.f980z = d14;
        }
        this.f976v = u10.e(f.j.f8438x3, -1);
        int d15 = u10.d(f.j.f8418t3, Integer.MIN_VALUE);
        int d16 = u10.d(f.j.f8398p3, Integer.MIN_VALUE);
        int e10 = u10.e(f.j.f8408r3, 0);
        int e11 = u10.e(f.j.f8413s3, 0);
        h();
        this.A.e(e10, e11);
        if (!(d15 == Integer.MIN_VALUE && d16 == Integer.MIN_VALUE)) {
            this.A.g(d15, d16);
        }
        this.B = u10.d(f.j.f8423u3, Integer.MIN_VALUE);
        this.C = u10.d(f.j.f8403q3, Integer.MIN_VALUE);
        this.f967m = u10.f(f.j.f8393o3);
        this.f968n = u10.o(f.j.f8388n3);
        CharSequence o10 = u10.o(f.j.F3);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = u10.o(f.j.C3);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f971q = getContext();
        setPopupTheme(u10.m(f.j.B3, 0));
        Drawable f10 = u10.f(f.j.A3);
        if (f10 != null) {
            setNavigationIcon(f10);
        }
        CharSequence o12 = u10.o(f.j.f8448z3);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable f11 = u10.f(f.j.f8428v3);
        if (f11 != null) {
            setLogo(f11);
        }
        CharSequence o13 = u10.o(f.j.f8433w3);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        int i12 = f.j.N3;
        if (u10.r(i12)) {
            setTitleTextColor(u10.c(i12));
        }
        int i13 = f.j.E3;
        if (u10.r(i13)) {
            setSubtitleTextColor(u10.c(i13));
        }
        int i14 = f.j.f8443y3;
        if (u10.r(i14)) {
            x(u10.m(i14, 0));
        }
        u10.v();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f969o;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f969o.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f969o;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f967m);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f966l)) {
                c(this.f966l, true);
            }
        } else {
            ImageView imageView = this.f966l;
            if (imageView != null && y(imageView)) {
                removeView(this.f966l);
                this.L.remove(this.f966l);
            }
        }
        ImageView imageView2 = this.f966l;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f966l;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f965k;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f965k)) {
                c(this.f965k, true);
            }
        } else {
            ImageButton imageButton = this.f965k;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f965k);
                this.L.remove(this.f965k);
            }
        }
        ImageButton imageButton2 = this.f965k;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f964j == null) {
                Context context = getContext();
                x xVar = new x(context);
                this.f964j = xVar;
                xVar.setSingleLine();
                this.f964j.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f974t;
                if (i10 != 0) {
                    this.f964j.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f964j.setTextColor(colorStateList);
                }
            }
            if (!y(this.f964j)) {
                c(this.f964j, true);
            }
        } else {
            TextView textView = this.f964j;
            if (textView != null && y(textView)) {
                removeView(this.f964j);
                this.L.remove(this.f964j);
            }
        }
        TextView textView2 = this.f964j;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        TextView textView = this.f964j;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f963i == null) {
                Context context = getContext();
                x xVar = new x(context);
                this.f963i = xVar;
                xVar.setSingleLine();
                this.f963i.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f973s;
                if (i10 != 0) {
                    this.f963i.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f963i.setTextColor(colorStateList);
                }
            }
            if (!y(this.f963i)) {
                c(this.f963i, true);
            }
        } else {
            TextView textView = this.f963i;
            if (textView != null && y(textView)) {
                removeView(this.f963i);
                this.L.remove(this.f963i);
            }
        }
        TextView textView2 = this.f963i;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.f963i;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends e0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        int f988j;

        /* renamed from: k  reason: collision with root package name */
        boolean f989k;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f988j = parcel.readInt();
            this.f989k = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f988j);
            parcel.writeInt(this.f989k ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
