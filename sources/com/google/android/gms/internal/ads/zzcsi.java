package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsi implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzcsi(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsd(((zzcvf) this.zza).zzb(), ((zzcsh) this.zzb).zza(), ((zzcsg) this.zzc).zza(), (Executor) this.zzd.zzb());
    }
}
