package com.google.android.gms.analytics;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzq extends Thread {
    zzq(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
