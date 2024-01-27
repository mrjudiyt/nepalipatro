package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwz implements RewardItem {
    private final zzbwm zza;

    public zzbwz(zzbwm zzbwm) {
        this.zza = zzbwm;
    }

    public final int getAmount() {
        zzbwm zzbwm = this.zza;
        if (zzbwm != null) {
            try {
                return zzbwm.zze();
            } catch (RemoteException e10) {
                zzcat.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    public final String getType() {
        zzbwm zzbwm = this.zza;
        if (zzbwm != null) {
            try {
                return zzbwm.zzf();
            } catch (RemoteException e10) {
                zzcat.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
