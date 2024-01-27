package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.n {
    int A = Integer.MIN_VALUE;
    private boolean B;
    d C = null;
    final a D = new a();
    private final b E = new b();
    private int F = 2;

    /* renamed from: r  reason: collision with root package name */
    int f3982r = 1;

    /* renamed from: s  reason: collision with root package name */
    private c f3983s;

    /* renamed from: t  reason: collision with root package name */
    h f3984t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3985u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3986v = false;

    /* renamed from: w  reason: collision with root package name */
    boolean f3987w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f3988x = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3989y = true;

    /* renamed from: z  reason: collision with root package name */
    int f3990z = -1;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        h f3991a;

        /* renamed from: b  reason: collision with root package name */
        int f3992b;

        /* renamed from: c  reason: collision with root package name */
        int f3993c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3994d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3995e;

        a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3992b = -1;
            this.f3993c = Integer.MIN_VALUE;
            this.f3994d = false;
            this.f3995e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3992b + ", mCoordinate=" + this.f3993c + ", mLayoutFromEnd=" + this.f3994d + ", mValid=" + this.f3995e + '}';
        }
    }

    protected static class b {
        protected b() {
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f3996a = true;

        /* renamed from: b  reason: collision with root package name */
        int f3997b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f3998c = false;

        /* renamed from: d  reason: collision with root package name */
        List<RecyclerView.c0> f3999d = null;

        c() {
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        int f4000h;

        /* renamed from: i  reason: collision with root package name */
        int f4001i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4002j;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f4000h = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4000h);
            parcel.writeInt(this.f4001i);
            parcel.writeInt(this.f4002j ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f4000h = parcel.readInt();
            this.f4001i = parcel.readInt();
            this.f4002j = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f4000h = dVar.f4000h;
            this.f4001i = dVar.f4001i;
            this.f4002j = dVar.f4002j;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.c J = RecyclerView.n.J(context, attributeSet, i10, i11);
        U0(J.f4109a);
        V0(J.f4111c);
        W0(J.f4112d);
    }

    private int I0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f3984t;
        View O0 = O0(!this.f3989y, true);
        return j.a(zVar, hVar, O0, N0(!this.f3989y, true), this, this.f3989y);
    }

    private int J0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f3984t;
        View O0 = O0(!this.f3989y, true);
        return j.b(zVar, hVar, O0, N0(!this.f3989y, true), this, this.f3989y, this.f3987w);
    }

    private int K0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f3984t;
        View O0 = O0(!this.f3989y, true);
        return j.c(zVar, hVar, O0, N0(!this.f3989y, true), this, this.f3989y);
    }

    private View N0(boolean z10, boolean z11) {
        if (this.f3987w) {
            return R0(0, t(), z10, z11);
        }
        return R0(t() - 1, -1, z10, z11);
    }

    private View O0(boolean z10, boolean z11) {
        if (this.f3987w) {
            return R0(t() - 1, -1, z10, z11);
        }
        return R0(0, t(), z10, z11);
    }

    private View S0() {
        return s(this.f3987w ? 0 : t() - 1);
    }

    private View T0() {
        return s(this.f3987w ? t() - 1 : 0);
    }

    public boolean H0() {
        return this.C == null && this.f3985u == this.f3988x;
    }

    /* access modifiers changed from: package-private */
    public c L0() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void M0() {
        if (this.f3983s == null) {
            this.f3983s = L0();
        }
    }

    public int P0() {
        View R0 = R0(0, t(), false, true);
        if (R0 == null) {
            return -1;
        }
        return I(R0);
    }

    public boolean Q() {
        return true;
    }

    public int Q0() {
        View R0 = R0(t() - 1, -1, false, true);
        if (R0 == null) {
            return -1;
        }
        return I(R0);
    }

    /* access modifiers changed from: package-private */
    public View R0(int i10, int i11, boolean z10, boolean z11) {
        M0();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        if (this.f3982r == 0) {
            return this.f4094e.a(i10, i11, i13, i12);
        }
        return this.f4095f.a(i10, i11, i13, i12);
    }

    public void U0(int i10) {
        if (i10 == 0 || i10 == 1) {
            a((String) null);
            if (i10 != this.f3982r || this.f3984t == null) {
                h b10 = h.b(this, i10);
                this.f3984t = b10;
                this.D.f3991a = b10;
                this.f3982r = i10;
                D0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void V0(boolean z10) {
        a((String) null);
        if (z10 != this.f3986v) {
            this.f3986v = z10;
            D0();
        }
    }

    public void W0(boolean z10) {
        a((String) null);
        if (this.f3988x != z10) {
            this.f3988x = z10;
            D0();
        }
    }

    public void Y(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.Y(recyclerView, uVar);
        if (this.B) {
            w0(uVar);
            uVar.b();
        }
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            accessibilityEvent.setFromIndex(P0());
            accessibilityEvent.setToIndex(Q0());
        }
    }

    public void a(String str) {
        if (this.C == null) {
            super.a(str);
        }
    }

    public boolean b() {
        return this.f3982r == 0;
    }

    public boolean c() {
        return this.f3982r == 1;
    }

    public int f(RecyclerView.z zVar) {
        return I0(zVar);
    }

    public int g(RecyclerView.z zVar) {
        return J0(zVar);
    }

    public int h(RecyclerView.z zVar) {
        return K0(zVar);
    }

    public int i(RecyclerView.z zVar) {
        return I0(zVar);
    }

    public int j(RecyclerView.z zVar) {
        return J0(zVar);
    }

    public int k(RecyclerView.z zVar) {
        return K0(zVar);
    }

    public RecyclerView.o n() {
        return new RecyclerView.o(-2, -2);
    }

    public void p0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.C = (d) parcelable;
            D0();
        }
    }

    public Parcelable q0() {
        if (this.C != null) {
            return new d(this.C);
        }
        d dVar = new d();
        if (t() > 0) {
            M0();
            boolean z10 = this.f3985u ^ this.f3987w;
            dVar.f4002j = z10;
            if (z10) {
                View S0 = S0();
                dVar.f4001i = this.f3984t.f() - this.f3984t.d(S0);
                dVar.f4000h = I(S0);
            } else {
                View T0 = T0();
                dVar.f4000h = I(T0);
                dVar.f4001i = this.f3984t.e(T0) - this.f3984t.g();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }
}
