package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgfl extends zzghu {
    final /* synthetic */ zzgfm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgfl(zzgfm zzgfm, Class cls) {
        super(cls);
        this.zza = zzgfm;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgoj zzgoj = (zzgoj) zzgvj;
        zzgof zzc = zzgog.zzc();
        zzc.zzb(0);
        byte[] zzb = zzgjf.zzb(32);
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgog) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgoj.zzd(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgfo.zzb(zzgfn.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgfo.zzb(zzgfn.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgoj zzgoj = (zzgoj) zzgvj;
    }
}
