package p8;

import java.util.Collection;
import kotlin.jvm.internal.m;

/* compiled from: Iterables.kt */
class q extends p {
    public static <T> int l(Iterable<? extends T> iterable, int i10) {
        m.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
