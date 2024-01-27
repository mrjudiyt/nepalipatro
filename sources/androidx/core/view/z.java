package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.a;
import androidx.core.view.j0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ViewCompat */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f2590a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static Field f2591b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2592c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2593d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2594e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, String> f2595f;

    /* renamed from: g  reason: collision with root package name */
    private static WeakHashMap<View, f0> f2596g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Field f2597h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f2598i = false;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadLocal<Rect> f2599j;

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f2600k = {y.e.f12864b, y.e.f12866c, y.e.f12886n, y.e.f12897y, y.e.B, y.e.C, y.e.D, y.e.E, y.e.F, y.e.G, y.e.f12868d, y.e.f12870e, y.e.f12872f, y.e.f12874g, y.e.f12876h, y.e.f12878i, y.e.f12880j, y.e.f12882k, y.e.f12884l, y.e.f12885m, y.e.f12887o, y.e.f12888p, y.e.f12889q, y.e.f12890r, y.e.f12891s, y.e.f12892t, y.e.f12893u, y.e.f12894v, y.e.f12895w, y.e.f12896x, y.e.f12898z, y.e.A};

    /* renamed from: l  reason: collision with root package name */
    private static final u f2601l = y.f2589a;

    /* renamed from: m  reason: collision with root package name */
    private static final e f2602m = new e();

    /* compiled from: ViewCompat */
    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(p.d(view));
        }
    }

    /* compiled from: ViewCompat */
    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return p.b(view);
        }
    }

    /* compiled from: ViewCompat */
    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return r.b(view);
        }
    }

    /* compiled from: ViewCompat */
    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(p.c(view));
        }
    }

    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: h  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f2603h = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                z.H(view, z11 ? 16 : 32);
                this.f2603h.put(view, Boolean.valueOf(z11));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f2603h.entrySet()) {
                    a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f2604a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2605b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2606c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2607d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f2606c;
        }

        /* access modifiers changed from: package-private */
        public abstract T c(View view);

        /* access modifiers changed from: package-private */
        public T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T tag = view.getTag(this.f2604a);
            if (this.f2605b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f2604a = i10;
            this.f2605b = cls;
            this.f2607d = i11;
            this.f2606c = i12;
        }
    }

    /* compiled from: ViewCompat */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat */
    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat */
    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat */
    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat */
    private static class m {

        /* compiled from: ViewCompat */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            j0 f2608a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f2609b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ t f2610c;

            a(View view, t tVar) {
                this.f2609b = view;
                this.f2610c = tVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j0 w10 = j0.w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f2609b);
                    if (w10.equals(this.f2608a)) {
                        return this.f2610c.a(view, w10).u();
                    }
                }
                this.f2608a = w10;
                j0 a10 = this.f2610c.a(view, w10);
                if (i10 >= 30) {
                    return a10.u();
                }
                z.P(view);
                return a10.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(y.e.f12875g0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static j0 b(View view, j0 j0Var, Rect rect) {
            WindowInsets u10 = j0Var.u();
            if (u10 != null) {
                return j0.w(view.computeSystemWindowInsets(u10, rect), view);
            }
            rect.setEmpty();
            return j0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static j0 j(View view) {
            return j0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(y.e.f12863a0, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(y.e.f12875g0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat */
    private static class n {
        public static j0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j0 v10 = j0.v(rootWindowInsets);
            v10.s(v10);
            v10.d(view.getRootView());
            return v10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat */
    static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    static class p {
        static void a(View view, s sVar) {
            int i10 = y.e.f12873f0;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(i10);
            if (hVar == null) {
                hVar = new androidx.collection.h();
                view.setTag(i10, hVar);
            }
            Objects.requireNonNull(sVar);
            a0 a0Var = new a0(sVar);
            hVar.put(sVar, a0Var);
            view.addOnUnhandledKeyEventListener(a0Var);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, s sVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(y.e.f12873f0);
            if (hVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(sVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat */
    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat */
    private static class r {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    public interface s {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    static class t {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2611d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2612a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2613b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f2614c = null;

        t() {
        }

        static t a(View view) {
            int i10 = y.e.f12871e0;
            t tVar = (t) view.getTag(i10);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            view.setTag(i10, tVar2);
            return tVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2612a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f2613b == null) {
                this.f2613b = new SparseArray<>();
            }
            return this.f2613b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(y.e.f12873f0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((s) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2612a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2611d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2612a == null) {
                        this.f2612a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2611d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2612a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2612a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2614c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2614c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && z.E(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static boolean A(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean D(View view) {
        Boolean d10 = a().d(view);
        return d10 != null && d10.booleanValue();
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean F(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean G(View view) {
        Boolean d10 = R().d(view);
        return d10 != null && d10.booleanValue();
    }

    static void H(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (k(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(l(view));
                    a0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                }
            }
        }
    }

    public static void I(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
        } else if (i11 >= 21) {
            Rect q10 = q();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                q10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !q10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i10);
            if (z10 && q10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(q10);
            }
        } else {
            c(view, i10);
        }
    }

    public static void J(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
        } else if (i11 >= 21) {
            Rect q10 = q();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                q10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !q10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i10);
            if (z10 && q10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(q10);
            }
        } else {
            d(view, i10);
        }
    }

    public static j0 K(View view, j0 j0Var) {
        WindowInsets u10;
        if (Build.VERSION.SDK_INT >= 21 && (u10 = j0Var.u()) != null) {
            WindowInsets b10 = l.b(view, u10);
            if (!b10.equals(u10)) {
                return j0.w(b10, view);
            }
        }
        return j0Var;
    }

    private static f<CharSequence> L() {
        return new b(y.e.Z, CharSequence.class, 8, 28);
    }

    public static void M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void N(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void O(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    public static void P(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            l.c(view);
        } else if (i10 >= 16) {
            h.p(view);
        }
    }

    public static void Q(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> R() {
        return new a(y.e.f12865b0, Boolean.class, 28);
    }

    public static void S(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (i(view) instanceof a.C0038a)) {
            aVar = new a();
        }
        a0(view);
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void T(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void U(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void V(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.r(view, mode);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background != null && z10) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    h.q(view, background);
                }
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void W(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    public static void X(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f10);
        }
    }

    public static void Y(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z10);
        }
    }

    public static void Z(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            h.s(view, i10);
        } else if (i11 >= 16) {
            if (i10 == 4) {
                i10 = 2;
            }
            h.s(view, i10);
        }
    }

    private static f<Boolean> a() {
        return new d(y.e.Y, Boolean.class, 28);
    }

    private static void a0(View view) {
        if (r(view) == 0) {
            Z(view, 1);
        }
    }

    public static f0 b(View view) {
        if (f2596g == null) {
            f2596g = new WeakHashMap<>();
        }
        f0 f0Var = f2596g.get(view);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(view);
        f2596g.put(view, f0Var2);
        return f0Var2;
    }

    public static void b0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m(view, i10);
        }
    }

    private static void c(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            h0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                h0((View) parent);
            }
        }
    }

    public static void c0(View view, t tVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, tVar);
        }
    }

    private static void d(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            h0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                h0((View) parent);
            }
        }
    }

    public static void d0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static j0 e(View view, j0 j0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, j0Var, rect) : j0Var;
    }

    public static void e0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (f2595f == null) {
            f2595f = new WeakHashMap<>();
        }
        f2595f.put(view, str);
    }

    public static j0 f(View view, j0 j0Var) {
        WindowInsets u10;
        if (Build.VERSION.SDK_INT >= 21 && (u10 = j0Var.u()) != null) {
            WindowInsets a10 = l.a(view, u10);
            if (!a10.equals(u10)) {
                return j0.w(a10, view);
            }
        }
        return j0Var;
    }

    private static f<CharSequence> f0() {
        return new c(y.e.f12867c0, CharSequence.class, 64, 30);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).b(view, keyEvent);
    }

    public static void g0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof n) {
            ((n) view).stopNestedScroll();
        }
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).f(keyEvent);
    }

    private static void h0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    private static View.AccessibilityDelegate i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.a(view);
        }
        return j(view);
    }

    private static View.AccessibilityDelegate j(View view) {
        if (f2598i) {
            return null;
        }
        if (f2597h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2597h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2598i = true;
                return null;
            }
        }
        try {
            Object obj = f2597h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2598i = true;
            return null;
        }
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    public static CharSequence l(View view) {
        return L().d(view);
    }

    public static ColorStateList m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static Rect o(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static Display p(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.b(view);
        }
        if (E(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    private static Rect q() {
        if (f2599j == null) {
            f2599j = new ThreadLocal<>();
        }
        Rect rect = f2599j.get();
        if (rect == null) {
            rect = new Rect();
            f2599j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.c(view);
        }
        return 0;
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static int u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f2594e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2593d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2594e = true;
        }
        Field field = f2593d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f2592c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2591b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2592c = true;
        }
        Field field = f2591b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static j0 w(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.a(view);
        }
        if (i10 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static CharSequence x(View view) {
        return f0().d(view);
    }

    public static String y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f2595f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }
}
