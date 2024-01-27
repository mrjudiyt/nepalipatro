package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.n f4307a;

    /* renamed from: b  reason: collision with root package name */
    private int f4308b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f4309c;

    /* compiled from: OrientationHelper */
    static class a extends h {
        a(RecyclerView.n nVar) {
            super(nVar, (a) null);
        }

        public int d(View view) {
            return this.f4307a.z(view) + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            return this.f4307a.y(view) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
        }

        public int f() {
            return this.f4307a.O() - this.f4307a.G();
        }

        public int g() {
            return this.f4307a.F();
        }

        public int h() {
            return (this.f4307a.O() - this.f4307a.F()) - this.f4307a.G();
        }
    }

    /* compiled from: OrientationHelper */
    static class b extends h {
        b(RecyclerView.n nVar) {
            super(nVar, (a) null);
        }

        public int d(View view) {
            return this.f4307a.w(view) + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            return this.f4307a.A(view) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
        }

        public int f() {
            return this.f4307a.B() - this.f4307a.E();
        }

        public int g() {
            return this.f4307a.H();
        }

        public int h() {
            return (this.f4307a.B() - this.f4307a.H()) - this.f4307a.E();
        }
    }

    /* synthetic */ h(RecyclerView.n nVar, a aVar) {
        this(nVar);
    }

    public static h a(RecyclerView.n nVar) {
        return new a(nVar);
    }

    public static h b(RecyclerView.n nVar, int i10) {
        if (i10 == 0) {
            return a(nVar);
        }
        if (i10 == 1) {
            return c(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(RecyclerView.n nVar) {
        return new b(nVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    private h(RecyclerView.n nVar) {
        this.f4308b = Integer.MIN_VALUE;
        this.f4309c = new Rect();
        this.f4307a = nVar;
    }
}
