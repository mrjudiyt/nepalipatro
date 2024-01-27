package o;

import java.util.HashMap;
import java.util.Map;
import o.b;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f10273l = new HashMap<>();

    /* access modifiers changed from: protected */
    public b.c<K, V> b(K k10) {
        return this.f10273l.get(k10);
    }

    public boolean contains(K k10) {
        return this.f10273l.containsKey(k10);
    }

    public V f(K k10, V v10) {
        b.c b10 = b(k10);
        if (b10 != null) {
            return b10.f10279i;
        }
        this.f10273l.put(k10, e(k10, v10));
        return null;
    }

    public V g(K k10) {
        V g10 = super.g(k10);
        this.f10273l.remove(k10);
        return g10;
    }

    public Map.Entry<K, V> i(K k10) {
        if (contains(k10)) {
            return this.f10273l.get(k10).f10281k;
        }
        return null;
    }
}
