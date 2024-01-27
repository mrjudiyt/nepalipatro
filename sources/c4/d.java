package c4;

import u3.b;

/* compiled from: TimeModule_UptimeClockFactory */
public final class d implements b<a> {

    /* compiled from: TimeModule_UptimeClockFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final d f5224a = new d();
    }

    public static d a() {
        return a.f5224a;
    }

    public static a c() {
        return (a) u3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
