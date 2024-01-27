package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcx {
    public static final zzn zza = zzcw.zza;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;

    public zzcx(String str, zzam... zzamArr) {
        this.zzc = str;
        this.zzg = zzamArr;
        int zzb2 = zzcb.zzb(zzamArr[0].zzm);
        this.zzd = zzb2 == -1 ? zzcb.zzb(zzamArr[0].zzl) : zzb2;
        zzd(zzamArr[0].zzd);
        int i10 = zzamArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcx = (zzcx) obj;
            return this.zzc.equals(zzcx.zzc) && Arrays.equals(this.zzg, zzcx.zzg);
        }
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = hashCode;
        return hashCode;
    }

    public final int zza(zzam zzam) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (zzam == this.zzg[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final zzam zzb(int i10) {
        return this.zzg[i10];
    }

    public final zzcx zzc(String str) {
        return new zzcx(str, this.zzg);
    }
}
