package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzou implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzou(zzpb zzpb, Exception exc) {
        this.zza = zzpb;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
