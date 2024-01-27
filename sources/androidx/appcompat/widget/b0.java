package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.core.view.f0;

/* compiled from: DecorToolbar */
public interface b0 {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(n0 n0Var);

    boolean j();

    void k(int i10);

    void l(int i10);

    int m();

    f0 n(int i10, long j10);

    void o(int i10);

    ViewGroup p();

    void q(boolean z10);

    int r();

    void s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u(boolean z10);
}
