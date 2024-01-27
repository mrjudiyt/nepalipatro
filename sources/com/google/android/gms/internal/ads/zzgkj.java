package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgkj implements zzghn {
    public static final /* synthetic */ zzgkj zza = new zzgkj();

    private /* synthetic */ zzgkj() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgkd zzgkd;
        int i10 = zzgkk.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgmn zze = zzgmn.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgkc zzgkc = new zzgkc((zzgkb) null);
                    zzgkc.zza(zze.zzg().zzd());
                    zzgkc.zzb(zze.zzf().zza());
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgkd = zzgkd.zza;
                    } else if (ordinal == 2) {
                        zzgkd = zzgkd.zzc;
                    } else if (ordinal == 3) {
                        zzgkd = zzgkd.zzd;
                    } else if (ordinal == 4) {
                        zzgkd = zzgkd.zzb;
                    } else {
                        int zza2 = zzc.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                    }
                    zzgkc.zzc(zzgkd);
                    zzgkf zzd = zzgkc.zzd();
                    zzgjt zzgjt = new zzgjt((zzgjs) null);
                    zzgjt.zzc(zzd);
                    zzgjt.zza(zzgry.zzb(zze.zzg().zzA(), zzgch));
                    zzgjt.zzb(((zzgjc) zzgjh).zzf());
                    return zzgjt.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }
}
