package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcom implements Runnable {
    public final /* synthetic */ zzcou zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcom(zzcou zzcou, Throwable th) {
        this.zza = zzcou;
        this.zzb = th;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
