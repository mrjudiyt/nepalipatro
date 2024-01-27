package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.h;
import java.util.ArrayList;
import l.b;
import m.c;
import m.d;

/* compiled from: SupportActionModeWrapper */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f9748a;

    /* renamed from: b  reason: collision with root package name */
    final b f9749b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f9750a;

        /* renamed from: b  reason: collision with root package name */
        final Context f9751b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f9752c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final h<Menu, Menu> f9753d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f9751b = context;
            this.f9750a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f9753d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            d dVar = new d(this.f9751b, (z.a) menu);
            this.f9753d.put(menu, dVar);
            return dVar;
        }

        public boolean a(b bVar, Menu menu) {
            return this.f9750a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f9750a.onPrepareActionMode(e(bVar), f(menu));
        }

        public void c(b bVar) {
            this.f9750a.onDestroyActionMode(e(bVar));
        }

        public boolean d(b bVar, MenuItem menuItem) {
            return this.f9750a.onActionItemClicked(e(bVar), new c(this.f9751b, (z.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f9752c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f9752c.get(i10);
                if (fVar != null && fVar.f9749b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f9751b, bVar);
            this.f9752c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f9748a = context;
        this.f9749b = bVar;
    }

    public void finish() {
        this.f9749b.c();
    }

    public View getCustomView() {
        return this.f9749b.d();
    }

    public Menu getMenu() {
        return new d(this.f9748a, (z.a) this.f9749b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f9749b.f();
    }

    public CharSequence getSubtitle() {
        return this.f9749b.g();
    }

    public Object getTag() {
        return this.f9749b.h();
    }

    public CharSequence getTitle() {
        return this.f9749b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f9749b.j();
    }

    public void invalidate() {
        this.f9749b.k();
    }

    public boolean isTitleOptional() {
        return this.f9749b.l();
    }

    public void setCustomView(View view) {
        this.f9749b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9749b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f9749b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9749b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f9749b.s(z10);
    }

    public void setSubtitle(int i10) {
        this.f9749b.n(i10);
    }

    public void setTitle(int i10) {
        this.f9749b.q(i10);
    }
}
