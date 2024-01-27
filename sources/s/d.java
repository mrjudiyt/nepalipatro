package s;

import java.util.Arrays;
import java.util.HashMap;
import s.i;
import v.d;
import v.e;

/* compiled from: LinearSystem */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f11219r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f11220s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f11221t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f11222u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f11223v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f11224w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f11225x;

    /* renamed from: y  reason: collision with root package name */
    public static long f11226y;

    /* renamed from: z  reason: collision with root package name */
    public static long f11227z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11228a;

    /* renamed from: b  reason: collision with root package name */
    int f11229b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f11230c;

    /* renamed from: d  reason: collision with root package name */
    private a f11231d;

    /* renamed from: e  reason: collision with root package name */
    private int f11232e;

    /* renamed from: f  reason: collision with root package name */
    private int f11233f;

    /* renamed from: g  reason: collision with root package name */
    b[] f11234g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11235h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11236i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f11237j;

    /* renamed from: k  reason: collision with root package name */
    int f11238k;

    /* renamed from: l  reason: collision with root package name */
    int f11239l;

    /* renamed from: m  reason: collision with root package name */
    private int f11240m;

    /* renamed from: n  reason: collision with root package name */
    final c f11241n;

    /* renamed from: o  reason: collision with root package name */
    private i[] f11242o;

    /* renamed from: p  reason: collision with root package name */
    private int f11243p;

    /* renamed from: q  reason: collision with root package name */
    private a f11244q;

    /* compiled from: LinearSystem */
    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem */
    class b extends b {
        public b(c cVar) {
            this.f11213e = new j(this, cVar);
        }
    }

    public d() {
        this.f11228a = false;
        this.f11229b = 0;
        this.f11230c = null;
        this.f11232e = 32;
        this.f11233f = 32;
        this.f11234g = null;
        this.f11235h = false;
        this.f11236i = false;
        this.f11237j = new boolean[32];
        this.f11238k = 1;
        this.f11239l = 0;
        this.f11240m = 32;
        this.f11242o = new i[f11224w];
        this.f11243p = 0;
        this.f11234g = new b[32];
        C();
        c cVar = new c();
        this.f11241n = cVar;
        this.f11231d = new h(cVar);
        if (f11223v) {
            this.f11244q = new b(cVar);
        } else {
            this.f11244q = new b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f11238k; i10++) {
            this.f11237j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f11238k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f11237j[aVar.getKey().f11261j] = true;
            }
            i b10 = aVar.b(this, this.f11237j);
            if (b10 != null) {
                boolean[] zArr = this.f11237j;
                int i12 = b10.f11261j;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f11239l; i14++) {
                    b bVar = this.f11234g[i14];
                    if (bVar.f11209a.f11268q != i.a.UNRESTRICTED && !bVar.f11214f && bVar.t(b10)) {
                        float f11 = bVar.f11213e.f(b10);
                        if (f11 < 0.0f) {
                            float f12 = (-bVar.f11210b) / f11;
                            if (f12 < f10) {
                                i13 = i14;
                                f10 = f12;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f11234g[i13];
                    bVar2.f11209a.f11262k = -1;
                    bVar2.x(b10);
                    i iVar = bVar2.f11209a;
                    iVar.f11262k = i13;
                    iVar.m(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f11223v) {
            while (i10 < this.f11239l) {
                b bVar = this.f11234g[i10];
                if (bVar != null) {
                    this.f11241n.f11215a.a(bVar);
                }
                this.f11234g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f11239l) {
            b bVar2 = this.f11234g[i10];
            if (bVar2 != null) {
                this.f11241n.f11216b.a(bVar2);
            }
            this.f11234g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f11241n.f11217c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.l(aVar, str);
        } else {
            b10.g();
            b10.l(aVar, str);
        }
        int i10 = this.f11243p;
        int i11 = f11224w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f11224w = i12;
            this.f11242o = (i[]) Arrays.copyOf(this.f11242o, i12);
        }
        i[] iVarArr = this.f11242o;
        int i13 = this.f11243p;
        this.f11243p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(b bVar) {
        int i10;
        if (!f11221t || !bVar.f11214f) {
            b[] bVarArr = this.f11234g;
            int i11 = this.f11239l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f11209a;
            iVar.f11262k = i11;
            this.f11239l = i11 + 1;
            iVar.m(this, bVar);
        } else {
            bVar.f11209a.k(this, bVar.f11210b);
        }
        if (f11221t && this.f11228a) {
            int i12 = 0;
            while (i12 < this.f11239l) {
                if (this.f11234g[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f11234g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f11214f) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f11209a.k(this, bVar2.f11210b);
                    if (f11223v) {
                        this.f11241n.f11215a.a(bVar2);
                    } else {
                        this.f11241n.f11216b.a(bVar2);
                    }
                    this.f11234g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f11239l;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f11234g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f11209a.f11262k == i13) {
                            bVarArr3[i15].f11209a.f11262k = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f11234g[i14] = null;
                    }
                    this.f11239l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f11228a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f11239l; i10++) {
            b bVar = this.f11234g[i10];
            bVar.f11209a.f11264m = bVar.f11210b;
        }
    }

    public static b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f11239l) {
                z10 = false;
                break;
            }
            b[] bVarArr = this.f11234g;
            if (bVarArr[i10].f11209a.f11268q != i.a.UNRESTRICTED && bVarArr[i10].f11210b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f11239l; i15++) {
                b bVar = this.f11234g[i15];
                if (bVar.f11209a.f11268q != i.a.UNRESTRICTED && !bVar.f11214f && bVar.f11210b < 0.0f) {
                    int i16 = 9;
                    if (f11222u) {
                        int b10 = bVar.f11213e.b();
                        int i17 = 0;
                        while (i17 < b10) {
                            i e10 = bVar.f11213e.e(i17);
                            float f11 = bVar.f11213e.f(e10);
                            if (f11 > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f12 = e10.f11266o[i18] / f11;
                                    if ((f12 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = e10.f11261j;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f12;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f11238k; i19++) {
                            i iVar = this.f11241n.f11218d[i19];
                            float f13 = bVar.f11213e.f(iVar);
                            if (f13 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f14 = iVar.f11266o[i20] / f13;
                                    if ((f14 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f10 = f14;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                b bVar2 = this.f11234g[i12];
                bVar2.f11209a.f11262k = -1;
                bVar2.x(this.f11241n.f11218d[i13]);
                i iVar2 = bVar2.f11209a;
                iVar2.f11262k = i12;
                iVar2.m(this, bVar2);
            } else {
                z11 = true;
            }
            if (i11 > this.f11238k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    public static e w() {
        return f11225x;
    }

    private void y() {
        int i10 = this.f11232e * 2;
        this.f11232e = i10;
        this.f11234g = (b[]) Arrays.copyOf(this.f11234g, i10);
        c cVar = this.f11241n;
        cVar.f11218d = (i[]) Arrays.copyOf(cVar.f11218d, this.f11232e);
        int i11 = this.f11232e;
        this.f11237j = new boolean[i11];
        this.f11233f = i11;
        this.f11240m = i11;
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f11241n;
            i[] iVarArr = cVar.f11218d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.g();
            }
            i10++;
        }
        cVar.f11217c.c(this.f11242o, this.f11243p);
        this.f11243p = 0;
        Arrays.fill(this.f11241n.f11218d, (Object) null);
        HashMap<String, i> hashMap = this.f11230c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f11229b = 0;
        this.f11231d.clear();
        this.f11238k = 1;
        for (int i11 = 0; i11 < this.f11239l; i11++) {
            b[] bVarArr = this.f11234g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f11211c = false;
            }
        }
        C();
        this.f11239l = 0;
        if (f11223v) {
            this.f11244q = new b(this.f11241n);
        } else {
            this.f11244q = new b(this.f11241n);
        }
    }

    public void b(e eVar, e eVar2, float f10, int i10) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar3.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar3.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar3.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar3.m(bVar4));
        i q14 = q(eVar4.m(bVar));
        i q15 = q(eVar4.m(bVar2));
        i q16 = q(eVar4.m(bVar3));
        i q17 = q(eVar4.m(bVar4));
        b r10 = r();
        double d10 = (double) f10;
        i iVar = q16;
        double d11 = (double) i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        b r11 = r();
        r11.q(q10, q12, q14, iVar, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13 = i12;
        b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            r10.d(this, i13);
        }
        d(r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(s.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f11239l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f11240m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f11238k
            int r0 = r0 + r1
            int r2 = r5.f11233f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.y()
        L_0x0015:
            r0 = 0
            boolean r2 = r6.f11214f
            if (r2 != 0) goto L_0x0084
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L_0x007b
            s.i r2 = r5.p()
            r6.f11209a = r2
            int r3 = r5.f11239l
            r5.l(r6)
            int r4 = r5.f11239l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            s.d$a r0 = r5.f11244q
            r0.c(r6)
            s.d$a r0 = r5.f11244q
            r5.B(r0, r1)
            int r0 = r2.f11262k
            r3 = -1
            if (r0 != r3) goto L_0x007c
            s.i r0 = r6.f11209a
            if (r0 != r2) goto L_0x0059
            s.i r0 = r6.v(r2)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f11214f
            if (r0 != 0) goto L_0x0062
            s.i r0 = r6.f11209a
            r0.m(r5, r6)
        L_0x0062:
            boolean r0 = f11223v
            if (r0 == 0) goto L_0x006e
            s.c r0 = r5.f11241n
            s.f<s.b> r0 = r0.f11215a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            s.c r0 = r5.f11241n
            s.f<s.b> r0 = r0.f11216b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f11239l
            int r0 = r0 - r1
            r5.f11239l = r0
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.d(s.b):void");
    }

    public b e(i iVar, i iVar2, int i10, int i11) {
        if (!f11220s || i11 != 8 || !iVar2.f11265n || iVar.f11262k != -1) {
            b r10 = r();
            r10.n(iVar, iVar2, i10);
            if (i11 != 8) {
                r10.d(this, i11);
            }
            d(r10);
            return r10;
        }
        iVar.k(this, iVar2.f11264m + ((float) i10));
        return null;
    }

    public void f(i iVar, int i10) {
        if (!f11220s || iVar.f11262k != -1) {
            int i11 = iVar.f11262k;
            if (i11 != -1) {
                b bVar = this.f11234g[i11];
                if (bVar.f11214f) {
                    bVar.f11210b = (float) i10;
                } else if (bVar.f11213e.b() == 0) {
                    bVar.f11214f = true;
                    bVar.f11210b = (float) i10;
                } else {
                    b r10 = r();
                    r10.m(iVar, i10);
                    d(r10);
                }
            } else {
                b r11 = r();
                r11.i(iVar, i10);
                d(r11);
            }
        } else {
            float f10 = (float) i10;
            iVar.k(this, f10);
            for (int i12 = 0; i12 < this.f11229b + 1; i12++) {
                i iVar2 = this.f11241n.f11218d[i12];
                if (iVar2 != null && iVar2.f11272u && iVar2.f11273v == iVar.f11261j) {
                    iVar2.k(this, iVar2.f11274w + f10);
                }
            }
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f11263l = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f11263l = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f11213e.f(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f11263l = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f11263l = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f11213e.f(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i10, int i11) {
        bVar.e(o(i11, (String) null), i10);
    }

    public i o(int i10, String str) {
        if (this.f11238k + 1 >= this.f11233f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f11229b + 1;
        this.f11229b = i11;
        this.f11238k++;
        a10.f11261j = i11;
        a10.f11263l = i10;
        this.f11241n.f11218d[i11] = a10;
        this.f11231d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f11238k + 1 >= this.f11233f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f11229b + 1;
        this.f11229b = i10;
        this.f11238k++;
        a10.f11261j = i10;
        this.f11241n.f11218d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f11238k + 1 >= this.f11233f) {
            y();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f11241n);
                iVar = dVar.h();
            }
            int i10 = iVar.f11261j;
            if (i10 == -1 || i10 > this.f11229b || this.f11241n.f11218d[i10] == null) {
                if (i10 != -1) {
                    iVar.g();
                }
                int i11 = this.f11229b + 1;
                this.f11229b = i11;
                this.f11238k++;
                iVar.f11261j = i11;
                iVar.f11268q = i.a.UNRESTRICTED;
                this.f11241n.f11218d[i11] = iVar;
            }
        }
        return iVar;
    }

    public b r() {
        b bVar;
        if (f11223v) {
            bVar = this.f11241n.f11215a.b();
            if (bVar == null) {
                bVar = new b(this.f11241n);
                f11227z++;
            } else {
                bVar.y();
            }
        } else {
            bVar = this.f11241n.f11216b.b();
            if (bVar == null) {
                bVar = new b(this.f11241n);
                f11226y++;
            } else {
                bVar.y();
            }
        }
        i.e();
        return bVar;
    }

    public i t() {
        if (this.f11238k + 1 >= this.f11233f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f11229b + 1;
        this.f11229b = i10;
        this.f11238k++;
        a10.f11261j = i10;
        this.f11241n.f11218d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f11241n;
    }

    public int x(Object obj) {
        i h10 = ((v.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f11264m + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f11231d.isEmpty()) {
            n();
        } else if (this.f11235h || this.f11236i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f11239l) {
                    z10 = true;
                    break;
                } else if (!this.f11234g[i10].f11214f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                A(this.f11231d);
            } else {
                n();
            }
        } else {
            A(this.f11231d);
        }
    }
}
