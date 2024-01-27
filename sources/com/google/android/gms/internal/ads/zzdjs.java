package com.google.android.gms.internal.ads;

import androidx.collection.h;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdjs {
    zzbgp zza;
    zzbgm zzb;
    zzbhc zzc;
    zzbgz zzd;
    zzbmb zze;
    final h zzf = new h();
    final h zzg = new h();

    public final zzdjs zza(zzbgm zzbgm) {
        this.zzb = zzbgm;
        return this;
    }

    public final zzdjs zzb(zzbgp zzbgp) {
        this.zza = zzbgp;
        return this;
    }

    public final zzdjs zzc(String str, zzbgv zzbgv, zzbgs zzbgs) {
        this.zzf.put(str, zzbgv);
        if (zzbgs != null) {
            this.zzg.put(str, zzbgs);
        }
        return this;
    }

    public final zzdjs zzd(zzbmb zzbmb) {
        this.zze = zzbmb;
        return this;
    }

    public final zzdjs zze(zzbgz zzbgz) {
        this.zzd = zzbgz;
        return this;
    }

    public final zzdjs zzf(zzbhc zzbhc) {
        this.zzc = zzbhc;
        return this;
    }

    public final zzdju zzg() {
        return new zzdju(this);
    }
}
