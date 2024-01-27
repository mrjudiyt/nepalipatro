package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdlt implements zzhbc {
    private final zzdlm zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdlt(zzdlm zzdlm, zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzdlm;
        this.zzb = zzhbp;
        this.zzc = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdev(((zzdot) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
