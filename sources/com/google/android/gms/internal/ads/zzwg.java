package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzwg implements zzxk {
    protected final zzcx zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzwg(zzcx zzcx, int[] iArr, int i10) {
        int length = iArr.length;
        zzdx.zzf(length > 0);
        Objects.requireNonNull(zzcx);
        this.zza = zzcx;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzcx.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, zzwf.zza);
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzcx.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwg zzwg = (zzwg) obj;
            return this.zza.equals(zzwg.zza) && Arrays.equals(this.zzc, zzwg.zzc);
        }
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i10) {
        return this.zzc[0];
    }

    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzam zzd(int i10) {
        return this.zzd[i10];
    }

    public final zzcx zze() {
        return this.zza;
    }
}
