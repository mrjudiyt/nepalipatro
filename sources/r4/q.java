package r4;

import a6.y;
import k4.j;

/* compiled from: TrackFragment */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f11156a;

    /* renamed from: b  reason: collision with root package name */
    public long f11157b;

    /* renamed from: c  reason: collision with root package name */
    public long f11158c;

    /* renamed from: d  reason: collision with root package name */
    public long f11159d;

    /* renamed from: e  reason: collision with root package name */
    public int f11160e;

    /* renamed from: f  reason: collision with root package name */
    public int f11161f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f11162g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f11163h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f11164i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public int[] f11165j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public long[] f11166k = new long[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean[] f11167l = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean f11168m;

    /* renamed from: n  reason: collision with root package name */
    public boolean[] f11169n = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public p f11170o;

    /* renamed from: p  reason: collision with root package name */
    public final y f11171p = new y();

    /* renamed from: q  reason: collision with root package name */
    public boolean f11172q;

    /* renamed from: r  reason: collision with root package name */
    public long f11173r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11174s;

    public void a(y yVar) {
        yVar.j(this.f11171p.d(), 0, this.f11171p.f());
        this.f11171p.O(0);
        this.f11172q = false;
    }

    public void b(j jVar) {
        jVar.readFully(this.f11171p.d(), 0, this.f11171p.f());
        this.f11171p.O(0);
        this.f11172q = false;
    }

    public long c(int i10) {
        return this.f11166k[i10] + ((long) this.f11165j[i10]);
    }

    public void d(int i10) {
        this.f11171p.K(i10);
        this.f11168m = true;
        this.f11172q = true;
    }

    public void e(int i10, int i11) {
        this.f11160e = i10;
        this.f11161f = i11;
        if (this.f11163h.length < i10) {
            this.f11162g = new long[i10];
            this.f11163h = new int[i10];
        }
        if (this.f11164i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f11164i = new int[i12];
            this.f11165j = new int[i12];
            this.f11166k = new long[i12];
            this.f11167l = new boolean[i12];
            this.f11169n = new boolean[i12];
        }
    }

    public void f() {
        this.f11160e = 0;
        this.f11173r = 0;
        this.f11174s = false;
        this.f11168m = false;
        this.f11172q = false;
        this.f11170o = null;
    }

    public boolean g(int i10) {
        return this.f11168m && this.f11169n[i10];
    }
}
