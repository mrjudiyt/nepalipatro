package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdoi;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzm implements Runnable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ zzdoi[] zzb;

    public /* synthetic */ zzm(zzaa zzaa, zzdoi[] zzdoiArr) {
        this.zza = zzaa;
        this.zzb = zzdoiArr;
    }

    public final void run() {
        this.zza.zzH(this.zzb);
    }
}
