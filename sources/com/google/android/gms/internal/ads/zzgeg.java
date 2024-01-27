package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgeg extends zzghu {
    final /* synthetic */ zzgeh zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgeg(zzgeh zzgeh, Class cls) {
        super(cls);
        this.zza = zzgeh;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgnt zzc = zzgnu.zzc();
        byte[] zzb = zzgjf.zzb(((zzgnx) zzgvj).zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgnu) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgnx.zze(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzggh.zza);
        zzgej zzgej = new zzgej((zzgei) null);
        zzgej.zza(12);
        zzgej.zzb(16);
        zzgej.zzc(16);
        zzgek zzgek = zzgek.zzc;
        zzgej.zzd(zzgek);
        hashMap.put("AES128_GCM_RAW", zzgej.zze());
        hashMap.put("AES256_GCM", zzggh.zzb);
        zzgej zzgej2 = new zzgej((zzgei) null);
        zzgej2.zza(12);
        zzgej2.zzb(32);
        zzgej2.zzc(16);
        zzgej2.zzd(zzgek);
        hashMap.put("AES256_GCM_RAW", zzgej2.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgrv.zza(((zzgnx) zzgvj).zza());
    }
}
