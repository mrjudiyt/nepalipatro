package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzetd implements zzetw {
    private final String zza;
    private final zzgad zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfdn zze;
    private final zzchw zzf;

    zzetd(zzgad zzgad, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfdn zzfdn, zzchw zzchw) {
        this.zzb = zzgad;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfdn;
        this.zzf = zzchw;
    }

    public static /* synthetic */ e zzc(zzetd zzetd) {
        String str;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhc)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        } else {
            str = zzetd.zza;
        }
        zzg zzo = zzetd.zzf.zzo();
        zzcwt zzcwt = new zzcwt();
        zzcwt.zze(zzetd.zzd);
        zzfdl zzfdl = new zzfdl();
        zzfdl.zzs("adUnitId");
        zzfdl.zzE(zzetd.zze.zzd);
        zzfdl.zzr(new zzq());
        zzfdl.zzx(true);
        zzcwt.zzi(zzfdl.zzG());
        zzo.zza(zzcwt.zzj());
        zzac zzac = new zzac();
        zzac.zza(str);
        zzo.zzb(zzac.zzb());
        new zzdda();
        zzfzk zzu = zzfzk.zzu(zzo.zzc().zzc());
        long longValue = ((Long) zzba.zzc().zzb(zzbci.zzhd)).longValue();
        ScheduledExecutorService scheduledExecutorService = zzetd.zzc;
        return zzfzt.zze(zzfzt.zzm((zzfzk) zzfzt.zzo(zzu, longValue, TimeUnit.MILLISECONDS, scheduledExecutorService), zzeta.zza, zzetd.zzb), Exception.class, zzetb.zza, zzetd.zzb);
    }

    public final int zza() {
        return 33;
    }

    public final e zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhb)).booleanValue() || this.zze.zzq) {
            return zzfzt.zzh(new zzete((String) null));
        }
        return zzfzt.zzk(new zzetc(this), this.zzb);
    }
}
