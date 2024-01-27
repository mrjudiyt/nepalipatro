package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdwq {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzdxx zzc;
    private final zzhaw zzd;

    public zzdwq(zzgad zzgad, zzgad zzgad2, zzdxx zzdxx, zzhaw zzhaw) {
        this.zza = zzgad;
        this.zzb = zzgad2;
        this.zzc = zzdxx;
        this.zzd = zzhaw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzbvg zzbvg, int i10, zzdyo zzdyo) {
        return ((zzeav) this.zzd.zzb()).zzc(zzbvg, i10);
    }

    public final e zzb(zzbvg zzbvg) {
        e eVar;
        String str = zzbvg.zzd;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            eVar = zzfzt.zzg(new zzdyo(1));
        } else {
            eVar = zzfzt.zzf(this.zza.zzb(new zzdwn(this, zzbvg)), ExecutionException.class, zzdwo.zza, this.zzb);
        }
        return zzfzt.zzf(eVar, zzdyo.class, new zzdwp(this, zzbvg, Binder.getCallingUid()), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbvg zzbvg) {
        zzcbl zzcbl;
        zzdxx zzdxx = this.zzc;
        synchronized (zzdxx.zzb) {
            if (zzdxx.zzc) {
                zzcbl = zzdxx.zza;
            } else {
                zzdxx.zzc = true;
                zzdxx.zze = zzbvg;
                zzdxx.zzf.checkAvailabilityAndConnect();
                zzdxx.zza.addListener(new zzdxw(zzdxx), zzcbg.zzf);
                zzcbl = zzdxx.zza;
            }
        }
        return (InputStream) zzcbl.get((long) ((Integer) zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
    }
}
