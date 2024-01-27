package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzx implements Runnable {
    public final /* synthetic */ zzaac zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzzx(zzaac zzaac, Exception exc) {
        this.zza = zzaac;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
