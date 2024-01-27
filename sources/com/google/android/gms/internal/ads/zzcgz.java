package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgz implements Runnable {
    public final /* synthetic */ zzchb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcgz(zzchb zzchb, String str) {
        this.zza = zzchb;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
