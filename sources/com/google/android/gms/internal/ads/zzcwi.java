package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcwi implements zzcxl, zzdem, zzdcd, zzcyb, zzauw {
    /* access modifiers changed from: private */
    public final zzcyd zza;
    private final zzfcr zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzgal zze = zzgal.zze();
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg = new AtomicBoolean();
    private final String zzh;

    zzcwi(zzcyd zzcyd, zzfcr zzfcr, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcyd;
        this.zzb = zzfcr;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzbt(zzauv zzauv) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzku)).booleanValue() && zzm() && zzauv.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
    }

    public final void zzc() {
        zzfcr zzfcr = this.zzb;
        if (zzfcr.zzf != 3) {
            int i10 = zzfcr.zzaa;
            if (i10 == 0 || i10 == 1) {
                if (!((Boolean) zzba.zzc().zzb(zzbci.zzku)).booleanValue() || !zzm()) {
                    this.zza.zza();
                }
            }
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzc(Boolean.TRUE);
            }
        }
    }

    public final void zzi() {
    }

    public final synchronized void zzj() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    public final void zzk() {
        if (this.zzb.zzf != 3) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzbu)).booleanValue()) {
                zzfcr zzfcr = this.zzb;
                if (zzfcr.zzaa != 2) {
                    return;
                }
                if (zzfcr.zzs == 0) {
                    this.zza.zza();
                    return;
                }
                zzfzt.zzr(this.zze, new zzcwh(this), this.zzd);
                this.zzf = this.zzc.schedule(new zzcwg(this), (long) this.zzb.zzs, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void zzl() {
    }

    public final synchronized void zzp(com.google.android.gms.ads.internal.client.zze zze2) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(new Exception());
        }
    }
}
