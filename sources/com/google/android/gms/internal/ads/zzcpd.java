package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcpd implements Runnable {
    public final /* synthetic */ zzcpg zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcpd(zzcpg zzcpg, int i10, int i11) {
        this.zza = zzcpg;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final void run() {
        this.zza.zzo(this.zzb, this.zzc);
    }
}
