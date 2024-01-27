package p8;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import o8.k;

/* compiled from: Maps.kt */
class h0 extends g0 {
    public static <K, V> Map<K, V> d() {
        a0 a0Var = a0.f16196h;
        m.d(a0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a0Var;
    }

    public static <K, V> HashMap<K, V> e(k<? extends K, ? extends V>... kVarArr) {
        m.f(kVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(g0.a(kVarArr.length));
        i(hashMap, kVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> f(k<? extends K, ? extends V>... kVarArr) {
        m.f(kVarArr, "pairs");
        return kVarArr.length > 0 ? m(kVarArr, new LinkedHashMap(g0.a(kVarArr.length))) : d();
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        m.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return map;
        }
        return g0.c(map);
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, Iterable<? extends k<? extends K, ? extends V>> iterable) {
        m.f(map, "<this>");
        m.f(iterable, "pairs");
        for (k kVar : iterable) {
            map.put(kVar.a(), kVar.b());
        }
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, k<? extends K, ? extends V>[] kVarArr) {
        m.f(map, "<this>");
        m.f(kVarArr, "pairs");
        for (k<? extends K, ? extends V> kVar : kVarArr) {
            map.put(kVar.a(), kVar.b());
        }
    }

    public static <K, V> Map<K, V> j(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return k(iterable, new LinkedHashMap(g0.a(collection.size())));
        }
        return g0.b((k) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M k(Iterable<? extends k<? extends K, ? extends V>> iterable, M m10) {
        m.f(iterable, "<this>");
        m.f(m10, "destination");
        h(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        m.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return n(map);
        }
        return g0.c(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(k<? extends K, ? extends V>[] kVarArr, M m10) {
        m.f(kVarArr, "<this>");
        m.f(m10, "destination");
        i(m10, kVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map) {
        m.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
