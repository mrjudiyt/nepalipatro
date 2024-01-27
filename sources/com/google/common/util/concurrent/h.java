package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;

/* compiled from: SettableFuture */
public final class h<V> extends a.j<V> {
    private h() {
    }

    public static <V> h<V> C() {
        return new h<>();
    }

    public boolean A(V v10) {
        return super.A(v10);
    }

    public boolean B(Throwable th) {
        return super.B(th);
    }

    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }
}
