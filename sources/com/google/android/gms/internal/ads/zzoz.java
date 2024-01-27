package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzoz implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ zzid zzb;

    public /* synthetic */ zzoz(zzpb zzpb, zzid zzid) {
        this.zza = zzpb;
        this.zzb = zzid;
    }

    public final void run() {
        this.zza.zzl(this.zzb);
    }
}
