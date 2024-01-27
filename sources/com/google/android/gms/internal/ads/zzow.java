package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzow implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzow(zzpb zzpb, boolean z10) {
        this.zza = zzpb;
        this.zzb = z10;
    }

    public final void run() {
        this.zza.zzp(this.zzb);
    }
}
