package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdqs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzdqs(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcic) this.zza).zza();
        String zza3 = ((zzdxd) this.zzb).zzb();
        zzcaz zza4 = ((zzcio) this.zzc).zza();
        zzayf zzayf = (zzayf) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzaxv zzaxv = new zzaxv(new zzayb(zza2));
        zzbau zza5 = zzbav.zza();
        zza5.zza(zza4.zzb);
        zza5.zzc(zza4.zzc);
        zza5.zzb(true != zza4.zzd ? 2 : 0);
        zzaxv.zzb(new zzdqr(zzayf, zza3, (zzbav) zza5.zzal(), str));
        return zzaxv;
    }
}
