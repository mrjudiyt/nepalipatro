package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzble implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcbl zza;

    zzble(zzblf zzblf, zzcbl zzcbl) {
        this.zza = zzcbl;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
