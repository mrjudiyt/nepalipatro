package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcii implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcii(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdut zzdut = (zzdut) this.zza.zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbB)).booleanValue()) {
            set = Collections.singleton(new zzdev(zzdut, zzgad));
        } else {
            set = Collections.emptySet();
        }
        zzhbk.zzb(set);
        return set;
    }
}
