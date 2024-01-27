package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeaw implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;

    public zzeaw(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7, zzhbp zzhbp8) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
        this.zzh = zzhbp8;
    }

    public final /* synthetic */ Object zzb() {
        Context zza2 = ((zzcic) this.zza).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzeav(zza2, zzgad, new zzbvs(), ((zzcil) this.zzd).zzb(), ((zzebo) this.zze).zzb(), (ArrayDeque) this.zzf.zzb(), new zzebk(), (zzfjh) this.zzh.zzb());
    }
}
