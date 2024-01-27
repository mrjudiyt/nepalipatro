package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfjw implements Runnable {
    public final /* synthetic */ zzfjx zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfje zzc;

    public /* synthetic */ zzfjw(zzfjx zzfjx, String str, zzfje zzfje) {
        this.zza = zzfjx;
        this.zzb = str;
        this.zzc = zzfje;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
