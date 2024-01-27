package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzecx implements zzfhs {
    private final zzecl zza;
    private final zzecp zzb;

    zzecx(zzecl zzecl, zzecp zzecp) {
        this.zza = zzecl;
        this.zzb = zzecp;
    }

    public final void zzbG(zzfhl zzfhl, String str) {
    }

    public final void zzbH(zzfhl zzfhl, String str, Throwable th) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue() && zzfhl.RENDERER == zzfhl && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzbI(zzfhl zzfhl, String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
            if (zzfhl.RENDERER == zzfhl) {
                this.zza.zzg(zzt.zzB().elapsedRealtime());
            } else if (zzfhl.PRELOADED_LOADER == zzfhl || zzfhl.SERVER_TRANSACTION == zzfhl) {
                this.zza.zzh(zzt.zzB().elapsedRealtime());
                zzecp zzecp = this.zzb;
                zzecp.zza.zza(new zzeco(zzecp, this.zza.zzd()));
            }
        }
    }

    public final void zzd(zzfhl zzfhl, String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue() && zzfhl.RENDERER == zzfhl && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
