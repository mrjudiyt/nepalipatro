package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzpa implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzpa(zzpb zzpb, long j10) {
        this.zza = zzpb;
        this.zzb = j10;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
