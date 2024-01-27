package a4;

import u3.b;
import u3.d;

/* compiled from: EventStoreModule_DbNameFactory */
public final class g implements b<String> {

    /* compiled from: EventStoreModule_DbNameFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final g f63a = new g();
    }

    public static g a() {
        return a.f63a;
    }

    public static String b() {
        return (String) d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
