package l5;

import a6.a;
import a6.i0;
import e4.j;
import k4.i;
import k4.k;
import k4.x;
import q4.f;
import r4.g;
import u4.e;
import u4.h;
import u4.h0;

/* compiled from: BundledHlsMediaChunkExtractor */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final x f9986d = new x();

    /* renamed from: a  reason: collision with root package name */
    final i f9987a;

    /* renamed from: b  reason: collision with root package name */
    private final j f9988b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f9989c;

    public b(i iVar, j jVar, i0 i0Var) {
        this.f9987a = iVar;
        this.f9988b = jVar;
        this.f9989c = i0Var;
    }

    public boolean a(k4.j jVar) {
        return this.f9987a.g(jVar, f9986d) == 0;
    }

    public void b() {
        this.f9987a.b(0, 0);
    }

    public void c(k kVar) {
        this.f9987a.c(kVar);
    }

    public boolean d() {
        i iVar = this.f9987a;
        return (iVar instanceof h) || (iVar instanceof u4.b) || (iVar instanceof e) || (iVar instanceof f);
    }

    public boolean e() {
        i iVar = this.f9987a;
        return (iVar instanceof h0) || (iVar instanceof g);
    }

    public j f() {
        i iVar;
        a.f(!e());
        i iVar2 = this.f9987a;
        if (iVar2 instanceof s) {
            iVar = new s(this.f9988b.f8087j, this.f9989c);
        } else if (iVar2 instanceof h) {
            iVar = new h();
        } else if (iVar2 instanceof u4.b) {
            iVar = new u4.b();
        } else if (iVar2 instanceof e) {
            iVar = new e();
        } else if (iVar2 instanceof f) {
            iVar = new f();
        } else {
            String simpleName = this.f9987a.getClass().getSimpleName();
            throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
        }
        return new b(iVar, this.f9988b, this.f9989c);
    }
}
