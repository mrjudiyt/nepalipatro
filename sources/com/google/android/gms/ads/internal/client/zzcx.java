package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcx implements MuteThisAdReason {
    private final String zza;
    private final zzcw zzb;

    public zzcx(zzcw zzcw) {
        String str;
        this.zzb = zzcw;
        try {
            str = zzcw.zze();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            str = null;
        }
        this.zza = str;
    }

    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzcw zza() {
        return this.zzb;
    }
}
