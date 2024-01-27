package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnu implements zzbjj {
    private final zzbgs zza;
    private final zzdoi zzb;
    private final zzhaw zzc;

    public zzdnu(zzdju zzdju, zzdjj zzdjj, zzdoi zzdoi, zzhaw zzhaw) {
        this.zza = zzdju.zzc(zzdjj.zzA());
        this.zzb = zzdoi;
        this.zzc = zzhaw;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgi) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            zzcat.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzi("/nativeAdCustomClick", this);
        }
    }
}
