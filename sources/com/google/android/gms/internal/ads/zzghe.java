package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzghe implements zzgax {
    private static final ThreadLocal zza = new zzghd();
    private static final boolean zzb;
    private final SecretKey zzc;

    static {
        boolean z10;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        zzb = z10;
    }

    public zzghe(byte[] bArr) {
        zzgrv.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length >= 28) {
            if (zzb) {
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } else if (zzgru.zza()) {
                algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
            } else {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ThreadLocal threadLocal = zza;
            ((Cipher) threadLocal.get()).init(2, this.zzc, algorithmParameterSpec);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) threadLocal.get()).updateAAD(bArr2);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
