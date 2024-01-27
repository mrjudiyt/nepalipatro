package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcla implements zzdty {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbkh zzb;
    private final zzcjs zzc;
    private final zzcla zzd = this;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;

    /* synthetic */ zzcla(zzcjs zzcjs, Context context, zzbkh zzbkh, zzckz zzckz) {
        this.zzc = zzcjs;
        this.zza = context;
        this.zzb = zzbkh;
        zzhbc zza2 = zzhbd.zza(this);
        this.zze = zza2;
        zzhbc zza3 = zzhbd.zza(zzbkh);
        this.zzf = zza3;
        zzdtu zzdtu = new zzdtu(zza3);
        this.zzg = zzdtu;
        this.zzh = zzhbb.zzc(new zzdtw(zza2, zzdtu));
    }

    public final zzdtp zzb() {
        return new zzcku(this.zzc, this.zzd, (zzckt) null);
    }

    public final zzdtv zzd() {
        return (zzdtv) this.zzh.zzb();
    }
}
