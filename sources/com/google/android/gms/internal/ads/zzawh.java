package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzawh implements Comparator {
    public zzawh(zzawi zzawi) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavw zzavw = (zzavw) obj;
        zzavw zzavw2 = (zzavw) obj2;
        if (zzavw.zzd() >= zzavw2.zzd()) {
            if (zzavw.zzd() > zzavw2.zzd()) {
                return 1;
            }
            if (zzavw.zzb() >= zzavw2.zzb()) {
                if (zzavw.zzb() > zzavw2.zzb()) {
                    return 1;
                }
                float zza = (zzavw.zza() - zzavw.zzd()) * (zzavw.zzc() - zzavw.zzb());
                float zza2 = (zzavw2.zza() - zzavw2.zzd()) * (zzavw2.zzc() - zzavw2.zzb());
                if (zza <= zza2) {
                    if (zza < zza2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
