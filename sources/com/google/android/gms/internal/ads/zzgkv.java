package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgkv extends zzgiv {
    zzgkv(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgvj zzgvj) {
        zzgoo zzgoo = (zzgoo) zzgvj;
        zzgol zzc = zzgoo.zzg().zzc();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgoo.zzh().zzA(), "HMAC");
        int zza = zzgoo.zzg().zza();
        zzgol zzgol = zzgol.UNKNOWN_HASH;
        int ordinal = zzc.ordinal();
        if (ordinal == 1) {
            return new zzgrt(new zzgrs("HMACSHA1", secretKeySpec), zza);
        }
        if (ordinal == 2) {
            return new zzgrt(new zzgrs("HMACSHA384", secretKeySpec), zza);
        }
        if (ordinal == 3) {
            return new zzgrt(new zzgrs("HMACSHA256", secretKeySpec), zza);
        }
        if (ordinal == 4) {
            return new zzgrt(new zzgrs("HMACSHA512", secretKeySpec), zza);
        }
        if (ordinal == 5) {
            return new zzgrt(new zzgrs("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
