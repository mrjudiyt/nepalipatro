package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdga {
    private final zzdhf zza;
    private final zzcgb zzb;

    public zzdga(zzdhf zzdhf, zzcgb zzcgb) {
        this.zza = zzdhf;
        this.zzb = zzcgb;
    }

    public static final zzdev zzh(zzfiq zzfiq) {
        return new zzdev(zzfiq, zzcbg.zzf);
    }

    public static final zzdev zzi(zzdhk zzdhk) {
        return new zzdev(zzdhk, zzcbg.zzf);
    }

    public final View zza() {
        zzcgb zzcgb = this.zzb;
        if (zzcgb == null) {
            return null;
        }
        return zzcgb.zzG();
    }

    public final View zzb() {
        zzcgb zzcgb = this.zzb;
        if (zzcgb != null) {
            return zzcgb.zzG();
        }
        return null;
    }

    public final zzcgb zzc() {
        return this.zzb;
    }

    public final zzdev zzd(Executor executor) {
        return new zzdev(new zzdfz(this.zzb), executor);
    }

    public final zzdhf zze() {
        return this.zza;
    }

    public Set zzf(zzcwi zzcwi) {
        return Collections.singleton(new zzdev(zzcwi, zzcbg.zzf));
    }

    public Set zzg(zzcwi zzcwi) {
        return Collections.singleton(new zzdev(zzcwi, zzcbg.zzf));
    }
}
