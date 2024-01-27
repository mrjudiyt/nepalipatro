package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeov implements zzetw {
    private final Executor zza;
    private final zzcac zzb;

    zzeov(Executor executor, zzcac zzcac) {
        this.zza = executor;
        this.zzb = zzcac;
    }

    public final int zza() {
        return 10;
    }

    public final e zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcy)).booleanValue()) {
            return zzfzt.zzh((Object) null);
        }
        zzcac zzcac = this.zzb;
        return zzfzt.zzm(zzcac.zzj(), zzeou.zza, this.zza);
    }
}
