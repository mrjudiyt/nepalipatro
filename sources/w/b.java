package w;

import java.util.ArrayList;
import s.d;
import v.d;
import v.e;
import v.f;
import v.g;
import v.h;
import v.j;
import v.k;

/* compiled from: BasicMeasure */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<e> f12481a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f12482b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f12483c;

    /* compiled from: BasicMeasure */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f12484k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f12485l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f12486m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f12487a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f12488b;

        /* renamed from: c  reason: collision with root package name */
        public int f12489c;

        /* renamed from: d  reason: collision with root package name */
        public int f12490d;

        /* renamed from: e  reason: collision with root package name */
        public int f12491e;

        /* renamed from: f  reason: collision with root package name */
        public int f12492f;

        /* renamed from: g  reason: collision with root package name */
        public int f12493g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12494h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12495i;

        /* renamed from: j  reason: collision with root package name */
        public int f12496j;
    }

    /* renamed from: w.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0206b {
        void a();

        void b(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f12483c = fVar;
    }

    private boolean a(C0206b bVar, e eVar, int i10) {
        this.f12482b.f12487a = eVar.y();
        this.f12482b.f12488b = eVar.R();
        this.f12482b.f12489c = eVar.U();
        this.f12482b.f12490d = eVar.v();
        a aVar = this.f12482b;
        aVar.f12495i = false;
        aVar.f12496j = i10;
        e.b bVar2 = aVar.f12487a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f12488b == bVar3;
        boolean z12 = z10 && eVar.f12150d0 > 0.0f;
        boolean z13 = z11 && eVar.f12150d0 > 0.0f;
        if (z12 && eVar.f12191y[0] == 4) {
            aVar.f12487a = e.b.FIXED;
        }
        if (z13 && eVar.f12191y[1] == 4) {
            aVar.f12488b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.h1(this.f12482b.f12491e);
        eVar.I0(this.f12482b.f12492f);
        eVar.H0(this.f12482b.f12494h);
        eVar.x0(this.f12482b.f12493g);
        a aVar2 = this.f12482b;
        aVar2.f12496j = a.f12484k;
        return aVar2.f12495i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f12150d0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(v.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<v.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            w.b$b r2 = r13.F1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<v.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5 instanceof v.g
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof v.a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            w.l r6 = r5.f12151e
            if (r6 == 0) goto L_0x0047
            w.n r7 = r5.f12153f
            if (r7 == 0) goto L_0x0047
            w.g r6 = r6.f12565e
            boolean r6 = r6.f12517j
            if (r6 == 0) goto L_0x0047
            w.g r6 = r7.f12565e
            boolean r6 = r6.f12517j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            v.e$b r6 = r5.s(r3)
            r7 = 1
            v.e$b r8 = r5.s(r7)
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f12187w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f12189x
            if (r10 == r7) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof v.k
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f12187w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L_0x007c
            r10 = 1
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f12189x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L_0x008b
            r10 = 1
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f12150d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = w.b.a.f12484k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.b(v.f):void");
    }

    private void c(f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i11);
        fVar.I0(i12);
        fVar.X0(G);
        fVar.W0(F);
        this.f12483c.T1(i10);
        this.f12483c.p1();
    }

    public long d(f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        f fVar2;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        b bVar = this;
        f fVar3 = fVar;
        int i23 = i10;
        int i24 = i13;
        int i25 = i15;
        C0206b F1 = fVar.F1();
        int size = fVar3.L0.size();
        int U = fVar.U();
        int v10 = fVar.v();
        boolean b10 = j.b(i23, 128);
        boolean z13 = b10 || j.b(i23, 64);
        if (z13) {
            int i26 = 0;
            while (true) {
                if (i26 >= size) {
                    break;
                }
                e eVar = fVar3.L0.get(i26);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((!eVar.g0() || !z14) && ((!eVar.i0() || !z14) && !(eVar instanceof k) && !eVar.g0() && !eVar.i0())) {
                    i26++;
                }
            }
            z13 = false;
        }
        if (z13) {
            s.e eVar2 = d.f11225x;
        }
        boolean z15 = z13 & ((i24 == 1073741824 && i25 == 1073741824) || b10);
        if (z15) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i24 == 1073741824 && fVar.U() != min) {
                fVar3.h1(min);
                fVar.I1();
            }
            if (i25 == 1073741824 && fVar.v() != min2) {
                fVar3.I0(min2);
                fVar.I1();
            }
            if (i24 == 1073741824 && i25 == 1073741824) {
                z10 = fVar3.C1(b10);
                i19 = 2;
            } else {
                boolean D1 = fVar3.D1(b10);
                if (i24 == 1073741824) {
                    D1 &= fVar3.E1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i25 == 1073741824) {
                    z10 = fVar3.E1(b10, 1) & D1;
                    i19++;
                } else {
                    z10 = D1;
                }
            }
            if (z10) {
                fVar3.m1(i24 == 1073741824, i25 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0;
        }
        int G1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f12481a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, U, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z16 = y11 == bVar3;
            boolean z17 = fVar.R() == bVar3;
            int max = Math.max(fVar.U(), bVar.f12483c.G());
            int max2 = Math.max(fVar.v(), bVar.f12483c.F());
            int i27 = 0;
            boolean z18 = false;
            while (i27 < size2) {
                e eVar3 = bVar.f12481a.get(i27);
                if (!(eVar3 instanceof k)) {
                    i22 = G1;
                } else {
                    int U2 = eVar3.U();
                    int v11 = eVar3.v();
                    i22 = G1;
                    boolean a10 = bVar.a(F1, eVar3, a.f12485l) | z18;
                    int U3 = eVar3.U();
                    boolean z19 = a10;
                    int v12 = eVar3.v();
                    if (U3 != U2) {
                        eVar3.h1(U3);
                        if (z16 && eVar3.K() > max) {
                            max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                        }
                        z12 = true;
                    } else {
                        z12 = z19;
                    }
                    if (v12 != v11) {
                        eVar3.I0(v12);
                        if (z17 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z12 = true;
                    }
                    z18 = z12 | ((k) eVar3).s1();
                }
                i27++;
                f fVar4 = fVar;
                G1 = i22;
            }
            int i28 = G1;
            int i29 = 0;
            int i30 = 2;
            while (i29 < i30) {
                int i31 = 0;
                while (i31 < size2) {
                    e eVar4 = bVar.f12481a.get(i31);
                    if ((!(eVar4 instanceof h) || (eVar4 instanceof k)) && !(eVar4 instanceof g) && eVar4.T() != 8 && ((!z15 || !eVar4.f12151e.f12565e.f12517j || !eVar4.f12153f.f12565e.f12517j) && !(eVar4 instanceof k))) {
                        int U4 = eVar4.U();
                        int v13 = eVar4.v();
                        z11 = z15;
                        int n10 = eVar4.n();
                        int i32 = a.f12485l;
                        i21 = size2;
                        if (i29 == 1) {
                            i32 = a.f12486m;
                        }
                        boolean a11 = bVar.a(F1, eVar4, i32) | z18;
                        int U5 = eVar4.U();
                        int v14 = eVar4.v();
                        if (U5 != U4) {
                            eVar4.h1(U5);
                            if (z16 && eVar4.K() > max) {
                                max = Math.max(max, eVar4.K() + eVar4.m(d.b.RIGHT).e());
                            }
                            a11 = true;
                        }
                        if (v14 != v13) {
                            eVar4.I0(v14);
                            if (z17 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            a11 = true;
                        }
                        z18 = (!eVar4.X() || n10 == eVar4.n()) ? a11 : true;
                    } else {
                        z11 = z15;
                        i21 = size2;
                    }
                    i31++;
                    bVar = this;
                    z15 = z11;
                    size2 = i21;
                }
                boolean z20 = z15;
                int i33 = size2;
                if (!z18) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, U, v10);
                bVar = this;
                z15 = z20;
                size2 = i33;
                i30 = 2;
                z18 = false;
            }
            fVar2 = fVar;
            i20 = i28;
        } else {
            fVar2 = fVar;
            i20 = G1;
        }
        fVar2.S1(i20);
        return 0;
    }

    public void e(f fVar) {
        this.f12481a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.L0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f12481a.add(eVar);
            }
        }
        fVar.I1();
    }
}
