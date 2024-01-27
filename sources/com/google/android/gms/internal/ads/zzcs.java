package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcs {
    public static final zzn zza = zzcr.zza;
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcs.class.equals(obj.getClass())) {
            zzcs zzcs = (zzcs) obj;
            return zzfk.zzE(this.zzb, zzcs.zzb) && zzfk.zzE(this.zzc, zzcs.zzc) && this.zzd == zzcs.zzd && this.zze == zzcs.zze && this.zzg == zzcs.zzg && zzfk.zzE(this.zzm, zzcs.zzm);
        }
    }

    public final int hashCode() {
        int i10;
        Object obj = this.zzb;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        Object obj2 = this.zzc;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        int i12 = ((((i10 + 217) * 31) + i11) * 31) + this.zzd;
        long j10 = this.zze;
        return (((((i12 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzm.hashCode();
    }

    public final int zza(int i10) {
        return this.zzm.zza(i10).zzc;
    }

    public final int zzb() {
        int i10 = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        this.zzm.zzb(-1);
        return -1;
    }

    public final int zze(int i10) {
        return this.zzm.zza(i10).zza(-1);
    }

    public final int zzf(int i10, int i11) {
        return this.zzm.zza(i10).zza(i11);
    }

    public final int zzg() {
        int i10 = this.zzm.zze;
        return 0;
    }

    public final long zzh(int i10, int i11) {
        zzc zza2 = this.zzm.zza(i10);
        if (zza2.zzc != -1) {
            return zza2.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int i10) {
        long j10 = this.zzm.zza(i10).zzb;
        return 0;
    }

    public final long zzj() {
        long j10 = this.zzm.zzd;
        return 0;
    }

    public final long zzk(int i10) {
        long j10 = this.zzm.zza(i10).zzg;
        return 0;
    }

    public final zzcs zzl(Object obj, Object obj2, int i10, long j10, long j11, zzd zzd2, boolean z10) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = i10;
        this.zze = j10;
        this.zzf = 0;
        this.zzm = zzd2;
        this.zzg = z10;
        return this;
    }

    public final boolean zzm(int i10) {
        zzb();
        if (i10 != -1) {
            return false;
        }
        this.zzm.zzb(-1);
        return false;
    }

    public final boolean zzn(int i10) {
        boolean z10 = this.zzm.zza(i10).zzh;
        return false;
    }
}
