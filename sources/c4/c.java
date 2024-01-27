package c4;

import u3.b;
import u3.d;

/* compiled from: TimeModule_EventClockFactory */
public final class c implements b<a> {

    /* compiled from: TimeModule_EventClockFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final c f5223a = new c();
    }

    public static c a() {
        return a.f5223a;
    }

    public static a b() {
        return (a) d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public a get() {
        return b();
    }
}
