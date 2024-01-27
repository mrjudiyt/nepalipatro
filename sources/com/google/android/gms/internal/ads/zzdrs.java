package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdrs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzdrs(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String str = (String) this.zza.zzb();
        Context zza2 = ((zzcic) this.zzb).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        Map zzd2 = ((zzhbg) this.zzd).zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeM)).booleanValue()) {
            zzaxv zzaxv = new zzaxv(new zzayb(zza2));
            zzaxv.zzb(new zzdrt(str));
            set = Collections.singleton(new zzdev(new zzdrv(zzaxv, zzd2), zzgad));
        } else {
            set = Collections.emptySet();
        }
        zzhbk.zzb(set);
        return set;
    }
}
