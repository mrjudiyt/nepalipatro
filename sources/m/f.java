package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import z.c;

/* compiled from: SubMenuWrapperICS */
class f extends d implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f10150e;

    f(Context context, c cVar) {
        super(context, cVar);
        this.f10150e = cVar;
    }

    public void clearHeader() {
        this.f10150e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f10150e.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f10150e.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f10150e.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f10150e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f10150e.setIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f10150e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f10150e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f10150e.setIcon(drawable);
        return this;
    }
}
