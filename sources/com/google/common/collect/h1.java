package com.google.common.collect;

import java.util.Comparator;

/* compiled from: SortedIterable */
interface h1<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
