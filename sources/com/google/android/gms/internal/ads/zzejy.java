package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzejy implements zzeew {
    private final zzelc zza;
    private final zzdqj zzb;

    zzejy(zzelc zzelc, zzdqj zzdqj) {
        this.zza = zzelc;
        this.zzb = zzdqj;
    }

    public final zzeex zza(String str, JSONObject jSONObject) {
        zzbqv zzbqv;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbC)).booleanValue()) {
            try {
                zzbqv = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                zzcat.zzh("Coundn't create RTB adapter: ", e10);
                zzbqv = null;
            }
        } else {
            zzbqv = this.zza.zza(str);
        }
        if (zzbqv == null) {
            return null;
        }
        return new zzeex(zzbqv, new zzegq(), str);
    }
}
