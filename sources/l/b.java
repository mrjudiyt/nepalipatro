package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode */
public abstract class b {

    /* renamed from: h  reason: collision with root package name */
    private Object f9734h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9735i;

    /* compiled from: ActionMode */
    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, Menu menu);

        void c(b bVar);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f9734h;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f9735i;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f9734h = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f9735i = z10;
    }
}
