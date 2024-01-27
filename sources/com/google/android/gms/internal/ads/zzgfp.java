package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgfp implements zzgio {
    public static final /* synthetic */ zzgfp zza = new zzgfp();

    private /* synthetic */ zzgfp() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgqf zzgqf;
        int i10 = zzgft.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgoj.zzc().zzau());
        zzgfn zza3 = ((zzgfo) zzgbw).zza();
        if (zzgfn.zza.equals(zza3)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgfn.zzb.equals(zza3)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgfn.zzc.equals(zza3)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(zza3.toString()));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
