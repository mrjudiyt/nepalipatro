package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final /* synthetic */ class zzfj implements Runnable {
    public final /* synthetic */ zzfn zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfb zzc;

    public /* synthetic */ zzfj(zzfn zzfn, int i10, zzfb zzfb) {
        this.zza = zzfn;
        this.zzb = i10;
        this.zzc = zzfb;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}
