package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcwq implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;
    private final zzhbp zzl;

    public zzcwq(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7, zzhbp zzhbp8, zzhbp zzhbp9, zzhbp zzhbp10, zzhbp zzhbp11, zzhbp zzhbp12) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
        this.zzh = zzhbp8;
        this.zzi = zzhbp9;
        this.zzj = zzhbp10;
        this.zzk = zzhbp11;
        this.zzl = zzhbp12;
    }

    /* renamed from: zza */
    public final zzcwp zzb() {
        zzcaz zza2 = ((zzcio) this.zzb).zza();
        ApplicationInfo zza3 = ((zzdwy) this.zzc).zzb();
        String zza4 = ((zzdxd) this.zzd).zzb();
        zzbca zzbca = zzbci.zza;
        return new zzcwp((zzfhr) this.zza.zzb(), zza2, zza3, zza4, zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzhbb.zza(this.zzg), ((zzcia) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzeua) this.zzj).zzb(), ((zzcxc) this.zzk).zza(), (zzdcu) this.zzl.zzb());
    }
}
