package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcsc implements Runnable {
    public final /* synthetic */ zzcsd zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcsc(zzcsd zzcsd, Runnable runnable) {
        this.zza = zzcsd;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
