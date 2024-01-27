package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdhm implements zzcta {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhbp zzd;
    private final zzdju zze;

    zzdhm(Map map, Map map2, Map map3, zzhbp zzhbp, zzdju zzdju) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhbp;
        this.zze = zzdju;
    }

    public final zzeeu zza(int i10, String str) {
        zzeeu zza2;
        zzeeu zzeeu = (zzeeu) this.zza.get(str);
        if (zzeeu != null) {
            return zzeeu;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzehi zzehi = (zzehi) this.zzc.get(str);
            if (zzehi != null) {
                return new zzeev(zzehi, zzctc.zza);
            }
            zzeeu zzeeu2 = (zzeeu) this.zzb.get(str);
            if (zzeeu2 == null) {
                return null;
            }
            return zzcte.zza(zzeeu2);
        } else if (this.zze.zze() == null || (zza2 = ((zzcta) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        } else {
            return zzcte.zza(zza2);
        }
    }
}
