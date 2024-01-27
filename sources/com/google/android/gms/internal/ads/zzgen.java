package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgen implements zzgio {
    public static final /* synthetic */ zzgen zza = new zzgen();

    private /* synthetic */ zzgen() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        zzgem zzgem = (zzgem) zzgbw;
        int i10 = zzger.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgnw zzc = zzgnx.zzc();
        zzc.zza(zzgem.zza());
        zza2.zzc(((zzgnx) zzc.zzal()).zzau());
        zzgek zzb = zzgem.zzb();
        if (zzgek.zza.equals(zzb)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgek.zzb.equals(zzb)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgek.zzc.equals(zzb)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb)));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
