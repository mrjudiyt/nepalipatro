package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeed implements Runnable {
    public final /* synthetic */ zzfkc zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzeed(zzfkc zzfkc, View view) {
        this.zza = zzfkc;
        this.zzb = view;
    }

    public final void run() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            this.zza.zzb(this.zzb, zzfkj.NOT_VISIBLE, "Ad overlay");
        }
    }
}
