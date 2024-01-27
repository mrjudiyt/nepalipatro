package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v.d;
import v.e;
import v.f;
import v.g;
import v.j;
import v.k;
import w.b;

public class ConstraintLayout extends ViewGroup {
    private static l E;
    private SparseArray<e> A = new SparseArray<>();
    c B = new c(this);
    private int C = 0;
    private int D = 0;

    /* renamed from: h  reason: collision with root package name */
    SparseArray<View> f1601h = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<c> f1602i = new ArrayList<>(4);

    /* renamed from: j  reason: collision with root package name */
    protected f f1603j = new f();

    /* renamed from: k  reason: collision with root package name */
    private int f1604k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f1605l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f1606m = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: n  reason: collision with root package name */
    private int f1607n = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f1608o = true;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f1609p = 257;

    /* renamed from: q  reason: collision with root package name */
    private e f1610q = null;

    /* renamed from: r  reason: collision with root package name */
    protected d f1611r = null;

    /* renamed from: s  reason: collision with root package name */
    private int f1612s = -1;

    /* renamed from: t  reason: collision with root package name */
    private HashMap<String, Integer> f1613t = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    private int f1614u = -1;

    /* renamed from: v  reason: collision with root package name */
    private int f1615v = -1;

    /* renamed from: w  reason: collision with root package name */
    int f1616w = -1;

    /* renamed from: x  reason: collision with root package name */
    int f1617x = -1;

    /* renamed from: y  reason: collision with root package name */
    int f1618y = 0;

    /* renamed from: z  reason: collision with root package name */
    int f1619z = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                v.e$b[] r0 = v.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1620a = r0
                v.e$b r1 = v.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.e$b r1 = v.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.e$b r1 = v.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1620a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.e$b r1 = v.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements b.C0206b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f1671a;

        /* renamed from: b  reason: collision with root package name */
        int f1672b;

        /* renamed from: c  reason: collision with root package name */
        int f1673c;

        /* renamed from: d  reason: collision with root package name */
        int f1674d;

        /* renamed from: e  reason: collision with root package name */
        int f1675e;

        /* renamed from: f  reason: collision with root package name */
        int f1676f;

        /* renamed from: g  reason: collision with root package name */
        int f1677g;

