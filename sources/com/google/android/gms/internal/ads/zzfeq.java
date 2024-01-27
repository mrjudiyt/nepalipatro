package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfeq implements zzhbc {
    private final zzfep zza;

    public zzfeq(zzfep zzfep) {
        this.zza = zzfep;
    }

    public final /* synthetic */ Object zzb() {
        Clock instance = DefaultClock.getInstance();
        zzhbk.zzb(instance);
        return instance;
    }
}
