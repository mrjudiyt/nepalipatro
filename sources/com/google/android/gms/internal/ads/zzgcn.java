package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgcn implements zzgax {
    private final zzgcd zza;
    private final zzgmd zzb;
    private final zzgmd zzc;

    /* synthetic */ zzgcn(zzgcd zzgcd, zzgcm zzgcm) {
        zzgmd zzgmd;
        this.zza = zzgcd;
        if (zzgcd.zzf()) {
            zzgme zzb2 = zzgie.zza().zzb();
            zzgmj zza2 = zzgib.zza(zzgcd);
            this.zzb = zzb2.zza(zza2, "aead", "encrypt");
            zzgmd = zzb2.zza(zza2, "aead", "decrypt");
        } else {
            zzgmd = zzgib.zza;
            this.zzb = zzgmd;
        }
        this.zzc = zzgmd;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgbz zzgbz : this.zza.zze(copyOf)) {
                try {
                    byte[] zza2 = ((zzgax) zzgbz.zze()).zza(copyOfRange, bArr2);
                    zzgbz.zza();
                    int length2 = copyOfRange.length;
                    return zza2;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgbz zzgbz2 : this.zza.zze(zzgbc.zza)) {
            try {
                byte[] zza3 = ((zzgax) zzgbz2.zze()).zza(bArr, bArr2);
                zzgbz2.zza();
                return zza3;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
