package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdmf implements zzfza {
    public final /* synthetic */ e zza;

    public /* synthetic */ zzdmf(e eVar) {
        this.zza = eVar;
    }

    public final e zza(Object obj) {
        if (((zzcgb) obj) != null) {
            return this.zza;
        }
        throw new zzeir(1, "Retrieve Web View from image ad response failed.");
    }
}
