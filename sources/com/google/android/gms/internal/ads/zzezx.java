package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezx implements zzfai {
    private zzcws zza;

    /* renamed from: zza */
    public final synchronized zzcws zzd() {
        return this.zza;
    }

    public final synchronized e zzb(zzfaj zzfaj, zzfah zzfah, zzcws zzcws) {
        zzcue zzb;
        if (zzcws != null) {
            this.zza = zzcws;
        } else {
            this.zza = (zzcws) zzfah.zza(zzfaj.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    public final /* bridge */ /* synthetic */ e zzc(zzfaj zzfaj, zzfah zzfah, Object obj) {
        return zzb(zzfaj, zzfah, (zzcws) null);
    }
}
