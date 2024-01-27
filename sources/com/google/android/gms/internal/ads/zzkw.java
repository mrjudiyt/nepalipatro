package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzkw implements Runnable {
    public final /* synthetic */ zzkx zza;
    public final /* synthetic */ zzfvp zzb;
    public final /* synthetic */ zztw zzc;

    public /* synthetic */ zzkw(zzkx zzkx, zzfvp zzfvp, zztw zztw) {
        this.zza = zzkx;
        this.zzb = zzfvp;
        this.zzc = zztw;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
