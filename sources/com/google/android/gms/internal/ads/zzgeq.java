package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgeq implements zzghn {
    public static final /* synthetic */ zzgeq zza = new zzgeq();

    private /* synthetic */ zzgeq() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgek zzgek;
        int i10 = zzger.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgnu zze = zzgnu.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgej zzgej = new zzgej((zzgei) null);
                    zzgej.zzb(zze.zzf().zzd());
                    zzgej.zza(12);
                    zzgej.zzc(16);
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzgek = zzgek.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzgek = zzgek.zzb;
                    } else {
                        zzgek = zzgek.zza;
                    }
                    zzgej.zzd(zzgek);
                    zzgem zze2 = zzgej.zze();
                    zzgec zzgec = new zzgec((zzgeb) null);
                    zzgec.zzc(zze2);
                    zzgec.zzb(zzgry.zzb(zze.zzf().zzA(), zzgch));
                    zzgec.zza(((zzgjc) zzgjh).zzf());
                    return zzgec.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }
}
