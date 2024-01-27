package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrq implements zzgmk {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgrq(byte[] bArr) {
        zzgrv.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb2 = zzb();
        zzb2.init(1, secretKeySpec);
        byte[] zza2 = zzglr.zza(zzb2.doFinal(new byte[16]));
        this.zzb = zza2;
        this.zzc = zzglr.zza(zza2);
    }

    private static Cipher zzb() {
        if (zzghf.zza(1)) {
            return (Cipher) zzgrf.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, int i10) {
        byte[] bArr2;
        if (i10 <= 16) {
            SecretKey secretKey = this.zza;
            Cipher zzb2 = zzb();
            zzb2.init(1, secretKey);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            int i11 = max - 1;
            int i12 = i11 * 16;
            if (max * 16 == length) {
                bArr2 = zzgqv.zzd(bArr, i12, this.zzb, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    bArr2 = zzgqv.zzc(copyOf, this.zzc);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i13 = 0; i13 < i11; i13++) {
                bArr3 = zzb2.doFinal(zzgqv.zzd(bArr3, 0, bArr, i13 * 16, 16));
            }
            return Arrays.copyOf(zzb2.doFinal(zzgqv.zzc(bArr2, bArr3)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
