package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgdp extends zzghu {
    final /* synthetic */ zzgdq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgdp(zzgdq zzgdq, Class cls) {
        super(cls);
        this.zza = zzgdq;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgno zzgno = (zzgno) zzgvj;
        zzgnk zzc = zzgnl.zzc();
        byte[] zzb = zzgjf.zzb(zzgno.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgno.zzf());
        zzc.zzc(0);
        return (zzgnl) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgno.zze(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzggh.zzc);
        zzgds zzgds = new zzgds((zzgdr) null);
        zzgds.zza(16);
        zzgds.zzb(16);
        zzgds.zzc(16);
        zzgdt zzgdt = zzgdt.zzc;
        zzgds.zzd(zzgdt);
        hashMap.put("AES128_EAX_RAW", zzgds.zze());
        hashMap.put("AES256_EAX", zzggh.zzd);
        zzgds zzgds2 = new zzgds((zzgdr) null);
        zzgds2.zza(16);
        zzgds2.zzb(32);
        zzgds2.zzc(16);
        zzgds2.zzd(zzgdt);
        hashMap.put("AES256_EAX_RAW", zzgds2.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgno zzgno = (zzgno) zzgvj;
        zzgrv.zza(zzgno.zza());
        if (zzgno.zzf().zza() != 12 && zzgno.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
