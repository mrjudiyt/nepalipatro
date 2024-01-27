package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgv implements Runnable {
    public final /* synthetic */ zzcgx zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcgv(zzcgx zzcgx, Map map) {
        this.zza = zzcgx;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zzr(this.zzb);
    }
}
