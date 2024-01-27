package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzs {
    public static final zzs zza = new zzs(1, 2, 3, (byte[]) null);
    public static final zzs zzb;
    public static final zzn zzc = zzp.zza;
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    private int zzl;

    static {
        zzr zzr = new zzr();
        zzr.zzb(1);
        zzr.zza(1);
        zzr.zzc(2);
        zzb = zzr.zzd();
    }

    @Deprecated
    public zzs(int i10, int i11, int i12, byte[] bArr) {
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = bArr;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzf(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzg(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzh(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzs = (zzs) obj;
            return this.zzd == zzs.zzd && this.zze == zzs.zze && this.zzf == zzs.zzf && Arrays.equals(this.zzg, zzs.zzg);
        }
    }

    public final int hashCode() {
        int i10 = this.zzl;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31) + Arrays.hashCode(this.zzg);
        this.zzl = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(zzg(this.zzd));
        sb.append(", ");
        sb.append(zzf(this.zze));
        sb.append(", ");
        sb.append(zzh(this.zzf));
        sb.append(", ");
        sb.append(this.zzg != null);
        sb.append(")");
        return sb.toString();
    }

    public final zzr zzc() {
        return new zzr(this, (zzq) null);
    }

    public final String zzd() {
        if (!zze()) {
            return "NA";
        }
        return String.format(Locale.US, "%s/%s/%s", new Object[]{zzg(this.zzd), zzf(this.zze), zzh(this.zzf)});
    }

    public final boolean zze() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
