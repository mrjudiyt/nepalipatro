package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzggk extends zzghu {
    final /* synthetic */ zzggl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzggk(zzggl zzggl, Class cls) {
        super(cls);
        this.zza = zzggl;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgqo zzgqo = (zzgqo) zzgvj;
        zzgqk zzc = zzgql.zzc();
        zzc.zzb(0);
        byte[] zzb = zzgjf.zzb(32);
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgql) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgqo.zzd(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzggn.zzb(zzggm.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzggn.zzb(zzggm.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgqo zzgqo = (zzgqo) zzgvj;
    }
}
