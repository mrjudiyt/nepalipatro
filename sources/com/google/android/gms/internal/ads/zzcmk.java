package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcmk implements Runnable {
    public final /* synthetic */ zzcml zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcmk(zzcml zzcml, Runnable runnable) {
        this.zza = zzcml;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
