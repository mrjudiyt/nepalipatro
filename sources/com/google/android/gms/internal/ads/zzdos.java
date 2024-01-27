package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdos extends VideoController.VideoLifecycleCallbacks {
    private final zzdjj zza;

    public zzdos(zzdjj zzdjj) {
        this.zza = zzdjj;
    }

    private static zzdt zza(zzdjj zzdjj) {
        zzdq zzj = zzdjj.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zze();
            } catch (RemoteException e10) {
                zzcat.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void onVideoPause() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzg();
            } catch (RemoteException e10) {
                zzcat.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void onVideoStart() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzi();
            } catch (RemoteException e10) {
                zzcat.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }
}
