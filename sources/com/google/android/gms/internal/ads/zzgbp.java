package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgbp {
    private final List zza = new ArrayList();
    private final zzgmc zzb = zzgmc.zza;
    private boolean zzc = false;

    /* access modifiers changed from: private */
    public final void zzd() {
        for (zzgbn zzj : this.zza) {
            zzj.zza = false;
        }
    }

    public final zzgbp zza(zzgbn zzgbn) {
        if (zzgbn.zzf == null) {
            if (zzgbn.zza) {
                zzd();
            }
            zzgbn.zzf = this;
            this.zza.add(zzgbn);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgbs zzb() {
        byte b10;
        if (!this.zzc) {
            char c10 = 1;
            this.zzc = true;
            List list = this.zza;
            zzgpj zzd = zzgpm.zzd();
            int i10 = 0;
            while (i10 < list.size() - 1) {
                int i11 = i10 + 1;
                if (((zzgbn) list.get(i10)).zze != zzgbo.zza || ((zzgbn) list.get(i11)).zze == zzgbo.zza) {
                    i10 = i11;
                } else {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzgbn zzgbn : this.zza) {
                zzgbj unused = zzgbn.zzb;
                if (zzgbn.zze != null) {
                    int i12 = 3;
                    if (zzgbn.zze == zzgbo.zza) {
                        b10 = 0;
                        while (true) {
                            if (b10 != 0 && !hashSet.contains(Integer.valueOf(b10))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[4];
                            byte b11 = 0;
                            while (b11 == 0) {
                                secureRandom.nextBytes(bArr);
                                b11 = ((bArr[0] & 255) << 24) | ((bArr[c10] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                c10 = 1;
                            }
                            b10 = b11;
                        }
                    } else {
                        zzgbo unused2 = zzgbn.zze;
                        b10 = 0;
                    }
                    Integer valueOf = Integer.valueOf(b10);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgbe unused3 = zzgbn.zzc;
                        zzgbw zzh = zzgbn.zzd;
                        zzgbj zzc2 = zzgbn.zzc();
                        zzgbj zzgbj = zzgbj.zza;
                        if (!zzgbj.equals(zzc2)) {
                            if (zzgbj.zzb.equals(zzc2)) {
                                i12 = 4;
                            } else if (zzgbj.zzc.equals(zzc2)) {
                                i12 = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                        }
                        if (!(zzh instanceof zzghy)) {
                            zzgjd zzgjd = (zzgjd) zzgii.zzb().zzc(zzh, zzgjd.class);
                            zzgoz zza2 = zzgcg.zza(zzgjd.zzb());
                            zzgpk zzd2 = zzgpl.zzd();
                            zzd2.zzb(b10);
                            zzd2.zzd(i12);
                            zzd2.zza(zza2);
                            zzd2.zzc(zzgjd.zzb().zze());
                            zzd.zza((zzgpl) zzd2.zzal());
                            if (zzgbn.zza) {
                                if (num != null) {
                                    throw new GeneralSecurityException("Two primaries were set");
                                } else if (zzgbn.zzb == zzgbj) {
                                    num = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            }
                            c10 = 1;
                        } else {
                            zzghy zzghy = (zzghy) zzh;
                            throw null;
                        }
                    } else {
                        throw new GeneralSecurityException("Id " + b10 + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzd.zzb(num.intValue());
                return zzgbs.zzb((zzgpm) zzd.zzal(), this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
