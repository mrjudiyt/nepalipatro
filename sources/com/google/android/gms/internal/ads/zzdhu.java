package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdhu implements zzhbc {
    private final zzhbp zza;

    public zzdhu(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdhr) this.zza).zza().zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzhbk.zzb(set);
        return set;
    }
}
