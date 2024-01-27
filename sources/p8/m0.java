package p8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: Sets.kt */
class m0 extends l0 {
    public static <T> Set<T> b() {
        return b0.f16200h;
    }

    public static <T> HashSet<T> c(T... tArr) {
        m.f(tArr, "elements");
        return (HashSet) k.w(tArr, new HashSet(g0.a(tArr.length)));
    }

    public static <T> Set<T> d(T... tArr) {
        m.f(tArr, "elements");
        return (Set) k.w(tArr, new LinkedHashSet(g0.a(tArr.length)));
    }

    public static final <T> Set<T> e(Set<? extends T> set) {
        m.f(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return b();
        }
        if (size != 1) {
            return set;
        }
        return l0.a(set.iterator().next());
    }

    public static <T> Set<T> f(T... tArr) {
        m.f(tArr, "elements");
        return tArr.length > 0 ? k.A(tArr) : b();
    }
}
