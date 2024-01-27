package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcpe implements zzfzp {
    final /* synthetic */ zzcpg zza;

    zzcpe(zzcpg zzcpg) {
        this.zza = zzcpg;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpg zzcpg = this.zza;
        zzfdx zzj = zzcpg.zzh;
        List zzd = zzcpg.zzg.zzd(zzcpg.zze, zzcpg.zzf, false, "", (String) obj, zzcpg.zzf.zzc);
        int i10 = 1;
        if (true == zzt.zzo().zzx(this.zza.zza)) {
            i10 = 2;
        }
        zzj.zzc(zzd, i10);
    }
}
