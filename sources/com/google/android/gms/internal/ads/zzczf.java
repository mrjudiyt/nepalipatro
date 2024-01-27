package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzczf extends zzdcz implements zzbhz {
    private final Bundle zzb = new Bundle();

    zzczf(Set set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzt(zzcze.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
