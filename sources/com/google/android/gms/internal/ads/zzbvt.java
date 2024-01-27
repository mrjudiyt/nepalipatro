package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbvt extends zzbvv {
    private final String zza;
    private final int zzb;

    public zzbvt(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvt)) {
            zzbvt zzbvt = (zzbvt) obj;
            if (Objects.equal(this.zza, zzbvt.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbvt.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
