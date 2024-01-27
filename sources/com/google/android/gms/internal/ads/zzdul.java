package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdul implements Runnable {
    public final /* synthetic */ zzdur zza;
    public final /* synthetic */ zzbln zzb;

    public /* synthetic */ zzdul(zzdur zzdur, zzbln zzbln) {
        this.zza = zzdur;
        this.zzb = zzbln;
    }

    public final void run() {
        zzdur zzdur = this.zza;
        try {
            this.zzb.zzb(zzdur.zzg());
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }
}
