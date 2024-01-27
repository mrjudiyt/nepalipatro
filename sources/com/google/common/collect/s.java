package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap */
public abstract class s<K, V> extends t implements Map<K, V> {
    protected s() {
    }

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    public V get(Object obj) {
        return b().get(obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set<K> keySet() {
        return b().keySet();
    }

    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    public V remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    public Collection<V> values() {
        return b().values();
    }
}
