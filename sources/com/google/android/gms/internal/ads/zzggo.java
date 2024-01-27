package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzggo implements zzgio {
    public static final /* synthetic */ zzggo zza = new zzggo();

    private /* synthetic */ zzggo() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        int i10 = zzggs.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgqo.zzc().zzau());
        zzggm zza3 = ((zzggn) zzgbw).zza();
        if (zzggm.zza.equals(zza3)) {
            zzgqf = zzgqf.TINK;
        } else if (zzggm.zzb.equals(zza3)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzggm.zzc.equals(zza3)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(zza3.toString()));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
