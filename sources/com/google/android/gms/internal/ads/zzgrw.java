package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrw implements zzgax {
    private final zzghb zza;

    public zzgrw(byte[] bArr) {
        this.zza = new zzghb(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
