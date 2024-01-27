package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzuj implements zzxk {
    private final zzxk zza;
    private final zzcx zzb;

    public zzuj(zzxk zzxk, zzcx zzcx) {
        this.zza = zzxk;
        this.zzb = zzcx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuj)) {
            return false;
        }
        zzuj zzuj = (zzuj) obj;
        return this.zza.equals(zzuj.zza) && this.zzb.equals(zzuj.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    public final int zza(int i10) {
        return this.zza.zza(0);
    }

    public final int zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final int zzc() {
        return this.zza.zzc();
    }

    public final zzam zzd(int i10) {
        return this.zza.zzd(i10);
    }

    public final zzcx zze() {
        return this.zzb;
    }
}
