package v5;

import android.text.Layout;

/* compiled from: TtmlStyle */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f12457a;

    /* renamed from: b  reason: collision with root package name */
    private int f12458b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12459c;

    /* renamed from: d  reason: collision with root package name */
    private int f12460d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12461e;

    /* renamed from: f  reason: collision with root package name */
    private int f12462f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f12463g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f12464h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f12465i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f12466j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f12467k;

    /* renamed from: l  reason: collision with root package name */
    private String f12468l;

    /* renamed from: m  reason: collision with root package name */
    private int f12469m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f12470n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f12471o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f12472p;

    /* renamed from: q  reason: collision with root package name */
    private int f12473q = -1;

    /* renamed from: r  reason: collision with root package name */
    private b f12474r;

    /* renamed from: s  reason: collision with root package name */
    private float f12475s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f12459c && gVar.f12459c) {
                w(gVar.f12458b);
            }
            if (this.f12464h == -1) {
                this.f12464h = gVar.f12464h;
            }
            if (this.f12465i == -1) {
                this.f12465i = gVar.f12465i;
            }
            if (this.f12457a == null && (str = gVar.f12457a) != null) {
                this.f12457a = str;
            }
            if (this.f12462f == -1) {
                this.f12462f = gVar.f12462f;
            }
            if (this.f12463g == -1) {
                this.f12463g = gVar.f12463g;
            }
            if (this.f12470n == -1) {
                this.f12470n = gVar.f12470n;
            }
            if (this.f12471o == null && (alignment2 = gVar.f12471o) != null) {
                this.f12471o = alignment2;
            }
            if (this.f12472p == null && (alignment = gVar.f12472p) != null) {
                this.f12472p = alignment;
            }
            if (this.f12473q == -1) {
                this.f12473q = gVar.f12473q;
            }
            if (this.f12466j == -1) {
                this.f12466j = gVar.f12466j;
                this.f12467k = gVar.f12467k;
            }
            if (this.f12474r == null) {
                this.f12474r = gVar.f12474r;
            }
            if (this.f12475s == Float.MAX_VALUE) {
                this.f12475s = gVar.f12475s;
            }
            if (z10 && !this.f12461e && gVar.f12461e) {
                u(gVar.f12460d);
            }
            if (z10 && this.f12469m == -1 && (i10 = gVar.f12469m) != -1) {
                this.f12469m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f12468l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f12465i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f12462f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f12472p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f12470n = i10;
        return this;
    }

    public g F(int i10) {
        this.f12469m = i10;
        return this;
    }

    public g G(float f10) {
        this.f12475s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f12471o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f12473q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f12474r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f12463g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f12461e) {
            return this.f12460d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f12459c) {
            return this.f12458b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f12457a;
    }

    public float e() {
        return this.f12467k;
    }

    public int f() {
        return this.f12466j;
    }

    public String g() {
        return this.f12468l;
    }

    public Layout.Alignment h() {
        return this.f12472p;
    }

    public int i() {
        return this.f12470n;
    }

    public int j() {
        return this.f12469m;
    }

    public float k() {
        return this.f12475s;
    }

    public int l() {
        int i10 = this.f12464h;
        if (i10 == -1 && this.f12465i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f12465i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment m() {
        return this.f12471o;
    }

    public boolean n() {
        return this.f12473q == 1;
    }

    public b o() {
        return this.f12474r;
    }

    public boolean p() {
        return this.f12461e;
    }

    public boolean q() {
        return this.f12459c;
    }

    public boolean s() {
        return this.f12462f == 1;
    }

    public boolean t() {
        return this.f12463g == 1;
    }

    public g u(int i10) {
        this.f12460d = i10;
        this.f12461e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f12464h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f12458b = i10;
        this.f12459c = true;
        return this;
    }

    public g x(String str) {
        this.f12457a = str;
        return this;
    }

    public g y(float f10) {
        this.f12467k = f10;
        return this;
    }

    public g z(int i10) {
        this.f12466j = i10;
        return this;
    }
}
