package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzggr implements zzghn {
    public static final /* synthetic */ zzggr zza = new zzggr();

    private /* synthetic */ zzggr() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzggm zzggm;
        int i10 = zzggs.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgql zze = zzgql.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzggm = zzggm.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzggm = zzggm.zzb;
                    } else {
                        zzggm = zzggm.zza;
                    }
                    return zzggi.zza(zzggm, zzgry.zzb(zze.zzf().zzA(), zzgch), ((zzgjc) zzgjh).zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }
}
