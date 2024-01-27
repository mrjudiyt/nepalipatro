package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdmd implements zzfza {
    public final /* synthetic */ e zza;

    public /* synthetic */ zzdmd(e eVar) {
        this.zza = eVar;
    }

    public final e zza(Object obj) {
        zzcgb zzcgb = (zzcgb) obj;
        if (zzcgb != null && zzcgb.zzq() != null) {
            return this.zza;
        }
        throw new zzeir(1, "Retrieve video view in html5 ad response failed.");
    }
}
