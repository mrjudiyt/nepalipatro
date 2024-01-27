package g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.n0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.z;
import f.f;
import f.j;
import g.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.b;
import l.g;
import l.h;

/* compiled from: WindowDecorActionBar */
public class k extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    final g0 B = new a();
    final g0 C = new b();
    final i0 D = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f8642a;

    /* renamed from: b  reason: collision with root package name */
    private Context f8643b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f8644c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f8645d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f8646e;

    /* renamed from: f  reason: collision with root package name */
    b0 f8647f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f8648g;

    /* renamed from: h  reason: collision with root package name */
    View f8649h;

    /* renamed from: i  reason: collision with root package name */
    n0 f8650i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f8651j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f8652k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8653l;

    /* renamed from: m  reason: collision with root package name */
    d f8654m;

    /* renamed from: n  reason: collision with root package name */
    l.b f8655n;

    /* renamed from: o  reason: collision with root package name */
    b.a f8656o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8657p;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f8658q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f8659r;

    /* renamed from: s  reason: collision with root package name */
    private int f8660s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f8661t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f8662u;

    /* renamed from: v  reason: collision with root package name */
    boolean f8663v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f8664w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f8665x = true;

    /* renamed from: y  reason: collision with root package name */
    h f8666y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f8667z;

    /* compiled from: WindowDecorActionBar */
    class a extends h0 {
        a() {
        }

        public void b(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.f8661t && (view2 = kVar.f8649h) != null) {
                view2.setTranslationY(0.0f);
                k.this.f8646e.setTranslationY(0.0f);
            }
            k.this.f8646e.setVisibility(8);
            k.this.f8646e.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.f8666y = null;
            kVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.f8645d;
            if (actionBarOverlayLayout != null) {
                z.P(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends h0 {
        b() {
        }

        public void b(View view) {
            k kVar = k.this;
            kVar.f8666y = null;
            kVar.f8646e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements i0 {
        c() {
        }

        public void a(View view) {
            ((View) k.this.f8646e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends l.b implements e.a {

        /* renamed from: j  reason: collision with root package name */
        private final Context f8671j;

        /* renamed from: k  reason: collision with root package name */
        private final e f8672k;

        /* renamed from: l  reason: collision with root package name */
        private b.a f8673l;

        /* renamed from: m  reason: collision with root package name */
        private WeakReference<View> f8674m;

        public d(Context context, b.a aVar) {
            this.f8671j = context;
            this.f8673l = aVar;
            e S = new e(context).S(1);
            this.f8672k = S;
            S.R(this);
        }

        public boolean a(e eVar, MenuItem menuItem) {
            b.a aVar = this.f8673l;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f8673l != null) {
                k();
                k.this.f8648g.l();
            }
        }

        public void c() {
            k kVar = k.this;
            if (kVar.f8654m == this) {
                if (!k.v(kVar.f8662u, kVar.f8663v, false)) {
                    k kVar2 = k.this;
                    kVar2.f8655n = this;
                    kVar2.f8656o = this.f8673l;
                } else {
                    this.f8673l.c(this);
                }
                this.f8673l = null;
                k.this.u(false);
                k.this.f8648g.g();
                k.this.f8647f.p().sendAccessibilityEvent(32);
                k kVar3 = k.this;
                kVar3.f8645d.setHideOnContentScrollEnabled(kVar3.A);
                k.this.f8654m = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f8674m;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f8672k;
        }

        public MenuInflater f() {
            return new g(this.f8671j);
        }

        public CharSequence g() {
            return k.this.f8648g.getSubtitle();
        }

        public CharSequence i() {
            return k.this.f8648g.getTitle();
        }

        public void k() {
            if (k.this.f8654m == this) {
                this.f8672k.d0();
                try {
                    this.f8673l.b(this, this.f8672k);
                } finally {
                    this.f8672k.c0();
                }
            }
        }

        public boolean l() {
            return k.this.f8648g.j();
        }

        public void m(View view) {
            k.this.f8648g.setCustomView(view);
            this.f8674m = new WeakReference<>(view);
        }

        public void n(int i10) {
            o(k.this.f8642a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            k.this.f8648g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(k.this.f8642a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            k.this.f8648g.setTitle(charSequence);
        }

        public void s(boolean z10) {
            super.s(z10);
            k.this.f8648g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f8672k.d0();
            try {
                return this.f8673l.a(this, this.f8672k);
            } finally {
                this.f8672k.c0();
            }
        }
    }

    public k(Activity activity, boolean z10) {
        this.f8644c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (!z10) {
            this.f8649h = decorView.findViewById(16908290);
        }
    }

    private void B() {
        if (this.f8664w) {
            this.f8664w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f8645d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f8272p);
        this.f8645d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f8647f = z(view.findViewById(f.f8257a));
        this.f8648g = (ActionBarContextView) view.findViewById(f.f8262f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f8259c);
        this.f8646e = actionBarContainer;
        b0 b0Var = this.f8647f;
        if (b0Var == null || this.f8648g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f8642a = b0Var.getContext();
        boolean z10 = (this.f8647f.r() & 4) != 0;
        if (z10) {
            this.f8653l = true;
        }
        l.a b10 = l.a.b(this.f8642a);
        I(b10.a() || z10);
        G(b10.g());
        TypedArray obtainStyledAttributes = this.f8642a.obtainStyledAttributes((AttributeSet) null, j.f8319a, f.a.f8186c, 0);
        if (obtainStyledAttributes.getBoolean(j.f8369k, false)) {
            H(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f8359i, 0);
        if (dimensionPixelSize != 0) {
            F((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void G(boolean z10) {
        this.f8659r = z10;
        if (!z10) {
            this.f8647f.i((n0) null);
            this.f8646e.setTabContainer(this.f8650i);
        } else {
            this.f8646e.setTabContainer((n0) null);
            this.f8647f.i(this.f8650i);
        }
        boolean z11 = true;
        boolean z12 = A() == 2;
        n0 n0Var = this.f8650i;
        if (n0Var != null) {
            if (z12) {
                n0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8645d;
                if (actionBarOverlayLayout != null) {
                    z.P(actionBarOverlayLayout);
                }
            } else {
                n0Var.setVisibility(8);
            }
        }
        this.f8647f.u(!this.f8659r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8645d;
        if (this.f8659r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean J() {
        return z.F(this.f8646e);
    }

    private void K() {
        if (!this.f8664w) {
            this.f8664w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f8645d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            L(false);
        }
    }

    private void L(boolean z10) {
        if (v(this.f8662u, this.f8663v, this.f8664w)) {
            if (!this.f8665x) {
                this.f8665x = true;
                y(z10);
            }
        } else if (this.f8665x) {
            this.f8665x = false;
            x(z10);
        }
    }

    static boolean v(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    private b0 z(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int A() {
        return this.f8647f.m();
    }

    public void D(boolean z10) {
        E(z10 ? 4 : 0, 4);
    }

    public void E(int i10, int i11) {
        int r10 = this.f8647f.r();
        if ((i11 & 4) != 0) {
            this.f8653l = true;
        }
        this.f8647f.k((i10 & i11) | ((~i11) & r10));
    }

    public void F(float f10) {
        z.X(this.f8646e, f10);
    }

    public void H(boolean z10) {
        if (!z10 || this.f8645d.w()) {
            this.A = z10;
            this.f8645d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void I(boolean z10) {
        this.f8647f.q(z10);
    }

    public void a() {
        if (this.f8663v) {
            this.f8663v = false;
            L(true);
        }
    }

    public void b() {
    }

    public void c(boolean z10) {
        this.f8661t = z10;
    }

    public void d() {
        if (!this.f8663v) {
            this.f8663v = true;
            L(true);
        }
    }

    public void e() {
        h hVar = this.f8666y;
        if (hVar != null) {
            hVar.a();
            this.f8666y = null;
        }
    }

    public boolean g() {
        b0 b0Var = this.f8647f;
        if (b0Var == null || !b0Var.j()) {
            return false;
        }
        this.f8647f.collapseActionView();
        return true;
    }

    public void h(boolean z10) {
        if (z10 != this.f8657p) {
            this.f8657p = z10;
            int size = this.f8658q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8658q.get(i10).a(z10);
            }
        }
    }

    public int i() {
        return this.f8647f.r();
    }

    public Context j() {
        if (this.f8643b == null) {
            TypedValue typedValue = new TypedValue();
            this.f8642a.getTheme().resolveAttribute(f.a.f8190g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f8643b = new ContextThemeWrapper(this.f8642a, i10);
            } else {
                this.f8643b = this.f8642a;
            }
        }
        return this.f8643b;
    }

    public void l(Configuration configuration) {
        G(l.a.b(this.f8642a).g());
    }

    public boolean n(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f8654m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void onWindowVisibilityChanged(int i10) {
        this.f8660s = i10;
    }

    public void q(boolean z10) {
        if (!this.f8653l) {
            D(z10);
        }
    }

    public void r(boolean z10) {
        h hVar;
        this.f8667z = z10;
        if (!z10 && (hVar = this.f8666y) != null) {
            hVar.a();
        }
    }

    public void s(CharSequence charSequence) {
        this.f8647f.setWindowTitle(charSequence);
    }

    public l.b t(b.a aVar) {
        d dVar = this.f8654m;
        if (dVar != null) {
            dVar.c();
        }
        this.f8645d.setHideOnContentScrollEnabled(false);
        this.f8648g.k();
        d dVar2 = new d(this.f8648g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f8654m = dVar2;
        dVar2.k();
        this.f8648g.h(dVar2);
        u(true);
        this.f8648g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void u(boolean z10) {
        f0 f0Var;
        f0 f0Var2;
        if (z10) {
            K();
        } else {
            B();
        }
        if (J()) {
            if (z10) {
                f0Var = this.f8647f.n(4, 100);
                f0Var2 = this.f8648g.f(0, 200);
            } else {
                f0Var2 = this.f8647f.n(0, 200);
                f0Var = this.f8648g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(f0Var, f0Var2);
            hVar.h();
        } else if (z10) {
            this.f8647f.o(4);
            this.f8648g.setVisibility(0);
        } else {
            this.f8647f.o(0);
            this.f8648g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        b.a aVar = this.f8656o;
        if (aVar != null) {
            aVar.c(this.f8655n);
            this.f8655n = null;
            this.f8656o = null;
        }
    }

    public void x(boolean z10) {
        View view;
        h hVar = this.f8666y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f8660s != 0 || (!this.f8667z && !z10)) {
            this.B.b((View) null);
            return;
        }
        this.f8646e.setAlpha(1.0f);
        this.f8646e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f8646e.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f8646e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        f0 m10 = z.b(this.f8646e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f8661t && (view = this.f8649h) != null) {
            hVar2.c(z.b(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250);
        hVar2.g(this.B);
        this.f8666y = hVar2;
        hVar2.h();
    }

    public void y(boolean z10) {
        View view;
        View view2;
        h hVar = this.f8666y;
        if (hVar != null) {
            hVar.a();
        }
        this.f8646e.setVisibility(0);
        if (this.f8660s != 0 || (!this.f8667z && !z10)) {
            this.f8646e.setAlpha(1.0f);
            this.f8646e.setTranslationY(0.0f);
            if (this.f8661t && (view = this.f8649h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b((View) null);
        } else {
            this.f8646e.setTranslationY(0.0f);
            float f10 = (float) (-this.f8646e.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f8646e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f8646e.setTranslationY(f10);
            h hVar2 = new h();
            f0 m10 = z.b(this.f8646e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f8661t && (view2 = this.f8649h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(z.b(this.f8649h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250);
            hVar2.g(this.C);
            this.f8666y = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8645d;
        if (actionBarOverlayLayout != null) {
            z.P(actionBarOverlayLayout);
        }
    }

    public k(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }
}
