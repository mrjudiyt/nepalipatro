package s3;

import android.content.Context;
import c4.a;
import java.util.Collections;
import java.util.Set;
import q3.b;
import q3.g;
import q3.h;
import y3.e;
import z3.s;
import z3.w;

/* compiled from: TransportRuntime */
public class u implements t {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v f11408e;

    /* renamed from: a  reason: collision with root package name */
    private final a f11409a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11410b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11411c;

    /* renamed from: d  reason: collision with root package name */
    private final s f11412d;

    u(a aVar, a aVar2, e eVar, s sVar, w wVar) {
        this.f11409a = aVar;
        this.f11410b = aVar2;
        this.f11411c = eVar;
        this.f11412d = sVar;
        wVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f11409a.a()).k(this.f11410b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f11408e;
        if (vVar != null) {
            return vVar.h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f11408e == null) {
            synchronized (u.class) {
                if (f11408e == null) {
                    f11408e = e.j().a(context).build();
                }
            }
        }
    }

    public void a(o oVar, h hVar) {
        this.f11411c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public s e() {
        return this.f11412d;
    }

    public g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.b()).c(fVar.getExtras()).a(), this);
    }
}
