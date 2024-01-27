package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzggi extends zzgck {
    private final zzggn zza;
    private final zzgry zzb;
    private final zzgrx zzc;
    private final Integer zzd;

    private zzggi(zzggn zzggn, zzgry zzgry, zzgrx zzgrx, Integer num) {
        this.zza = zzggn;
        this.zzb = zzgry;
        this.zzc = zzgrx;
        this.zzd = num;
    }

    public static zzggi zza(zzggm zzggm, zzgry zzgry, Integer num) {
        zzgrx zzgrx;
        zzggm zzggm2 = zzggm.zzc;
        if (zzggm != zzggm2 && num == null) {
            String obj = zzggm.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzggm == zzggm2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgry.zza() == 32) {
            zzggn zzb2 = zzggn.zzb(zzggm);
            if (zzb2.zza() == zzggm2) {
                zzgrx = zzgrx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzggm.zzb) {
                zzgrx = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzggm.zza) {
                zzgrx = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzggi(zzb2, zzgry, zzgrx, num);
        } else {
            int zza2 = zzgry.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }
}
