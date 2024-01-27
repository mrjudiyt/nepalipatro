package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.f0;
import androidx.core.view.h0;
import androidx.core.view.z;
import f.e;
import f.f;
import f.h;

/* compiled from: ToolbarWidgetWrapper */
public class v0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1261a;

    /* renamed from: b  reason: collision with root package name */
    private int f1262b;

    /* renamed from: c  reason: collision with root package name */
    private View f1263c;

    /* renamed from: d  reason: collision with root package name */
    private View f1264d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1265e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1266f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1267g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1268h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1269i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1270j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1271k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1272l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1273m;

    /* renamed from: n  reason: collision with root package name */
    private c f1274n;

    /* renamed from: o  reason: collision with root package name */
    private int f1275o;

    /* renamed from: p  reason: collision with root package name */
    private int f1276p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1277q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        final m.a f1278h;

        a() {
            this.f1278h = new m.a(v0.this.f1261a.getContext(), 0, 16908332, 0, 0, v0.this.f1269i);
        }

        public void onClick(View view) {
            v0 v0Var = v0.this;
            Window.Callback callback = v0Var.f1272l;
            if (callback != null && v0Var.f1273m) {
                callback.onMenuItemSelected(0, this.f1278h);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends h0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1280a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1281b;

        b(int i10) {
            this.f1281b = i10;
        }

        public void a(View view) {
            this.f1280a = true;
        }

        public void b(View view) {
            if (!this.f1280a) {
                v0.this.f1261a.setVisibility(this.f1281b);
            }
        }

        public void c(View view) {
            v0.this.f1261a.setVisibility(0);
        }
    }

    public v0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f8303a, e.f8244n);
    }

    private void E(CharSequence charSequence) {
        this.f1269i = charSequence;
        if ((this.f1262b & 8) != 0) {
            this.f1261a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f1262b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1271k)) {
            this.f1261a.setNavigationContentDescription(this.f1276p);
        } else {
            this.f1261a.setNavigationContentDescription(this.f1271k);
        }
    }

    private void G() {
        if ((this.f1262b & 4) != 0) {
            Toolbar toolbar = this.f1261a;
            Drawable drawable = this.f1267g;
            if (drawable == null) {
                drawable = this.f1277q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1261a.setNavigationIcon((Drawable) null);
    }

    private void H() {
        Drawable drawable;
        int i10 = this.f1262b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1266f;
            if (drawable == null) {
                drawable = this.f1265e;
            }
        } else {
            drawable = this.f1265e;
        }
        this.f1261a.setLogo(drawable);
    }

    private int v() {
        if (this.f1261a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1277q = this.f1261a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f1271k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f1267g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f1270j = charSequence;
        if ((this.f1262b & 8) != 0) {
            this.f1261a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f1268h = true;
        E(charSequence);
    }

    public void a(Menu menu, j.a aVar) {
        if (this.f1274n == null) {
            c cVar = new c(this.f1261a.getContext());
            this.f1274n = cVar;
            cVar.p(f.f8263g);
        }
        this.f1274n.g(aVar);
        this.f1261a.I((androidx.appcompat.view.menu.e) menu, this.f1274n);
    }

    public boolean b() {
        return this.f1261a.A();
    }

    public void c() {
        this.f1273m = true;
    }

    public void collapseActionView() {
        this.f1261a.e();
    }

    public boolean d() {
        return this.f1261a.d();
    }

    public boolean e() {
        return this.f1261a.z();
    }

    public boolean f() {
        return this.f1261a.w();
    }

    public boolean g() {
        return this.f1261a.N();
    }

    public Context getContext() {
        return this.f1261a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1261a.getTitle();
    }

    public void h() {
        this.f1261a.f();
    }

    public void i(n0 n0Var) {
        Toolbar toolbar;
        View view = this.f1263c;
        if (view != null && view.getParent() == (toolbar = this.f1261a)) {
            toolbar.removeView(this.f1263c);
        }
        this.f1263c = n0Var;
        if (n0Var != null && this.f1275o == 2) {
            this.f1261a.addView(n0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.f1263c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f8532a = 8388691;
            n0Var.setAllowCollapse(true);
        }
    }

    public boolean j() {
        return this.f1261a.v();
    }

    public void k(int i10) {
        View view;
        int i11 = this.f1262b ^ i10;
        this.f1262b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i11 & 3) != 0) {
                H();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1261a.setTitle(this.f1269i);
                    this.f1261a.setSubtitle(this.f1270j);
                } else {
                    this.f1261a.setTitle((CharSequence) null);
                    this.f1261a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1264d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1261a.addView(view);
                } else {
                    this.f1261a.removeView(view);
                }
            }
        }
    }

    public void l(int i10) {
        y(i10 != 0 ? h.a.d(getContext(), i10) : null);
    }

    public int m() {
        return this.f1275o;
    }

    public f0 n(int i10, long j10) {
        return z.b(this.f1261a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    public void o(int i10) {
        this.f1261a.setVisibility(i10);
    }

    public ViewGroup p() {
        return this.f1261a;
    }

    public void q(boolean z10) {
    }

    public int r() {
        return this.f1262b;
    }

    public void s() {
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.d(getContext(), i10) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1272l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1268h) {
            E(charSequence);
        }
    }

    public void t() {
    }

    public void u(boolean z10) {
        this.f1261a.setCollapsible(z10);
    }

    public void w(View view) {
        View view2 = this.f1264d;
        if (!(view2 == null || (this.f1262b & 16) == 0)) {
            this.f1261a.removeView(view2);
        }
        this.f1264d = view;
        if (view != null && (this.f1262b & 16) != 0) {
            this.f1261a.addView(view);
        }
    }

    public void x(int i10) {
        if (i10 != this.f1276p) {
            this.f1276p = i10;
            if (TextUtils.isEmpty(this.f1261a.getNavigationContentDescription())) {
                z(this.f1276p);
            }
        }
    }

    public void y(Drawable drawable) {
        this.f1266f = drawable;
        H();
    }

    public void z(int i10) {
        A(i10 == 0 ? null : getContext().getString(i10));
    }

    public v0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1275o = 0;
        this.f1276p = 0;
        this.f1261a = toolbar;
        this.f1269i = toolbar.getTitle();
        this.f1270j = toolbar.getSubtitle();
        this.f1268h = this.f1269i != null;
        this.f1267g = toolbar.getNavigationIcon();
        u0 u10 = u0.u(toolbar.getContext(), (AttributeSet) null, f.j.f8319a, f.a.f8186c, 0);
        this.f1277q = u10.f(f.j.f8374l);
        if (z10) {
            CharSequence o10 = u10.o(f.j.f8404r);
            if (!TextUtils.isEmpty(o10)) {
                D(o10);
            }
            CharSequence o11 = u10.o(f.j.f8394p);
            if (!TextUtils.isEmpty(o11)) {
                C(o11);
            }
            Drawable f10 = u10.f(f.j.f8384n);
            if (f10 != null) {
                y(f10);
            }
            Drawable f11 = u10.f(f.j.f8379m);
            if (f11 != null) {
                setIcon(f11);
            }
            if (this.f1267g == null && (drawable = this.f1277q) != null) {
                B(drawable);
            }
            k(u10.j(f.j.f8354h, 0));
            int m10 = u10.m(f.j.f8349g, 0);
            if (m10 != 0) {
                w(LayoutInflater.from(this.f1261a.getContext()).inflate(m10, this.f1261a, false));
                k(this.f1262b | 16);
            }
            int l10 = u10.l(f.j.f8364j, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1261a.getLayoutParams();
                layoutParams.height = l10;
                this.f1261a.setLayoutParams(layoutParams);
            }
            int d10 = u10.d(f.j.f8344f, -1);
            int d11 = u10.d(f.j.f8339e, -1);
            if (d10 >= 0 || d11 >= 0) {
                this.f1261a.H(Math.max(d10, 0), Math.max(d11, 0));
            }
            int m11 = u10.m(f.j.f8409s, 0);
            if (m11 != 0) {
                Toolbar toolbar2 = this.f1261a;
                toolbar2.K(toolbar2.getContext(), m11);
            }
            int m12 = u10.m(f.j.f8399q, 0);
            if (m12 != 0) {
                Toolbar toolbar3 = this.f1261a;
                toolbar3.J(toolbar3.getContext(), m12);
            }
            int m13 = u10.m(f.j.f8389o, 0);
            if (m13 != 0) {
                this.f1261a.setPopupTheme(m13);
            }
        } else {
            this.f1262b = v();
        }
        u10.v();
        x(i10);
        this.f1271k = this.f1261a.getNavigationContentDescription();
        this.f1261a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f1265e = drawable;
        H();
    }
}
