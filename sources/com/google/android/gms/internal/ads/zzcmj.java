package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcmj implements Runnable {
    public final /* synthetic */ zzcml zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcmj(zzcml zzcml, Runnable runnable) {
        this.zza = zzcml;
        this.zzb = runnable;
    }

    public final void run() {
        zzcbg.zze.execute(new zzcmk(this.zza, this.zzb));
    }
}
