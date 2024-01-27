package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcdn implements Runnable {
    public final /* synthetic */ zzcdu zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcdn(zzcdu zzcdu, boolean z10, long j10) {
        this.zza = zzcdu;
        this.zzb = z10;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzJ(this.zzb, this.zzc);
    }
}
