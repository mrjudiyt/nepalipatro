package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexk implements zzetw {
    private final zzcac zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgad zze;
    private final String zzf;
    private final zzbzr zzg;

    zzexk(zzcac zzcac, boolean z10, boolean z11, zzbzr zzbzr, zzgad zzgad, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcac;
        this.zzb = z10;
        this.zzc = z11;
        this.zzg = zzbzr;
        this.zze = zzgad;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    public final e zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhe)).booleanValue() && this.zzc) {
            return zzfzt.zzh((Object) null);
        }
        if (!this.zzb) {
            return zzfzt.zzh((Object) null);
        }
        return zzfzt.zze(zzfzt.zzo(zzfzt.zzm(zzfzt.zzh((Object) null), zzexi.zza, this.zze), ((Long) zzbep.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzexj(this), this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzexl zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
