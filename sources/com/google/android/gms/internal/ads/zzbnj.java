package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbnj implements Runnable {
    public final /* synthetic */ zzbnk zza;
    public final /* synthetic */ zzbmh zzb;

    public /* synthetic */ zzbnj(zzbnk zzbnk, zzbmh zzbmh) {
        this.zza = zzbnk;
        this.zzb = zzbmh;
    }

    public final void run() {
        zzbmh zzbmh = this.zzb;
        zzbmh.zzr("/result", zzbji.zzo);
        zzbmh.zzc();
    }
}
