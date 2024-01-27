package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzfb implements Runnable {
    public final /* synthetic */ zzbww zza;

    public /* synthetic */ zzfb(zzbww zzbww) {
        this.zza = zzbww;
    }

    public final void run() {
        zzbww zzbww = this.zza;
        if (zzbww != null) {
            try {
                zzbww.zze(1);
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
