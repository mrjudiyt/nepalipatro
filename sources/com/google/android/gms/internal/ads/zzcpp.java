package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcpp implements Runnable {
    public final /* synthetic */ zzcgb zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcpp(zzcgb zzcgb, JSONObject jSONObject) {
        this.zza = zzcgb;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}
