package com.google.common.util.concurrent;

/* compiled from: FutureCallback */
public interface b<V> {
    void onFailure(Throwable th);

    void onSuccess(V v10);
}
