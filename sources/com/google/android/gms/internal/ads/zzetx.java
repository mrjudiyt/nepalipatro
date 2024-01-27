package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzetx implements Runnable {
    public final /* synthetic */ zzetz zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzetw zzc;

    public /* synthetic */ zzetx(zzetz zzetz, long j10, zzetw zzetw) {
        this.zza = zzetz;
        this.zzb = j10;
        this.zzc = zzetw;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
