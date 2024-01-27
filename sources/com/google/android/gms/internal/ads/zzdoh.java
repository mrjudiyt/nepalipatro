package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdoh implements zzbjj {
    final /* synthetic */ zzdoi zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjj zzd;

    /* synthetic */ zzdoh(zzdoi zzdoi, WeakReference weakReference, String str, zzbjj zzbjj, zzdog zzdog) {
        this.zza = zzdoi;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjj;
    }

    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
