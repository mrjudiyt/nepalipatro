package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdft extends zzdcz {
    private boolean zzb;

    protected zzdft(Set set) {
        super(set);
    }

    public final void zza() {
        zzt(zzdfq.zza);
    }

    public final void zzb() {
        zzt(zzdfp.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzt(zzdfr.zza);
            this.zzb = true;
        }
        zzt(zzdfs.zza);
    }

    public final synchronized void zzd() {
        zzt(zzdfr.zza);
        this.zzb = true;
    }
}
