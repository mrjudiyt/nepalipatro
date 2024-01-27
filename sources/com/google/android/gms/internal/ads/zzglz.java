package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzglz implements zzgbv {
    private static final byte[] zza = {0};
    private final zzgbv zzb;
    private final zzgqf zzc;
    private final byte[] zzd;

    private zzglz(zzgbv zzgbv, zzgqf zzgqf, byte[] bArr) {
        this.zzb = zzgbv;
        this.zzc = zzgqf;
        this.zzd = bArr;
    }

    public static zzgbv zzb(zzghx zzghx) {
        byte[] bArr;
        zzgjc zza2 = zzghx.zza(zzgbd.zza());
        zzgow zza3 = zzgoz.zza();
        zza3.zzb(zza2.zzg());
        zza3.zzc(zza2.zze());
        zza3.zza(zza2.zzb());
        zzgbv zzgbv = (zzgbv) zzgcg.zzc((zzgoz) zza3.zzal(), zzgbv.class);
        zzgqf zzc2 = zza2.zzc();
        zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = new byte[0];
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzghx.zzb().intValue()).array();
        } else {
            bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzghx.zzb().intValue()).array();
        }
        return new zzglz(zzgbv, zzc2, bArr);
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 10) {
            if (this.zzc.equals(zzgqf.LEGACY)) {
                bArr2 = zzgqv.zzb(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzgqf.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
