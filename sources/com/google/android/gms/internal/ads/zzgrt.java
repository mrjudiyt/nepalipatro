package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrt implements zzgbv {
    private static final byte[] zza = {0};
    private final zzgmk zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgrt(zzgjv zzgjv) {
        this.zzb = new zzgrq(zzgjv.zzd().zzc(zzgbd.zza()));
        this.zzc = zzgjv.zza().zza();
        this.zzd = zzgjv.zzc().zzc();
        if (zzgjv.zza().zzd().equals(zzgkd.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgbv zzb(zzgjv zzgjv) {
        return new zzgrt(zzgjv);
    }

    public static zzgbv zzc(zzgks zzgks) {
        return new zzgrt(zzgks);
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = this.zze;
        if (bArr4.length > 0) {
            bArr3 = zzgqv.zzb(this.zzd, this.zzb.zza(zzgqv.zzb(bArr2, bArr4), this.zzc));
        } else {
            bArr3 = zzgqv.zzb(this.zzd, this.zzb.zza(bArr2, this.zzc));
        }
        if (!MessageDigest.isEqual(bArr3, bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private zzgrt(zzgks zzgks) {
        String valueOf = String.valueOf(zzgks.zzd().zze());
        this.zzb = new zzgrs("HMAC".concat(valueOf), new SecretKeySpec(zzgks.zze().zzc(zzgbd.zza()), "HMAC"));
        this.zzc = zzgks.zzd().zza();
        this.zzd = zzgks.zzc().zzc();
        if (zzgks.zzd().zzf().equals(zzglb.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgrt(zzgmk zzgmk, int i10) {
        this.zzb = zzgmk;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i10 >= 10) {
            zzgmk.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
