package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcpf implements zzfzp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpg zzb;

    zzcpf(zzcpg zzcpg, String str) {
        this.zzb = zzcpg;
        this.zza = str;
    }

    public final void zza(Throwable th) {
        zzcpg zzcpg = this.zzb;
        zzcpg.zzh.zza(zzcpg.zzg.zzd(zzcpg.zze, zzcpg.zzf, false, this.zza, (String) null, zzcpg.zzf.zzd));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpg zzcpg = this.zzb;
        zzfdx zzj = zzcpg.zzh;
        zzfjt zzk = zzcpg.zzg;
        zzfde zzi = zzcpg.zze;
        zzfcr zzh = zzcpg.zzf;
        List list = zzcpg.zzf.zzd;
        zzj.zza(zzk.zzd(zzi, zzh, false, this.zza, (String) obj, list));
    }
}
