package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzlo extends zztk {
    private final zzcu zzd = new zzcu();

    zzlo(zzlp zzlp, zzcv zzcv) {
        super(zzcv);
    }

    public final zzcs zzd(int i10, zzcs zzcs, boolean z10) {
        zzcs zzd2 = this.zzc.zzd(i10, zzcs, z10);
        if (this.zzc.zze(zzd2.zzd, this.zzd, 0).zzb()) {
            zzd2.zzl(zzcs.zzb, zzcs.zzc, zzcs.zzd, zzcs.zze, 0, zzd.zza, true);
        } else {
            zzd2.zzg = true;
        }
        return zzd2;
    }
}
