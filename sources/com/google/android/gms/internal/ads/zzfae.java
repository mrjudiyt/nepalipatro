package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfae {
    private final zzffa zza;
    private final zzcws zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzfad zzd;

    public zzfae(zzffa zzffa, zzcws zzcws, Executor executor) {
        this.zza = zzffa;
        this.zzb = zzcws;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzffk zze() {
        zzfdn zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final e zzc() {
        e eVar;
        zzfad zzfad = this.zzd;
        if (zzfad != null) {
            return zzfzt.zzh(zzfad);
        }
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            zzfad zzfad2 = new zzfad((zzbvg) null, zze(), (zzfac) null);
            this.zzd = zzfad2;
            eVar = zzfzt.zzh(zzfad2);
        } else {
            Class<zzdyo> cls = zzdyo.class;
            eVar = zzfzt.zze(zzfzt.zzm(zzfzk.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfab(this), this.zzc), cls, new zzfaa(this), this.zzc);
        }
        return zzfzt.zzm(eVar, zzezz.zza, this.zzc);
    }
}
