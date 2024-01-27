package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaxb implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzaxd zza;

    zzaxb(zzaxd zzaxd) {
        this.zza = zzaxd;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzaxd zzaxd = this.zza;
                if (zzaxd.zzd != null) {
                    zzaxd.zzf = zzaxd.zzd.zzq();
                }
            } catch (DeadObjectException e10) {
                zzcat.zzh("Unable to obtain a cache service instance.", e10);
                zzaxd.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i10) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
