package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgkw extends zzghu {
    final /* synthetic */ zzgkx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgkw(zzgkx zzgkx, Class cls) {
        super(cls);
        this.zza = zzgkx;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgor zzgor = (zzgor) zzgvj;
        zzgon zzc = zzgoo.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgor.zzg());
        byte[] zzb = zzgjf.zzb(zzgor.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgoo) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgor.zzf(zzgsr, zzgtl.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzglq.zza);
        zzgkz zzgkz = new zzgkz((zzgky) null);
        zzgkz.zzb(32);
        zzgkz.zzc(16);
        zzglb zzglb = zzglb.zzd;
        zzgkz.zzd(zzglb);
        zzgla zzgla = zzgla.zzc;
        zzgkz.zza(zzgla);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgkz.zze());
        zzgkz zzgkz2 = new zzgkz((zzgky) null);
        zzgkz2.zzb(32);
        zzgkz2.zzc(32);
        zzglb zzglb2 = zzglb.zza;
        zzgkz2.zzd(zzglb2);
        zzgkz2.zza(zzgla);
        hashMap.put("HMAC_SHA256_256BITTAG", zzgkz2.zze());
        zzgkz zzgkz3 = new zzgkz((zzgky) null);
        zzgkz3.zzb(32);
        zzgkz3.zzc(32);
        zzgkz3.zzd(zzglb);
        zzgkz3.zza(zzgla);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgkz3.zze());
        zzgkz zzgkz4 = new zzgkz((zzgky) null);
        zzgkz4.zzb(64);
        zzgkz4.zzc(16);
        zzgkz4.zzd(zzglb2);
        zzgla zzgla2 = zzgla.zze;
        zzgkz4.zza(zzgla2);
        hashMap.put("HMAC_SHA512_128BITTAG", zzgkz4.zze());
        zzgkz zzgkz5 = new zzgkz((zzgky) null);
        zzgkz5.zzb(64);
        zzgkz5.zzc(16);
        zzgkz5.zzd(zzglb);
        zzgkz5.zza(zzgla2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgkz5.zze());
        zzgkz zzgkz6 = new zzgkz((zzgky) null);
        zzgkz6.zzb(64);
        zzgkz6.zzc(32);
        zzgkz6.zzd(zzglb2);
        zzgkz6.zza(zzgla2);
        hashMap.put("HMAC_SHA512_256BITTAG", zzgkz6.zze());
        zzgkz zzgkz7 = new zzgkz((zzgky) null);
        zzgkz7.zzb(64);
        zzgkz7.zzc(32);
        zzgkz7.zzd(zzglb);
        zzgkz7.zza(zzgla2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgkz7.zze());
        hashMap.put("HMAC_SHA512_512BITTAG", zzglq.zzd);
        zzgkz zzgkz8 = new zzgkz((zzgky) null);
        zzgkz8.zzb(64);
        zzgkz8.zzc(64);
        zzgkz8.zzd(zzglb);
        zzgkz8.zza(zzgla2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgkz8.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgor zzgor = (zzgor) zzgvj;
        if (zzgor.zza() >= 16) {
            zzgkx.zzn(zzgor.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
