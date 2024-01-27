package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.h;
import androidx.lifecycle.l0;

/* compiled from: FragmentController */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final k<?> f3204a;

    private i(k<?> kVar) {
        this.f3204a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) h.c(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f3204a;
        kVar.f3210l.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f3204a.f3210l.z();
    }

    public void d(Configuration configuration) {
        this.f3204a.f3210l.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f3204a.f3210l.C(menuItem);
    }

    public void f() {
        this.f3204a.f3210l.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f3204a.f3210l.E(menu, menuInflater);
    }

    public void h() {
        this.f3204a.f3210l.F();
    }

    public void i() {
        this.f3204a.f3210l.H();
    }

    public void j(boolean z10) {
        this.f3204a.f3210l.I(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f3204a.f3210l.K(menuItem);
    }

    public void l(Menu menu) {
        this.f3204a.f3210l.L(menu);
    }

    public void m() {
        this.f3204a.f3210l.N();
    }

    public void n(boolean z10) {
        this.f3204a.f3210l.O(z10);
    }

    public boolean o(Menu menu) {
        return this.f3204a.f3210l.P(menu);
    }

    public void p() {
        this.f3204a.f3210l.R();
    }

    public void q() {
        this.f3204a.f3210l.S();
    }

    public void r() {
        this.f3204a.f3210l.U();
    }

    public boolean s() {
        return this.f3204a.f3210l.b0(true);
    }

    public n t() {
        return this.f3204a.f3210l;
    }

    public void u() {
        this.f3204a.f3210l.T0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3204a.f3210l.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f3204a;
        if (kVar instanceof l0) {
            kVar.f3210l.g1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f3204a.f3210l.i1();
    }
}
