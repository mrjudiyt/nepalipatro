package a4;

import android.content.Context;
import n8.a;
import u3.b;
import u3.d;

/* compiled from: EventStoreModule_PackageNameFactory */
public final class h implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f65a;

    public h(a<Context> aVar) {
        this.f65a = aVar;
    }

    public static h a(a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return c(this.f65a.get());
    }
}
