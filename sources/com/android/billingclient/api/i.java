package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class i implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f5473a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f5474b = new AtomicInteger(1);

    i(d dVar) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5473a.newThread(runnable);
        int andIncrement = this.f5474b.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
