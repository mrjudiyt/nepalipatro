package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zztw {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zztw(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private zztw(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztw)) {
            return false;
        }
        zztw zztw = (zztw) obj;
        return this.zza.equals(zztw.zza) && this.zzb == zztw.zzb && this.zzc == zztw.zzc && this.zzd == zztw.zzd && this.zze == zztw.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zztw zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zztw(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zztw(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zztw(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
