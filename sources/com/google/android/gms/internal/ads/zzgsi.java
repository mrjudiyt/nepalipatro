package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgsi implements Comparator {
    zzgsi() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgsr zzgsr = (zzgsr) obj;
        zzgsr zzgsr2 = (zzgsr) obj2;
        zzgsl zzs = zzgsr.iterator();
        zzgsl zzs2 = zzgsr2.iterator();
        while (zzs.hasNext() && zzs2.hasNext()) {
            int compareTo = Integer.valueOf(zzs.zza() & 255).compareTo(Integer.valueOf(zzs2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgsr.zzd()).compareTo(Integer.valueOf(zzgsr2.zzd()));
    }
}
