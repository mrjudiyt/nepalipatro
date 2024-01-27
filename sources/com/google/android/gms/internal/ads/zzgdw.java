package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgdw implements zzgio {
    public static final /* synthetic */ zzgdw zza = new zzgdw();

    private /* synthetic */ zzgdw() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        zzgdv zzgdv = (zzgdv) zzgbw;
        int i10 = zzgea.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgnn zzc = zzgno.zzc();
        zzgnq zzc2 = zzgnr.zzc();
        zzc2.zza(zzgdv.zza());
        zzc.zzb((zzgnr) zzc2.zzal());
        zzc.zza(zzgdv.zzb());
        zza2.zzc(((zzgno) zzc.zzal()).zzau());
        zzgdt zzc3 = zzgdv.zzc();
        if (zzgdt.zza.equals(zzc3)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgdt.zzb.equals(zzc3)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgdt.zzc.equals(zzc3)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzc3)));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
