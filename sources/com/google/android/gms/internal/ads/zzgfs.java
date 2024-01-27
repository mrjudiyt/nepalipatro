package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgfs implements zzghn {
    public static final /* synthetic */ zzgfs zza = new zzgfs();

    private /* synthetic */ zzgfs() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgfn zzgfn;
        int i10 = zzgft.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgog zze = zzgog.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() == 0) {
                    zzgqf zzc = ((zzgjc) zzgjh).zzc();
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                zzgfn = zzgfn.zzc;
                            } else if (ordinal != 4) {
                                int zza2 = zzc.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                            }
                        }
                        zzgfn = zzgfn.zzb;
                    } else {
                        zzgfn = zzgfn.zza;
                    }
                    return zzgfj.zza(zzgfn, zzgry.zzb(zze.zzf().zzA(), zzgch), ((zzgjc) zzgjh).zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }
}
