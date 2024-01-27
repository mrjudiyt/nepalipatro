package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgbz {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgqf zzd;
    private final int zze;
    private final String zzf;
    private final zzgbe zzg;
    private final int zzh;

    zzgbz(Object obj, Object obj2, byte[] bArr, int i10, zzgqf zzgqf, int i11, String str, zzgbe zzgbe) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i10;
        this.zzd = zzgqf;
        this.zze = i11;
        this.zzf = str;
        this.zzg = zzgbe;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgbe zzb() {
        return this.zzg;
    }

    public final zzgqf zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
