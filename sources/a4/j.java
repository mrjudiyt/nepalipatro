package a4;

import u3.b;
import u3.d;

/* compiled from: EventStoreModule_StoreConfigFactory */
public final class j implements b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final j f70a = new j();
    }

    public static j a() {
        return a.f70a;
    }

    public static e c() {
        return (e) d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public e get() {
        return c();
    }
}
