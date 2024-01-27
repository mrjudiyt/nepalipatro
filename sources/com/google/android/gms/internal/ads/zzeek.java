package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeek implements Runnable {
    public final /* synthetic */ zzfkc zza;

    public /* synthetic */ zzeek(zzfkc zzfkc) {
        this.zza = zzfkc;
    }

    public final void run() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            this.zza.zzc();
        }
    }
}
