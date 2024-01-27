package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbld implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcbl zza;
    final /* synthetic */ zzblf zzb;

    zzbld(zzblf zzblf, zzcbl zzcbl) {
        this.zzb = zzblf;
        this.zza = zzcbl;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zzd(e10);
        }
    }

    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
