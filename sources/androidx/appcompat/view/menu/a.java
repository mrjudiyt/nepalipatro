package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class a implements j {

    /* renamed from: h  reason: collision with root package name */
    protected Context f670h;

    /* renamed from: i  reason: collision with root package name */
    protected Context f671i;

    /* renamed from: j  reason: collision with root package name */
    protected e f672j;

    /* renamed from: k  reason: collision with root package name */
    protected LayoutInflater f673k;

    /* renamed from: l  reason: collision with root package name */
    protected LayoutInflater f674l;

    /* renamed from: m  reason: collision with root package name */
    private j.a f675m;

    /* renamed from: n  reason: collision with root package name */
    private int f676n;

    /* renamed from: o  reason: collision with root package name */
    private int f677o;

    /* renamed from: p  reason: collision with root package name */
    protected k f678p;

    /* renamed from: q  reason: collision with root package name */
    private int f679q;

    public a(Context context, int i10, int i11) {
        this.f670h = context;
        this.f673k = LayoutInflater.from(context);
        this.f676n = i10;
        this.f677o = i11;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f678p).addView(view, i10);
    }

    public void b(e eVar, boolean z10) {
        j.a aVar = this.f675m;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public void c(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f678p;
        if (viewGroup != null) {
            e eVar = this.f672j;
            int i10 = 0;
            if (eVar != null) {
                eVar.r();
                ArrayList<g> E = this.f672j.E();
                int size = E.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    g gVar = E.get(i12);
                    if (q(i11, gVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View n10 = n(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            n10.setPressed(false);
                            n10.jumpDrawablesToCurrentState();
                        }
                        if (n10 != childAt) {
                            a(n10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean e(e eVar, g gVar) {
        return false;
    }

    public boolean f(e eVar, g gVar) {
        return false;
    }

    public void g(j.a aVar) {
        this.f675m = aVar;
    }

    public void h(Context context, e eVar) {
        this.f671i = context;
        this.f674l = LayoutInflater.from(context);
        this.f672j = eVar;
    }

    public abstract void i(g gVar, k.a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.appcompat.view.menu.m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f675m
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f672j
        L_0x0009:
            boolean r2 = r0.c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.j(androidx.appcompat.view.menu.m):boolean");
    }

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f673k.inflate(this.f677o, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f675m;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        if (view instanceof k.a) {
            aVar = (k.a) view;
        } else {
            aVar = k(viewGroup);
        }
        i(gVar, aVar);
        return (View) aVar;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f678p == null) {
            k kVar = (k) this.f673k.inflate(this.f676n, viewGroup, false);
            this.f678p = kVar;
            kVar.b(this.f672j);
            c(true);
        }
        return this.f678p;
    }

    public void p(int i10) {
        this.f679q = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
