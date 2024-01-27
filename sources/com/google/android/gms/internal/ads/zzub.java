package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzub implements Runnable {
    public final /* synthetic */ zzuf zza;
    public final /* synthetic */ zzug zzb;
    public final /* synthetic */ zztn zzc;
    public final /* synthetic */ zzts zzd;

    public /* synthetic */ zzub(zzuf zzuf, zzug zzug, zztn zztn, zzts zzts) {
        this.zza = zzuf;
        this.zzb = zzug;
        this.zzc = zztn;
        this.zzd = zzts;
    }

    public final void run() {
        this.zzb.zzae(0, this.zza.zzb, this.zzc, this.zzd);
    }
}
