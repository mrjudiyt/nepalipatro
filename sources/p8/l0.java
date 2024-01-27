package p8;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: SetsJVM.kt */
class l0 {
    public static final <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        m.e(singleton, "singleton(element)");
        return singleton;
    }
}
