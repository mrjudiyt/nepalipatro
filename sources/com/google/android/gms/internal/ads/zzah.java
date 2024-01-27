package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzah {
    private final SparseBooleanArray zza;

    /* synthetic */ zzah(SparseBooleanArray sparseBooleanArray, zzag zzag) {
        this.zza = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzah = (zzah) obj;
        if (zzfk.zza >= 24) {
            return this.zza.equals(zzah.zza);
        }
        if (this.zza.size() != zzah.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (zza(i10) != zzah.zza(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzfk.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            size = (size * 31) + zza(i10);
        }
        return size;
    }

    public final int zza(int i10) {
        zzdx.zza(i10, 0, this.zza.size());
        return this.zza.keyAt(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i10) {
        return this.zza.get(i10);
    }
}
