package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzoy implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzoy(zzpb zzpb, String str) {
        this.zza = zzpb;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