        public c(ConstraintLayout constraintLayout) {
            this.f1671a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f1671a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f1671a.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f1671a);
                }
            }
            int size = this.f1671a.f1602i.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((c) this.f1671a.f1602i.get(i11)).p(this.f1671a);
                }
            }
        }

        @SuppressLint({"WrongCall"})
        public final void b(e eVar, b.a aVar) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            e eVar2 = eVar;
            b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.T() == 8 && !eVar.h0()) {
                    aVar2.f12491e = 0;
                    aVar2.f12492f = 0;
                    aVar2.f12493g = 0;
                } else if (eVar.I() != null) {
                    e.b bVar = aVar2.f12487a;
                    e.b bVar2 = aVar2.f12488b;
                    int i17 = aVar2.f12489c;
                    int i18 = aVar2.f12490d;
                    int i19 = this.f1672b + this.f1673c;
                    int i20 = this.f1674d;
                    View view = (View) eVar.q();
                    int[] iArr = a.f1620a;
                    int i21 = iArr[bVar.ordinal()];
                    if (i21 == 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                    } else if (i21 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f1676f, i20, -2);
                    } else if (i21 == 3) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f1676f, i20 + eVar.z(), -1);
                    } else if (i21 != 4) {
                        i10 = 0;
                    } else {
                        i10 = ViewGroup.getChildMeasureSpec(this.f1676f, i20, -2);
                        boolean z10 = eVar2.f12187w == 1;
                        int i22 = aVar2.f12496j;
                        if (i22 == b.a.f12485l || i22 == b.a.f12486m) {
                            if (aVar2.f12496j == b.a.f12486m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.l0()) {
                                i10 = View.MeasureSpec.makeMeasureSpec(eVar.U(), 1073741824);
                            }
                        }
                    }
                    int i23 = iArr[bVar2.ordinal()];
                    if (i23 == 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    } else if (i23 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f1677g, i19, -2);
                    } else if (i23 == 3) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f1677g, i19 + eVar.S(), -1);
                    } else if (i23 != 4) {
                        i11 = 0;
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f1677g, i19, -2);
                        boolean z11 = eVar2.f12189x == 1;
                        int i24 = aVar2.f12496j;
                        if (i24 == b.a.f12485l || i24 == b.a.f12486m) {
                            if (aVar2.f12496j == b.a.f12486m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.U())) || (view instanceof i) || eVar.m0()) {
                                i11 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                            }
                        }
                    }
                    f fVar = (f) eVar.I();
                    if (fVar != null && j.b(ConstraintLayout.this.f1609p, UserVerificationMethods.USER_VERIFY_HANDPRINT) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                        if (d(eVar.A(), i10, eVar.U()) && d(eVar.B(), i11, eVar.v())) {
                            aVar2.f12491e = eVar.U();
                            aVar2.f12492f = eVar.v();
                            aVar2.f12493g = eVar.n();
                            return;
                        }
                    }
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    boolean z12 = bVar == bVar3;
                    boolean z13 = bVar2 == bVar3;
                    e.b bVar4 = e.b.MATCH_PARENT;
                    boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                    boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                    boolean z16 = z12 && eVar2.f12150d0 > 0.0f;
                    boolean z17 = z13 && eVar2.f12150d0 > 0.0f;
                    if (view != null) {
                        b bVar5 = (b) view.getLayoutParams();
                        int i25 = aVar2.f12496j;
                        if (i25 == b.a.f12485l || i25 == b.a.f12486m || !z12 || eVar2.f12187w != 0 || !z13 || eVar2.f12189x != 0) {
                            if (!(view instanceof m) || !(eVar2 instanceof k)) {
                                view.measure(i10, i11);
                            } else {
                                ((m) view).t((k) eVar2, i10, i11);
                            }
                            eVar2.S0(i10, i11);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = view.getBaseline();
                            int i26 = eVar2.f12193z;
                            i12 = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
                            int i27 = eVar2.A;
                            if (i27 > 0) {
                                i12 = Math.min(i27, i12);
                            }
                            int i28 = eVar2.C;
                            if (i28 > 0) {
                                i14 = Math.max(i28, measuredHeight);
                                i16 = i10;
                            } else {
                                i16 = i10;
                                i14 = measuredHeight;
                            }
                            int i29 = eVar2.D;
                            if (i29 > 0) {
                                i14 = Math.min(i29, i14);
                            }
                            if (!j.b(ConstraintLayout.this.f1609p, 1)) {
                                if (z16 && z14) {
                                    i12 = (int) ((((float) i14) * eVar2.f12150d0) + 0.5f);
                                } else if (z17 && z15) {
                                    i14 = (int) ((((float) i12) / eVar2.f12150d0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i12 && measuredHeight == i14)) {
                                int makeMeasureSpec = measuredWidth != i12 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : i16;
                                if (measuredHeight != i14) {
                                    i11 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i11);
                                eVar2.S0(makeMeasureSpec, i11);
                                i12 = view.getMeasuredWidth();
                                i14 = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                            }
                            i15 = -1;
                        } else {
                            i15 = -1;
                            i14 = 0;
                            i13 = 0;
                            i12 = 0;
                        }
                        boolean z18 = i13 != i15;
                        aVar2.f12495i = (i12 == aVar2.f12489c && i14 == aVar2.f12490d) ? false : true;
                        if (bVar5.f1634g0) {
                            z18 = true;
                        }
                        if (!(!z18 || i13 == -1 || eVar.n() == i13)) {
                            aVar2.f12495i = true;
                        }
                        aVar2.f12491e = i12;
                        aVar2.f12492f = i14;
                        aVar2.f12494h = z18;
                        aVar2.f12493g = i13;
                    }
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f1672b = i12;
            this.f1673c = i13;
            this.f1674d = i14;
            this.f1675e = i15;
            this.f1676f = i10;
            this.f1677g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(attributeSet, 0, 0);
    }

    private final e g(int i10) {
        if (i10 == 0) {
            return this.f1603j;
        }
        View view = this.f1601h.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1603j;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1664v0;
    }

    private int getPaddingWidth() {
        int i10 = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i10 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i10 > 0 ? i10 : max;
    }

    public static l getSharedValues() {
        if (E == null) {
            E = new l();
        }
        return E;
    }

    private void p(AttributeSet attributeSet, int i10, int i11) {
        this.f1603j.y0(this);
        this.f1603j.R1(this.B);
        this.f1601h.put(getId(), this);
        this.f1610q = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1959n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == k.f2004s1) {
                    this.f1604k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1604k);
                } else if (index == k.f2013t1) {
                    this.f1605l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1605l);
                } else if (index == k.f1986q1) {
                    this.f1606m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1606m);
                } else if (index == k.f1995r1) {
                    this.f1607n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1607n);
                } else if (index == k.H2) {
                    this.f1609p = obtainStyledAttributes.getInt(index, this.f1609p);
                } else if (index == k.C1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1611r = null;
                        }
                    }
                } else if (index == k.f2058y1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f1610q = eVar;
                        eVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1610q = null;
                    }
                    this.f1612s = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1603j.S1(this.f1609p);
    }

    private void r() {
        this.f1608o = true;
        this.f1614u = -1;
        this.f1615v = -1;
        this.f1616w = -1;
        this.f1617x = -1;
        this.f1618y = 0;
        this.f1619z = 0;
    }

    private void v() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e i11 = i(getChildAt(i10));
            if (i11 != null) {
                i11.r0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1612s != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f1612s && (childAt2 instanceof f)) {
                    this.f1610q = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f1610q;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f1603j.r1();
        int size = this.f1602i.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f1602i.get(i14).r(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.A.clear();
        this.A.put(0, this.f1603j);
        this.A.put(getId(), this.f1603j);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.A.put(childAt4.getId(), i(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            e i18 = i(childAt5);
            if (i18 != null) {
                this.f1603j.b(i18);
                c(isInEditMode, childAt5, i18, (b) childAt5.getLayoutParams(), this.A);
            }
        }
    }

    private void y(e eVar, b bVar, SparseArray<e> sparseArray, int i10, d.b bVar2) {
        View view = this.f1601h.get(i10);
        e eVar2 = sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f1634g0 = true;
            d.b bVar3 = d.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.f1634g0 = true;
                bVar4.f1664v0.H0(true);
            }
            eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
            eVar.H0(true);
            eVar.m(d.b.TOP).p();
            eVar.m(d.b.BOTTOM).p();
        }
    }

    private boolean z() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            v();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void c(boolean z10, View view, e eVar, b bVar, SparseArray<e> sparseArray) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        View view2 = view;
        e eVar6 = eVar;
        b bVar2 = bVar;
        SparseArray<e> sparseArray2 = sparseArray;
        bVar.a();
        bVar2.f1666w0 = false;
        eVar6.g1(view.getVisibility());
        if (bVar2.f1640j0) {
            eVar6.Q0(true);
            eVar6.g1(8);
        }
        eVar6.y0(view2);
        if (view2 instanceof c) {
            ((c) view2).n(eVar6, this.f1603j.L1());
        }
        if (bVar2.f1636h0) {
            g gVar = (g) eVar6;
            int i14 = bVar2.f1658s0;
            int i15 = bVar2.f1660t0;
            float f11 = bVar2.f1662u0;
            if (Build.VERSION.SDK_INT < 17) {
                i14 = bVar2.f1621a;
                i15 = bVar2.f1623b;
                f11 = bVar2.f1625c;
            }
            if (f11 != -1.0f) {
                gVar.w1(f11);
            } else if (i14 != -1) {
                gVar.u1(i14);
            } else if (i15 != -1) {
                gVar.v1(i15);
            }
        } else {
            int i16 = bVar2.f1644l0;
            int i17 = bVar2.f1646m0;
            int i18 = bVar2.f1648n0;
            int i19 = bVar2.f1650o0;
            int i20 = bVar2.f1652p0;
            int i21 = bVar2.f1654q0;
            float f12 = bVar2.f1656r0;
            if (Build.VERSION.SDK_INT < 17) {
                i16 = bVar2.f1629e;
                int i22 = bVar2.f1631f;
                int i23 = bVar2.f1633g;
                int i24 = bVar2.f1635h;
                int i25 = bVar2.f1665w;
                int i26 = bVar2.f1668y;
                float f13 = bVar2.G;
                if (i16 == -1 && i22 == -1) {
                    int i27 = bVar2.f1659t;
                    if (i27 != -1) {
                        i16 = i27;
                    } else {
                        int i28 = bVar2.f1657s;
                        if (i28 != -1) {
                            i22 = i28;
                        }
                    }
                }
                if (i23 == -1 && i24 == -1) {
                    i12 = bVar2.f1661u;
                    if (i12 == -1) {
                        int i29 = bVar2.f1663v;
                        if (i29 != -1) {
                            i10 = i26;
                            f10 = f13;
                            i20 = i25;
                            i11 = i29;
                            i17 = i22;
                            i12 = i23;
                        }
                    }
                    i10 = i26;
                    f10 = f13;
                    i20 = i25;
                    i11 = i24;
                    i17 = i22;
                }
                i12 = i23;
                i10 = i26;
                f10 = f13;
                i20 = i25;
                i11 = i24;
                i17 = i22;
            } else {
                i10 = i21;
                f10 = f12;
                i12 = i18;
                i11 = i19;
            }
            int i30 = bVar2.f1651p;
            if (i30 != -1) {
                e eVar7 = sparseArray2.get(i30);
                if (eVar7 != null) {
                    eVar6.j(eVar7, bVar2.f1655r, bVar2.f1653q);
                }
            } else {
                if (i16 != -1) {
                    e eVar8 = sparseArray2.get(i16);
                    if (eVar8 != null) {
                        d.b bVar3 = d.b.LEFT;
                        eVar.c0(bVar3, eVar8, bVar3, bVar2.leftMargin, i20);
                    }
                } else if (!(i17 == -1 || (eVar5 = sparseArray2.get(i17)) == null)) {
                    eVar.c0(d.b.LEFT, eVar5, d.b.RIGHT, bVar2.leftMargin, i20);
                }
                if (i12 != -1) {
                    e eVar9 = sparseArray2.get(i12);
                    if (eVar9 != null) {
                        eVar.c0(d.b.RIGHT, eVar9, d.b.LEFT, bVar2.rightMargin, i10);
                    }
                } else if (!(i11 == -1 || (eVar4 = sparseArray2.get(i11)) == null)) {
                    d.b bVar4 = d.b.RIGHT;
                    eVar.c0(bVar4, eVar4, bVar4, bVar2.rightMargin, i10);
                }
                int i31 = bVar2.f1637i;
                if (i31 != -1) {
                    e eVar10 = sparseArray2.get(i31);
                    if (eVar10 != null) {
                        d.b bVar5 = d.b.TOP;
                        eVar.c0(bVar5, eVar10, bVar5, bVar2.topMargin, bVar2.f1667x);
                    }
                } else {
                    int i32 = bVar2.f1639j;
                    if (!(i32 == -1 || (eVar3 = sparseArray2.get(i32)) == null)) {
                        eVar.c0(d.b.TOP, eVar3, d.b.BOTTOM, bVar2.topMargin, bVar2.f1667x);
                    }
                }
                int i33 = bVar2.f1641k;
                if (i33 != -1) {
                    e eVar11 = sparseArray2.get(i33);
                    if (eVar11 != null) {
                        eVar.c0(d.b.BOTTOM, eVar11, d.b.TOP, bVar2.bottomMargin, bVar2.f1669z);
                    }
                } else {
                    int i34 = bVar2.f1643l;
                    if (!(i34 == -1 || (eVar2 = sparseArray2.get(i34)) == null)) {
                        d.b bVar6 = d.b.BOTTOM;
                        eVar.c0(bVar6, eVar2, bVar6, bVar2.bottomMargin, bVar2.f1669z);
                    }
                }
                int i35 = bVar2.f1645m;
                if (i35 != -1) {
                    y(eVar, bVar, sparseArray, i35, d.b.BASELINE);
                } else {
                    int i36 = bVar2.f1647n;
                    if (i36 != -1) {
                        y(eVar, bVar, sparseArray, i36, d.b.TOP);
                    } else {
                        int i37 = bVar2.f1649o;
                        if (i37 != -1) {
                            y(eVar, bVar, sparseArray, i37, d.b.BOTTOM);
                        }
                    }
                }
                if (f10 >= 0.0f) {
                    eVar6.J0(f10);
                }
                float f14 = bVar2.H;
                if (f14 >= 0.0f) {
                    eVar6.a1(f14);
                }
            }
            if (z10 && !((i13 = bVar2.X) == -1 && bVar2.Y == -1)) {
                eVar6.Y0(i13, bVar2.Y);
            }
            if (bVar2.f1630e0) {
                eVar6.M0(e.b.FIXED);
                eVar6.h1(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.M0(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f1622a0) {
                    eVar6.M0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.M0(e.b.MATCH_PARENT);
                }
                eVar6.m(d.b.LEFT).f12129g = bVar2.leftMargin;
                eVar6.m(d.b.RIGHT).f12129g = bVar2.rightMargin;
            } else {
                eVar6.M0(e.b.MATCH_CONSTRAINT);
                eVar6.h1(0);
            }
            if (bVar2.f1632f0) {
                eVar6.d1(e.b.FIXED);
                eVar6.I0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.d1(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f1624b0) {
                    eVar6.d1(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.d1(e.b.MATCH_PARENT);
                }
                eVar6.m(d.b.TOP).f12129g = bVar2.topMargin;
                eVar6.m(d.b.BOTTOM).f12129g = bVar2.bottomMargin;
            } else {
                eVar6.d1(e.b.MATCH_CONSTRAINT);
                eVar6.I0(0);
            }
            eVar6.A0(bVar2.I);
            eVar6.O0(bVar2.L);
            eVar6.f1(bVar2.M);
            eVar6.K0(bVar2.N);
            eVar6.b1(bVar2.O);
            eVar6.i1(bVar2.f1628d0);
            eVar6.N0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
            eVar6.e1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.f1602i;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1602i.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1613t;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1613t.get(str);
    }

    public void forceLayout() {
        r();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1607n;
    }

    public int getMaxWidth() {
        return this.f1606m;
    }

    public int getMinHeight() {
        return this.f1605l;
    }

    public int getMinWidth() {
        return this.f1604k;
    }

    public int getOptimizationLevel() {
        return this.f1603j.G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1603j.f12171o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1603j.f12171o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1603j.f12171o = "parent";
            }
        }
        if (this.f1603j.r() == null) {
            f fVar = this.f1603j;
            fVar.z0(fVar.f12171o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.f1603j.r());
        }
        Iterator<e> it = this.f1603j.o1().iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f12171o == null && (id = view.getId()) != -1) {
                    next.f12171o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.r() == null) {
                    next.z0(next.f12171o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(next.r());
                }
            }
        }
        this.f1603j.M(sb);
        return sb.toString();
    }

    public View h(int i10) {
        return this.f1601h.get(i10);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f1603j;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1664v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1664v0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f1664v0;
            if ((childAt.getVisibility() != 8 || bVar.f1636h0 || bVar.f1638i0 || bVar.f1642k0 || isInEditMode) && !bVar.f1640j0) {
                int V = eVar.V();
                int W = eVar.W();
                int U = eVar.U() + V;
                int v10 = eVar.v() + W;
                childAt.layout(V, W, U, v10);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v10);
                }
            }
        }
        int size = this.f1602i.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1602i.get(i15).o(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.C == i10) {
            int i12 = this.D;
        }
        if (!this.f1608o) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f1608o = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z10 = this.f1608o;
        this.C = i10;
        this.D = i11;
        this.f1603j.U1(q());
        if (this.f1608o) {
            this.f1608o = false;
            if (z()) {
                this.f1603j.W1();
            }
        }
        u(this.f1603j, this.f1609p, i10, i11);
        t(i10, i11, this.f1603j.U(), this.f1603j.v(), this.f1603j.M1(), this.f1603j.K1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e i10 = i(view);
        if ((view instanceof h) && !(i10 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f1664v0 = gVar;
            bVar.f1636h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.s();
            ((b) view.getLayoutParams()).f1638i0 = true;
            if (!this.f1602i.contains(cVar)) {
                this.f1602i.add(cVar);
            }
        }
        this.f1601h.put(view.getId(), view);
        this.f1608o = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1601h.remove(view.getId());
        this.f1603j.q1(i(view));
        this.f1602i.remove(view);
        this.f1608o = true;
    }

    /* access modifiers changed from: protected */
    public boolean q() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        r();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void s(int i10) {
        this.f1611r = new d(getContext(), this, i10);
    }

    public void setConstraintSet(e eVar) {
        this.f1610q = eVar;
    }

    public void setId(int i10) {
        this.f1601h.remove(getId());
        super.setId(i10);
        this.f1601h.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f1607n) {
            this.f1607n = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f1606m) {
            this.f1606m = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f1605l) {
            this.f1605l = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f1604k) {
            this.f1604k = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f1611r;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1609p = i10;
        this.f1603j.S1(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void t(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.B;
        int i14 = cVar.f1675e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f1674d, i10, 0);
        int min = Math.min(this.f1606m, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1607n, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1614u = min;
        this.f1615v = min2;
    }

    /* access modifiers changed from: protected */
    public void u(f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.B.c(i11, i12, max, max2, paddingWidth, i14);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (q()) {
                max3 = max4;
            }
            i13 = max3;
        } else {
            i13 = Math.max(0, getPaddingLeft());
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        x(fVar, mode, i15, mode2, i16);
        fVar.N1(i10, mode, i15, mode2, i16, this.f1614u, this.f1615v, i13, max);
    }

    public void w(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1613t == null) {
                this.f1613t = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1613t.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void x(f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.B;
        int i14 = cVar.f1675e;
        int i15 = cVar.f1674d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.f1604k);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.f1606m - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1604k);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.f1605l);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.f1607n - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1605l);
            }
        }
        if (!(i11 == fVar.U() && i13 == fVar.v())) {
            fVar.J1();
        }
        fVar.j1(0);
        fVar.k1(0);
        fVar.U0(this.f1606m - i15);
        fVar.T0(this.f1607n - i14);
        fVar.X0(0);
        fVar.W0(0);
        fVar.M0(bVar);
        fVar.h1(i11);
        fVar.d1(bVar2);
        fVar.I0(i13);
        fVar.X0(this.f1604k - i15);
        fVar.W0(this.f1605l - i14);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        boolean E = true;
        boolean F = true;
        public float G = 0.5f;
        public float H = 0.5f;
        public String I = null;
        float J = 0.0f;
        int K = 1;
        public float L = -1.0f;
        public float M = -1.0f;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public float V = 1.0f;
        public float W = 1.0f;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f1621a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1622a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1623b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1624b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f1625c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f1626c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1627d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f1628d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1629e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f1630e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f1631f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f1632f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f1633g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f1634g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f1635h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f1636h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f1637i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f1638i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f1639j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f1640j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f1641k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f1642k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1643l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f1644l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1645m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f1646m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1647n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f1648n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1649o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f1650o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1651p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f1652p0 = Integer.MIN_VALUE;

        /* renamed from: q  reason: collision with root package name */
        public int f1653q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f1654q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f1655r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f1656r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f1657s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f1658s0;

        /* renamed from: t  reason: collision with root package name */
        public int f1659t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f1660t0;

        /* renamed from: u  reason: collision with root package name */
        public int f1661u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f1662u0;

        /* renamed from: v  reason: collision with root package name */
        public int f1663v = -1;

        /* renamed from: v0  reason: collision with root package name */
        e f1664v0 = new e();

        /* renamed from: w  reason: collision with root package name */
        public int f1665w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f1666w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f1667x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f1668y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1669z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1670a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1670a = sparseIntArray;
                sparseIntArray.append(k.f2005s2, 64);
                sparseIntArray.append(k.V1, 65);
                sparseIntArray.append(k.f1879e2, 8);
                sparseIntArray.append(k.f1888f2, 9);
                sparseIntArray.append(k.f1906h2, 10);
                sparseIntArray.append(k.f1915i2, 11);
                sparseIntArray.append(k.f1969o2, 12);
                sparseIntArray.append(k.f1960n2, 13);
                sparseIntArray.append(k.L1, 14);
                sparseIntArray.append(k.K1, 15);
                sparseIntArray.append(k.G1, 16);
                sparseIntArray.append(k.I1, 52);
                sparseIntArray.append(k.H1, 53);
                sparseIntArray.append(k.M1, 2);
                sparseIntArray.append(k.O1, 3);
                sparseIntArray.append(k.N1, 4);
                sparseIntArray.append(k.f2050x2, 49);
                sparseIntArray.append(k.f2059y2, 50);
                sparseIntArray.append(k.S1, 5);
                sparseIntArray.append(k.T1, 6);
                sparseIntArray.append(k.U1, 7);
                sparseIntArray.append(k.B1, 67);
                sparseIntArray.append(k.f1968o1, 1);
                sparseIntArray.append(k.f1924j2, 17);
                sparseIntArray.append(k.f1933k2, 18);
                sparseIntArray.append(k.R1, 19);
                sparseIntArray.append(k.Q1, 20);
                sparseIntArray.append(k.C2, 21);
                sparseIntArray.append(k.F2, 22);
                sparseIntArray.append(k.D2, 23);
                sparseIntArray.append(k.A2, 24);
                sparseIntArray.append(k.E2, 25);
                sparseIntArray.append(k.B2, 26);
                sparseIntArray.append(k.f2068z2, 55);
                sparseIntArray.append(k.G2, 54);
                sparseIntArray.append(k.f1843a2, 29);
                sparseIntArray.append(k.f1978p2, 30);
                sparseIntArray.append(k.P1, 44);
                sparseIntArray.append(k.f1861c2, 45);
                sparseIntArray.append(k.f1996r2, 46);
                sparseIntArray.append(k.f1852b2, 47);
                sparseIntArray.append(k.f1987q2, 48);
                sparseIntArray.append(k.E1, 27);
                sparseIntArray.append(k.D1, 28);
                sparseIntArray.append(k.f2014t2, 31);
                sparseIntArray.append(k.W1, 32);
                sparseIntArray.append(k.f2032v2, 33);
                sparseIntArray.append(k.f2023u2, 34);
                sparseIntArray.append(k.f2041w2, 35);
                sparseIntArray.append(k.Y1, 36);
                sparseIntArray.append(k.X1, 37);
                sparseIntArray.append(k.Z1, 38);
                sparseIntArray.append(k.f1870d2, 39);
                sparseIntArray.append(k.f1951m2, 40);
                sparseIntArray.append(k.f1897g2, 41);
                sparseIntArray.append(k.J1, 42);
                sparseIntArray.append(k.F1, 43);
                sparseIntArray.append(k.f1942l2, 51);
                sparseIntArray.append(k.I2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1959n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f1670a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1651p);
                        this.f1651p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1651p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1653q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1653q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1655r) % 360.0f;
                        this.f1655r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1655r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1621a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1621a);
                        break;
                    case 6:
                        this.f1623b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1623b);
                        break;
                    case 7:
                        this.f1625c = obtainStyledAttributes.getFloat(index, this.f1625c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1629e);
                        this.f1629e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1629e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1631f);
                        this.f1631f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1631f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1633g);
                        this.f1633g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1633g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1635h);
                        this.f1635h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1635h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1637i);
                        this.f1637i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1637i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1639j);
                        this.f1639j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1639j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1641k);
                        this.f1641k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1641k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1643l);
                        this.f1643l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1643l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1645m);
                        this.f1645m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1645m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1657s);
                        this.f1657s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1657s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1659t);
                        this.f1659t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1659t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1661u);
                        this.f1661u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1661u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1663v);
                        this.f1663v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1663v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1665w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1665w);
                        break;
                    case 22:
                        this.f1667x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1667x);
                        break;
                    case 23:
                        this.f1668y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1668y);
                        break;
                    case 24:
                        this.f1669z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1669z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f1622a0 = obtainStyledAttributes.getBoolean(index, this.f1622a0);
                        break;
                    case 28:
                        this.f1624b0 = obtainStyledAttributes.getBoolean(index, this.f1624b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        this.P = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.Q = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) != -2) {
                                break;
                            } else {
                                this.R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) != -2) {
                                break;
                            } else {
                                this.T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) != -2) {
                                break;
                            } else {
                                this.S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) != -2) {
                                break;
                            } else {
                                this.U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                e.o(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1626c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1647n);
                                this.f1647n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1647n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1649o);
                                this.f1649o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1649o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        e.m(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.m(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1628d0 = obtainStyledAttributes.getInt(index, this.f1628d0);
                                        break;
                                    case 67:
                                        this.f1627d = obtainStyledAttributes.getBoolean(index, this.f1627d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f1636h0 = false;
            this.f1630e0 = true;
            this.f1632f0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.f1622a0) {
                this.f1630e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.f1624b0) {
                this.f1632f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1630e0 = false;
                if (i10 == 0 && this.P == 1) {
                    this.width = -2;
                    this.f1622a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1632f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.f1624b0 = true;
                }
            }
            if (this.f1625c != -1.0f || this.f1621a != -1 || this.f1623b != -1) {
                this.f1636h0 = true;
                this.f1630e0 = true;
                this.f1632f0 = true;
                if (!(this.f1664v0 instanceof g)) {
                    this.f1664v0 = new g();
                }
                ((g) this.f1664v0).x1(this.Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                if (r4 != r11) goto L_0x0017
                r11 = 1
                goto L_0x0018
            L_0x0017:
                r11 = 0
            L_0x0018:
                r2 = -1
                r10.f1648n0 = r2
                r10.f1650o0 = r2
                r10.f1644l0 = r2
                r10.f1646m0 = r2
                r10.f1652p0 = r2
                r10.f1654q0 = r2
                int r5 = r10.f1665w
                r10.f1652p0 = r5
                int r5 = r10.f1668y
                r10.f1654q0 = r5
                float r5 = r10.G
                r10.f1656r0 = r5
                int r6 = r10.f1621a
                r10.f1658s0 = r6
                int r7 = r10.f1623b
                r10.f1660t0 = r7
                float r8 = r10.f1625c
                r10.f1662u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x009e
                int r11 = r10.f1657s
                if (r11 == r2) goto L_0x0049
                r10.f1648n0 = r11
            L_0x0047:
                r3 = 1
                goto L_0x0050
            L_0x0049:
                int r11 = r10.f1659t
                if (r11 == r2) goto L_0x0050
                r10.f1650o0 = r11
                goto L_0x0047
            L_0x0050:
                int r11 = r10.f1661u
                if (r11 == r2) goto L_0x0057
                r10.f1646m0 = r11
                r3 = 1
            L_0x0057:
                int r11 = r10.f1663v
                if (r11 == r2) goto L_0x005e
                r10.f1644l0 = r11
                r3 = 1
            L_0x005e:
                int r11 = r10.A
                if (r11 == r9) goto L_0x0064
                r10.f1654q0 = r11
            L_0x0064:
                int r11 = r10.B
                if (r11 == r9) goto L_0x006a
                r10.f1652p0 = r11
            L_0x006a:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r11 - r5
                r10.f1656r0 = r3
            L_0x0072:
                boolean r3 = r10.f1636h0
                if (r3 == 0) goto L_0x00c2
                int r3 = r10.Z
                if (r3 != r4) goto L_0x00c2
                boolean r3 = r10.f1627d
                if (r3 == 0) goto L_0x00c2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x008c
                float r11 = r11 - r8
                r10.f1662u0 = r11
                r10.f1658s0 = r2
                r10.f1660t0 = r2
                goto L_0x00c2
            L_0x008c:
                if (r6 == r2) goto L_0x0095
                r10.f1660t0 = r6
                r10.f1658s0 = r2
                r10.f1662u0 = r3
                goto L_0x00c2
            L_0x0095:
                if (r7 == r2) goto L_0x00c2
                r10.f1658s0 = r7
                r10.f1660t0 = r2
                r10.f1662u0 = r3
                goto L_0x00c2
            L_0x009e:
                int r11 = r10.f1657s
                if (r11 == r2) goto L_0x00a4
                r10.f1646m0 = r11
            L_0x00a4:
                int r11 = r10.f1659t
                if (r11 == r2) goto L_0x00aa
                r10.f1644l0 = r11
            L_0x00aa:
                int r11 = r10.f1661u
                if (r11 == r2) goto L_0x00b0
                r10.f1648n0 = r11
            L_0x00b0:
                int r11 = r10.f1663v
                if (r11 == r2) goto L_0x00b6
                r10.f1650o0 = r11
            L_0x00b6:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00bc
                r10.f1652p0 = r11
            L_0x00bc:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00c2
                r10.f1654q0 = r11
            L_0x00c2:
                int r11 = r10.f1661u
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f1663v
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f1659t
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f1657s
                if (r11 != r2) goto L_0x010c
                int r11 = r10.f1633g
                if (r11 == r2) goto L_0x00e1
                r10.f1648n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ef
                if (r1 <= 0) goto L_0x00ef
                r10.rightMargin = r1
                goto L_0x00ef
            L_0x00e1:
                int r11 = r10.f1635h
                if (r11 == r2) goto L_0x00ef
                r10.f1650o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ef
                if (r1 <= 0) goto L_0x00ef
                r10.rightMargin = r1
            L_0x00ef:
                int r11 = r10.f1629e
                if (r11 == r2) goto L_0x00fe
                r10.f1644l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x010c
                if (r0 <= 0) goto L_0x010c
                r10.leftMargin = r0
                goto L_0x010c
            L_0x00fe:
                int r11 = r10.f1631f
                if (r11 == r2) goto L_0x010c
                r10.f1646m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x010c
                if (r0 <= 0) goto L_0x010c
                r10.leftMargin = r0
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
