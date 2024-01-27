package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.n {
    int A = -1;
    int B = Integer.MIN_VALUE;
    d C = new d();
    private int D = 2;
    private boolean E;
    private boolean F;
    private e G;
    private final Rect H = new Rect();
    private final b I = new b();
    private boolean J = false;
    private boolean K = true;
    private final Runnable L = new a();

    /* renamed from: r  reason: collision with root package name */
    private int f4145r = -1;

    /* renamed from: s  reason: collision with root package name */
    f[] f4146s;

    /* renamed from: t  reason: collision with root package name */
    h f4147t;

    /* renamed from: u  reason: collision with root package name */
    h f4148u;

    /* renamed from: v  reason: collision with root package name */
    private int f4149v;

    /* renamed from: w  reason: collision with root package name */
    private final f f4150w;

    /* renamed from: x  reason: collision with root package name */
    boolean f4151x = false;

    /* renamed from: y  reason: collision with root package name */
    boolean f4152y = false;

    /* renamed from: z  reason: collision with root package name */
    private BitSet f4153z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.I0();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f4155a;

        /* renamed from: b  reason: collision with root package name */
        int f4156b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4157c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4158d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4159e;

        /* renamed from: f  reason: collision with root package name */
        int[] f4160f;

        b() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f4155a = -1;
            this.f4156b = Integer.MIN_VALUE;
            this.f4157c = false;
            this.f4158d = false;
            this.f4159e = false;
            int[] iArr = this.f4160f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        f f4162e;

        /* renamed from: f  reason: collision with root package name */
        boolean f4163f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int b() {
            f fVar = this.f4162e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f4184e;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        int f4170h;

        /* renamed from: i  reason: collision with root package name */
        int f4171i;

        /* renamed from: j  reason: collision with root package name */
        int f4172j;

        /* renamed from: k  reason: collision with root package name */
        int[] f4173k;

        /* renamed from: l  reason: collision with root package name */
        int f4174l;

        /* renamed from: m  reason: collision with root package name */
        int[] f4175m;

        /* renamed from: n  reason: collision with root package name */
        List<d.a> f4176n;

        /* renamed from: o  reason: collision with root package name */
        boolean f4177o;

        /* renamed from: p  reason: collision with root package name */
        boolean f4178p;

        /* renamed from: q  reason: collision with root package name */
        boolean f4179q;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4170h);
            parcel.writeInt(this.f4171i);
            parcel.writeInt(this.f4172j);
            if (this.f4172j > 0) {
                parcel.writeIntArray(this.f4173k);
            }
            parcel.writeInt(this.f4174l);
            if (this.f4174l > 0) {
                parcel.writeIntArray(this.f4175m);
            }
            parcel.writeInt(this.f4177o ? 1 : 0);
            parcel.writeInt(this.f4178p ? 1 : 0);
            parcel.writeInt(this.f4179q ? 1 : 0);
            parcel.writeList(this.f4176n);
        }

        e(Parcel parcel) {
            this.f4170h = parcel.readInt();
            this.f4171i = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4172j = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4173k = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4174l = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4175m = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f4177o = parcel.readInt() == 1;
            this.f4178p = parcel.readInt() == 1;
            this.f4179q = parcel.readInt() == 1 ? true : z10;
            this.f4176n = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4172j = eVar.f4172j;
            this.f4170h = eVar.f4170h;
            this.f4171i = eVar.f4171i;
            this.f4173k = eVar.f4173k;
            this.f4174l = eVar.f4174l;
            this.f4175m = eVar.f4175m;
            this.f4177o = eVar.f4177o;
            this.f4178p = eVar.f4178p;
            this.f4179q = eVar.f4179q;
            this.f4176n = eVar.f4176n;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f4180a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f4181b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f4182c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f4183d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f4184e;

        f(int i10) {
            this.f4184e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a e10;
            ArrayList<View> arrayList = this.f4180a;
            View view = arrayList.get(arrayList.size() - 1);
            c f10 = f(view);
            this.f4182c = StaggeredGridLayoutManager.this.f4147t.d(view);
            if (f10.f4163f && (e10 = StaggeredGridLayoutManager.this.C.e(f10.a())) != null && e10.f4167i == 1) {
                this.f4182c += e10.b(this.f4184e);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d.a e10;
            View view = this.f4180a.get(0);
            c f10 = f(view);
            this.f4181b = StaggeredGridLayoutManager.this.f4147t.e(view);
            if (f10.f4163f && (e10 = StaggeredGridLayoutManager.this.C.e(f10.a())) != null && e10.f4167i == -1) {
                this.f4181b -= e10.b(this.f4184e);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f4180a.clear();
            i();
            this.f4183d = 0;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            int i10 = this.f4182c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            a();
            return this.f4182c;
        }

        /* access modifiers changed from: package-private */
        public int e(int i10) {
            int i11 = this.f4182c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4180a.size() == 0) {
                return i10;
            }
            a();
            return this.f4182c;
        }

        /* access modifiers changed from: package-private */
        public c f(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i10 = this.f4181b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            b();
            return this.f4181b;
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int i11 = this.f4181b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4180a.size() == 0) {
                return i10;
            }
            b();
            return this.f4181b;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f4181b = Integer.MIN_VALUE;
            this.f4182c = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.c J2 = RecyclerView.n.J(context, attributeSet, i10, i11);
        X0(J2.f4109a);
        Z0(J2.f4110b);
        Y0(J2.f4111c);
        this.f4150w = new f();
        N0();
    }

    private boolean J0(f fVar) {
        if (this.f4152y) {
            if (fVar.d() < this.f4147t.f()) {
                ArrayList<View> arrayList = fVar.f4180a;
                return !fVar.f(arrayList.get(arrayList.size() - 1)).f4163f;
            }
        } else if (fVar.g() > this.f4147t.g()) {
            return !fVar.f(fVar.f4180a.get(0)).f4163f;
        }
        return false;
    }

    private int K0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        return j.a(zVar, this.f4147t, P0(!this.K), O0(!this.K), this, this.K);
    }

    private int L0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        return j.b(zVar, this.f4147t, P0(!this.K), O0(!this.K), this, this.K, this.f4152y);
    }

    private int M0(RecyclerView.z zVar) {
        if (t() == 0) {
            return 0;
        }
        return j.c(zVar, this.f4147t, P0(!this.K), O0(!this.K), this, this.K);
    }

    private void N0() {
        this.f4147t = h.b(this, this.f4149v);
        this.f4148u = h.b(this, 1 - this.f4149v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4152y
            if (r0 == 0) goto L_0x0009
            int r0 = r6.S0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.R0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.C
            r4.f(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.C
            r9.i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.C
            r7.h(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.C
            r9.i(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.C
            r9.h(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f4152y
            if (r7 == 0) goto L_0x004d
            int r7 = r6.R0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.S0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.D0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(int, int, int):void");
    }

    public boolean H0() {
        return this.G == null;
    }

    /* access modifiers changed from: package-private */
    public boolean I0() {
        int i10;
        int i11;
        if (t() == 0 || this.D == 0 || !P()) {
            return false;
        }
        if (this.f4152y) {
            i11 = S0();
            i10 = R0();
        } else {
            i11 = R0();
            i10 = S0();
        }
        if (i11 == 0 && U0() != null) {
            this.C.a();
            E0();
            D0();
            return true;
        } else if (!this.J) {
            return false;
        } else {
            int i12 = this.f4152y ? -1 : 1;
            int i13 = i10 + 1;
            d.a d10 = this.C.d(i11, i13, i12, true);
            if (d10 == null) {
                this.J = false;
                this.C.c(i13);
                return false;
            }
            d.a d11 = this.C.d(i11, d10.f4166h, i12 * -1, true);
            if (d11 == null) {
                this.C.c(d10.f4166h);
            } else {
                this.C.c(d11.f4166h + 1);
            }
            E0();
            D0();
            return true;
        }
    }

    public int L(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4149v == 0) {
            return this.f4145r;
        }
        return super.L(uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public View O0(boolean z10) {
        int g10 = this.f4147t.g();
        int f10 = this.f4147t.f();
        View view = null;
        for (int t10 = t() - 1; t10 >= 0; t10--) {
            View s10 = s(t10);
            int e10 = this.f4147t.e(s10);
            int d10 = this.f4147t.d(s10);
            if (d10 > g10 && e10 < f10) {
                if (d10 <= f10 || !z10) {
                    return s10;
                }
                if (view == null) {
                    view = s10;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View P0(boolean z10) {
        int g10 = this.f4147t.g();
        int f10 = this.f4147t.f();
        int t10 = t();
        View view = null;
        for (int i10 = 0; i10 < t10; i10++) {
            View s10 = s(i10);
            int e10 = this.f4147t.e(s10);
            if (this.f4147t.d(s10) > g10 && e10 < f10) {
                if (e10 >= g10 || !z10) {
                    return s10;
                }
                if (view == null) {
                    view = s10;
                }
            }
        }
        return view;
    }

    public boolean Q() {
        return this.D != 0;
    }

    /* access modifiers changed from: package-private */
    public int Q0() {
        View view;
        if (this.f4152y) {
            view = O0(true);
        } else {
            view = P0(true);
        }
        if (view == null) {
            return -1;
        }
        return I(view);
    }

    /* access modifiers changed from: package-private */
    public int R0() {
        if (t() == 0) {
            return 0;
        }
        return I(s(0));
    }

    /* access modifiers changed from: package-private */
    public int S0() {
        int t10 = t();
        if (t10 == 0) {
            return 0;
        }
        return I(s(t10 - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View U0() {
        /*
            r12 = this;
            int r0 = r12.t()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4145r
            r2.<init>(r3)
            int r3 = r12.f4145r
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4149v
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.W0()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f4152y
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.s(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4162e
            int r9 = r9.f4184e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4162e
            boolean r9 = r12.J0(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4162e
            int r9 = r9.f4184e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4163f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.s(r9)
            boolean r10 = r12.f4152y
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.h r10 = r12.f4147t
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.f4147t
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.h r10 = r12.f4147t
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.h r11 = r12.f4147t
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4162e
            int r8 = r8.f4184e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4162e
            int r9 = r9.f4184e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0():android.view.View");
    }

    public void V0() {
        this.C.a();
        D0();
    }

    /* access modifiers changed from: package-private */
    public boolean W0() {
        return C() == 1;
    }

    public void X0(int i10) {
        if (i10 == 0 || i10 == 1) {
            a((String) null);
            if (i10 != this.f4149v) {
                this.f4149v = i10;
                h hVar = this.f4147t;
                this.f4147t = this.f4148u;
                this.f4148u = hVar;
                D0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void Y(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.Y(recyclerView, uVar);
        z0(this.L);
        for (int i10 = 0; i10 < this.f4145r; i10++) {
            this.f4146s[i10].c();
        }
        recyclerView.requestLayout();
    }

    public void Y0(boolean z10) {
        a((String) null);
        e eVar = this.G;
        if (!(eVar == null || eVar.f4177o == z10)) {
            eVar.f4177o = z10;
        }
        this.f4151x = z10;
        D0();
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            View P0 = P0(false);
            View O0 = O0(false);
            if (P0 != null && O0 != null) {
                int I2 = I(P0);
                int I3 = I(O0);
                if (I2 < I3) {
                    accessibilityEvent.setFromIndex(I2);
                    accessibilityEvent.setToIndex(I3);
                    return;
                }
                accessibilityEvent.setFromIndex(I3);
                accessibilityEvent.setToIndex(I2);
            }
        }
    }

    public void Z0(int i10) {
        a((String) null);
        if (i10 != this.f4145r) {
            V0();
            this.f4145r = i10;
            this.f4153z = new BitSet(this.f4145r);
            this.f4146s = new f[this.f4145r];
            for (int i11 = 0; i11 < this.f4145r; i11++) {
                this.f4146s[i11] = new f(i11);
            }
            D0();
        }
    }

    public void a(String str) {
        if (this.G == null) {
            super.a(str);
        }
    }

    public boolean b() {
        return this.f4149v == 0;
    }

    public boolean c() {
        return this.f4149v == 1;
    }

    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    public void e0(RecyclerView.u uVar, RecyclerView.z zVar, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.d0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.f4149v == 0) {
            int b10 = cVar2.b();
            boolean z10 = cVar2.f4163f;
            cVar.Z(c.g.a(b10, z10 ? this.f4145r : 1, -1, -1, z10, false));
            return;
        }
        int b11 = cVar2.b();
        boolean z11 = cVar2.f4163f;
        cVar.Z(c.g.a(-1, -1, b11, z11 ? this.f4145r : 1, z11, false));
    }

    public int f(RecyclerView.z zVar) {
        return K0(zVar);
    }

    public int g(RecyclerView.z zVar) {
        return L0(zVar);
    }

    public void g0(RecyclerView recyclerView, int i10, int i11) {
        T0(i10, i11, 1);
    }

    public int h(RecyclerView.z zVar) {
        return M0(zVar);
    }

    public void h0(RecyclerView recyclerView) {
        this.C.a();
        D0();
    }

    public int i(RecyclerView.z zVar) {
        return K0(zVar);
    }

    public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        T0(i10, i11, 8);
    }

    public int j(RecyclerView.z zVar) {
        return L0(zVar);
    }

    public void j0(RecyclerView recyclerView, int i10, int i11) {
        T0(i10, i11, 2);
    }

    public int k(RecyclerView.z zVar) {
        return M0(zVar);
    }

    public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        T0(i10, i11, 4);
    }

    public RecyclerView.o n() {
        if (this.f4149v == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void p0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.G = (e) parcelable;
            D0();
        }
    }

    public Parcelable q0() {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        if (this.G != null) {
            return new e(this.G);
        }
        e eVar = new e();
        eVar.f4177o = this.f4151x;
        eVar.f4178p = this.E;
        eVar.f4179q = this.F;
        d dVar = this.C;
        if (dVar == null || (iArr = dVar.f4164a) == null) {
            eVar.f4174l = 0;
        } else {
            eVar.f4175m = iArr;
            eVar.f4174l = iArr.length;
            eVar.f4176n = dVar.f4165b;
        }
        if (t() > 0) {
            if (this.E) {
                i10 = S0();
            } else {
                i10 = R0();
            }
            eVar.f4170h = i10;
            eVar.f4171i = Q0();
            int i13 = this.f4145r;
            eVar.f4172j = i13;
            eVar.f4173k = new int[i13];
            for (int i14 = 0; i14 < this.f4145r; i14++) {
                if (this.E) {
                    i11 = this.f4146s[i14].e(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f4147t.f();
                    } else {
                        eVar.f4173k[i14] = i11;
                    }
                } else {
                    i11 = this.f4146s[i14].h(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f4147t.g();
                    } else {
                        eVar.f4173k[i14] = i11;
                    }
                }
                i11 -= i12;
                eVar.f4173k[i14] = i11;
            }
        } else {
            eVar.f4170h = -1;
            eVar.f4171i = -1;
            eVar.f4172j = 0;
        }
        return eVar;
    }

    public void r0(int i10) {
        if (i10 == 0) {
            I0();
        }
    }

    public int v(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4149v == 1) {
            return this.f4145r;
        }
        return super.v(uVar, zVar);
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f4164a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f4165b;

        d() {
        }

        private int g(int i10) {
            if (this.f4165b == null) {
                return -1;
            }
            a e10 = e(i10);
            if (e10 != null) {
                this.f4165b.remove(e10);
            }
            int size = this.f4165b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f4165b.get(i11).f4166h >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f4165b.remove(i11);
            return this.f4165b.get(i11).f4166h;
        }

        private void j(int i10, int i11) {
            List<a> list = this.f4165b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f4165b.get(size);
                    int i12 = aVar.f4166h;
                    if (i12 >= i10) {
                        aVar.f4166h = i12 + i11;
                    }
                }
            }
        }

        private void k(int i10, int i11) {
            List<a> list = this.f4165b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f4165b.get(size);
                    int i13 = aVar.f4166h;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f4165b.remove(size);
                        } else {
                            aVar.f4166h = i13 - i11;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f4164a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4165b = null;
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            int[] iArr = this.f4164a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f4164a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[l(i10)];
                this.f4164a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4164a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int c(int i10) {
            List<a> list = this.f4165b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4165b.get(size).f4166h >= i10) {
                        this.f4165b.remove(size);
                    }
                }
            }
            return f(i10);
        }

        public a d(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f4165b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f4165b.get(i13);
                int i14 = aVar.f4166h;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f4167i == i12 || (z10 && aVar.f4169k))) {
                    return aVar;
                }
            }
            return null;
        }

        public a e(int i10) {
            List<a> list = this.f4165b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4165b.get(size);
                if (aVar.f4166h == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int f(int i10) {
            int[] iArr = this.f4164a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int g10 = g(i10);
            if (g10 == -1) {
                int[] iArr2 = this.f4164a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4164a.length;
            }
            int i11 = g10 + 1;
            Arrays.fill(this.f4164a, i10, i11, -1);
            return i11;
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11) {
            int[] iArr = this.f4164a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f4164a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f4164a, i10, i12, -1);
                j(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void i(int i10, int i11) {
            int[] iArr = this.f4164a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f4164a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f4164a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                k(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int length = this.f4164a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0068a();

            /* renamed from: h  reason: collision with root package name */
            int f4166h;

            /* renamed from: i  reason: collision with root package name */
            int f4167i;

            /* renamed from: j  reason: collision with root package name */
            int[] f4168j;

            /* renamed from: k  reason: collision with root package name */
            boolean f4169k;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C0068a implements Parcelable.Creator<a> {
                C0068a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f4166h = parcel.readInt();
                this.f4167i = parcel.readInt();
                this.f4169k = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4168j = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int b(int i10) {
                int[] iArr = this.f4168j;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4166h + ", mGapDir=" + this.f4167i + ", mHasUnwantedGapAfter=" + this.f4169k + ", mGapPerSpan=" + Arrays.toString(this.f4168j) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4166h);
                parcel.writeInt(this.f4167i);
                parcel.writeInt(this.f4169k ? 1 : 0);
                int[] iArr = this.f4168j;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4168j);
            }

            a() {
            }
        }
    }
}
