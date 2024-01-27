package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import com.facebook.internal.security.CertificateUtil;

/* compiled from: SubMenuBuilder */
public class m extends e implements SubMenu {
    private e B;
    private g C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.B = eVar;
        this.C = gVar;
    }

    public e D() {
        return this.B.D();
    }

    public boolean F() {
        return this.B.F();
    }

    public boolean G() {
        return this.B.G();
    }

    public boolean H() {
        return this.B.H();
    }

    public void R(e.a aVar) {
        this.B.R(aVar);
    }

    public Menu e0() {
        return this.B;
    }

    public boolean f(g gVar) {
        return this.B.f(gVar);
    }

    public MenuItem getItem() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.B.h(eVar, menuItem);
    }

    public boolean k(g gVar) {
        return this.B.k(gVar);
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    public String t() {
        g gVar = this.C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + CertificateUtil.DELIMITER + itemId;
    }

    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.U(i10);
    }

    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.X(i10);
    }

    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
