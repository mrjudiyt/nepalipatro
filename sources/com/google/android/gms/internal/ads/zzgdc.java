package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgdc implements zzgio {
    public static final /* synthetic */ zzgdc zza = new zzgdc();

    private /* synthetic */ zzgdc() {
    }

    public final zzgjh zza(zzgbw zzgbw) {
        zzgol zzgol;
        zzgqf zzgqf;
        zzgdb zzgdb = (zzgdb) zzgbw;
        int i10 = zzgdg.zza;
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgmy zza3 = zzgmz.zza();
        zzgne zzc = zzgnf.zzc();
        zzgnh zzc2 = zzgni.zzc();
        zzc2.zza(zzgdb.zzc());
        zzc.zzb((zzgni) zzc2.zzal());
        zzc.zza(zzgdb.zza());
        zza3.zza((zzgnf) zzc.zzal());
        zzgoq zzc3 = zzgor.zzc();
        zzgot zzd = zzgou.zzd();
        zzd.zzb(zzgdb.zzd());
        zzgcy zze = zzgdb.zze();
        if (zzgcy.zza.equals(zze)) {
            zzgol = zzgol.SHA1;
        } else if (zzgcy.zzb.equals(zze)) {
            zzgol = zzgol.SHA224;
        } else if (zzgcy.zzc.equals(zze)) {
            zzgol = zzgol.SHA256;
        } else if (zzgcy.zzd.equals(zze)) {
            zzgol = zzgol.SHA384;
        } else if (zzgcy.zze.equals(zze)) {
            zzgol = zzgol.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zze)));
        }
        zzd.zza(zzgol);
        zzc3.zzb((zzgou) zzd.zzal());
        zzc3.zza(zzgdb.zzb());
        zza3.zzb((zzgor) zzc3.zzal());
        zza2.zzc(((zzgmz) zza3.zzal()).zzau());
        zzgcz zzf = zzgdb.zzf();
        if (zzgcz.zza.equals(zzf)) {
            zzgqf = zzgqf.TINK;
        } else if (zzgcz.zzb.equals(zzf)) {
            zzgqf = zzgqf.CRUNCHY;
        } else if (zzgcz.zzc.equals(zzf)) {
            zzgqf = zzgqf.RAW;
        } else {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzf)));
        }
        zza2.zza(zzgqf);
        return zzgjd.zza((zzgpe) zza2.zzal());
    }
}
