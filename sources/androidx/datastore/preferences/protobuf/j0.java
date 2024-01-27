package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite */
public final class j0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: i  reason: collision with root package name */
    private static final j0 f2830i;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2831h = true;

    static {
        j0 j0Var = new j0();
        f2830i = j0Var;
        j0Var.k();
    }

    private j0() {
    }

    static <K, V> int a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            i10 += b(next.getValue()) ^ b(next.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return z.d((byte[]) obj);
        }
        if (!(obj instanceof z.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void c(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            z.a(next);
            z.a(map.get(next));
        }
    }

    public static <K, V> j0<K, V> d() {
        return f2830i;
    }

    private void e() {
        if (!i()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean f(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean g(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j0.g(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        e();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && g(this, (Map) obj);
    }

    public int hashCode() {
        return a(this);
    }

    public boolean i() {
        return this.f2831h;
    }

    public void k() {
        this.f2831h = false;
    }

    public void l(j0<K, V> j0Var) {
        e();
        if (!j0Var.isEmpty()) {
            putAll(j0Var);
        }
    }

    public j0<K, V> m() {
        return isEmpty() ? new j0<>() : new j0<>(this);
    }

    public V put(K k10, V v10) {
        e();
        z.a(k10);
        z.a(v10);
        return super.put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        e();
        c(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        e();
        return super.remove(obj);
    }

    private j0(Map<K, V> map) {
        super(map);
    }
}
