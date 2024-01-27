package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcqa implements Runnable {
    public final /* synthetic */ zzcqb zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcqa(zzcqb zzcqb, JSONObject jSONObject) {
        this.zza = zzcqb;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
