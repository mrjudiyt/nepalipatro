package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfiq implements zzdem, zzcyb, zzdeq {
    private final zzfje zza;
    private final zzfit zzb;

    zzfiq(Context context, zzfje zzfje) {
        this.zza = zzfje;
        this.zzb = zzfis.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            zzfje zzfje = this.zza;
            zzfit zzfit = this.zzb;
            zzfit.zzf(true);
            zzfje.zza(zzfit);
        }
    }

    public final void zzk() {
    }

    public final void zzl() {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    public final void zzp(zze zze) {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            zzfje zzfje = this.zza;
            zzfit zzfit = this.zzb;
            zzfit.zzc(zze.zza().toString());
            zzfit.zzf(false);
            zzfje.zza(zzfit);
        }
    }
}
