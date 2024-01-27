package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.j0;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f.f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements a0, r, p, q {
    static final int[] M = {f.a.f8185b, 16842841};
    private final Rect A = new Rect();
    private j0 B;
    private j0 C;
    private j0 D;
    private j0 E;
    private d F;
    private OverScroller G;
    ViewPropertyAnimator H;
    final AnimatorListenerAdapter I;
    private final Runnable J;
    private final Runnable K;
    private final s L;

    /* renamed from: h  reason: collision with root package name */
    private int f839h;

    /* renamed from: i  reason: collision with root package name */
    private int f840i = 0;

    /* renamed from: j  reason: collision with root package name */
    private ContentFrameLayout f841j;

    /* renamed from: k  reason: collision with root package name */
    ActionBarContainer f842k;

    /* renamed from: l  reason: collision with root package name */
    private b0 f843l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f844m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f845n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f846o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f847p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f848q;

    /* renamed from: r  reason: collision with root package name */
    boolean f849r;

    /* renamed from: s  reason: collision with root package name */
    private int f850s;

    /* renamed from: t  reason: collision with root package name */
    private int f851t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f852u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private final Rect f853v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private final Rect f854w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    private final Rect f855x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private final Rect f856y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    private final Rect f857z = new Rect();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.H = null;
            actionBarOverlayLayout.f849r = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.H = null;
            actionBarOverlayLayout.f849r = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.H = actionBarOverlayLayout.f842k.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.I);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.H = actionBarOverlayLayout.f842k.animate().translationY((float) (-ActionBarOverlayLayout.this.f842k.getHeight())).setListener(ActionBarOverlayLayout.this.I);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0 j0Var = j0.f2535b;
        this.B = j0Var;
        this.C = j0Var;
        this.D = j0Var;
        this.E = j0Var;
        this.I = new a();
        this.J = new b();
        this.K = new c();
        v(context);
        this.L = new s(this);
    }

    private void A() {
        u();
        this.J.run();
    }

    private boolean B(float f10) {
        this.G.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.G.getFinalY() > this.f842k.getHeight();
    }

    private void p() {
        u();
        this.K.run();
    }

    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private b0 t(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(M);
        boolean z10 = false;
        this.f839h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f844m = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f845n = z10;
        this.G = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.K, 600);
    }

    private void y() {
        u();
        postDelayed(this.J, 600);
    }

    public void a(Menu menu, j.a aVar) {
        z();
        this.f843l.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f843l.b();
    }

    public void c() {
        z();
        this.f843l.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f843l.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f844m != null && !this.f845n) {
            int bottom = this.f842k.getVisibility() == 0 ? (int) (((float) this.f842k.getBottom()) + this.f842k.getTranslationY() + 0.5f) : 0;
            this.f844m.setBounds(0, bottom, getWidth(), this.f844m.getIntrinsicHeight() + bottom);
            this.f844m.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f843l.e();
    }

    public boolean f() {
        z();
        return this.f843l.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q10 = q(this.f842k, rect, true, true, false, true);
        this.f855x.set(rect);
        a1.a(this, this.f855x, this.f852u);
        if (!this.f856y.equals(this.f855x)) {
            this.f856y.set(this.f855x);
            q10 = true;
        }
        if (!this.f853v.equals(this.f852u)) {
            this.f853v.set(this.f852u);
            q10 = true;
        }
        if (q10) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        z();
        return this.f843l.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f842k;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.L.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f843l.getTitle();
    }

    public void h(int i10) {
        z();
        if (i10 == 2) {
            this.f843l.s();
        } else if (i10 == 5) {
            this.f843l.t();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void i() {
        z();
        this.f843l.h();
    }

    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        j0 v10 = j0.v(windowInsets);
        boolean q10 = q(this.f842k, new Rect(v10.i(), v10.k(), v10.j(), v10.h()), true, true, false, true);
        z.e(this, v10, this.f852u);
        Rect rect = this.f852u;
        j0 l10 = v10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.B = l10;
        boolean z10 = true;
        if (!this.C.equals(l10)) {
            this.C = this.B;
            q10 = true;
        }
        if (!this.f853v.equals(this.f852u)) {
            this.f853v.set(this.f852u);
        } else {
            z10 = q10;
        }
        if (z10) {
            requestLayout();
        }
        return v10.a().c().b().u();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        z.P(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        z();
        measureChildWithMargins(this.f842k, i10, 0, i11, 0);
        e eVar = (e) this.f842k.getLayoutParams();
        int max = Math.max(0, this.f842k.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f842k.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f842k.getMeasuredState());
        boolean z10 = (z.z(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        if (z10) {
            i12 = this.f839h;
            if (this.f847p && this.f842k.getTabContainer() != null) {
                i12 += this.f839h;
            }
        } else {
            i12 = this.f842k.getVisibility() != 8 ? this.f842k.getMeasuredHeight() : 0;
        }
        this.f854w.set(this.f852u);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 21) {
            this.D = this.B;
        } else {
            this.f857z.set(this.f855x);
        }
        if (!this.f846o && !z10) {
            Rect rect = this.f854w;
            rect.top += i12;
            rect.bottom += 0;
            if (i13 >= 21) {
                this.D = this.D.l(0, i12, 0, 0);
            }
        } else if (i13 >= 21) {
            this.D = new j0.b(this.D).c(androidx.core.graphics.c.b(this.D.i(), this.D.k() + i12, this.D.j(), this.D.h() + 0)).a();
        } else {
            Rect rect2 = this.f857z;
            rect2.top += i12;
            rect2.bottom += 0;
        }
        q(this.f841j, this.f854w, true, true, true, true);
        if (i13 >= 21 && !this.E.equals(this.D)) {
            j0 j0Var = this.D;
            this.E = j0Var;
            z.f(this.f841j, j0Var);
        } else if (i13 < 21 && !this.A.equals(this.f857z)) {
            this.A.set(this.f857z);
            this.f841j.a(this.f857z);
        }
        measureChildWithMargins(this.f841j, i10, 0, i11, 0);
        e eVar2 = (e) this.f841j.getLayoutParams();
        int max3 = Math.max(max, this.f841j.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f841j.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f841j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f848q || !z10) {
            return false;
        }
        if (B(f11)) {
            p();
        } else {
            A();
        }
        this.f849r = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f850s + i11;
        this.f850s = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.L.b(view, view2, i10);
        this.f850s = getActionBarHideOffset();
        u();
        d dVar = this.F;
        if (dVar != null) {
            dVar.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f842k.getVisibility() != 0) {
            return false;
        }
        return this.f848q;
    }

    public void onStopNestedScroll(View view) {
        if (this.f848q && !this.f849r) {
            if (this.f850s <= this.f842k.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i10);
        }
        z();
        int i11 = this.f851t ^ i10;
        this.f851t = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z10 = true;
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.c(!z10);
            if (z11 || !z10) {
                this.F.a();
            } else {
                this.F.d();
            }
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && this.F != null) {
            z.P(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f840i = i10;
        d dVar = this.F;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f842k.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f842k.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.F = dVar;
        if (getWindowToken() != null) {
            this.F.onWindowVisibilityChanged(this.f840i);
            int i10 = this.f851t;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                z.P(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f847p = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f848q) {
            this.f848q = z10;
            if (!z10) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        z();
        this.f843l.setIcon(i10);
    }

    public void setLogo(int i10) {
        z();
        this.f843l.l(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f846o = z10;
        this.f845n = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f843l.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f843l.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.J);
        removeCallbacks(this.K);
        ViewPropertyAnimator viewPropertyAnimator = this.H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f846o;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f841j == null) {
            this.f841j = (ContentFrameLayout) findViewById(f.f8258b);
            this.f842k = (ActionBarContainer) findViewById(f.f8259c);
            this.f843l = t(findViewById(f.f8257a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f843l.setIcon(drawable);
    }
}
