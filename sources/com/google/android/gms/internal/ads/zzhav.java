package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhav {
    public static final zzhav zza = new zzhav(1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    public static final zzhav zzb = new zzhav(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    public static final zzhav zzc = new zzhav(-1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    public static final zzhav zzd = new zzhav(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhav(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.zze = d14;
        this.zzf = d15;
        this.zzg = d16;
        this.zzh = d10;
        this.zzi = d11;
        this.zzj = d12;
        this.zzk = d13;
        this.zzl = d17;
        this.zzm = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhav.class != obj.getClass()) {
            return false;
        }
        zzhav zzhav = (zzhav) obj;
        return Double.compare(zzhav.zzh, this.zzh) == 0 && Double.compare(zzhav.zzi, this.zzi) == 0 && Double.compare(zzhav.zzj, this.zzj) == 0 && Double.compare(zzhav.zzk, this.zzk) == 0 && Double.compare(zzhav.zzl, this.zzl) == 0 && Double.compare(zzhav.zzm, this.zzm) == 0 && Double.compare(zzhav.zze, this.zze) == 0 && Double.compare(zzhav.zzf, this.zzf) == 0 && Double.compare(zzhav.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zze);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long j11 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long j12 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long j13 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long j14 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long j15 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long j16 = doubleToLongBits7 ^ (doubleToLongBits7 >>> 32);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long j17 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) j16)) * 31) + ((int) j17)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d10 = this.zze;
        double d11 = this.zzf;
        double d12 = this.zzg;
        double d13 = this.zzh;
        double d14 = this.zzi;
        double d15 = this.zzj;
        double d16 = this.zzk;
        double d17 = this.zzl;
        double d18 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d10);
        sb.append(", v=");
        sb.append(d11);
        sb.append(", w=");
        sb.append(d12);
        sb.append(", a=");
        sb.append(d13);
        sb.append(", b=");
        sb.append(d14);
        sb.append(", c=");
        sb.append(d15);
        sb.append(", d=");
        sb.append(d16);
        sb.append(", tx=");
        sb.append(d17);
        sb.append(", ty=");
        sb.append(d18);
        sb.append("}");
        return sb.toString();
    }
}
