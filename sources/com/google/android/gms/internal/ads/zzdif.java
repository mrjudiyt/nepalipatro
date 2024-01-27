package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdif implements zzbjj {
    private final WeakReference zza;

    /* synthetic */ zzdif(zzdig zzdig, zzdie zzdie) {
        this.zza = new WeakReference(zzdig);
    }

    public final void zza(Object obj, Map map) {
        zzdig zzdig = (zzdig) this.zza.get();
        if (zzdig != null) {
            zzdig.zzg.zza();
        }
    }
}
