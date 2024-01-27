package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbmj implements Runnable {
    public final /* synthetic */ zzbmp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbmj(zzbmp zzbmp, String str) {
        this.zza = zzbmp;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
