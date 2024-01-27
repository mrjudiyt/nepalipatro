package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgjz extends zzghu {
    zzgjz(zzgka zzgka, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgmq zzgmq = (zzgmq) zzgvj;
        zzgmm zzc = zzgmn.zzc();
        zzc.zzc(0);
        byte[] zzb = zzgjf.zzb(zzgmq.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgmq.zzf());
        return (zzgmn) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgmq.zze(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        zzgkf zzgkf = zzglq.zze;
        hashMap.put("AES_CMAC", zzgkf);
        hashMap.put("AES256_CMAC", zzgkf);
        zzgkc zzgkc = new zzgkc((zzgkb) null);
        zzgkc.zza(32);
        zzgkc.zzb(16);
        zzgkc.zzc(zzgkd.zzd);
        hashMap.put("AES256_CMAC_RAW", zzgkc.zzd());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgmq zzgmq = (zzgmq) zzgvj;
        zzgka.zzn(zzgmq.zzf());
        zzgka.zzo(zzgmq.zza());
    }
}
