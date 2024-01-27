package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdjg {
    private zzbfl zza;

    public zzdjg(zzdis zzdis) {
        this.zza = zzdis;
    }

    public final synchronized zzbfl zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbfl zzbfl) {
        this.zza = zzbfl;
    }
}
