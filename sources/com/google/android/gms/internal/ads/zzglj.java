package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzglj implements zzgbv {
    private final zzgcd zza;
    private final zzgmd zzb;
    private final zzgmd zzc;

    /* synthetic */ zzglj(zzgcd zzgcd, zzgli zzgli) {
        zzgmd zzgmd;
        this.zza = zzgcd;
        if (zzgcd.zzf()) {
            zzgme zzb2 = zzgie.zza().zzb();
            zzgmj zza2 = zzgib.zza(zzgcd);
            this.zzb = zzb2.zza(zza2, "mac", "compute");
            zzgmd = zzb2.zza(zza2, "mac", "verify");
        } else {
            zzgmd = zzgib.zza;
            this.zzb = zzgmd;
        }
        this.zzc = zzgmd;
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzgbz zzgbz : this.zza.zze(Arrays.copyOf(bArr, 5))) {
                try {
                    ((zzgbv) zzgbz.zzd()).zza(bArr, bArr2);
                    zzgbz.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (zzgbz zzgbz2 : this.zza.zze(zzgbc.zza)) {
                try {
                    ((zzgbv) zzgbz2.zzd()).zza(bArr, bArr2);
                    zzgbz2.zza();
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
