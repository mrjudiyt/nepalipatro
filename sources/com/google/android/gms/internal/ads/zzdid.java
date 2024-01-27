package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdid implements zzbjj {
    private final WeakReference zza;

    /* synthetic */ zzdid(zzdig zzdig, zzdic zzdic) {
        this.zza = new WeakReference(zzdig);
    }

    public final void zza(Object obj, Map map) {
        zzdig zzdig = (zzdig) this.zza.get();
        if (zzdig != null) {
            zzdig.zzh.onAdClicked();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
                zzdig.zzi.zzbK();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdig.zzi.zzs();
                }
            }
        }
    }
}
