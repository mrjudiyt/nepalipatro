package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdsj;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzk implements Runnable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdsj zzd;

    public /* synthetic */ zzk(zzaa zzaa, String str, String str2, zzdsj zzdsj) {
        this.zza = zzaa;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdsj;
    }

    public final void run() {
        this.zza.zzI(this.zzb, this.zzc, this.zzd);
    }
}
