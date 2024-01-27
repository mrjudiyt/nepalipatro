package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzdst zza;
    public final /* synthetic */ zzdsj zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Pair[] zzd;

    public /* synthetic */ zze(zzdst zzdst, zzdsj zzdsj, String str, Pair[] pairArr) {
        this.zza = zzdst;
        this.zzb = zzdsj;
        this.zzc = str;
        this.zzd = pairArr;
    }

    public final void run() {
        zzf.zzd(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
