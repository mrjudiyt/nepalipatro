package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegb implements zzcsv {
    public final /* synthetic */ zzeex zza;

    public /* synthetic */ zzegb(zzeex zzeex) {
        this.zza = zzeex;
    }

    public final zzdq zza() {
        try {
            return ((zzbqv) this.zza.zzb).zze();
        } catch (RemoteException e10) {
            throw new zzfds(e10);
        }
    }
}
