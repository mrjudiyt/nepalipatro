package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcrm implements zzhbc {
    private final zzcrc zza;
    private final zzhbp zzb;

    public zzcrm(zzcrc zzcrc, zzhbp zzhbp) {
        this.zza = zzcrc;
        this.zzb = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdev((zzcsm) this.zzb.zzb(), zzcbg.zzf));
        zzhbk.zzb(singleton);
        return singleton;
    }
}
