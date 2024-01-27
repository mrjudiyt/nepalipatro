package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgfj extends zzgck {
    private final zzgfo zza;
    private final zzgry zzb;
    private final zzgrx zzc;
    private final Integer zzd;

    private zzgfj(zzgfo zzgfo, zzgry zzgry, zzgrx zzgrx, Integer num) {
        this.zza = zzgfo;
        this.zzb = zzgry;
        this.zzc = zzgrx;
        this.zzd = num;
    }

    public static zzgfj zza(zzgfn zzgfn, zzgry zzgry, Integer num) {
        zzgrx zzgrx;
        zzgfn zzgfn2 = zzgfn.zzc;
        if (zzgfn != zzgfn2 && num == null) {
            String obj = zzgfn.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgfn == zzgfn2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgry.zza() == 32) {
            zzgfo zzb2 = zzgfo.zzb(zzgfn);
            if (zzb2.zza() == zzgfn2) {
                zzgrx = zzgrx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzgfn.zzb) {
                zzgrx = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzgfn.zza) {
                zzgrx = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzgfj(zzb2, zzgry, zzgrx, num);
        } else {
            int zza2 = zzgry.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }
}
