package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.z;
import androidx.core.widget.h;
import com.google.android.gms.common.api.Api;
import f.j;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class h0 implements m.e {
    private static Method N;
    private static Method O;
    private static Method P;
    private Drawable A;
    private AdapterView.OnItemClickListener B;
    private AdapterView.OnItemSelectedListener C;
    final g D;
    private final f E;
    private final e F;
    private final c G;
    private Runnable H;
    final Handler I;
    private final Rect J;
    private Rect K;
    private boolean L;
    PopupWindow M;

    /* renamed from: h  reason: collision with root package name */
    private Context f1094h;

    /* renamed from: i  reason: collision with root package name */
    private ListAdapter f1095i;

    /* renamed from: j  reason: collision with root package name */
    d0 f1096j;

    /* renamed from: k  reason: collision with root package name */
    private int f1097k;

    /* renamed from: l  reason: collision with root package name */
    private int f1098l;

    /* renamed from: m  reason: collision with root package name */
    private int f1099m;

    /* renamed from: n  reason: collision with root package name */
    private int f1100n;

    /* renamed from: o  reason: collision with root package name */
    private int f1101o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1102p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1103q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1104r;

    /* renamed from: s  reason: collision with root package name */
    private int f1105s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1106t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1107u;

    /* renamed from: v  reason: collision with root package name */
    int f1108v;

    /* renamed from: w  reason: collision with root package name */
    private View f1109w;

    /* renamed from: x  reason: collision with root package name */
    private int f1110x;

    /* renamed from: y  reason: collision with root package name */
    private DataSetObserver f1111y;

    /* renamed from: z  reason: collision with root package name */
    private View f1112z;

    /* compiled from: ListPopupWindow */
    class a implements Runnable {
        a() {
        }

        public void run() {
            View s10 = h0.this.s();
            if (s10 != null && s10.getWindowToken() != null) {
                h0.this.show();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            d0 d0Var;
            if (i10 != -1 && (d0Var = h0.this.f1096j) != null) {
                d0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow */
    private class c implements Runnable {
        c() {
        }

        public void run() {
            h0.this.q();
        }
    }

    /* compiled from: ListPopupWindow */
    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (h0.this.a()) {
                h0.this.show();
            }
        }

        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !h0.this.v() && h0.this.M.getContentView() != null) {
                h0 h0Var = h0.this;
                h0Var.I.removeCallbacks(h0Var.D);
                h0.this.D.run();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.M) != null && popupWindow.isShowing() && x10 >= 0 && x10 < h0.this.M.getWidth() && y10 >= 0 && y10 < h0.this.M.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.I.postDelayed(h0Var.D, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                h0 h0Var2 = h0.this;
                h0Var2.I.removeCallbacks(h0Var2.D);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class g implements Runnable {
        g() {
        }

        public void run() {
            d0 d0Var = h0.this.f1096j;
            if (d0Var != null && z.E(d0Var) && h0.this.f1096j.getCount() > h0.this.f1096j.getChildCount()) {
                int childCount = h0.this.f1096j.getChildCount();
                h0 h0Var = h0.this;
                if (childCount <= h0Var.f1108v) {
                    h0Var.M.setInputMethodMode(2);
                    h0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                N = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                P = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                O = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public h0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void I(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = N;
            if (method != null) {
                try {
                    method.invoke(this.M, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.M.setIsClippedToScreen(z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.d0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int p() {
        /*
            r12 = this;
            androidx.appcompat.widget.d0 r0 = r12.f1096j
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b6
            android.content.Context r0 = r12.f1094h
            androidx.appcompat.widget.h0$a r5 = new androidx.appcompat.widget.h0$a
            r5.<init>()
            r12.H = r5
            boolean r5 = r12.L
            r5 = r5 ^ r3
            androidx.appcompat.widget.d0 r5 = r12.r(r0, r5)
            r12.f1096j = r5
            android.graphics.drawable.Drawable r6 = r12.A
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            android.widget.ListAdapter r6 = r12.f1095i
            r5.setAdapter(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            android.widget.AdapterView$OnItemClickListener r6 = r12.B
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            r5.setFocusable(r3)
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            androidx.appcompat.widget.h0$e r6 = r12.F
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.C
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.d0 r6 = r12.f1096j
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.d0 r5 = r12.f1096j
            android.view.View r6 = r12.f1109w
            if (r6 == 0) goto L_0x00af
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1110x
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1110x
            r0.append(r5)
            goto L_0x008c
        L_0x007f:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008c
        L_0x0086:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008c:
            int r0 = r12.f1098l
            if (r0 < 0) goto L_0x0093
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0095
        L_0x0093:
            r0 = 0
            r5 = 0
        L_0x0095:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            android.widget.PopupWindow r6 = r12.M
            r6.setContentView(r5)
            goto L_0x00d4
        L_0x00b6:
            android.widget.PopupWindow r0 = r12.M
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1109w
            if (r0 == 0) goto L_0x00d3
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            android.widget.PopupWindow r5 = r12.M
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f0
            android.graphics.Rect r6 = r12.J
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.J
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1102p
            if (r7 != 0) goto L_0x00f6
            int r6 = -r6
            r12.f1100n = r6
            goto L_0x00f6
        L_0x00f0:
            android.graphics.Rect r5 = r12.J
            r5.setEmpty()
            r5 = 0
        L_0x00f6:
            android.widget.PopupWindow r6 = r12.M
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r3 = 0
        L_0x0101:
            android.view.View r4 = r12.s()
            int r6 = r12.f1100n
            int r3 = r12.t(r4, r6, r3)
            boolean r4 = r12.f1106t
            if (r4 != 0) goto L_0x0172
            int r4 = r12.f1097k
            if (r4 != r2) goto L_0x0114
            goto L_0x0172
        L_0x0114:
            int r4 = r12.f1098l
            r6 = -2
            if (r4 == r6) goto L_0x013b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0122
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0153
        L_0x0122:
            android.content.Context r2 = r12.f1094h
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.J
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0153
        L_0x013b:
            android.content.Context r2 = r12.f1094h
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.J
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0153:
            r7 = r1
            androidx.appcompat.widget.d0 r6 = r12.f1096j
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0170
            androidx.appcompat.widget.d0 r2 = r12.f1096j
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.d0 r3 = r12.f1096j
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0170:
            int r1 = r1 + r0
            return r1
        L_0x0172:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.p():int");
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.M.getMaxAvailableHeight(view, i10, z10);
        }
        Method method = O;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.M, new Object[]{view, Integer.valueOf(i10), Boolean.valueOf(z10)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.M.getMaxAvailableHeight(view, i10);
    }

    private void x() {
        View view = this.f1109w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1109w);
            }
        }
    }

    public void A(int i10) {
        Drawable background = this.M.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            Rect rect = this.J;
            this.f1098l = rect.left + rect.right + i10;
            return;
        }
        L(i10);
    }

    public void B(int i10) {
        this.f1105s = i10;
    }

    public void C(Rect rect) {
        this.K = rect != null ? new Rect(rect) : null;
    }

    public void D(int i10) {
        this.M.setInputMethodMode(i10);
    }

    public void E(boolean z10) {
        this.L = z10;
        this.M.setFocusable(z10);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.M.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.B = onItemClickListener;
    }

    public void H(boolean z10) {
        this.f1104r = true;
        this.f1103q = z10;
    }

    public void J(int i10) {
        this.f1110x = i10;
    }

    public void K(int i10) {
        d0 d0Var = this.f1096j;
        if (a() && d0Var != null) {
            d0Var.setListSelectionHidden(false);
            d0Var.setSelection(i10);
            if (d0Var.getChoiceMode() != 0) {
                d0Var.setItemChecked(i10, true);
            }
        }
    }

    public void L(int i10) {
        this.f1098l = i10;
    }

    public boolean a() {
        return this.M.isShowing();
    }

    public int b() {
        return this.f1099m;
    }

    public void d(int i10) {
        this.f1099m = i10;
    }

    public void dismiss() {
        this.M.dismiss();
        x();
        this.M.setContentView((View) null);
        this.f1096j = null;
        this.I.removeCallbacks(this.D);
    }

    public Drawable g() {
        return this.M.getBackground();
    }

    public ListView i() {
        return this.f1096j;
    }

    public void j(Drawable drawable) {
        this.M.setBackgroundDrawable(drawable);
    }

    public void k(int i10) {
        this.f1100n = i10;
        this.f1102p = true;
    }

    public int n() {
        if (!this.f1102p) {
            return 0;
        }
        return this.f1100n;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1111y;
        if (dataSetObserver == null) {
            this.f1111y = new d();
        } else {
            ListAdapter listAdapter2 = this.f1095i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1095i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1111y);
        }
        d0 d0Var = this.f1096j;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1095i);
        }
    }

    public void q() {
        d0 d0Var = this.f1096j;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public d0 r(Context context, boolean z10) {
        return new d0(context, z10);
    }

    public View s() {
        return this.f1112z;
    }

    public void show() {
        int p10 = p();
        boolean v10 = v();
        h.b(this.M, this.f1101o);
        boolean z10 = true;
        if (!this.M.isShowing()) {
            int i10 = this.f1098l;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = s().getWidth();
            }
            int i11 = this.f1097k;
            if (i11 == -1) {
                p10 = -1;
            } else if (i11 != -2) {
                p10 = i11;
            }
            this.M.setWidth(i10);
            this.M.setHeight(p10);
            I(true);
            this.M.setOutsideTouchable(!this.f1107u && !this.f1106t);
            this.M.setTouchInterceptor(this.E);
            if (this.f1104r) {
                h.a(this.M, this.f1103q);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = P;
                if (method != null) {
                    try {
                        method.invoke(this.M, new Object[]{this.K});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.M.setEpicenterBounds(this.K);
            }
            h.c(this.M, s(), this.f1099m, this.f1100n, this.f1105s);
            this.f1096j.setSelection(-1);
            if (!this.L || this.f1096j.isInTouchMode()) {
                q();
            }
            if (!this.L) {
                this.I.post(this.G);
            }
        } else if (z.E(s())) {
            int i12 = this.f1098l;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = s().getWidth();
            }
            int i13 = this.f1097k;
            if (i13 == -1) {
                if (!v10) {
                    p10 = -1;
                }
                if (v10) {
                    this.M.setWidth(this.f1098l == -1 ? -1 : 0);
                    this.M.setHeight(0);
                } else {
                    this.M.setWidth(this.f1098l == -1 ? -1 : 0);
                    this.M.setHeight(-1);
                }
            } else if (i13 != -2) {
                p10 = i13;
            }
            PopupWindow popupWindow = this.M;
            if (this.f1107u || this.f1106t) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.M.update(s(), this.f1099m, this.f1100n, i12 < 0 ? -1 : i12, p10 < 0 ? -1 : p10);
        }
    }

    public int u() {
        return this.f1098l;
    }

    public boolean v() {
        return this.M.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.L;
    }

    public void y(View view) {
        this.f1112z = view;
    }

    public void z(int i10) {
        this.M.setAnimationStyle(i10);
    }

    public h0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1097k = -2;
        this.f1098l = -2;
        this.f1101o = 1002;
        this.f1105s = 0;
        this.f1106t = false;
        this.f1107u = false;
        this.f1108v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1110x = 0;
        this.D = new g();
        this.E = new f();
        this.F = new e();
        this.G = new c();
        this.J = new Rect();
        this.f1094h = context;
        this.I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8391o1, i10, i11);
        this.f1099m = obtainStyledAttributes.getDimensionPixelOffset(j.f8396p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f8401q1, 0);
        this.f1100n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1102p = true;
        }
        obtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i10, i11);
        this.M = oVar;
        oVar.setInputMethodMode(1);
    }
}
