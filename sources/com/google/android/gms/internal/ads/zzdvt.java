package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdvt implements Runnable {
    public final /* synthetic */ zzdvu zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdvt(zzdvu zzdvu, String str) {
        this.zza = zzdvu;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
