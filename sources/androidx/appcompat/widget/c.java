package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
class c extends androidx.appcompat.view.menu.a implements b.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private final SparseBooleanArray E = new SparseBooleanArray();
    e F;
    a G;
    C0013c H;
    private b I;
    final f J = new f();
    int K;

    /* renamed from: r  reason: collision with root package name */
    d f1008r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f1009s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1010t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1011u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1012v;

    /* renamed from: w  reason: collision with root package name */
    private int f1013w;

    /* renamed from: x  reason: collision with root package name */
    private int f1014x;

    /* renamed from: y  reason: collision with root package name */
    private int f1015y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1016z;

    /* compiled from: ActionMenuPresenter */
    private class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, f.a.f8195l);
            if (!((g) mVar.getItem()).l()) {
                View view2 = c.this.f1008r;
                f(view2 == null ? (View) c.this.f678p : view2);
            }
            j(c.this.J);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.G = null;
            cVar.K = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public m.e a() {
            a aVar = c.this.G;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    private class C0013c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private e f1019h;

        public C0013c(e eVar) {
            this.f1019h = eVar;
        }

        public void run() {
            if (c.this.f672j != null) {
                c.this.f672j.d();
            }
            View view = (View) c.this.f678p;
            if (!(view == null || view.getWindowToken() == null || !this.f1019h.m())) {
                c.this.F = this.f1019h;
            }
            c.this.H = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        class a extends f0 {

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ c f1022q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1022q = cVar;
            }

            public m.e b() {
                e eVar = c.this.F;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.K();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.H != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, f.a.f8194k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            w0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, f.a.f8195l);
            h(8388613);
            j(c.this.J);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f672j != null) {
                c.this.f672j.close();
            }
            c.this.F = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class f implements j.a {
        f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof m) {
                eVar.D().e(false);
            }
            j.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(eVar, z10);
            }
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == c.this.f672j) {
                return false;
            }
            c.this.K = ((m) eVar).getItem().getItemId();
            j.a m10 = c.this.m();
            if (m10 != null) {
                return m10.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.f8285c, f.g.f8284b);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f678p;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1008r;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1010t) {
            return this.f1009s;
        }
        return null;
    }

    public boolean B() {
        k kVar;
        C0013c cVar = this.H;
        if (cVar == null || (kVar = this.f678p) == null) {
            e eVar = this.F;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.H = null;
        return true;
    }

    public boolean C() {
        a aVar = this.G;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.H != null || E();
    }

    public boolean E() {
        e eVar = this.F;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1016z) {
            this.f1015y = l.a.b(this.f671i).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f672j;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.C = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f678p = actionMenuView;
        actionMenuView.b(this.f672j);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1008r;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1010t = true;
        this.f1009s = drawable;
    }

    public void J(boolean z10) {
        this.f1011u = z10;
        this.f1012v = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1011u || E() || (eVar = this.f672j) == null || this.f678p == null || this.H != null || eVar.z().isEmpty()) {
            return false;
        }
        C0013c cVar = new C0013c(new e(this.f671i, this.f672j, this.f1008r, true));
        this.H = cVar;
        ((View) this.f678p).post(cVar);
        return true;
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.b(eVar, z10);
    }

    public void c(boolean z10) {
        k kVar;
        super.c(z10);
        ((View) this.f678p).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f672j;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<g> s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s10.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f672j;
        ArrayList<g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1011u && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1008r == null) {
                this.f1008r = new d(this.f670h);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1008r.getParent();
            if (viewGroup != this.f678p) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1008r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f678p;
                actionMenuView.addView(this.f1008r, actionMenuView.D());
            }
        } else {
            d dVar = this.f1008r;
            if (dVar != null && dVar.getParent() == (kVar = this.f678p)) {
                ((ViewGroup) kVar).removeView(this.f1008r);
            }
        }
        ((ActionMenuView) this.f678p).setOverflowReserved(this.f1011u);
    }

    public boolean d() {
        int i10;
        ArrayList<g> arrayList;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f672j;
        View view = null;
        int i14 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.f1015y;
        int i16 = cVar.f1014x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f678p;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            g gVar = arrayList.get(i19);
            if (gVar.o()) {
                i17++;
            } else if (gVar.n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (cVar.C && gVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1011u && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.E;
        sparseBooleanArray.clear();
        if (cVar.A) {
            int i21 = cVar.D;
            i11 = i16 / i21;
            i12 = i21 + ((i16 % i21) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            g gVar2 = arrayList.get(i22);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.A) {
                    i11 -= ActionMenuView.J(n10, i12, i11, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!cVar.A || i11 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View n11 = cVar.n(gVar2, (View) null, viewGroup);
                    if (cVar.A) {
                        int J2 = ActionMenuView.J(n11, i12, i11, makeMeasureSpec, 0);
                        i11 -= J2;
                        if (J2 == 0) {
                            z13 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!cVar.A ? i16 + i23 > 0 : i16 >= 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    int i24 = 0;
                    while (i24 < i22) {
                        g gVar3 = arrayList.get(i24);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i20++;
                            }
                            gVar3.u(false);
                        }
                        i24++;
                    }
                }
                if (z12) {
                    i20--;
                }
                gVar2.u(z12);
            } else {
                i13 = i10;
                gVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    public void h(Context context, androidx.appcompat.view.menu.e eVar) {
        super.h(context, eVar);
        Resources resources = context.getResources();
        l.a b10 = l.a.b(context);
        if (!this.f1012v) {
            this.f1011u = b10.h();
        }
        if (!this.B) {
            this.f1013w = b10.c();
        }
        if (!this.f1016z) {
            this.f1015y = b10.d();
        }
        int i10 = this.f1013w;
        if (this.f1011u) {
            if (this.f1008r == null) {
                d dVar = new d(this.f670h);
                this.f1008r = dVar;
                if (this.f1010t) {
                    dVar.setImageDrawable(this.f1009s);
                    this.f1009s = null;
                    this.f1010t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1008r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1008r.getMeasuredWidth();
        } else {
            this.f1008r = null;
        }
        this.f1014x = i10;
        this.D = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void i(g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f678p);
        if (this.I == null) {
            this.I = new b();
        }
        actionMenuItemView.setPopupCallback(this.I);
    }

    public boolean j(m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.e0() != this.f672j) {
            mVar2 = (m) mVar2.e0();
        }
        View z11 = z(mVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.K = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f671i, mVar, z11);
        this.G = aVar;
        aVar.g(z10);
        this.G.k();
        super.j(mVar);
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1008r) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public k o(ViewGroup viewGroup) {
        k kVar = this.f678p;
        k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    public boolean q(int i10, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
