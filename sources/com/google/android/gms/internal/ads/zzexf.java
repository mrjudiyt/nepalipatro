package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexf {
    public static zzetw zza(zzewj zzewj, zzerw zzerw, ScheduledExecutorService scheduledExecutorService, int i10) {
        return i10 == 0 ? new zzese(zzerw, 0, scheduledExecutorService) : new zzese(zzewj, 0, scheduledExecutorService);
    }

    public static zzetw zzb(zzewt zzewt, ScheduledExecutorService scheduledExecutorService) {
        return new zzese(zzewt, ((Long) zzba.zzc().zzb(zzbci.zzdV)).longValue(), scheduledExecutorService);
    }

    public static zzetw zzc(zzexo zzexo, ScheduledExecutorService scheduledExecutorService) {
        return new zzese(zzexo, 0, scheduledExecutorService);
    }
}
