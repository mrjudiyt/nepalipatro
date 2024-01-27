package o8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import o8.l;

/* compiled from: Result.kt */
public final class m {
    public static final Object a(Throwable th) {
        kotlin.jvm.internal.m.f(th, Constants.EXCEPTION);
        return new l.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof l.b) {
            throw ((l.b) obj).f16184h;
        }
    }
}
