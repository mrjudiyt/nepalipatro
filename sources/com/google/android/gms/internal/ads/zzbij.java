package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbij implements zzfza {
    public final /* synthetic */ zzcou zza;

    public /* synthetic */ zzbij(zzcou zzcou) {
        this.zza = zzcou;
    }

    public final e zza(Object obj) {
        zzcou zzcou;
        String str = (String) obj;
        zzbjj zzbjj = zzbji.zza;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzju)).booleanValue() || (zzcou = this.zza) == null) {
            return zzfzt.zzh(str);
        }
        return zzcou.zzc(str, zzay.zze());
    }
}
