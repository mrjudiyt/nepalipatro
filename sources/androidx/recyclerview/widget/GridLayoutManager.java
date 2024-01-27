package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {
    boolean G = false;
    int H = -1;
    final SparseIntArray I = new SparseIntArray();
    final SparseIntArray J = new SparseIntArray();
    c K = new a();
    final Rect L = new Rect();

    public static final class a extends c {
        public int b(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f3980a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f3981b = false;

        public int a(int i10, int i11) {
            int b10 = b(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int b11 = b(i14);
                i12 += b11;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = b11;
                }
            }
            return i12 + b10 > i11 ? i13 + 1 : i13;
        }

        public abstract int b(int i10);

        public void c() {
            this.f3980a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Y0(RecyclerView.n.J(context, attributeSet, i10, i11).f4110b);
    }

    private int X0(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        if (!zVar.b()) {
            return this.K.a(i10, this.H);
        }
        int d10 = uVar.d(i10);
        if (d10 != -1) {
            return this.K.a(d10, this.H);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i10);
        return 0;
    }

    public boolean H0() {
        return this.C == null && !this.G;
    }

    public int L(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3982r == 0) {
            return this.H;
        }
        if (zVar.a() < 1) {
            return 0;
        }
        return X0(uVar, zVar, zVar.a() - 1) + 1;
    }

    public void W0(boolean z10) {
        if (!z10) {
            super.W0(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void Y0(int i10) {
        if (i10 != this.H) {
            this.G = true;
            if (i10 >= 1) {
                this.H = i10;
                this.K.c();
                D0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    public void e0(RecyclerView.u uVar, RecyclerView.z zVar, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.d0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int X0 = X0(uVar, zVar, bVar.a());
        if (this.f3982r == 0) {
            cVar.Z(c.g.a(bVar.b(), bVar.c(), X0, 1, this.H > 1 && bVar.c() == this.H, false));
        } else {
            cVar.Z(c.g.a(X0, 1, bVar.b(), bVar.c(), this.H > 1 && bVar.c() == this.H, false));
        }
    }

    public void g0(RecyclerView recyclerView, int i10, int i11) {
        this.K.c();
    }

    public void h0(RecyclerView recyclerView) {
        this.K.c();
    }

    public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.K.c();
    }

    public void j0(RecyclerView recyclerView, int i10, int i11) {
        this.K.c();
    }

    public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.K.c();
    }

    public RecyclerView.o n() {
        if (this.f3982r == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public int v(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3982r == 1) {
            return this.H;
        }
        if (zVar.a() < 1) {
            return 0;
        }
        return X0(uVar, zVar, zVar.a() - 1) + 1;
    }

    public static class b extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        int f3978e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f3979f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int b() {
            return this.f3978e;
        }

        public int c() {
            return this.f3979f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
