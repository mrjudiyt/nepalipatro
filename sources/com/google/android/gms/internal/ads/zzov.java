package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzov implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ zzam zzb;
    public final /* synthetic */ zzie zzc;

    public /* synthetic */ zzov(zzpb zzpb, zzam zzam, zzie zzie) {
        this.zza = zzpb;
        this.zzb = zzam;
        this.zzc = zzie;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
