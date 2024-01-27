package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzgdf implements zzghn {
    public static final /* synthetic */ zzgdf zza = new zzgdf();

    private /* synthetic */ zzgdf() {
    }

    public final zzgbe zza(zzgjh zzgjh, zzgch zzgch) {
        zzgcy zzgcy;
        zzgcz zzgcz;
        int i10 = zzgdg.zza;
        if (((zzgjc) zzgjh).zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgmw zze = zzgmw.zze(((zzgjc) zzgjh).zze(), zzgtl.zza());
                if (zze.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zze.zzf().zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                } else if (zze.zzg().zza() == 0) {
                    zzgcx zzgcx = new zzgcx((zzgcw) null);
                    zzgcx.zza(zze.zzf().zzh().zzd());
                    zzgcx.zzc(zze.zzg().zzh().zzd());
                    zzgcx.zzd(zze.zzf().zzg().zza());
                    zzgcx.zze(zze.zzg().zzg().zza());
                    zzgol zzc = zze.zzg().zzg().zzc();
                    zzgol zzgol = zzgol.UNKNOWN_HASH;
                    zzgqf zzgqf = zzgqf.UNKNOWN_PREFIX;
                    int ordinal = zzc.ordinal();
                    if (ordinal == 1) {
                        zzgcy = zzgcy.zza;
                    } else if (ordinal == 2) {
                        zzgcy = zzgcy.zzd;
                    } else if (ordinal == 3) {
                        zzgcy = zzgcy.zzc;
                    } else if (ordinal == 4) {
                        zzgcy = zzgcy.zze;
                    } else if (ordinal == 5) {
                        zzgcy = zzgcy.zzb;
                    } else {
                        int zza2 = zzc.zza();
                        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
                    }
                    zzgcx.zzb(zzgcy);
                    zzgqf zzc2 = ((zzgjc) zzgjh).zzc();
                    int ordinal2 = zzc2.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 == 3) {
                                zzgcz = zzgcz.zzc;
                            } else if (ordinal2 != 4) {
                                int zza3 = zzc2.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza3);
                            }
                        }
                        zzgcz = zzgcz.zzb;
                    } else {
                        zzgcz = zzgcz.zza;
                    }
                    zzgcx.zzf(zzgcz);
                    zzgdb zzg = zzgcx.zzg();
                    zzgcq zzgcq = new zzgcq((zzgcp) null);
                    zzgcq.zzd(zzg);
                    zzgcq.zza(zzgry.zzb(zze.zzf().zzh().zzA(), zzgch));
                    zzgcq.zzb(zzgry.zzb(zze.zzg().zzh().zzA(), zzgch));
                    zzgcq.zzc(((zzgjc) zzgjh).zzf());
                    return zzgcq.zze();
                } else {
                    throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                }
            } catch (zzgul unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }
}
