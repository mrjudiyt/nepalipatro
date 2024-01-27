package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzj zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc = "admob";

    public /* synthetic */ zzi(zzj zzj, Context context, String str) {
        this.zza = zzj;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzS(this.zzb, this.zzc);
    }
}
