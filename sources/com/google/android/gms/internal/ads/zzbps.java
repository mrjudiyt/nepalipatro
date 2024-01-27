package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbps implements InitializationCompleteCallback {
    final /* synthetic */ zzblk zza;

    zzbps(zzbpy zzbpy, zzblk zzblk) {
        this.zza = zzblk;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }
}
