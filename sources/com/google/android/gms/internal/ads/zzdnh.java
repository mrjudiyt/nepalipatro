package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdnh implements Runnable {
    public final /* synthetic */ zzdnj zza;

    public /* synthetic */ zzdnh(zzdnj zzdnj) {
        this.zza = zzdnj;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
