package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.e;
import androidx.core.view.m;
import androidx.core.view.n;
import androidx.core.view.o;
import androidx.core.view.q;
import androidx.core.view.s;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements q, n {
    private static final float I = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final a J = new a();
    private static final int[] K = {16843130};
    private final int[] A;
    private int B;
    private int C;
    private d D;
    private final s E;
    private final o F;
    private float G;
    private c H;

    /* renamed from: h  reason: collision with root package name */
    private final float f2615h;

    /* renamed from: i  reason: collision with root package name */
    private long f2616i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f2617j;

    /* renamed from: k  reason: collision with root package name */
    private OverScroller f2618k;

    /* renamed from: l  reason: collision with root package name */
    public EdgeEffect f2619l;

    /* renamed from: m  reason: collision with root package name */
    public EdgeEffect f2620m;

    /* renamed from: n  reason: collision with root package name */
    private int f2621n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2622o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2623p;

    /* renamed from: q  reason: collision with root package name */
    private View f2624q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2625r;

    /* renamed from: s  reason: collision with root package name */
    private VelocityTracker f2626s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2627t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2628u;

    /* renamed from: v  reason: collision with root package name */
    private int f2629v;

    /* renamed from: w  reason: collision with root package name */
    private int f2630w;

    /* renamed from: x  reason: collision with root package name */
    private int f2631x;

    /* renamed from: y  reason: collision with root package name */
    private int f2632y;

    /* renamed from: z  reason: collision with root package name */
    private final int[] f2633z;

    static class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.X(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.d0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.b(c.a.f2486r);
                    cVar.b(c.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.b(c.a.f2485q);
                    cVar.b(c.a.E);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f2634h;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2634h + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2634h);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f2634h = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, y.a.f12837c);
    }

    private void A() {
        this.f2618k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2629v = viewConfiguration.getScaledTouchSlop();
        this.f2630w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2631x = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2626s == null) {
            this.f2626s = VelocityTracker.obtain();
        }
    }

    private void C(int i10, int i11) {
        this.f2621n = i10;
        this.f2632y = i11;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !E((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean F(View view, int i10, int i11) {
        view.getDrawingRect(this.f2617j);
        offsetDescendantRectToMyCoords(view, this.f2617j);
        return this.f2617j.bottom + i10 >= getScrollY() && this.f2617j.top - i10 <= getScrollY() + i11;
    }

    private void G(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2632y) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2621n = (int) motionEvent.getY(i10);
            this.f2632y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2626s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f2626s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2626s = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int L(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2619l
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f2619l
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2619l
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2619l
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f2620m
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f2620m
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2620m
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2620m
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0064
            r3.invalidate()
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.L(int, float):int");
    }

    private void M(boolean z10) {
        if (z10) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.C = getScrollY();
        z.M(this);
    }

    private boolean N(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View t10 = t(z11, i11, i12);
        if (t10 == null) {
            t10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            O(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (t10 != findFocus()) {
            t10.requestFocus(i10);
        }
        return z10;
    }

    private int O(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15 = i11;
        int i16 = i12;
        if (i16 == 1) {
            W(2, i16);
        }
        boolean z11 = false;
        if (h(0, i10, this.A, this.f2633z, i12)) {
            i14 = i10 - this.A[1];
            i13 = this.f2633z[1] + 0;
        } else {
            i14 = i10;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = c() && !z10;
        int i17 = scrollRange;
        boolean z13 = I(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i16);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.A;
        iArr[1] = 0;
        i(0, scrollY2, 0, i14 - scrollY2, this.f2633z, i12, iArr);
        int i18 = i13 + this.f2633z[1];
        int i19 = i14 - this.A[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                d.d(this.f2619l, ((float) (-i19)) / ((float) getHeight()), ((float) i15) / ((float) getWidth()));
                if (!this.f2620m.isFinished()) {
                    this.f2620m.onRelease();
                }
            }
        } else if (i20 > i17 && z12) {
            d.d(this.f2620m, ((float) i19) / ((float) getHeight()), 1.0f - (((float) i15) / ((float) getWidth())));
            if (!this.f2619l.isFinished()) {
                this.f2619l.onRelease();
            }
        }
        if (!this.f2619l.isFinished() || !this.f2620m.isFinished()) {
            z.M(this);
        } else {
            z11 = z13;
        }
        if (z11 && i16 == 0) {
            this.f2626s.clear();
        }
        if (i16 == 1) {
            Y(i16);
            this.f2619l.onRelease();
            this.f2620m.onRelease();
        }
        return i18;
    }

    private void P(View view) {
        view.getDrawingRect(this.f2617j);
        offsetDescendantRectToMyCoords(view, this.f2617j);
        int f10 = f(this.f2617j);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean Q(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                S(0, f10);
            }
        }
        return z11;
    }

    private boolean R(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        if (w(-i10) < d.b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    private void T(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2616i > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2618k;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                M(z10);
            } else {
                if (!this.f2618k.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f2616i = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.f2619l) != 0.0f) {
            d.d(this.f2619l, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.f2620m) == 0.0f) {
            return z10;
        }
        d.d(this.f2620m, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f2618k.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.G;
    }

    private void p(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f2628u) {
            S(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean q(int i10) {
        if (d.b(this.f2619l) != 0.0f) {
            if (R(this.f2619l, i10)) {
                this.f2619l.onAbsorb(i10);
            } else {
                u(-i10);
            }
        } else if (d.b(this.f2620m) == 0.0f) {
            return false;
        } else {
            int i11 = -i10;
            if (R(this.f2620m, i11)) {
                this.f2620m.onAbsorb(i11);
            } else {
                u(i11);
            }
        }
        return true;
    }

    private void r() {
        this.f2632y = -1;
        this.f2625r = false;
        K();
        Y(0);
        this.f2619l.onRelease();
        this.f2620m.onRelease();
    }

    private View t(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float w(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f2615h * 0.015f)));
        float f10 = I;
        return (float) (((double) (this.f2615h * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean y(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i11 < childAt.getTop() - scrollY || i11 >= childAt.getBottom() - scrollY || i10 < childAt.getLeft() || i10 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2626s;
        if (velocityTracker == null) {
            this.f2626s = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.x(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f2618k
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean J(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2617j.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2617j;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2617j.top = getScrollY() - height;
            Rect rect2 = this.f2617j;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2617j;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return N(i10, i11, i12);
    }

    public final void S(int i10, int i11) {
        T(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void U(int i10, int i11, int i12, boolean z10) {
        T(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, int i11, boolean z10) {
        U(i10, i11, 250, z10);
    }

    public boolean W(int i10, int i11) {
        return this.F.q(i10, i11);
    }

    public void Y(int i10) {
        this.F.s(i10);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f2617j);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2617j);
            O(f(this.f2617j), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2618k.isFinished()) {
            this.f2618k.computeScrollOffset();
            int currY = this.f2618k.getCurrY();
            int g10 = g(currY - this.C);
            this.C = currY;
            int[] iArr = this.A;
            boolean z10 = false;
            iArr[1] = 0;
            h(0, g10, iArr, (int[]) null, 1);
            int i10 = g10 - this.A[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                I(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.A;
                iArr2[1] = 0;
                i(0, scrollY2, 0, i11, this.f2633z, 1, iArr2);
                i10 = i11 - this.A[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 < 0) {
                        if (this.f2619l.isFinished()) {
                            this.f2619l.onAbsorb((int) this.f2618k.getCurrVelocity());
                        }
                    } else if (this.f2620m.isFinished()) {
                        this.f2620m.onAbsorb((int) this.f2618k.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f2618k.isFinished()) {
                z.M(this);
            } else {
                Y(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.F.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.F.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return h(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.F.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f2619l.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 21 || b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (i12 >= 21 && b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f2619l.setSize(width, height);
            if (this.f2619l.draw(canvas)) {
                z.M(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2620m.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 21 || b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = 0 + getPaddingLeft();
            }
            if (i13 >= 21 && b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2620m.setSize(width2, height2);
            if (this.f2620m.draw(canvas)) {
                z.M(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.f2619l) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * d.d(this.f2619l, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f2619l.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || d.b(this.f2620m) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * d.d(this.f2620m, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f2620m.finish();
            }
            return i10 - round2;
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.F.d(i10, i11, iArr, iArr2, i12);
    }

    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.F.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.F.m();
    }

    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        G(i13, i14, iArr);
    }

    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        G(i13, i14, (int[]) null);
    }

    public boolean l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void m(View view, View view2, int i10, int i11) {
        this.E.c(view, view2, i10, i11);
        W(2, i11);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10) {
        this.E.d(view, i10);
        Y(i10);
    }

    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        h(i10, i11, iArr, (int[]) null, i12);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2623p = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f2625r) {
            return false;
        }
        if (m.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (m.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = 0.0f;
            i10 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        O(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, m.a(motionEvent, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2625r) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2632y;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i11);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2621n) > this.f2629v && (2 & getNestedScrollAxes()) == 0) {
                                this.f2625r = true;
                                this.f2621n = y10;
                                B();
                                this.f2626s.addMovement(motionEvent);
                                this.B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f2625r = false;
            this.f2632y = -1;
            K();
            if (this.f2618k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                z.M(this);
            }
            Y(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!y((int) motionEvent.getX(), y11)) {
                if (!X(motionEvent) && this.f2618k.isFinished()) {
                    z10 = false;
                }
                this.f2625r = z10;
                K();
            } else {
                this.f2621n = y11;
                this.f2632y = motionEvent.getPointerId(0);
                z();
                this.f2626s.addMovement(motionEvent);
                this.f2618k.computeScrollOffset();
                if (!X(motionEvent) && this.f2618k.isFinished()) {
                    z10 = false;
                }
                this.f2625r = z10;
                W(2, 0);
            }
        }
        return this.f2625r;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2622o = false;
        View view = this.f2624q;
        if (view != null && E(view, this)) {
            P(this.f2624q);
        }
        this.f2624q = null;
        if (!this.f2623p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.f2634h);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e10 = e(scrollY, paddingTop, i14);
            if (e10 != scrollY) {
                scrollTo(getScrollX(), e10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2623p = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2627t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        u((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        G(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !D(view)) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.D = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2634h = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.H;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && F(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f2617j);
            offsetDescendantRectToMyCoords(findFocus, this.f2617j);
            p(f(this.f2617j));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        B();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.B);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2626s;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f2631x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2632y);
                if (Math.abs(yVelocity) >= this.f2630w) {
                    if (!q(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = (float) i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            u(i10);
                        }
                    }
                } else if (this.f2618k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    z.M(this);
                }
                r();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2632y);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f2632y);
                    sb.append(" in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f2621n - y10;
                    int L = i11 - L(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f2625r && Math.abs(L) > this.f2629v) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2625r = true;
                        L = L > 0 ? L - this.f2629v : L + this.f2629v;
                    }
                    if (this.f2625r) {
                        int O = O(L, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f2621n = y10 - O;
                        this.B += O;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2625r && getChildCount() > 0 && this.f2618k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    z.M(this);
                }
                r();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2621n = (int) motionEvent.getY(actionIndex);
                this.f2632y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                H(motionEvent);
                this.f2621n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2632y));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f2625r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2618k.isFinished()) {
                a();
            }
            C((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f2626s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2622o) {
            P(view2);
        } else {
            this.f2624q = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f2622o = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2617j.setEmpty();
        int i10 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i10 = 33;
                        }
                        J(i10);
                        return false;
                    } else if (keyCode == 92) {
                        return v(33);
                    } else {
                        if (keyCode == 93) {
                            return v(130);
                        }
                        if (keyCode == 122) {
                            J(33);
                            return false;
                        } else if (keyCode != 123) {
                            return false;
                        } else {
                            J(130);
                            return false;
                        }
                    }
                } else if (keyEvent.isAltPressed()) {
                    return v(130);
                } else {
                    return b(130);
                }
            } else if (keyEvent.isAltPressed()) {
                return v(33);
            } else {
                return b(33);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e10 = e(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e11 = e(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e10 != getScrollX() || e11 != getScrollY()) {
                super.scrollTo(e10, e11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2627t) {
            this.f2627t = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.F.n(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.H = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2628u = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return W(i10, 0);
    }

    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i10) {
        if (getChildCount() > 0) {
            this.f2618k.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            M(true);
        }
    }

    public boolean v(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2617j;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2617j.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2617j;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2617j;
        return N(i10, rect3.top, rect3.bottom);
    }

    public boolean x(int i10) {
        return this.F.l(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2617j = new Rect();
        this.f2622o = true;
        this.f2623p = false;
        this.f2624q = null;
        this.f2625r = false;
        this.f2628u = true;
        this.f2632y = -1;
        this.f2633z = new int[2];
        this.A = new int[2];
        this.f2619l = d.a(context, attributeSet);
        this.f2620m = d.a(context, attributeSet);
        this.f2615h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.E = new s(this);
        this.F = new o(this);
        setNestedScrollingEnabled(true);
        z.S(this, J);
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
