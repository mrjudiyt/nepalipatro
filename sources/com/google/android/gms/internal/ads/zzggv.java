package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzggv {
    private static final ThreadLocal zza = new zzggu();
    private final SecretKey zzb;

    public zzggv(byte[] bArr, boolean z10) {
        if (zzghf.zza(2)) {
            zzgrv.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length < 28) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                String property = System.getProperty("java.vendor");
                Integer num = null;
                if (property == "The Android Project" || (property != null && property.equals("The Android Project"))) {
                    num = Integer.valueOf(Build.VERSION.SDK_INT);
                }
                if (num == null || num.intValue() > 19) {
                    algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                } else {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                }
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(2, this.zzb, algorithmParameterSpec);
                if (!(bArr3 == null || bArr3.length == 0)) {
                    ((Cipher) threadLocal.get()).updateAAD(bArr3);
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }
}
