package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: Iterables */
public final class f0 {
    private static <E> Collection<E> a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return i0.i(iterable.iterator());
    }

    public static <T> T b(Iterable<? extends T> iterable, T t10) {
        return g0.i(iterable.iterator(), t10);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return g0.g(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return e(list);
        }
        throw new NoSuchElementException();
    }

    public static <T> T d(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return e(i0.a(iterable));
            }
        }
        return g0.h(iterable.iterator(), t10);
    }

    private static <T> T e(List<T> list) {
        return list.get(list.size() - 1);
    }

    static Object[] f(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static String g(Iterable<?> iterable) {
        return g0.m(iterable.iterator());
    }
}
