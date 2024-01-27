package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzvd implements zzui {
    private final zzgh zzc;
    private int zzd = 1048576;
    private final zzvc zze;
    private final zzyd zzf;
    private final zzqu zzg;

    public zzvd(zzgh zzgh, zzvc zzvc) {
        zzqu zzqu = new zzqu();
        zzyd zzyd = new zzyd();
        this.zzc = zzgh;
        this.zze = zzvc;
        this.zzg = zzqu;
        this.zzf = zzyd;
    }

    public final zzvd zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzvf zzb(zzbp zzbp) {
        Objects.requireNonNull(zzbp.zzd);
        return new zzvf(zzbp, this.zzc, this.zze, zzrd.zza, this.zzf, this.zzd, (zzve) null);
    }
}
