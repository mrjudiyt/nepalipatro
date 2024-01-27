package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzevy implements zzetw {
    private final Context zza;
    private final zzcac zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbzt zzf;

    public zzevy(zzbzt zzbzt, int i10, Context context, zzcac zzcac, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzbzt;
        this.zza = context;
        this.zzb = zzcac;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    public final int zza() {
        return 44;
    }

    public final e zzb() {
        return zzfzt.zze((zzfzk) zzfzt.zzo(zzfzt.zzm(zzfzk.zzu(zzfzt.zzk(new zzevv(this), this.zzd)), zzevw.zza, this.zzd), ((Long) zzba.zzc().zzb(zzbci.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzevx(this), zzgaj.zzb());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevz zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
