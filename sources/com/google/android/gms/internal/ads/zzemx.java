package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzemx {
    private final zzdju zza;
    private final zzemk zzb;
    private final zzcxo zzc;

    public zzemx(zzdju zzdju, zzfib zzfib) {
        this.zza = zzdju;
        zzemk zzemk = new zzemk(zzfib);
        this.zzb = zzemk;
        this.zzc = new zzemw(zzemk, zzdju.zzg());
    }

    public final zzcxo zza() {
        return this.zzc;
    }

    public final zzcyz zzb() {
        return this.zzb;
    }

    public final zzdho zzc() {
        return new zzdho(this.zza, this.zzb.zzg());
    }

    public final zzemk zzd() {
        return this.zzb;
    }

    public final void zze(zzbh zzbh) {
        this.zzb.zzj(zzbh);
    }
}
