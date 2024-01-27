package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzg implements Runnable {
    public final /* synthetic */ zzi zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzg(zzi zzi, boolean z10) {
        this.zza = zzi;
        this.zzb = z10;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
