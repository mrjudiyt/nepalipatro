package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzego implements zzeeu {
    /* access modifiers changed from: private */
    public final zzcrs zza;
    private final zzefv zzb;
    private final zzgad zzc;
    /* access modifiers changed from: private */
    public final zzcxn zzd;
    private final ScheduledExecutorService zze;

    public zzego(zzcrs zzcrs, zzefv zzefv, zzcxn zzcxn, ScheduledExecutorService scheduledExecutorService, zzgad zzgad) {
        this.zza = zzcrs;
        this.zzb = zzefv;
        this.zzd = zzcxn;
        this.zze = scheduledExecutorService;
        this.zzc = zzgad;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        return this.zzc.zzb(new zzegm(this, zzfde, zzfcr));
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        return zzfde.zza.zza.zza() != null && this.zzb.zzb(zzfde, zzfcr);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcqv zzc(zzfde zzfde, zzfcr zzfcr) {
        return this.zza.zzb(new zzctm(zzfde, zzfcr, (String) null), new zzcsf(zzfde.zza.zza.zza(), new zzegl(this, zzfde, zzfcr))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfde zzfde, zzfcr zzfcr) {
        zzfzt.zzr(zzfzt.zzo(this.zzb.zza(zzfde, zzfcr), (long) zzfcr.zzT, TimeUnit.SECONDS, this.zze), new zzegn(this), this.zzc);
    }
}
