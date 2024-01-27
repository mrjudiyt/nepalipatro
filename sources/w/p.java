package w;

import v.d;
import v.e;

/* compiled from: WidgetRun */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f12561a;

    /* renamed from: b  reason: collision with root package name */
    e f12562b;

    /* renamed from: c  reason: collision with root package name */
    m f12563c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f12564d;

    /* renamed from: e  reason: collision with root package name */
    g f12565e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f12566f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f12567g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f12568h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f12569i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f12570j = b.NONE;

    /* compiled from: WidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12571a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12571a = r0
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12571a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12571a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12571a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12571a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.p.a.<clinit>():void");
        }
    }

    /* compiled from: WidgetRun */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f12562b = eVar;
    }

    private void l(int i10, int i11) {
        int i12;
        int i13 = this.f12561a;
        if (i13 == 0) {
            this.f12565e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f12565e.d(Math.min(g(this.f12565e.f12529m, i10), i11));
        } else if (i13 == 2) {
            e I = this.f12562b.I();
            if (I != null) {
                g gVar = (i10 == 0 ? I.f12151e : I.f12153f).f12565e;
                if (gVar.f12517j) {
                    e eVar = this.f12562b;
                    this.f12565e.d(g((int) ((((float) gVar.f12514g) * (i10 == 0 ? eVar.B : eVar.E)) + 0.5f), i10));
                }
            }
        } else if (i13 == 3) {
            e eVar2 = this.f12562b;
            p pVar = eVar2.f12151e;
            e.b bVar = pVar.f12564d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f12561a == 3) {
                n nVar = eVar2.f12153f;
                if (nVar.f12564d == bVar2 && nVar.f12561a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar2.f12153f;
            }
            if (pVar.f12565e.f12517j) {
                float t10 = eVar2.t();
                if (i10 == 1) {
                    i12 = (int) ((((float) pVar.f12565e.f12514g) / t10) + 0.5f);
                } else {
                    i12 = (int) ((t10 * ((float) pVar.f12565e.f12514g)) + 0.5f);
                }
                this.f12565e.d(i12);
            }
        }
    }

    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f12519l.add(fVar2);
        fVar.f12513f = i10;
        fVar2.f12518k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f12519l.add(fVar2);
        fVar.f12519l.add(this.f12565e);
        fVar.f12515h = i10;
        fVar.f12516i = gVar;
        fVar2.f12518k.add(fVar);
        gVar.f12518k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f12562b;
            int i13 = eVar.A;
            i12 = Math.max(eVar.f12193z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f12562b;
            int i14 = eVar2.D;
            int max = Math.max(eVar2.C, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public final f h(d dVar) {
        d dVar2 = dVar.f12128f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f12126d;
        int i10 = a.f12571a[dVar2.f12127e.ordinal()];
        if (i10 == 1) {
            return eVar.f12151e.f12568h;
        }
        if (i10 == 2) {
            return eVar.f12151e.f12569i;
        }
        if (i10 == 3) {
            return eVar.f12153f.f12568h;
        }
        if (i10 == 4) {
            return eVar.f12153f.f12543k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f12153f.f12569i;
    }

    /* access modifiers changed from: protected */
    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f12128f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f12126d;
        p pVar = i10 == 0 ? eVar.f12151e : eVar.f12153f;
        int i11 = a.f12571a[dVar2.f12127e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f12569i;
        }
        return pVar.f12568h;
    }

    public long j() {
        g gVar = this.f12565e;
        if (gVar.f12517j) {
            return (long) gVar.f12514g;
        }
        return 0;
    }

    public boolean k() {
        return this.f12567g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, d dVar2, d dVar3, int i10) {
        float f10;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f12517j && h11.f12517j) {
            int e10 = h10.f12514g + dVar2.e();
            int e11 = h11.f12514g - dVar3.e();
            int i11 = e11 - e10;
            if (!this.f12565e.f12517j && this.f12564d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f12565e;
            if (gVar.f12517j) {
                if (gVar.f12514g == i11) {
                    this.f12568h.d(e10);
                    this.f12569i.d(e11);
                    return;
                }
                e eVar = this.f12562b;
                if (i10 == 0) {
                    f10 = eVar.w();
                } else {
                    f10 = eVar.P();
                }
                if (h10 == h11) {
                    e10 = h10.f12514g;
                    e11 = h11.f12514g;
                    f10 = 0.5f;
                }
                this.f12568h.d((int) (((float) e10) + 0.5f + (((float) ((e11 - e10) - this.f12565e.f12514g)) * f10)));
                this.f12569i.d(this.f12568h.f12514g + this.f12565e.f12514g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
