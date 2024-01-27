package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbyp implements Runnable {
    public final /* synthetic */ zzbyy zza;
    public final /* synthetic */ zzbyx zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbyp(zzbyy zzbyy, zzbyx zzbyx, String str) {
        this.zza = zzbyy;
        this.zzb = zzbyx;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
