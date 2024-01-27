package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbrf implements SignalCallbacks {
    final /* synthetic */ zzbqy zza;

    zzbrf(zzbrh zzbrh, zzbqy zzbqy) {
        this.zza = zzbqy;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }
}
