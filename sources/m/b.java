package m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.h;
import z.c;

/* compiled from: BaseMenuWrapper */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f10135a;

    /* renamed from: b  reason: collision with root package name */
    private h<z.b, MenuItem> f10136b;

    /* renamed from: c  reason: collision with root package name */
    private h<c, SubMenu> f10137c;

    b(Context context) {
        this.f10135a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof z.b)) {
            return menuItem;
        }
        z.b bVar = (z.b) menuItem;
        if (this.f10136b == null) {
            this.f10136b = new h<>();
        }
        MenuItem menuItem2 = this.f10136b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f10135a, bVar);
        this.f10136b.put(bVar, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f10137c == null) {
            this.f10137c = new h<>();
        }
        SubMenu subMenu2 = this.f10137c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f10135a, cVar);
        this.f10137c.put(cVar, fVar);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        h<z.b, MenuItem> hVar = this.f10136b;
        if (hVar != null) {
            hVar.clear();
        }
        h<c, SubMenu> hVar2 = this.f10137c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f10136b != null) {
            int i11 = 0;
            while (i11 < this.f10136b.size()) {
                if (this.f10136b.i(i11).getGroupId() == i10) {
                    this.f10136b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f10136b != null) {
            for (int i11 = 0; i11 < this.f10136b.size(); i11++) {
                if (this.f10136b.i(i11).getItemId() == i10) {
                    this.f10136b.k(i11);
                    return;
                }
            }
        }
    }
}
