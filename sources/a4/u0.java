package a4;

import android.content.Context;
import n8.a;
import u3.b;

/* compiled from: SchemaManager_Factory */
public final class u0 implements b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f127a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f128b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Integer> f129c;

    public u0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.f127a = aVar;
        this.f128b = aVar2;
        this.f129c = aVar3;
    }

    public static u0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    /* renamed from: b */
    public t0 get() {
        return c(this.f127a.get(), this.f128b.get(), this.f129c.get().intValue());
    }
}
