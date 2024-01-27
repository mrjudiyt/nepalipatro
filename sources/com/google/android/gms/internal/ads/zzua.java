package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzua implements Runnable {
    public final /* synthetic */ zzuf zza;
    public final /* synthetic */ zzug zzb;
    public final /* synthetic */ zztn zzc;
    public final /* synthetic */ zzts zzd;

    public /* synthetic */ zzua(zzuf zzuf, zzug zzug, zztn zztn, zzts zzts) {
        this.zza = zzuf;
        this.zzb = zzug;
        this.zzc = zztn;
        this.zzd = zzts;
    }

    public final void run() {
        this.zzb.zzag(0, this.zza.zzb, this.zzc, this.zzd);
    }
}
