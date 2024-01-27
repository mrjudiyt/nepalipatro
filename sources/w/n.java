package w;

import v.d;
import v.e;
import v.h;
import w.f;
import w.p;

/* compiled from: VerticalWidgetRun */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f12543k;

    /* renamed from: l  reason: collision with root package name */
    g f12544l = null;

    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12545a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12545a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12545a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f12543k = fVar;
        this.f12568h.f12512e = f.a.TOP;
        this.f12569i.f12512e = f.a.BOTTOM;
        fVar.f12512e = f.a.BASELINE;
        this.f12566f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        float f11;
        float f12;
        int i11 = a.f12545a[this.f12570j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            e eVar = this.f12562b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f12565e;
        if (gVar.f12510c && !gVar.f12517j && this.f12564d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f12562b;
            int i12 = eVar2.f12189x;
            if (i12 == 2) {
                e I = eVar2.I();
                if (I != null) {
                    g gVar2 = I.f12153f.f12565e;
                    if (gVar2.f12517j) {
                        float f13 = this.f12562b.E;
                        this.f12565e.d((int) ((((float) gVar2.f12514g) * f13) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f12151e.f12565e.f12517j) {
                int u10 = eVar2.u();
                if (u10 == -1) {
                    e eVar3 = this.f12562b;
                    f12 = (float) eVar3.f12151e.f12565e.f12514g;
                    f11 = eVar3.t();
                } else if (u10 == 0) {
                    e eVar4 = this.f12562b;
                    f10 = ((float) eVar4.f12151e.f12565e.f12514g) * eVar4.t();
                    i10 = (int) (f10 + 0.5f);
                    this.f12565e.d(i10);
                } else if (u10 != 1) {
                    i10 = 0;
                    this.f12565e.d(i10);
                } else {
                    e eVar5 = this.f12562b;
                    f12 = (float) eVar5.f12151e.f12565e.f12514g;
                    f11 = eVar5.t();
                }
                f10 = f12 / f11;
                i10 = (int) (f10 + 0.5f);
                this.f12565e.d(i10);
            }
        }
        f fVar = this.f12568h;
        if (fVar.f12510c) {
            f fVar2 = this.f12569i;
            if (fVar2.f12510c) {
                if (!fVar.f12517j || !fVar2.f12517j || !this.f12565e.f12517j) {
                    if (!this.f12565e.f12517j && this.f12564d == e.b.MATCH_CONSTRAINT) {
                        e eVar6 = this.f12562b;
                        if (eVar6.f12187w == 0 && !eVar6.i0()) {
                            int i13 = this.f12568h.f12519l.get(0).f12514g;
                            f fVar3 = this.f12568h;
                            int i14 = i13 + fVar3.f12513f;
                            int i15 = this.f12569i.f12519l.get(0).f12514g + this.f12569i.f12513f;
                            fVar3.d(i14);
                            this.f12569i.d(i15);
                            this.f12565e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f12565e.f12517j && this.f12564d == e.b.MATCH_CONSTRAINT && this.f12561a == 1 && this.f12568h.f12519l.size() > 0 && this.f12569i.f12519l.size() > 0) {
                        int i16 = (this.f12569i.f12519l.get(0).f12514g + this.f12569i.f12513f) - (this.f12568h.f12519l.get(0).f12514g + this.f12568h.f12513f);
                        g gVar3 = this.f12565e;
                        int i17 = gVar3.f12529m;
                        if (i16 < i17) {
                            gVar3.d(i16);
                        } else {
                            gVar3.d(i17);
                        }
                    }
                    if (this.f12565e.f12517j && this.f12568h.f12519l.size() > 0 && this.f12569i.f12519l.size() > 0) {
                        f fVar4 = this.f12568h.f12519l.get(0);
                        f fVar5 = this.f12569i.f12519l.get(0);
                        int i18 = fVar4.f12514g + this.f12568h.f12513f;
                        int i19 = fVar5.f12514g + this.f12569i.f12513f;
                        float P = this.f12562b.P();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f12514g;
                            i19 = fVar5.f12514g;
                            P = 0.5f;
                        }
                        this.f12568h.d((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f12565e.f12514g)) * P)));
                        this.f12569i.d(this.f12568h.f12514g + this.f12565e.f12514g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e I;
        e I2;
        e eVar = this.f12562b;
        if (eVar.f12143a) {
            this.f12565e.d(eVar.v());
        }
        if (!this.f12565e.f12517j) {
            this.f12564d = this.f12562b.R();
            if (this.f12562b.X()) {
                this.f12544l = new a(this);
            }
            e.b bVar = this.f12564d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f12562b.I()) != null && I2.R() == e.b.FIXED) {
                    int v10 = (I2.v() - this.f12562b.P.e()) - this.f12562b.R.e();
                    b(this.f12568h, I2.f12153f.f12568h, this.f12562b.P.e());
                    b(this.f12569i, I2.f12153f.f12569i, -this.f12562b.R.e());
                    this.f12565e.d(v10);
                    return;
                } else if (this.f12564d == e.b.FIXED) {
                    this.f12565e.d(this.f12562b.v());
                }
            }
        } else if (this.f12564d == e.b.MATCH_PARENT && (I = this.f12562b.I()) != null && I.R() == e.b.FIXED) {
            b(this.f12568h, I.f12153f.f12568h, this.f12562b.P.e());
            b(this.f12569i, I.f12153f.f12569i, -this.f12562b.R.e());
            return;
        }
        g gVar = this.f12565e;
        boolean z10 = gVar.f12517j;
        if (z10) {
            e eVar2 = this.f12562b;
            if (eVar2.f12143a) {
                d[] dVarArr = eVar2.W;
                if (dVarArr[2].f12128f != null && dVarArr[3].f12128f != null) {
                    if (eVar2.i0()) {
                        this.f12568h.f12513f = this.f12562b.W[2].e();
                        this.f12569i.f12513f = -this.f12562b.W[3].e();
                    } else {
                        f h10 = h(this.f12562b.W[2]);
                        if (h10 != null) {
                            b(this.f12568h, h10, this.f12562b.W[2].e());
                        }
                        f h11 = h(this.f12562b.W[3]);
                        if (h11 != null) {
                            b(this.f12569i, h11, -this.f12562b.W[3].e());
                        }
                        this.f12568h.f12509b = true;
                        this.f12569i.f12509b = true;
                    }
                    if (this.f12562b.X()) {
                        b(this.f12543k, this.f12568h, this.f12562b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f12128f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        b(this.f12568h, h12, this.f12562b.W[2].e());
                        b(this.f12569i, this.f12568h, this.f12565e.f12514g);
                        if (this.f12562b.X()) {
                            b(this.f12543k, this.f12568h, this.f12562b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f12128f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        b(this.f12569i, h13, -this.f12562b.W[3].e());
                        b(this.f12568h, this.f12569i, -this.f12565e.f12514g);
                    }
                    if (this.f12562b.X()) {
                        b(this.f12543k, this.f12568h, this.f12562b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f12128f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        b(this.f12543k, h14, 0);
                        b(this.f12568h, this.f12543k, -this.f12562b.n());
                        b(this.f12569i, this.f12568h, this.f12565e.f12514g);
                        return;
                    }
                    return;
                } else if (!(eVar2 instanceof h) && eVar2.I() != null && this.f12562b.m(d.b.CENTER).f12128f == null) {
                    b(this.f12568h, this.f12562b.I().f12153f.f12568h, this.f12562b.W());
                    b(this.f12569i, this.f12568h, this.f12565e.f12514g);
                    if (this.f12562b.X()) {
                        b(this.f12543k, this.f12568h, this.f12562b.n());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z10 || this.f12564d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            e eVar3 = this.f12562b;
            int i10 = eVar3.f12189x;
            if (i10 == 2) {
                e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f12153f.f12565e;
                    this.f12565e.f12519l.add(gVar2);
                    gVar2.f12518k.add(this.f12565e);
                    g gVar3 = this.f12565e;
                    gVar3.f12509b = true;
                    gVar3.f12518k.add(this.f12568h);
                    this.f12565e.f12518k.add(this.f12569i);
                }
            } else if (i10 == 3 && !eVar3.i0()) {
                e eVar4 = this.f12562b;
                if (eVar4.f12187w != 3) {
                    g gVar4 = eVar4.f12151e.f12565e;
                    this.f12565e.f12519l.add(gVar4);
                    gVar4.f12518k.add(this.f12565e);
                    g gVar5 = this.f12565e;
                    gVar5.f12509b = true;
                    gVar5.f12518k.add(this.f12568h);
                    this.f12565e.f12518k.add(this.f12569i);
                }
            }
        }
        e eVar5 = this.f12562b;
        d[] dVarArr2 = eVar5.W;
        if (dVarArr2[2].f12128f != null && dVarArr2[3].f12128f != null) {
            if (eVar5.i0()) {
                this.f12568h.f12513f = this.f12562b.W[2].e();
                this.f12569i.f12513f = -this.f12562b.W[3].e();
            } else {
                f h15 = h(this.f12562b.W[2]);
                f h16 = h(this.f12562b.W[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f12570j = p.b.CENTER;
            }
            if (this.f12562b.X()) {
                c(this.f12543k, this.f12568h, 1, this.f12544l);
            }
        } else if (dVarArr2[2].f12128f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                b(this.f12568h, h17, this.f12562b.W[2].e());
                c(this.f12569i, this.f12568h, 1, this.f12565e);
                if (this.f12562b.X()) {
                    c(this.f12543k, this.f12568h, 1, this.f12544l);
                }
                e.b bVar2 = this.f12564d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f12562b.t() > 0.0f) {
                    l lVar = this.f12562b.f12151e;
                    if (lVar.f12564d == bVar3) {
                        lVar.f12565e.f12518k.add(this.f12565e);
                        this.f12565e.f12519l.add(this.f12562b.f12151e.f12565e);
                        this.f12565e.f12508a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f12128f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                b(this.f12569i, h18, -this.f12562b.W[3].e());
                c(this.f12568h, this.f12569i, -1, this.f12565e);
                if (this.f12562b.X()) {
                    c(this.f12543k, this.f12568h, 1, this.f12544l);
                }
            }
        } else if (dVarArr2[4].f12128f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                b(this.f12543k, h19, 0);
                c(this.f12568h, this.f12543k, -1, this.f12544l);
                c(this.f12569i, this.f12568h, 1, this.f12565e);
            }
        } else if (!(eVar5 instanceof h) && eVar5.I() != null) {
            b(this.f12568h, this.f12562b.I().f12153f.f12568h, this.f12562b.W());
            c(this.f12569i, this.f12568h, 1, this.f12565e);
            if (this.f12562b.X()) {
                c(this.f12543k, this.f12568h, 1, this.f12544l);
            }
            e.b bVar4 = this.f12564d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f12562b.t() > 0.0f) {
                l lVar2 = this.f12562b.f12151e;
                if (lVar2.f12564d == bVar5) {
                    lVar2.f12565e.f12518k.add(this.f12565e);
                    this.f12565e.f12519l.add(this.f12562b.f12151e.f12565e);
                    this.f12565e.f12508a = this;
                }
            }
        }
        if (this.f12565e.f12519l.size() == 0) {
            this.f12565e.f12510c = true;
        }
    }

    public void e() {
        f fVar = this.f12568h;
        if (fVar.f12517j) {
            this.f12562b.k1(fVar.f12514g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f12563c = null;
        this.f12568h.c();
        this.f12569i.c();
        this.f12543k.c();
        this.f12565e.c();
        this.f12567g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f12564d != e.b.MATCH_CONSTRAINT || this.f12562b.f12189x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f12567g = false;
        this.f12568h.c();
        this.f12568h.f12517j = false;
        this.f12569i.c();
        this.f12569i.f12517j = false;
        this.f12543k.c();
        this.f12543k.f12517j = false;
        this.f12565e.f12517j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f12562b.r();
    }
}
