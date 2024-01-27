package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaxq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcbl zza;
    final /* synthetic */ zzaxr zzb;

    zzaxq(zzaxr zzaxr, zzcbl zzcbl) {
        this.zzb = zzaxr;
        this.zza = zzcbl;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
