package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezy implements zzfai {
    private final zzfai zza;
    private zzcws zzb;

    public zzezy(zzfai zzfai) {
        this.zza = zzfai;
    }

    /* renamed from: zza */
    public final synchronized zzcws zzd() {
        return this.zzb;
    }

    public final synchronized e zzb(zzfaj zzfaj, zzfah zzfah, zzcws zzcws) {
        this.zzb = zzcws;
        if (zzfaj.zza != null) {
            zzcue zzb2 = zzcws.zzb();
            return zzb2.zzi(zzb2.zzk(zzfzt.zzh(zzfaj.zza)));
        }
        return ((zzezx) this.zza).zzb(zzfaj, zzfah, zzcws);
    }

    public final /* bridge */ /* synthetic */ e zzc(zzfaj zzfaj, zzfah zzfah, Object obj) {
        return zzb(zzfaj, zzfah, (zzcws) null);
    }
}
