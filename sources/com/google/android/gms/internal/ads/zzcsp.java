package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsp {
    private final zzdaa zza;
    private final zzdch zzb;

    public zzcsp(zzdaa zzdaa, zzdch zzdch) {
        this.zza = zzdaa;
        this.zzb = zzdch;
    }

    public final zzdaa zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdch zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzdev zzc() {
        zzdch zzdch = this.zzb;
        if (zzdch != null) {
            return new zzdev(zzdch, zzcbg.zzf);
        }
        return new zzdev(new zzcso(this), zzcbg.zzf);
    }
}
