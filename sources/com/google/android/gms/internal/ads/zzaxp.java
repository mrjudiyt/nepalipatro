package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaxp implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzaxh zza;
    final /* synthetic */ zzcbl zzb;
    final /* synthetic */ zzaxr zzc;

    zzaxp(zzaxr zzaxr, zzaxh zzaxh, zzcbl zzcbl) {
        this.zzc = zzaxr;
        this.zza = zzaxh;
        this.zzb = zzcbl;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzaxr zzaxr = this.zzc;
            if (!zzaxr.zzb) {
                zzaxr.zzb = true;
                zzaxg zza2 = this.zzc.zza;
                if (zza2 != null) {
                    e zza3 = zzcbg.zza.zza(new zzaxm(this, zza2, this.zza, this.zzb));
                    zzcbl zzcbl = this.zzb;
                    zzcbl.addListener(new zzaxn(zzcbl, zza3), zzcbg.zzf);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i10) {
    }
}
