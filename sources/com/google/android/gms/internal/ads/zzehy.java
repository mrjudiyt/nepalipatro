package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehy {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcta zzc;
    private final zzeio zzd;
    private final zzfjt zze;
    private final zzgal zzf = zzgal.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    /* access modifiers changed from: private */
    public zzehz zzh;
    private zzfde zzi;

    zzehy(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcta zzcta, zzeio zzeio, zzfjt zzfjt) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcta;
        this.zzd = zzeio;
        this.zze = zzfjt;
    }

    private final synchronized e zzd(zzfcr zzfcr) {
        for (String zza2 : zzfcr.zza) {
            zzeeu zza3 = this.zzc.zza(zzfcr.zzb, zza2);
            if (zza3 != null && zza3.zzb(this.zzi, zzfcr)) {
                e zza4 = zza3.zza(this.zzi, zzfcr);
                int i10 = zzfcr.zzT;
                return zzfzt.zzo(zza4, (long) i10, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzfzt.zzg(new zzdwm(3));
    }

    /* access modifiers changed from: private */
    public final void zze(zzfcr zzfcr) {
        if (zzfcr != null) {
            e zzd2 = zzd(zzfcr);
            this.zzd.zzf(this.zzi, zzfcr, zzd2, this.zze);
            zzfzt.zzr(zzd2, new zzehx(this, zzfcr), this.zza);
        }
    }

    public final synchronized e zzb(zzfde zzfde) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfde.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzeir(3, zzeiu.zzc(zzfde)));
            } else {
                this.zzi = zzfde;
                this.zzh = new zzehz(zzfde, this.zzd, this.zzf);
                this.zzd.zzk(zzfde.zzb.zza);
                while (this.zzh.zze()) {
                    zze(this.zzh.zza());
                }
            }
        }
        return this.zzf;
    }
}
