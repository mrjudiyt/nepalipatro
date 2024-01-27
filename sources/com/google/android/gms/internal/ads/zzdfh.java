package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdfh {
    private final List zza;
    private final zzfjx zzb;
    private boolean zzc;

    public zzdfh(zzfcr zzfcr, zzfjx zzfjx) {
        this.zza = zzfcr.zzr;
        this.zzb = zzfjx;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
