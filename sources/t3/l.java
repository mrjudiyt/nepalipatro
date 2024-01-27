package t3;

import android.content.Context;
import n8.a;
import u3.b;

/* compiled from: MetadataBackendRegistry_Factory */
public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f11659a;

    /* renamed from: b  reason: collision with root package name */
    private final a<i> f11660b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.f11659a = aVar;
        this.f11660b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c(this.f11659a.get(), this.f11660b.get());
    }
}
