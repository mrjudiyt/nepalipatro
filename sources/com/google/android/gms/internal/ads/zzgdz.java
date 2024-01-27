package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgdz implements zzghn {
    public static final /* synthetic */ zzgdz zza = new zzgdz();

    private /* synthetic */ zzgdz() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgdt zzgdt;
        int i10 = zzgea.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgnl zze = zzgnl.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgds zzgds = new zzgds((zzgdr) null);
                    zzgds.zzb(zze.zzg().zzd());
                    zzgds.zza(zze.zzf().zza());
                    zzgds.zzc(16);
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzgdt = zzgdt.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzgdt = zzgdt.zzb;
                    } else {
                        zzgdt = zzgdt.zza;
                    }
                    zzgds.zzd(zzgdt);
                    zzgdv zze2 = zzgds.zze();
                    zzgdl zzgdl = new zzgdl((zzgdk) null);
                    zzgdl.zzc(zze2);
                    zzgdl.zzb(zzgry.zzb(zze.zzg().zzA(), zzgch));
                    zzgdl.zza(((zzgjc) zzgjh).zzf());
                    return zzgdl.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }
}
