package v;

import java.util.ArrayList;
import v.e;

/* compiled from: ChainHead */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f12101a;

    /* renamed from: b  reason: collision with root package name */
    protected e f12102b;

    /* renamed from: c  reason: collision with root package name */
    protected e f12103c;

    /* renamed from: d  reason: collision with root package name */
    protected e f12104d;

    /* renamed from: e  reason: collision with root package name */
    protected e f12105e;

    /* renamed from: f  reason: collision with root package name */
    protected e f12106f;

    /* renamed from: g  reason: collision with root package name */
    protected e f12107g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f12108h;

    /* renamed from: i  reason: collision with root package name */
    protected int f12109i;

    /* renamed from: j  reason: collision with root package name */
    protected int f12110j;

    /* renamed from: k  reason: collision with root package name */
    protected float f12111k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f12112l;

    /* renamed from: m  reason: collision with root package name */
    int f12113m;

    /* renamed from: n  reason: collision with root package name */
    int f12114n;

    /* renamed from: o  reason: collision with root package name */
    boolean f12115o;

    /* renamed from: p  reason: collision with root package name */
    private int f12116p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12117q = false;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f12118r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f12119s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f12120t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f12121u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f12122v;

    public c(e eVar, int i10, boolean z10) {
        this.f12101a = eVar;
        this.f12116p = i10;
        this.f12117q = z10;
    }

    private void b() {
        int i10 = this.f12116p * 2;
        e eVar = this.f12101a;
        boolean z10 = true;
        this.f12115o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f12109i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f12116p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.T() != 8) {
                this.f12112l++;
                e.b s10 = eVar.s(this.f12116p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f12113m += eVar.C(this.f12116p);
                }
                int e10 = this.f12113m + eVar.W[i10].e();
                this.f12113m = e10;
                int i12 = i10 + 1;
                this.f12113m = e10 + eVar.W[i12].e();
                int e11 = this.f12114n + eVar.W[i10].e();
                this.f12114n = e11;
                this.f12114n = e11 + eVar.W[i12].e();
                if (this.f12102b == null) {
                    this.f12102b = eVar;
                }
                this.f12104d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f12116p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f12191y;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f12110j++;
                        float[] fArr = eVar.D0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f12111k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f12118r = true;
                            } else {
                                this.f12119s = true;
                            }
                            if (this.f12108h == null) {
                                this.f12108h = new ArrayList<>();
                            }
                            this.f12108h.add(eVar);
                        }
                        if (this.f12106f == null) {
                            this.f12106f = eVar;
                        }
                        e eVar4 = this.f12107g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f12116p] = eVar;
                        }
                        this.f12107g = eVar;
                    }
                    if (this.f12116p == 0) {
                        if (eVar.f12187w != 0) {
                            this.f12115o = false;
                        } else if (!(eVar.f12193z == 0 && eVar.A == 0)) {
                            this.f12115o = false;
                        }
                    } else if (eVar.f12189x != 0) {
                        this.f12115o = false;
                    } else if (!(eVar.C == 0 && eVar.D == 0)) {
                        this.f12115o = false;
                    }
                    if (eVar.f12150d0 != 0.0f) {
                        this.f12115o = false;
                        this.f12121u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f12116p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f12128f;
            if (dVar != null) {
                e eVar5 = dVar.f12126d;
                d[] dVarArr = eVar5.W;
                if (dVarArr[i10].f12128f != null && dVarArr[i10].f12128f.f12126d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f12102b;
        if (eVar6 != null) {
            this.f12113m -= eVar6.W[i10].e();
        }
        e eVar7 = this.f12104d;
        if (eVar7 != null) {
            this.f12113m -= eVar7.W[i10 + 1].e();
        }
        this.f12103c = eVar;
        if (this.f12116p != 0 || !this.f12117q) {
            this.f12105e = this.f12101a;
        } else {
            this.f12105e = eVar;
        }
        if (!this.f12119s || !this.f12118r) {
            z10 = false;
        }
        this.f12120t = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.T() != 8 && eVar.Z[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f12191y;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f12122v) {
            b();
        }
        this.f12122v = true;
    }
}
