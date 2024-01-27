package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgex extends zzghu {
    final /* synthetic */ zzgey zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgex(zzgey zzgey, Class cls) {
        super(cls);
        this.zza = zzgey;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgnz zzc = zzgoa.zzc();
        byte[] zzb = zzgjf.zzb(((zzgod) zzgvj).zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgoa) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgod.zze(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        zzgfa zzgfa = new zzgfa((zzgez) null);
        zzgfa.zza(16);
        zzgfb zzgfb = zzgfb.zza;
        zzgfa.zzb(zzgfb);
        hashMap.put("AES128_GCM_SIV", zzgfa.zzc());
        zzgfa zzgfa2 = new zzgfa((zzgez) null);
        zzgfa2.zza(16);
        zzgfb zzgfb2 = zzgfb.zzc;
        zzgfa2.zzb(zzgfb2);
        hashMap.put("AES128_GCM_SIV_RAW", zzgfa2.zzc());
        zzgfa zzgfa3 = new zzgfa((zzgez) null);
        zzgfa3.zza(32);
        zzgfa3.zzb(zzgfb);
        hashMap.put("AES256_GCM_SIV", zzgfa3.zzc());
        zzgfa zzgfa4 = new zzgfa((zzgez) null);
        zzgfa4.zza(32);
        zzgfa4.zzb(zzgfb2);
        hashMap.put("AES256_GCM_SIV_RAW", zzgfa4.zzc());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgrv.zza(((zzgod) zzgvj).zza());
    }
}
