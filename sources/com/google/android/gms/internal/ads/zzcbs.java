package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzcbs {
    private final zzcbl zza;
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzcbs() {
        zzcbl zzcbl = new zzcbl();
        this.zza = zzcbl;
        zzfzt.zzr(zzcbl, new zzcbq(this), zzcbg.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzi(zzcbp zzcbp, zzcbn zzcbn) {
        zzfzt.zzr(this.zza, new zzcbr(this, zzcbp, zzcbn), zzcbg.zzf);
    }
}
