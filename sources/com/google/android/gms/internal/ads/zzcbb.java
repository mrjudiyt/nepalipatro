package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcbb extends ScheduledThreadPoolExecutor {
    zzcbb(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
