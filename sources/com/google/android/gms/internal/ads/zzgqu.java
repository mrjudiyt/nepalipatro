package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgqu implements zzgax {
    private final zzggv zza;
    private final byte[] zzb;

    public zzgqu(byte[] bArr) {
        zzgrx zzb2 = zzgrx.zzb(new byte[0]);
        if (zzghf.zza(2)) {
            this.zza = new zzggv(bArr, true);
            this.zzb = zzb2.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        Charset charset = zzgjr.zza;
        if (bArr.length >= length) {
            int i10 = 0;
            while (i10 < bArr3.length) {
                if (bArr[i10] == bArr3[i10]) {
                    i10++;
                }
            }
            byte[] bArr4 = this.zzb;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
            return this.zza.zza(Arrays.copyOf(copyOfRange, 12), copyOfRange, bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
