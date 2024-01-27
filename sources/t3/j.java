package t3;

import android.content.Context;
import n8.a;
import u3.b;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f11651a;

    /* renamed from: b  reason: collision with root package name */
    private final a<c4.a> f11652b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c4.a> f11653c;

    public j(a<Context> aVar, a<c4.a> aVar2, a<c4.a> aVar3) {
        this.f11651a = aVar;
        this.f11652b = aVar2;
        this.f11653c = aVar3;
    }

    public static j a(a<Context> aVar, a<c4.a> aVar2, a<c4.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, c4.a aVar, c4.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c(this.f11651a.get(), this.f11652b.get(), this.f11653c.get());
    }
}
