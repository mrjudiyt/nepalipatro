package l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.b;

/* compiled from: StandaloneActionMode */
public class e extends b implements e.a {

    /* renamed from: j  reason: collision with root package name */
    private Context f9741j;

    /* renamed from: k  reason: collision with root package name */
    private ActionBarContextView f9742k;

    /* renamed from: l  reason: collision with root package name */
    private b.a f9743l;

    /* renamed from: m  reason: collision with root package name */
    private WeakReference<View> f9744m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9745n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9746o;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f9747p;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f9741j = context;
        this.f9742k = actionBarContextView;
        this.f9743l = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f9747p = S;
        S.R(this);
        this.f9746o = z10;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f9743l.d(this, menuItem);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f9742k.l();
    }

    public void c() {
        if (!this.f9745n) {
            this.f9745n = true;
            this.f9742k.sendAccessibilityEvent(32);
            this.f9743l.c(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f9744m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f9747p;
    }

    public MenuInflater f() {
        return new g(this.f9742k.getContext());
    }

    public CharSequence g() {
        return this.f9742k.getSubtitle();
    }

    public CharSequence i() {
        return this.f9742k.getTitle();
    }

    public void k() {
        this.f9743l.b(this, this.f9747p);
    }

    public boolean l() {
        return this.f9742k.j();
    }

    public void m(View view) {
        this.f9742k.setCustomView(view);
        this.f9744m = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i10) {
        o(this.f9741j.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f9742k.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f9741j.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f9742k.setTitle(charSequence);
    }

    public void s(boolean z10) {
        super.s(z10);
        this.f9742k.setTitleOptional(z10);
    }
}
