package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgag extends zzfzn implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzgag(e eVar, ScheduledFuture scheduledFuture) {
        super(eVar);
        this.zza = scheduledFuture;
    }

    public final boolean cancel(boolean z10) {
        boolean cancel = zzb().cancel(z10);
        if (cancel) {
            this.zza.cancel(z10);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zza.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
