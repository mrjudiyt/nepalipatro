package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdm {
    public static final zzdm zza = new zzdm(0, 0, 0, 1.0f);
    public static final zzn zzb = zzdl.zza;
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    public zzdm(int i10, int i11, int i12, float f10) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdm) {
            zzdm zzdm = (zzdm) obj;
            return this.zzc == zzdm.zzc && this.zzd == zzdm.zzd && this.zze == zzdm.zze && this.zzf == zzdm.zzf;
        }
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
