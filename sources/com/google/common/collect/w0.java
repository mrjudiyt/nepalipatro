package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Platform */
final class w0 {
    static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i10) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10);
    }

    static <E> Set<E> c() {
        return l.f();
    }

    static <K, V> Map<K, V> d() {
        return k.r();
    }
}
