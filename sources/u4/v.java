package u4;

import a6.a;
import a6.i0;
import a6.m0;
import a6.y;
import e4.j;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: PassthroughSectionPayloadReader */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private j f12070a;

    /* renamed from: b  reason: collision with root package name */
    private i0 f12071b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f12072c;

    public v(String str) {
        this.f12070a = new j.b().e0(str).E();
    }

    private void b() {
        a.h(this.f12071b);
        m0.j(this.f12072c);
    }

    public void a(y yVar) {
        b();
        long d10 = this.f12071b.d();
        long e10 = this.f12071b.e();
        if (d10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            j jVar = this.f12070a;
            if (e10 != jVar.f8100w) {
                j E = jVar.b().i0(e10).E();
                this.f12070a = E;
                this.f12072c.d(E);
            }
            int a10 = yVar.a();
            this.f12072c.a(yVar, a10);
            this.f12072c.e(d10, 1, a10, 0, (b0.a) null);
        }
    }

    public void c(i0 i0Var, k kVar, i0.d dVar) {
        this.f12071b = i0Var;
        dVar.a();
        b0 e10 = kVar.e(dVar.c(), 5);
        this.f12072c = e10;
        e10.d(this.f12070a);
    }
}
