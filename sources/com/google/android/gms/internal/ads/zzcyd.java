package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcyd extends zzdcz {
    private boolean zzb = false;

    public zzcyd(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzt(zzcyc.zza);
            this.zzb = true;
        }
    }
}
