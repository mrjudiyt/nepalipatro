package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2503a;

    /* renamed from: b  reason: collision with root package name */
    private a f2504b;

    /* renamed from: c  reason: collision with root package name */
    private C0041b f2505c;

    /* compiled from: ActionProvider */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* compiled from: ActionProvider */
    public interface C0041b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f2503a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2505c = null;
        this.f2504b = null;
    }

    public void i(a aVar) {
        this.f2504b = aVar;
    }

    public void j(C0041b bVar) {
        if (!(this.f2505c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.f2505c = bVar;
    }
}
