package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgey extends zzghv {
    zzgey() {
        super(zzgoa.class, new zzgew(zzgax.class));
    }

    public static void zzg(boolean z10) {
        if (zzh()) {
            zzgcg.zzf(new zzgey(), true);
            int i10 = zzgfi.zza;
            zzgfi.zza(zzgii.zzb());
        }
    }

    private static boolean zzh() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzghu zza() {
        return new zzgex(this, zzgod.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgoa.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgoa zzgoa = (zzgoa) zzgvj;
        zzgrv.zzb(zzgoa.zza(), 0);
        zzgrv.zza(zzgoa.zzf().zzd());
    }
}
