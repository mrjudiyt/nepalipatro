package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import l6.p;

/* compiled from: SortedIterables */
final class i1 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? v0.c() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        p.j(comparator);
        p.j(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof h1)) {
            return false;
        } else {
            comparator2 = ((h1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
