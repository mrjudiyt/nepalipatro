package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewt implements zzetw {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbsz zzc;

    public zzewt(zzbsz zzbsz, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbsz;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final e zzb() {
        return zzfzt.zzm(zzfzt.zzo(zzfzt.zzh(new Bundle()), ((Long) zzba.zzc().zzb(zzbci.zzdV)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzews.zza, zzcbg.zza);
    }
}
