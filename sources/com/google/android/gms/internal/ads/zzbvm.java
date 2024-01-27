package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbvm implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvo zzb;

    zzbvm(zzbvo zzbvo, Context context) {
        this.zzb = zzbvo;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        zzbvl zzbvl;
        zzbvn zzbvn = (zzbvn) this.zzb.zza.get(this.zza);
        if (zzbvn != null) {
            if (zzbvn.zza + ((Long) zzbdr.zza.zze()).longValue() >= zzt.zzB().currentTimeMillis()) {
                zzbvl = new zzbvk(this.zza, zzbvn.zzb).zza();
                zzbvo zzbvo = this.zzb;
                zzbvo.zza.put(this.zza, new zzbvn(zzbvo, zzbvl));
                return zzbvl;
            }
        }
        zzbvl = new zzbvk(this.zza).zza();
        zzbvo zzbvo2 = this.zzb;
        zzbvo2.zza.put(this.zza, new zzbvn(zzbvo2, zzbvl));
        return zzbvl;
    }
}
