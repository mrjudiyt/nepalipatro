package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j0;
import androidx.core.view.z;
import f.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int I = g.f8287e;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private j.a E;
    ViewTreeObserver F;
    private PopupWindow.OnDismissListener G;
    boolean H;

    /* renamed from: i  reason: collision with root package name */
    private final Context f680i;

    /* renamed from: j  reason: collision with root package name */
    private final int f681j;

    /* renamed from: k  reason: collision with root package name */
    private final int f682k;

    /* renamed from: l  reason: collision with root package name */
    private final int f683l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f684m;

    /* renamed from: n  reason: collision with root package name */
    final Handler f685n;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f686o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    final List<d> f687p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f688q = new a();

    /* renamed from: r  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f689r = new C0011b();

    /* renamed from: s  reason: collision with root package name */
    private final i0 f690s = new c();

    /* renamed from: t  reason: collision with root package name */
    private int f691t = 0;

    /* renamed from: u  reason: collision with root package name */
    private int f692u = 0;

    /* renamed from: v  reason: collision with root package name */
    private View f693v;

    /* renamed from: w  reason: collision with root package name */
    View f694w;

    /* renamed from: x  reason: collision with root package name */
    private int f695x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f696y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f697z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (b.this.a() && b.this.f687p.size() > 0 && !b.this.f687p.get(0).f705a.w()) {
                View view = b.this.f694w;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f687p) {
                    dVar.f705a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    class C0011b implements View.OnAttachStateChangeListener {
        C0011b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.F = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.F.removeGlobalOnLayoutListener(bVar.f688q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements i0 {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f701h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ MenuItem f702i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ e f703j;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f701h = dVar;
                this.f702i = menuItem;
                this.f703j = eVar;
            }

            public void run() {
                d dVar = this.f701h;
                if (dVar != null) {
                    b.this.H = true;
                    dVar.f706b.e(false);
                    b.this.H = false;
                }
                if (this.f702i.isEnabled() && this.f702i.hasSubMenu()) {
                    this.f703j.L(this.f702i, 4);
                }
            }
        }

        c() {
        }

        public void c(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.f685n.removeCallbacksAndMessages((Object) null);
            int size = b.this.f687p.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f687p.get(i10).f706b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < b.this.f687p.size()) {
                    dVar = b.this.f687p.get(i11);
                }
                b.this.f685n.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void f(e eVar, MenuItem menuItem) {
            b.this.f685n.removeCallbacksAndMessages(eVar);
        }
    }

    /* compiled from: CascadingMenuPopup */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f705a;

        /* renamed from: b  reason: collision with root package name */
        public final e f706b;

        /* renamed from: c  reason: collision with root package name */
        public final int f707c;

        public d(j0 j0Var, e eVar, int i10) {
            this.f705a = j0Var;
            this.f706b = eVar;
            this.f707c = i10;
        }

        public ListView a() {
            return this.f705a.i();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f680i = context;
        this.f693v = view;
        this.f682k = i10;
        this.f683l = i11;
        this.f684m = z10;
        this.C = false;
        this.f695x = C();
        Resources resources = context.getResources();
        this.f681j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f8222d));
        this.f685n = new Handler();
    }

    private MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(d dVar, e eVar) {
        int i10;
        d dVar2;
        int firstVisiblePosition;
        MenuItem A2 = A(dVar.f706b, eVar);
        if (A2 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (A2 == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return z.t(this.f693v) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<d> list = this.f687p;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f694w.getWindowVisibleDisplayFrame(rect);
        if (this.f695x == 1) {
            if (iArr[0] + a10.getWidth() + i10 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i10 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void E(e eVar) {
        View view;
        d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f680i);
        d dVar2 = new d(eVar, from, this.f684m, I);
        if (!a() && this.C) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.w(eVar));
        }
        int n10 = h.n(dVar2, (ViewGroup) null, this.f680i, this.f681j);
        j0 y10 = y();
        y10.o(dVar2);
        y10.A(n10);
        y10.B(this.f692u);
        if (this.f687p.size() > 0) {
            List<d> list = this.f687p;
            dVar = list.get(list.size() - 1);
            view = B(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y10.P(false);
            y10.M((Object) null);
            int D2 = D(n10);
            boolean z10 = D2 == 1;
            this.f695x = D2;
            if (Build.VERSION.SDK_INT >= 26) {
                y10.y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f693v.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f692u & 7) == 5) {
                    iArr[0] = iArr[0] + this.f693v.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f692u & 5) != 5) {
                if (z10) {
                    n10 = view.getWidth();
                }
                i12 = i10 - n10;
                y10.d(i12);
                y10.H(true);
                y10.k(i11);
            } else if (!z10) {
                n10 = view.getWidth();
                i12 = i10 - n10;
                y10.d(i12);
                y10.H(true);
                y10.k(i11);
            }
            i12 = i10 + n10;
            y10.d(i12);
            y10.H(true);
            y10.k(i11);
        } else {
            if (this.f696y) {
                y10.d(this.A);
            }
            if (this.f697z) {
                y10.k(this.B);
            }
            y10.C(m());
        }
        this.f687p.add(new d(y10, eVar, this.f695x));
        y10.show();
        ListView i13 = y10.i();
        i13.setOnKeyListener(this);
        if (dVar == null && this.D && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.f8294l, i13, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            i13.addHeaderView(frameLayout, (Object) null, false);
            y10.show();
        }
    }

    private j0 y() {
        j0 j0Var = new j0(this.f680i, (AttributeSet) null, this.f682k, this.f683l);
        j0Var.O(this.f690s);
        j0Var.G(this);
        j0Var.F(this);
        j0Var.y(this.f693v);
        j0Var.B(this.f692u);
        j0Var.E(true);
        j0Var.D(2);
        return j0Var;
    }

    private int z(e eVar) {
        int size = this.f687p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f687p.get(i10).f706b) {
                return i10;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.f687p.size() > 0 && this.f687p.get(0).f705a.a();
    }

    public void b(e eVar, boolean z10) {
        int z11 = z(eVar);
        if (z11 >= 0) {
            int i10 = z11 + 1;
            if (i10 < this.f687p.size()) {
                this.f687p.get(i10).f706b.e(false);
            }
            d remove = this.f687p.remove(z11);
            remove.f706b.O(this);
            if (this.H) {
                remove.f705a.N((Object) null);
                remove.f705a.z(0);
            }
            remove.f705a.dismiss();
            int size = this.f687p.size();
            if (size > 0) {
                this.f695x = this.f687p.get(size - 1).f707c;
            } else {
                this.f695x = C();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.E;
                if (aVar != null) {
                    aVar.b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.F;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.F.removeGlobalOnLayoutListener(this.f688q);
                    }
                    this.F = null;
                }
                this.f694w.removeOnAttachStateChangeListener(this.f689r);
                this.G.onDismiss();
            } else if (z10) {
                this.f687p.get(0).f706b.e(false);
            }
        }
    }

    public void c(boolean z10) {
        for (d a10 : this.f687p) {
            h.x(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public void dismiss() {
        int size = this.f687p.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f687p.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f705a.a()) {
                    dVar.f705a.dismiss();
                }
            }
        }
    }

    public void g(j.a aVar) {
        this.E = aVar;
    }

    public ListView i() {
        if (this.f687p.isEmpty()) {
            return null;
        }
        List<d> list = this.f687p;
        return list.get(list.size() - 1).a();
    }

    public boolean j(m mVar) {
        for (d next : this.f687p) {
            if (mVar == next.f706b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.E;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    public void k(e eVar) {
        eVar.c(this, this.f680i);
        if (a()) {
            E(eVar);
        } else {
            this.f686o.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public void o(View view) {
        if (this.f693v != view) {
            this.f693v = view;
            this.f692u = androidx.core.view.d.a(this.f691t, z.t(view));
        }
    }

    public void onDismiss() {
        d dVar;
        int size = this.f687p.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f687p.get(i10);
            if (!dVar.f705a.a()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f706b.e(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void q(boolean z10) {
        this.C = z10;
    }

    public void r(int i10) {
        if (this.f691t != i10) {
            this.f691t = i10;
            this.f692u = androidx.core.view.d.a(i10, z.t(this.f693v));
        }
    }

    public void s(int i10) {
        this.f696y = true;
        this.A = i10;
    }

    public void show() {
        if (!a()) {
            for (e E2 : this.f686o) {
                E(E2);
            }
            this.f686o.clear();
            View view = this.f693v;
            this.f694w = view;
            if (view != null) {
                boolean z10 = this.F == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.F = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f688q);
                }
                this.f694w.addOnAttachStateChangeListener(this.f689r);
            }
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    public void u(boolean z10) {
        this.D = z10;
    }

    public void v(int i10) {
        this.f697z = true;
        this.B = i10;
    }
}
