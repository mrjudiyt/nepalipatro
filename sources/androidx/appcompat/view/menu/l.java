package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j0;
import androidx.core.view.z;
import f.d;
import f.g;

/* compiled from: StandardMenuPopup */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int C = g.f8295m;
    private int A = 0;
    private boolean B;

    /* renamed from: i  reason: collision with root package name */
    private final Context f796i;

    /* renamed from: j  reason: collision with root package name */
    private final e f797j;

    /* renamed from: k  reason: collision with root package name */
    private final d f798k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f799l;

    /* renamed from: m  reason: collision with root package name */
    private final int f800m;

    /* renamed from: n  reason: collision with root package name */
    private final int f801n;

    /* renamed from: o  reason: collision with root package name */
    private final int f802o;

    /* renamed from: p  reason: collision with root package name */
    final j0 f803p;

    /* renamed from: q  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f804q = new a();

    /* renamed from: r  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f805r = new b();

    /* renamed from: s  reason: collision with root package name */
    private PopupWindow.OnDismissListener f806s;

    /* renamed from: t  reason: collision with root package name */
    private View f807t;

    /* renamed from: u  reason: collision with root package name */
    View f808u;

    /* renamed from: v  reason: collision with root package name */
    private j.a f809v;

    /* renamed from: w  reason: collision with root package name */
    ViewTreeObserver f810w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f811x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f812y;

    /* renamed from: z  reason: collision with root package name */
    private int f813z;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (l.this.a() && !l.this.f803p.w()) {
                View view = l.this.f808u;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.f803p.show();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f810w;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f810w = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f810w.removeGlobalOnLayoutListener(lVar.f804q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f796i = context;
        this.f797j = eVar;
        this.f799l = z10;
        this.f798k = new d(eVar, LayoutInflater.from(context), z10, C);
        this.f801n = i10;
        this.f802o = i11;
        Resources resources = context.getResources();
        this.f800m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.f8222d));
        this.f807t = view;
        this.f803p = new j0(context, (AttributeSet) null, i10, i11);
        eVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f811x || (view = this.f807t) == null) {
            return false;
        }
        this.f808u = view;
        this.f803p.F(this);
        this.f803p.G(this);
        this.f803p.E(true);
        View view2 = this.f808u;
        boolean z10 = this.f810w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f810w = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f804q);
        }
        view2.addOnAttachStateChangeListener(this.f805r);
        this.f803p.y(view2);
        this.f803p.B(this.A);
        if (!this.f812y) {
            this.f813z = h.n(this.f798k, (ViewGroup) null, this.f796i, this.f800m);
            this.f812y = true;
        }
        this.f803p.A(this.f813z);
        this.f803p.D(2);
        this.f803p.C(m());
        this.f803p.show();
        ListView i10 = this.f803p.i();
        i10.setOnKeyListener(this);
        if (this.B && this.f797j.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f796i).inflate(g.f8294l, i10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f797j.x());
            }
            frameLayout.setEnabled(false);
            i10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f803p.o(this.f798k);
        this.f803p.show();
        return true;
    }

    public boolean a() {
        return !this.f811x && this.f803p.a();
    }

    public void b(e eVar, boolean z10) {
        if (eVar == this.f797j) {
            dismiss();
            j.a aVar = this.f809v;
            if (aVar != null) {
                aVar.b(eVar, z10);
            }
        }
    }

    public void c(boolean z10) {
        this.f812y = false;
        d dVar = this.f798k;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public void dismiss() {
        if (a()) {
            this.f803p.dismiss();
        }
    }

    public void g(j.a aVar) {
        this.f809v = aVar;
    }

    public ListView i() {
        return this.f803p.i();
    }

    public boolean j(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f796i, mVar, this.f808u, this.f799l, this.f801n, this.f802o);
            iVar.j(this.f809v);
            iVar.g(h.w(mVar));
            iVar.i(this.f806s);
            this.f806s = null;
            this.f797j.e(false);
            int b10 = this.f803p.b();
            int n10 = this.f803p.n();
            if ((Gravity.getAbsoluteGravity(this.A, z.t(this.f807t)) & 7) == 5) {
                b10 += this.f807t.getWidth();
            }
            if (iVar.n(b10, n10)) {
                j.a aVar = this.f809v;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    public void k(e eVar) {
    }

    public void o(View view) {
        this.f807t = view;
    }

    public void onDismiss() {
        this.f811x = true;
        this.f797j.close();
        ViewTreeObserver viewTreeObserver = this.f810w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f810w = this.f808u.getViewTreeObserver();
            }
            this.f810w.removeGlobalOnLayoutListener(this.f804q);
            this.f810w = null;
        }
        this.f808u.removeOnAttachStateChangeListener(this.f805r);
        PopupWindow.OnDismissListener onDismissListener = this.f806s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f798k.d(z10);
    }

    public void r(int i10) {
        this.A = i10;
    }

    public void s(int i10) {
        this.f803p.d(i10);
    }

    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f806s = onDismissListener;
    }

    public void u(boolean z10) {
        this.B = z10;
    }

    public void v(int i10) {
        this.f803p.k(i10);
    }
}
