package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdxo implements zzfzp {
    final /* synthetic */ zzdxp zza;

    zzdxo(zzdxp zzdxp) {
        this.zza = zzdxp;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
            Matcher matcher = zzdxp.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfde zzfde = (zzfde) obj;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
            this.zza.zzf.zzi(zzfde.zzb.zzb.zze);
            this.zza.zzf.zzj(zzfde.zzb.zzb.zzf);
        }
    }
}
