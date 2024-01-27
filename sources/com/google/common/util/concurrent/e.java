package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture */
public interface e<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
