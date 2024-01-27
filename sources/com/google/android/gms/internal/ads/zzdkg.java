package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdkg implements Runnable {
    public final /* synthetic */ zzdkj zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdkg(zzdkj zzdkj, ViewGroup viewGroup) {
        this.zza = zzdkj;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
