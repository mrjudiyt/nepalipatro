package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdgf implements zzhbc {
    private final zzdga zza;
    private final zzhbp zzb;

    public zzdgf(zzdga zzdga, zzhbp zzhbp) {
        this.zza = zzdga;
        this.zzb = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdev((zzcwi) this.zzb.zzb(), zzcbg.zzf));
        zzhbk.zzb(singleton);
        return singleton;
    }
}
