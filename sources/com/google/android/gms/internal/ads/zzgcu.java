package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgcu extends zzghu {
    final /* synthetic */ zzgcv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgcu(zzgcv zzgcv, Class cls) {
        super(cls);
        this.zza = zzgcv;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgmz zzgmz = (zzgmz) zzgvj;
        new zzgdj();
        zzgnc zzf = zzgdi.zzf(zzgmz.zze());
        zzgvj zza2 = new zzgkx().zza().zza(zzgmz.zzf());
        zzgmv zzc = zzgmw.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgoo) zza2);
        zzc.zzc(0);
        return (zzgmw) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgmz.zzd(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzggh.zze);
        zzgcx zzgcx = new zzgcx((zzgcw) null);
        zzgcx.zza(16);
        zzgcx.zzc(32);
        zzgcx.zze(16);
        zzgcx.zzd(16);
        zzgcy zzgcy = zzgcy.zzc;
        zzgcx.zzb(zzgcy);
        zzgcz zzgcz = zzgcz.zzc;
        zzgcx.zzf(zzgcz);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgcx.zzg());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzggh.zzf);
        zzgcx zzgcx2 = new zzgcx((zzgcw) null);
        zzgcx2.zza(32);
        zzgcx2.zzc(32);
        zzgcx2.zze(32);
        zzgcx2.zzd(16);
        zzgcx2.zzb(zzgcy);
        zzgcx2.zzf(zzgcz);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgcx2.zzg());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgmz zzgmz = (zzgmz) zzgvj;
        ((zzgdi) new zzgdj().zza()).zzd(zzgmz.zze());
        new zzgkx().zza().zzd(zzgmz.zzf());
        zzgrv.zza(zzgmz.zze().zza());
    }
}
