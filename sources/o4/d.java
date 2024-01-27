package o4;

import k4.b0;
import k4.k;
import k4.y;
import k4.z;

/* compiled from: StartOffsetExtractorOutput */
public final class d implements k {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final long f10387h;

    /* renamed from: i  reason: collision with root package name */
    private final k f10388i;

    /* compiled from: StartOffsetExtractorOutput */
    class a implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f10389a;

        a(y yVar) {
            this.f10389a = yVar;
        }

        public boolean f() {
            return this.f10389a.f();
        }

        public y.a h(long j10) {
            y.a h10 = this.f10389a.h(j10);
            z zVar = h10.f9628a;
            z zVar2 = new z(zVar.f9633a, zVar.f9634b + d.this.f10387h);
            z zVar3 = h10.f9629b;
            return new y.a(zVar2, new z(zVar3.f9633a, zVar3.f9634b + d.this.f10387h));
        }

        public long i() {
            return this.f10389a.i();
        }
    }

    public d(long j10, k kVar) {
        this.f10387h = j10;
        this.f10388i = kVar;
    }

    public b0 e(int i10, int i11) {
        return this.f10388i.e(i10, i11);
    }

    public void i(y yVar) {
        this.f10388i.i(new a(yVar));
    }

    public void o() {
        this.f10388i.o();
    }
}
