package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdrv implements zzfhs {
    private final Map zza;
    private final zzaxv zzb;

    zzdrv(zzaxv zzaxv, Map map) {
        this.zza = map;
        this.zzb = zzaxv;
    }

    public final void zzbG(zzfhl zzfhl, String str) {
    }

    public final void zzbH(zzfhl zzfhl, String str, Throwable th) {
        if (this.zza.containsKey(zzfhl)) {
            this.zzb.zzc(((zzdru) this.zza.get(zzfhl)).zzc);
        }
    }

    public final void zzbI(zzfhl zzfhl, String str) {
        if (this.zza.containsKey(zzfhl)) {
            this.zzb.zzc(((zzdru) this.zza.get(zzfhl)).zza);
        }
    }

    public final void zzd(zzfhl zzfhl, String str) {
        if (this.zza.containsKey(zzfhl)) {
            this.zzb.zzc(((zzdru) this.zza.get(zzfhl)).zzb);
        }
    }
}
