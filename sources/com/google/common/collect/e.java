package com.google.common.collect;

import java.util.Map;
import l6.l;

/* compiled from: AbstractMapEntry */
abstract class e<K, V> implements Map.Entry<K, V> {
    e() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!l.a(getKey(), entry.getKey()) || !l.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i10;
        Object key = getKey();
        Object value = getValue();
        int i11 = 0;
        if (key == null) {
            i10 = 0;
        } else {
            i10 = key.hashCode();
        }
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
