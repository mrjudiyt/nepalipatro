package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcdl implements Runnable {
    public final /* synthetic */ zzcdu zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcdl(zzcdu zzcdu, int i10, int i11) {
        this.zza = zzcdu;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final void run() {
        this.zza.zzO(this.zzb, this.zzc);
    }
}
