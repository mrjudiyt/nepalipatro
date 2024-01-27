package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
enum zzfzh implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
