package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* compiled from: ForwardingConcurrentMap */
public abstract class r<K, V> extends s<K, V> implements ConcurrentMap<K, V> {
    protected r() {
    }

    /* access modifiers changed from: protected */
    public abstract ConcurrentMap<K, V> c();

    public V putIfAbsent(K k10, V v10) {
        return c().putIfAbsent(k10, v10);
    }

    public boolean remove(Object obj, Object obj2) {
        return c().remove(obj, obj2);
    }

    public V replace(K k10, V v10) {
        return c().replace(k10, v10);
    }

    public boolean replace(K k10, V v10, V v11) {
        return c().replace(k10, v10, v11);
    }
}
