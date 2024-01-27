package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgfh implements zzghn {
    public static final /* synthetic */ zzgfh zza = new zzgfh();

    private /* synthetic */ zzgfh() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgfb zzgfb;
        int i10 = zzgfi.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgoa zze = zzgoa.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgfa zzgfa = new zzgfa((zzgez) null);
                    zzgfa.zza(zze.zzf().zzd());
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzgfb = zzgfb.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzgfb = zzgfb.zzb;
                    } else {
                        zzgfb = zzgfb.zza;
                    }
                    zzgfa.zzb(zzgfb);
                    zzgfd zzc2 = zzgfa.zzc();
                    zzget zzget = new zzget((zzges) null);
                    zzget.zzc(zzc2);
                    zzget.zzb(zzgry.zzb(zze.zzf().zzA(), zzgch));
                    zzget.zza(((zzgjc) zzgjh).zzf());
                    return zzget.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }
}
