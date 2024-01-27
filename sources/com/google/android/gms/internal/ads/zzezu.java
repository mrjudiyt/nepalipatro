package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezu implements zzfai {
    private final zzffa zza;
    private final Executor zzb;
    private final zzfzp zzc = new zzezs(this);

    public zzezu(zzffa zzffa, Executor executor) {
        this.zza = zzffa;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzcws zzcws, zzfad zzfad) {
        zzffa zzffa = this.zza;
        zzffk zzffk = zzfad.zzb;
        zzbvg zzbvg = zzfad.zza;
        zzffj zzb2 = zzffa.zzb(zzffk);
        if (!(zzb2 == null || zzbvg == null)) {
            zzfzt.zzr(zzcws.zzb().zzh(zzbvg), this.zzc, this.zzb);
        }
        return zzfzt.zzh(new zzezt(zzffk, zzbvg, zzb2));
    }

    public final e zzb(zzfaj zzfaj, zzfah zzfah, zzcws zzcws) {
        return zzfzt.zze(zzfzt.zzn(zzfzk.zzu(new zzfae(this.zza, zzcws, this.zzb).zzc()), new zzezq(this, zzcws), this.zzb), Exception.class, new zzezr(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ e zzc(zzfaj zzfaj, zzfah zzfah, Object obj) {
        return zzb(zzfaj, zzfah, (zzcws) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
