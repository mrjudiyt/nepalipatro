package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcfk implements Runnable {
    public final /* synthetic */ zzcdc zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcfk(zzcdc zzcdc, Map map) {
        this.zza = zzcdc;
        this.zzb = map;
    }

    public final void run() {
        int i10 = zzcfo.zza;
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}
