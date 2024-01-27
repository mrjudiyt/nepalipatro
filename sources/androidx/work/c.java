package androidx.work;

import android.os.Build;

/* compiled from: Constraints */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f4732i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private n f4733a = n.NOT_REQUIRED;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4734b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4735c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4736d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4737e;

    /* renamed from: f  reason: collision with root package name */
    private long f4738f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f4739g = -1;

    /* renamed from: h  reason: collision with root package name */
    private d f4740h = new d();

    /* compiled from: Constraints */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f4741a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f4742b = false;

        /* renamed from: c  reason: collision with root package name */
        n f4743c = n.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f4744d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f4745e = false;

        /* renamed from: f  reason: collision with root package name */
        long f4746f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f4747g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f4748h = new d();

        public c a() {
            return new c(this);
        }

        public a b(n nVar) {
            this.f4743c = nVar;
            return this;
        }
    }

    public c() {
    }

    public d a() {
        return this.f4740h;
    }

    public n b() {
        return this.f4733a;
    }

    public long c() {
        return this.f4738f;
    }

    public long d() {
        return this.f4739g;
    }

    public boolean e() {
        return this.f4740h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4734b == cVar.f4734b && this.f4735c == cVar.f4735c && this.f4736d == cVar.f4736d && this.f4737e == cVar.f4737e && this.f4738f == cVar.f4738f && this.f4739g == cVar.f4739g && this.f4733a == cVar.f4733a) {
            return this.f4740h.equals(cVar.f4740h);
        }
        return false;
    }

    public boolean f() {
        return this.f4736d;
    }

    public boolean g() {
        return this.f4734b;
    }

    public boolean h() {
        return this.f4735c;
    }

    public int hashCode() {
        long j10 = this.f4738f;
        long j11 = this.f4739g;
        return (((((((((((((this.f4733a.hashCode() * 31) + (this.f4734b ? 1 : 0)) * 31) + (this.f4735c ? 1 : 0)) * 31) + (this.f4736d ? 1 : 0)) * 31) + (this.f4737e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f4740h.hashCode();
    }

    public boolean i() {
        return this.f4737e;
    }

    public void j(d dVar) {
        this.f4740h = dVar;
    }

    public void k(n nVar) {
        this.f4733a = nVar;
    }

    public void l(boolean z10) {
        this.f4736d = z10;
    }

    public void m(boolean z10) {
        this.f4734b = z10;
    }

    public void n(boolean z10) {
        this.f4735c = z10;
    }

    public void o(boolean z10) {
        this.f4737e = z10;
    }

    public void p(long j10) {
        this.f4738f = j10;
    }

    public void q(long j10) {
        this.f4739g = j10;
    }

    c(a aVar) {
        this.f4734b = aVar.f4741a;
        int i10 = Build.VERSION.SDK_INT;
        this.f4735c = i10 >= 23 && aVar.f4742b;
        this.f4733a = aVar.f4743c;
        this.f4736d = aVar.f4744d;
        this.f4737e = aVar.f4745e;
        if (i10 >= 24) {
            this.f4740h = aVar.f4748h;
            this.f4738f = aVar.f4746f;
            this.f4739g = aVar.f4747g;
        }
    }

    public c(c cVar) {
        this.f4734b = cVar.f4734b;
        this.f4735c = cVar.f4735c;
        this.f4733a = cVar.f4733a;
        this.f4736d = cVar.f4736d;
        this.f4737e = cVar.f4737e;
        this.f4740h = cVar.f4740h;
    }
}
