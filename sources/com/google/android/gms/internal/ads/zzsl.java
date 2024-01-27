package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzsl {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzsl(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzsl.class) {
            zzsl zzsl = (zzsl) obj;
            return TextUtils.equals(this.zza, zzsl.zza) && this.zzb == zzsl.zzb && this.zzc == zzsl.zzc;
        }
    }

    public final int hashCode() {
        int i10 = 1237;
        int hashCode = (((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31;
        if (true == this.zzc) {
            i10 = 1231;
        }
        return hashCode + i10;
    }
}
