package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgqx implements zzgax {
    private final zzgrp zza;
    private final zzgbv zzb;
    private final int zzc;

    public zzgqx(zzgrp zzgrp, zzgbv zzgbv, int i10) {
        this.zza = zzgrp;
        this.zzb = zzgbv;
        this.zzc = i10;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.zzb.zza(copyOfRange2, zzgqv.zzb(bArr2, copyOfRange, copyOf));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
