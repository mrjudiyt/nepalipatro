package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzacr {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzacr(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacr = (zzacr) obj;
            return this.zza == zzacr.zza && this.zzc == zzacr.zzc && this.zzd == zzacr.zzd && Arrays.equals(this.zzb, zzacr.zzb);
        }
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
