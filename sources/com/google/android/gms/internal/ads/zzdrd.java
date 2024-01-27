package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdrd implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdrd(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        zzdrv zza2 = ((zzdrw) this.zzb).zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeM)).booleanValue()) {
            set = Collections.singleton(new zzdev(zza2, zzgad));
        } else {
            set = Collections.emptySet();
        }
        zzhbk.zzb(set);
        return set;
    }
}
