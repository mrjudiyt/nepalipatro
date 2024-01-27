package y3;

import a4.d;
import android.content.Context;
import n8.a;
import u3.b;
import z3.g;
import z3.y;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class i implements b<y> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f12960a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f12961b;

    /* renamed from: c  reason: collision with root package name */
    private final a<g> f12962c;

    /* renamed from: d  reason: collision with root package name */
    private final a<c4.a> f12963d;

    public i(a<Context> aVar, a<d> aVar2, a<g> aVar3, a<c4.a> aVar4) {
        this.f12960a = aVar;
        this.f12961b = aVar2;
        this.f12962c = aVar3;
        this.f12963d = aVar4;
    }

    public static i a(a<Context> aVar, a<d> aVar2, a<g> aVar3, a<c4.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, d dVar, g gVar, c4.a aVar) {
        return (y) u3.d.c(h.a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public y get() {
        return c(this.f12960a.get(), this.f12961b.get(), this.f12962c.get(), this.f12963d.get());
    }
}
