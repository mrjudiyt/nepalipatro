package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbmi implements Predicate {
    public final /* synthetic */ zzbjj zza;

    public /* synthetic */ zzbmi(zzbjj zzbjj) {
        this.zza = zzbjj;
    }

    public final boolean apply(Object obj) {
        zzbjj zzbjj = (zzbjj) obj;
        if (!(zzbjj instanceof zzbmo)) {
            return false;
        }
        return ((zzbmo) zzbjj).zzb.equals(this.zza);
    }
}
