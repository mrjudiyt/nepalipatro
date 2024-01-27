package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import s.d;
import s.i;
import v.e;
import w.b;
import w.e;

/* compiled from: ConstraintWidgetContainer */
public class f extends l {
    b M0 = new b(this);
    public e N0 = new e(this);
    private int O0;
    protected b.C0206b P0 = null;
    private boolean Q0 = false;
    protected d R0 = new d();
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* renamed from: a1  reason: collision with root package name */
    public boolean f12202a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f12203b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f12204c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public int f12205d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public int f12206e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private int f12207f1 = 257;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f12208g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f12209h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f12210i1 = false;

    /* renamed from: j1  reason: collision with root package name */
    int f12211j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    private WeakReference<d> f12212k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    private WeakReference<d> f12213l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    private WeakReference<d> f12214m1 = null;

    /* renamed from: n1  reason: collision with root package name */
    private WeakReference<d> f12215n1 = null;

    /* renamed from: o1  reason: collision with root package name */
    HashSet<e> f12216o1 = new HashSet<>();

    /* renamed from: p1  reason: collision with root package name */
    public b.a f12217p1 = new b.a();

    public static boolean O1(int i10, e eVar, b.C0206b bVar, b.a aVar, int i11) {
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f12491e = 0;
            aVar.f12492f = 0;
            return false;
        }
        aVar.f12487a = eVar.y();
        aVar.f12488b = eVar.R();
        aVar.f12489c = eVar.U();
        aVar.f12490d = eVar.v();
        aVar.f12495i = false;
        aVar.f12496j = i11;
        e.b bVar2 = aVar.f12487a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f12488b == bVar3;
        boolean z12 = z10 && eVar.f12150d0 > 0.0f;
        boolean z13 = z11 && eVar.f12150d0 > 0.0f;
        if (z10 && eVar.Y(0) && eVar.f12187w == 0 && !z12) {
            aVar.f12487a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f12189x == 0) {
                aVar.f12487a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.Y(1) && eVar.f12189x == 0 && !z13) {
            aVar.f12488b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f12187w == 0) {
                aVar.f12488b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.l0()) {
            aVar.f12487a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.m0()) {
            aVar.f12488b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f12191y[0] == 4) {
                aVar.f12487a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar4 = aVar.f12488b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f12490d;
                } else {
                    aVar.f12487a = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i13 = aVar.f12492f;
                }
                aVar.f12487a = bVar5;
                aVar.f12489c = (int) (eVar.t() * ((float) i13));
            }
        }
        if (z13) {
            if (eVar.f12191y[1] == 4) {
                aVar.f12488b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar6 = aVar.f12487a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f12489c;
                } else {
                    aVar.f12488b = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i12 = aVar.f12491e;
                }
                aVar.f12488b = bVar7;
                if (eVar.u() == -1) {
                    aVar.f12490d = (int) (((float) i12) / eVar.t());
                } else {
                    aVar.f12490d = (int) (eVar.t() * ((float) i12));
                }
            }
        }
        bVar.b(eVar, aVar);
        eVar.h1(aVar.f12491e);
        eVar.I0(aVar.f12492f);
        eVar.H0(aVar.f12494h);
        eVar.x0(aVar.f12493g);
        aVar.f12496j = b.a.f12484k;
        return aVar.f12495i;
    }

    private void Q1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void u1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, L1());
        this.W0++;
    }

    private void x1(d dVar, i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void y1(d dVar, i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void z1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, L1());
        this.X0++;
    }

    /* access modifiers changed from: package-private */
    public void A1(d dVar) {
        WeakReference<d> weakReference = this.f12214m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f12214m1.get()).d()) {
            this.f12214m1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void B1(d dVar) {
        WeakReference<d> weakReference = this.f12212k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f12212k1.get()).d()) {
            this.f12212k1 = new WeakReference<>(dVar);
        }
    }

    public boolean C1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean D1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean E1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public b.C0206b F1() {
        return this.P0;
    }

    public int G1() {
        return this.f12207f1;
    }

    public d H1() {
        return this.R0;
    }

    public void I1() {
        this.N0.j();
    }

    public void J1() {
        this.N0.k();
    }

    public boolean K1() {
        return this.f12210i1;
    }

    public boolean L1() {
        return this.Q0;
    }

    public void M(StringBuilder sb) {
        sb.append(this.f12171o + ":{\n");
        sb.append("  actualWidth:" + this.f12146b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f12148c0);
        sb.append("\n");
        Iterator<e> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean M1() {
        return this.f12209h1;
    }

    public long N1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17;
        this.S0 = i19;
        int i20 = i18;
        this.T0 = i20;
        return this.M0.d(this, i10, i19, i20, i11, i12, i13, i14, i15, i16);
    }

    public boolean P1(int i10) {
        return (this.f12207f1 & i10) == i10;
    }

    public void R1(b.C0206b bVar) {
        this.P0 = bVar;
        this.N0.n(bVar);
    }

    public void S1(int i10) {
        this.f12207f1 = i10;
        d.f11219r = P1(512);
    }

    public void T1(int i10) {
        this.O0 = i10;
    }

    public void U1(boolean z10) {
        this.Q0 = z10;
    }

    public boolean V1(d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = P1(64);
        n1(dVar, P1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.n1(dVar, P1);
            if (eVar.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void W1() {
        this.M0.e(this);
    }

    public void m1(boolean z10, boolean z11) {
        super.m1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).m1(z10, z11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0312  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f12154f0 = r2
            r1.f12156g0 = r2
            r1.f12209h1 = r2
            r1.f12210i1 = r2
            java.util.ArrayList<v.e> r0 = r1.L0
            int r3 = r0.size()
            int r0 = r18.U()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.v()
            int r4 = java.lang.Math.max(r2, r4)
            v.e$b[] r5 = r1.Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.O0
            if (r8 != 0) goto L_0x0088
            int r8 = r1.f12207f1
            boolean r8 = v.j.b(r8, r6)
            if (r8 == 0) goto L_0x0088
            w.b$b r8 = r18.F1()
            w.h.h(r1, r8)
            r8 = 0
        L_0x003c:
            if (r8 >= r3) goto L_0x0088
            java.util.ArrayList<v.e> r9 = r1.L0
            java.lang.Object r9 = r9.get(r8)
            v.e r9 = (v.e) r9
            boolean r10 = r9.k0()
            if (r10 == 0) goto L_0x0085
            boolean r10 = r9 instanceof v.g
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof v.a
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof v.k
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9.j0()
            if (r10 != 0) goto L_0x0085
            v.e$b r10 = r9.s(r2)
            v.e$b r11 = r9.s(r6)
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0076
            int r10 = r9.f12187w
            if (r10 == r6) goto L_0x0076
            if (r11 != r12) goto L_0x0076
            int r10 = r9.f12189x
            if (r10 == r6) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 != 0) goto L_0x0085
            w.b$a r10 = new w.b$a
            r10.<init>()
            w.b$b r11 = r1.P0
            int r12 = w.b.a.f12484k
            O1(r2, r9, r11, r10, r12)
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0088:
            r8 = 2
            if (r3 <= r8) goto L_0x00d1
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0091
            if (r7 != r9) goto L_0x00d1
        L_0x0091:
            int r10 = r1.f12207f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = v.j.b(r10, r11)
            if (r10 == 0) goto L_0x00d1
            w.b$b r10 = r18.F1()
            boolean r10 = w.i.c(r1, r10)
            if (r10 == 0) goto L_0x00d1
            if (r5 != r9) goto L_0x00b9
            int r10 = r18.U()
            if (r0 >= r10) goto L_0x00b5
            if (r0 <= 0) goto L_0x00b5
            r1.h1(r0)
            r1.f12209h1 = r6
            goto L_0x00b9
        L_0x00b5:
            int r0 = r18.U()
        L_0x00b9:
            if (r7 != r9) goto L_0x00cd
            int r9 = r18.v()
            if (r4 >= r9) goto L_0x00c9
            if (r4 <= 0) goto L_0x00c9
            r1.I0(r4)
            r1.f12210i1 = r6
            goto L_0x00cd
        L_0x00c9:
            int r4 = r18.v()
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = 1
            goto L_0x00d4
        L_0x00d1:
            r9 = r4
            r4 = r0
            r0 = 0
        L_0x00d4:
            r10 = 64
            boolean r11 = r1.P1(r10)
            if (r11 != 0) goto L_0x00e7
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.P1(r11)
            if (r11 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = 0
            goto L_0x00e8
        L_0x00e7:
            r11 = 1
        L_0x00e8:
            s.d r12 = r1.R0
            r12.f11235h = r2
            r12.f11236i = r2
            int r13 = r1.f12207f1
            if (r13 == 0) goto L_0x00f6
            if (r11 == 0) goto L_0x00f6
            r12.f11236i = r6
        L_0x00f6:
            java.util.ArrayList<v.e> r11 = r1.L0
            v.e$b r12 = r18.y()
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0109
            v.e$b r12 = r18.R()
            if (r12 != r13) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r12 = 0
            goto L_0x010a
        L_0x0109:
            r12 = 1
        L_0x010a:
            r18.Q1()
            r13 = 0
        L_0x010e:
            if (r13 >= r3) goto L_0x0124
            java.util.ArrayList<v.e> r14 = r1.L0
            java.lang.Object r14 = r14.get(r13)
            v.e r14 = (v.e) r14
            boolean r15 = r14 instanceof v.l
            if (r15 == 0) goto L_0x0121
            v.l r14 = (v.l) r14
            r14.p1()
        L_0x0121:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0124:
            boolean r10 = r1.P1(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x012b:
            if (r14 == 0) goto L_0x0319
            int r15 = r0 + 1
            s.d r0 = r1.R0     // Catch:{ Exception -> 0x01dc }
            r0.D()     // Catch:{ Exception -> 0x01dc }
            r18.Q1()     // Catch:{ Exception -> 0x01dc }
            s.d r0 = r1.R0     // Catch:{ Exception -> 0x01dc }
            r1.k(r0)     // Catch:{ Exception -> 0x01dc }
            r0 = 0
        L_0x013d:
            if (r0 >= r3) goto L_0x0151
            java.util.ArrayList<v.e> r6 = r1.L0     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01dc }
            v.e r6 = (v.e) r6     // Catch:{ Exception -> 0x01dc }
            s.d r2 = r1.R0     // Catch:{ Exception -> 0x01dc }
            r6.k(r2)     // Catch:{ Exception -> 0x01dc }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x013d
        L_0x0151:
            s.d r0 = r1.R0     // Catch:{ Exception -> 0x01dc }
            boolean r14 = r1.t1(r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.ref.WeakReference<v.d> r0 = r1.f12212k1     // Catch:{ Exception -> 0x01dc }
            r2 = 0
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0177
            java.lang.ref.WeakReference<v.d> r0 = r1.f12212k1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x01dc }
            s.d r6 = r1.R0     // Catch:{ Exception -> 0x01dc }
            v.d r8 = r1.P     // Catch:{ Exception -> 0x01dc }
            s.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f12212k1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0177:
            java.lang.ref.WeakReference<v.d> r0 = r1.f12214m1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.ref.WeakReference<v.d> r0 = r1.f12214m1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x01dc }
            s.d r6 = r1.R0     // Catch:{ Exception -> 0x01dc }
            v.d r8 = r1.R     // Catch:{ Exception -> 0x01dc }
            s.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f12214m1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0196:
            java.lang.ref.WeakReference<v.d> r0 = r1.f12213l1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.ref.WeakReference<v.d> r0 = r1.f12213l1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x01dc }
            s.d r6 = r1.R0     // Catch:{ Exception -> 0x01dc }
            v.d r8 = r1.O     // Catch:{ Exception -> 0x01dc }
            s.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f12213l1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01b5:
            java.lang.ref.WeakReference<v.d> r0 = r1.f12215n1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.ref.WeakReference<v.d> r0 = r1.f12215n1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x01dc }
            s.d r6 = r1.R0     // Catch:{ Exception -> 0x01dc }
            v.d r8 = r1.Q     // Catch:{ Exception -> 0x01dc }
            s.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f12215n1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01d4:
            if (r14 == 0) goto L_0x01f6
            s.d r0 = r1.R0     // Catch:{ Exception -> 0x01dc }
            r0.z()     // Catch:{ Exception -> 0x01dc }
            goto L_0x01f6
        L_0x01dc:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f6:
            if (r14 == 0) goto L_0x0201
            s.d r0 = r1.R0
            boolean[] r2 = v.j.f12219a
            boolean r0 = r1.V1(r0, r2)
            goto L_0x021a
        L_0x0201:
            s.d r0 = r1.R0
            r1.n1(r0, r10)
            r0 = 0
        L_0x0207:
            if (r0 >= r3) goto L_0x0219
            java.util.ArrayList<v.e> r2 = r1.L0
            java.lang.Object r2 = r2.get(r0)
            v.e r2 = (v.e) r2
            s.d r6 = r1.R0
            r2.n1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0207
        L_0x0219:
            r0 = 0
        L_0x021a:
            r2 = 8
            if (r12 == 0) goto L_0x028b
            if (r15 >= r2) goto L_0x028b
            boolean[] r6 = v.j.f12219a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x028b
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x022a:
            if (r6 >= r3) goto L_0x0254
            java.util.ArrayList<v.e> r2 = r1.L0
            java.lang.Object r2 = r2.get(r6)
            v.e r2 = (v.e) r2
            r16 = r0
            int r0 = r2.f12154f0
            int r17 = r2.U()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f12156g0
            int r2 = r2.v()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x022a
        L_0x0254:
            r16 = r0
            int r0 = r1.f12168m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f12170n0
            int r2 = java.lang.Math.max(r2, r8)
            v.e$b r6 = v.e.b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0277
            int r8 = r18.U()
            if (r8 >= r0) goto L_0x0277
            r1.h1(r0)
            v.e$b[] r0 = r1.Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0277:
            if (r7 != r6) goto L_0x028d
            int r0 = r18.v()
            if (r0 >= r2) goto L_0x028d
            r1.I0(r2)
            v.e$b[] r0 = r1.Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028d
        L_0x028b:
            r16 = r0
        L_0x028d:
            int r0 = r1.f12168m0
            int r2 = r18.U()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.U()
            if (r0 <= r2) goto L_0x02aa
            r1.h1(r0)
            v.e$b[] r0 = r1.Z
            v.e$b r2 = v.e.b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02aa:
            int r0 = r1.f12170n0
            int r2 = r18.v()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.v()
            if (r0 <= r2) goto L_0x02c8
            r1.I0(r0)
            v.e$b[] r0 = r1.Z
            v.e$b r2 = v.e.b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L_0x02ca
        L_0x02c8:
            r6 = 1
            r2 = r13
        L_0x02ca:
            if (r2 != 0) goto L_0x0309
            v.e$b[] r0 = r1.Z
            r8 = 0
            r0 = r0[r8]
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02eb
            if (r4 <= 0) goto L_0x02eb
            int r0 = r18.U()
            if (r0 <= r4) goto L_0x02eb
            r1.f12209h1 = r6
            v.e$b[] r0 = r1.Z
            v.e$b r2 = v.e.b.FIXED
            r0[r8] = r2
            r1.h1(r4)
            r2 = 1
            r16 = 1
        L_0x02eb:
            v.e$b[] r0 = r1.Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0309
            if (r9 <= 0) goto L_0x0309
            int r0 = r18.v()
            if (r0 <= r9) goto L_0x0309
            r1.f12210i1 = r6
            v.e$b[] r0 = r1.Z
            v.e$b r2 = v.e.b.FIXED
            r0[r6] = r2
            r1.I0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030e
        L_0x0309:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030e:
            if (r15 <= r0) goto L_0x0312
            r14 = 0
            goto L_0x0313
        L_0x0312:
            r14 = r2
        L_0x0313:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x012b
        L_0x0319:
            r1.L0 = r11
            if (r13 == 0) goto L_0x0325
            v.e$b[] r0 = r1.Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0325:
            s.d r0 = r1.R0
            s.c r0 = r0.v()
            r1.t0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.p1():void");
    }

    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f12208g1 = false;
        super.r0();
    }

    /* access modifiers changed from: package-private */
    public void s1(e eVar, int i10) {
        if (i10 == 0) {
            u1(eVar);
        } else if (i10 == 1) {
            z1(eVar);
        }
    }

    public boolean t1(d dVar) {
        boolean P1 = P1(64);
        g(dVar, P1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).v1();
                }
            }
        }
        this.f12216o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.f12216o1.add(eVar3);
                } else {
                    eVar3.g(dVar, P1);
                }
            }
        }
        while (this.f12216o1.size() > 0) {
            int size2 = this.f12216o1.size();
            Iterator<e> it = this.f12216o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.r1(this.f12216o1)) {
                    kVar.g(dVar, P1);
                    this.f12216o1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f12216o1.size()) {
                Iterator<e> it2 = this.f12216o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, P1);
                }
                this.f12216o1.clear();
            }
        }
        if (d.f11219r) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                j.a(this, dVar, eVar5);
                eVar5.g(dVar, P1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = this.L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(e.b.FIXED);
                    }
                    eVar6.g(dVar, P1);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, P1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, (ArrayList<e>) null, 1);
        }
        return true;
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.f12215n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f12215n1.get()).d()) {
            this.f12215n1 = new WeakReference<>(dVar);
        }
    }

    public void w1(d dVar) {
        WeakReference<d> weakReference = this.f12213l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f12213l1.get()).d()) {
            this.f12213l1 = new WeakReference<>(dVar);
        }
    }
}
