package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl */
class b implements e {
    b() {
    }

    private f o(d dVar) {
        return (f) dVar.e();
    }

    public void a(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.b(new f(colorStateList, f10));
        View f13 = dVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        n(dVar, f12);
    }

    public void b(d dVar, float f10) {
        o(dVar).h(f10);
    }

    public float c(d dVar) {
        return dVar.f().getElevation();
    }

    public float d(d dVar) {
        return o(dVar).d();
    }

    public void e(d dVar) {
        n(dVar, g(dVar));
    }

    public void f(d dVar, float f10) {
        dVar.f().setElevation(f10);
    }

    public float g(d dVar) {
        return o(dVar).c();
    }

    public ColorStateList h(d dVar) {
        return o(dVar).b();
    }

    public void i() {
    }

    public float j(d dVar) {
        return d(dVar) * 2.0f;
    }

    public float k(d dVar) {
        return d(dVar) * 2.0f;
    }

    public void l(d dVar) {
        n(dVar, g(dVar));
    }

    public void m(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    public void n(d dVar, float f10) {
        o(dVar).g(f10, dVar.d(), dVar.c());
        p(dVar);
    }

    public void p(d dVar) {
        if (!dVar.d()) {
            dVar.g(0, 0, 0, 0);
            return;
        }
        float g10 = g(dVar);
        float d10 = d(dVar);
        int ceil = (int) Math.ceil((double) g.c(g10, d10, dVar.c()));
        int ceil2 = (int) Math.ceil((double) g.d(g10, d10, dVar.c()));
        dVar.g(ceil, ceil2, ceil, ceil2);
    }
}
