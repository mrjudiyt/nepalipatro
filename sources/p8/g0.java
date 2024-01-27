package p8;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.m;
import o8.k;

/* compiled from: MapsJVM.kt */
class g0 extends f0 {
    public static int a(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> b(k<? extends K, ? extends V> kVar) {
        m.f(kVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(kVar.c(), kVar.d());
        m.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        m.f(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        m.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
