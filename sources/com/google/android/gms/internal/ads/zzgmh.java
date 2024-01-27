package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmh {
    private final zzgbj zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzgmh(zzgbj zzgbj, int i10, String str, String str2, zzgmg zzgmg) {
        this.zza = zzgbj;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmh)) {
            return false;
        }
        zzgmh zzgmh = (zzgmh) obj;
        if (this.zza != zzgmh.zza || this.zzb != zzgmh.zzb || !this.zzc.equals(zzgmh.zzc) || !this.zzd.equals(zzgmh.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zzb;
    }
}
