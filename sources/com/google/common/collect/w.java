package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ImmutableEntry */
class w<K, V> extends e<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    final K f13697h;

    /* renamed from: i  reason: collision with root package name */
    final V f13698i;

    w(K k10, V v10) {
        this.f13697h = k10;
        this.f13698i = v10;
    }

    public final K getKey() {
        return this.f13697h;
    }

    public final V getValue() {
        return this.f13698i;
    }

    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
