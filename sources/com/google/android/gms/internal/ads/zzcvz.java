package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcvz implements zzdag {
    private final Context zza;
    private final zzfdn zzb;
    private final zzcaz zzc;
    private final zzg zzd;
    private final zzdur zze;
    private final zzfjh zzf;

    public zzcvz(Context context, zzfdn zzfdn, zzcaz zzcaz, zzg zzg, zzdur zzdur, zzfjh zzfjh) {
        this.zza = context;
        this.zzb = zzfdn;
        this.zzc = zzcaz;
        this.zzd = zzg;
        this.zze = zzdur;
        this.zzf = zzfjh;
    }

    public final void zzbr(zzbvg zzbvg) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdN)).booleanValue()) {
            zzg zzg = this.zzd;
            Context context = this.zza;
            zzcaz zzcaz = this.zzc;
            zzfdn zzfdn = this.zzb;
            zzfjh zzfjh = this.zzf;
            zzt.zza().zzc(context, zzcaz, zzfdn.zzf, zzg.zzh(), zzfjh);
        }
        this.zze.zzr();
    }

    public final void zzbs(zzfde zzfde) {
    }
}
