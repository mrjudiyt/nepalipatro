package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzemo implements zza, zzdfd {
    private zzbe zza;

    public final synchronized void onAdClicked() {
        zzbe zzbe = this.zza;
        if (zzbe != null) {
            try {
                zzbe.zzb();
            } catch (RemoteException e10) {
                zzcat.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(zzbe zzbe) {
        this.zza = zzbe;
    }

    public final synchronized void zzbK() {
        zzbe zzbe = this.zza;
        if (zzbe != null) {
            try {
                zzbe.zzb();
            } catch (RemoteException e10) {
                zzcat.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    public final synchronized void zzs() {
    }
}
