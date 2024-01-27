package s3;

import q3.b;
import q3.c;
import q3.e;
import q3.f;
import q3.h;

/* compiled from: TransportImpl */
final class s<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f11403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11404b;

    /* renamed from: c  reason: collision with root package name */
    private final b f11405c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f11406d;

    /* renamed from: e  reason: collision with root package name */
    private final t f11407e;

    s(p pVar, String str, b bVar, e<T, byte[]> eVar, t tVar) {
        this.f11403a = pVar;
        this.f11404b = str;
        this.f11405c = bVar;
        this.f11406d = eVar;
        this.f11407e = tVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    public void a(c<T> cVar) {
        b(cVar, r.f16442a);
    }

    public void b(c<T> cVar, h hVar) {
        this.f11407e.a(o.a().e(this.f11403a).c(cVar).f(this.f11404b).d(this.f11406d).b(this.f11405c).a(), hVar);
    }

    /* access modifiers changed from: package-private */
    public p d() {
        return this.f11403a;
    }
}
