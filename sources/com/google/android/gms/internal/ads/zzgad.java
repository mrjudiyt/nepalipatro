package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public interface zzgad extends ExecutorService {
    e zza(Runnable runnable);

    e zzb(Callable callable);
}
