package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaxc implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzaxd zza;

    zzaxc(zzaxd zzaxd) {
        this.zza = zzaxd;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzaxd zzaxd = this.zza;
            if (zzaxd.zzd != null) {
                zzaxd.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
