package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgkg implements zzgio {
    public static final /* synthetic */ zzgkg zza = new zzgkg();

    private /* synthetic */ zzgkg() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        zzgkf zzgkf = (zzgkf) zzgbw;
        int i10 = zzgkk.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgmp zzc = zzgmq.zzc();
        zzgms zzc2 = zzgmt.zzc();
        zzc2.zza(zzgkf.zza());
        zzc.zzb((zzgmt) zzc2.zzal());
        zzc.zza(zzgkf.zzb());
        zza2.zzc(((zzgmq) zzc.zzal()).zzau());
        zzgkd zzd = zzgkf.zzd();
        if (zzgkd.zza.equals(zzd)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgkd.zzb.equals(zzd)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgkd.zzd.equals(zzd)) {
            zzgqf = zzgqf.RAW;
        } else if (zzgkd.zzc.equals(zzd)) {
            zzgqf = zzgqf.LEGACY;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzd)));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
