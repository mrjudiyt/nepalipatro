package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxp implements zzdyn {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwq zzb;
    private final zzgad zzc;
    private final zzfdn zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzecl zzf;
    private final zzfje zzg;
    private final Context zzh;

    zzdxp(Context context, zzfdn zzfdn, zzdwq zzdwq, zzgad zzgad, ScheduledExecutorService scheduledExecutorService, zzecl zzecl, zzfje zzfje) {
        this.zzh = context;
        this.zzd = zzfdn;
        this.zzb = zzdwq;
        this.zzc = zzgad;
        this.zze = scheduledExecutorService;
        this.zzf = zzecl;
        this.zzg = zzfje;
    }

    public final e zzb(zzbvg zzbvg) {
        Context context = this.zzh;
        e zzb2 = this.zzb.zzb(zzbvg);
        zzfit zza2 = zzfis.zza(context, 11);
        zzfjd.zzd(zzb2, zza2);
        e zzn = zzfzt.zzn(zzb2, new zzdxm(this), this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfs)).booleanValue()) {
            zzbca zzbca = zzbci.zzfu;
            zzn = zzfzt.zzf(zzfzt.zzo(zzn, (long) ((Integer) zzba.zzc().zzb(zzbca)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzdxn.zza, zzcbg.zzf);
        }
        zzfjd.zza(zzn, this.zzg, zza2);
        zzfzt.zzr(zzn, new zzdxo(this), zzcbg.zzf);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(InputStream inputStream) {
        return zzfzt.zzh(new zzfde(new zzfdb(this.zzd), zzfdd.zza(new InputStreamReader(inputStream))));
    }
}
