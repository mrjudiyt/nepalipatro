package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgfe implements zzgio {
    public static final /* synthetic */ zzgfe zza = new zzgfe();

    private /* synthetic */ zzgfe() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        zzgfd zzgfd = (zzgfd) zzgbw;
        int i10 = zzgfi.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgoc zzc = zzgod.zzc();
        zzc.zza(zzgfd.zza());
        zza2.zzc(((zzgod) zzc.zzal()).zzau());
        zzgfb zzb = zzgfd.zzb();
        if (zzgfb.zza.equals(zzb)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgfb.zzb.equals(zzb)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgfb.zzc.equals(zzb)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb)));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
