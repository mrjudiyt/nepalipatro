package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdzk {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzeac zzc;

    zzdzk(zzgad zzgad, zzgad zzgad2, zzeac zzeac) {
        this.zza = zzgad;
        this.zzb = zzgad2;
        this.zzc = zzeac;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzbuk zzbuk) {
        return this.zzc.zza(zzbuk, ((Long) zzba.zzc().zzb(zzbci.zzkA)).longValue());
    }

    public final e zzb(zzbuk zzbuk) {
        e eVar;
        String str = zzbuk.zzb;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            eVar = zzfzt.zzg(new zzdyo(1, "Ads signal service force local"));
        } else {
            eVar = zzfzt.zzf(zzfzt.zzk(new zzdzg(this, zzbuk), this.zza), ExecutionException.class, zzdzh.zza, this.zzb);
        }
        return zzfzt.zzn(zzfzt.zzf(zzfzk.zzu(eVar), zzdyo.class, zzdzi.zza, this.zzb), zzdzj.zza, this.zzb);
    }
}
