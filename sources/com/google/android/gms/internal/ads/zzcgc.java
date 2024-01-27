package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcgc implements Runnable {
    public final /* synthetic */ zzcgi zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzbxu zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcgc(zzcgi zzcgi, View view, zzbxu zzbxu, int i10) {
        this.zza = zzcgi;
        this.zzb = view;
        this.zzc = zzbxu;
        this.zzd = i10;
    }

    public final void run() {
        this.zza.zzo(this.zzb, this.zzc, this.zzd);
    }
}
