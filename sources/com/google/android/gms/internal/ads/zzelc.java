package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzelc {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqj zzb;

    public zzelc(zzdqj zzdqj) {
        this.zzb = zzdqj;
    }

    public final zzbqv zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqv) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            zzcat.zzh("Couldn't create RTB adapter : ", e10);
        }
    }
}
