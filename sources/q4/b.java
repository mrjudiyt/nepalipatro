package q4;

import a6.m0;
import a6.q;
import k4.y;
import k4.z;

/* compiled from: IndexSeeker */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f10684a;

    /* renamed from: b  reason: collision with root package name */
    private final q f10685b;

    /* renamed from: c  reason: collision with root package name */
    private final q f10686c;

    /* renamed from: d  reason: collision with root package name */
    private long f10687d;

    public b(long j10, long j11, long j12) {
        this.f10687d = j10;
        this.f10684a = j12;
        q qVar = new q();
        this.f10685b = qVar;
        q qVar2 = new q();
        this.f10686c = qVar2;
        qVar.a(0);
        qVar2.a(j11);
    }

    public long a(long j10) {
        return this.f10685b.b(m0.f(this.f10686c, j10, true, true));
    }

    public boolean b(long j10) {
        q qVar = this.f10685b;
        return j10 - qVar.b(qVar.c() - 1) < 100000;
    }

    public void c(long j10, long j11) {
        if (!b(j10)) {
            this.f10685b.a(j10);
            this.f10686c.a(j11);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(long j10) {
        this.f10687d = j10;
    }

    public long e() {
        return this.f10684a;
    }

    public boolean f() {
        return true;
    }

    public y.a h(long j10) {
        int f10 = m0.f(this.f10685b, j10, true, true);
        z zVar = new z(this.f10685b.b(f10), this.f10686c.b(f10));
        if (zVar.f9633a == j10 || f10 == this.f10685b.c() - 1) {
            return new y.a(zVar);
        }
        int i10 = f10 + 1;
        return new y.a(zVar, new z(this.f10685b.b(i10), this.f10686c.b(i10)));
    }

    public long i() {
        return this.f10687d;
    }
}
