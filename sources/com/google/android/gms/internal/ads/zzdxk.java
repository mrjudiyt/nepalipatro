package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxk {
    private final ScheduledExecutorService zza;
    private final zzgad zzb;
    private final zzgad zzc;
    private final zzdyb zzd;
    private final zzhaw zze;

    public zzdxk(ScheduledExecutorService scheduledExecutorService, zzgad zzgad, zzgad zzgad2, zzdyb zzdyb, zzhaw zzhaw) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgad;
        this.zzc = zzgad2;
        this.zzd = zzdyb;
        this.zze = zzhaw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzbvg zzbvg, int i10, Throwable th) {
        return ((zzeav) this.zze.zzb()).zzd(zzbvg, i10);
    }

    public final e zzb(zzbvg zzbvg) {
        e eVar;
        String str = zzbvg.zzd;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            eVar = zzfzt.zzg(new zzdyo(1));
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhx)).booleanValue()) {
                eVar = this.zzc.zzb(new zzdxi(this, zzbvg));
            } else {
                eVar = this.zzd.zzb(zzbvg);
            }
        }
        int callingUid = Binder.getCallingUid();
        zzfzk zzu = zzfzk.zzu(eVar);
        zzbca zzbca = zzbci.zzfu;
        return zzfzt.zzf((zzfzk) zzfzt.zzo(zzu, (long) ((Integer) zzba.zzc().zzb(zzbca)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzdxj(this, zzbvg, callingUid), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbvg zzbvg) {
        return (InputStream) this.zzd.zzb(zzbvg).get((long) ((Integer) zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
    }
}
