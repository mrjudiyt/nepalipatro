package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdsu implements Runnable {
    public final /* synthetic */ zzdsw zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsu(zzdsw zzdsw, String str) {
        this.zza = zzdsw;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zze.zza(this.zzb);
    }
}
