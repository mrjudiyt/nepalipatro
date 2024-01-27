package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdze {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzdzz zzc;
    private final zzhaw zzd;

    zzdze(zzgad zzgad, zzgad zzgad2, zzdzz zzdzz, zzhaw zzhaw) {
        this.zza = zzgad;
        this.zzb = zzgad2;
        this.zzc = zzdzz;
        this.zzd = zzhaw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzbuo zzbuo) {
        return this.zzc.zza(zzbuo, ((Long) zzba.zzc().zzb(zzbci.zzkB)).longValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzb(zzbuo zzbuo, int i10, zzdyo zzdyo) {
        return ((zzebf) this.zzd.zzb()).zzb(zzbuo, i10);
    }

    public final e zzc(zzbuo zzbuo) {
        e eVar;
        String str = zzbuo.zzf;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            eVar = zzfzt.zzg(new zzdyo(1, "Ads service proxy force local"));
        } else {
            eVar = zzfzt.zzf(zzfzt.zzk(new zzdzb(this, zzbuo), this.zza), ExecutionException.class, zzdzc.zza, this.zzb);
        }
        return zzfzt.zzf(eVar, zzdyo.class, new zzdzd(this, zzbuo, Binder.getCallingUid()), this.zzb);
    }
}
