package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezj implements zzfai {
    private zzcws zza;
    private final Executor zzb = zzgaj.zzb();

    public final zzcws zza() {
        return this.zza;
    }

    public final e zzb(zzfaj zzfaj, zzfah zzfah, zzcws zzcws) {
        zzcwr zza2 = zzfah.zza(zzfaj.zzb);
        zza2.zzb(new zzfam(true));
        zzcws zzcws2 = (zzcws) zza2.zzh();
        this.zza = zzcws2;
        zzcue zzb2 = zzcws2.zzb();
        zzffj zzffj = new zzffj();
        return zzfzt.zzm(zzfzt.zzn(zzfzk.zzu(zzb2.zzj()), new zzezh(this, zzffj, zzb2), this.zzb), new zzezi(zzffj), this.zzb);
    }

    public final /* bridge */ /* synthetic */ e zzc(zzfaj zzfaj, zzfah zzfah, Object obj) {
        return zzb(zzfaj, zzfah, (zzcws) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
