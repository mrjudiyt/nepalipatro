package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgbs {
    private final zzgpm zza;
    private final List zzb;
    private final zzgmc zzc;

    private zzgbs(zzgpm zzgpm, List list) {
        this.zza = zzgpm;
        this.zzb = list;
        this.zzc = zzgmc.zza;
    }

    private zzgbs(zzgpm zzgpm, List list, zzgmc zzgmc) {
        this.zza = zzgpm;
        this.zzb = list;
        this.zzc = zzgmc;
    }

    static final zzgbs zza(zzgpm zzgpm) {
        zzi(zzgpm);
        return new zzgbs(zzgpm, zzh(zzgpm));
    }

    static final zzgbs zzb(zzgpm zzgpm, zzgmc zzgmc) {
        zzi(zzgpm);
        return new zzgbs(zzgpm, zzh(zzgpm), zzgmc);
    }

    public static final zzgbs zzc(zzgbw zzgbw) {
        zzgbp zzgbp = new zzgbp();
        zzgbn zzgbn = new zzgbn(zzgbw, (zzgbm) null);
        zzgbn.zze();
        zzgbn.zzd();
        zzgbp.zza(zzgbn);
        return zzgbp.zzb();
    }

    private static zzgjc zzf(zzgpl zzgpl) {
        try {
            return zzgjc.zza(zzgpl.zzc().zzg(), zzgpl.zzc().zzf(), zzgpl.zzc().zzc(), zzgpl.zzf(), zzgpl.zzf() == zzgqf.RAW ? null : Integer.valueOf(zzgpl.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzgjq("Creating a protokey serialization failed", e10);
        }
    }

    private static Object zzg(zzghl zzghl, zzgpl zzgpl, Class cls) {
        try {
            return zzgcg.zzc(zzgpl.zzc(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    private static List zzh(zzgpm zzgpm) {
        zzgbj zzgbj;
        ArrayList arrayList = new ArrayList(zzgpm.zza());
        for (zzgpl zzgpl : zzgpm.zzh()) {
            int zza2 = zzgpl.zza();
            try {
                zzgbe zza3 = zzgii.zzb().zza(zzf(zzgpl), zzgch.zza());
                int zzk = zzgpl.zzk() - 2;
                if (zzk == 1) {
                    zzgbj = zzgbj.zza;
                } else if (zzk == 2) {
                    zzgbj = zzgbj.zzb;
                } else if (zzk == 3) {
                    zzgbj = zzgbj.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzgbr(zza3, zzgbj, zza2, zza2 == zzgpm.zzc(), (zzgbq) null));
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgpm zzgpm) {
        if (zzgpm == null || zzgpm.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzj(zzghl zzghl, zzgbe zzgbe, Class cls) {
        try {
            return zzgif.zza().zzc(zzgbe, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzgci.zza;
        zzgpm zzgpm = this.zza;
        zzgpo zza2 = zzgpr.zza();
        zza2.zzb(zzgpm.zzc());
        for (zzgpl zzgpl : zzgpm.zzh()) {
            zzgpp zza3 = zzgpq.zza();
            zza3.zzc(zzgpl.zzc().zzg());
            zza3.zzd(zzgpl.zzk());
            zza3.zzb(zzgpl.zzf());
            zza3.zza(zzgpl.zza());
            zza2.zza((zzgpq) zza3.zzal());
        }
        return ((zzgpr) zza2.zzal()).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgpm zzd() {
        return this.zza;
    }

    public final Object zze(zzgbb zzgbb, Class cls) {
        Class zzb2 = zzgcg.zzb(cls);
        if (zzb2 != null) {
            zzgpm zzgpm = this.zza;
            Charset charset = zzgci.zza;
            int zzc2 = zzgpm.zzc();
            int i10 = 0;
            boolean z10 = false;
            boolean z11 = true;
            for (zzgpl zzgpl : zzgpm.zzh()) {
                if (zzgpl.zzk() == 3) {
                    if (!zzgpl.zzj()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgpl.zza())}));
                    } else if (zzgpl.zzf() == zzgqf.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgpl.zza())}));
                    } else if (zzgpl.zzk() != 2) {
                        if (zzgpl.zza() == zzc2) {
                            if (!z10) {
                                z10 = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        z11 &= zzgpl.zzc().zzc() == zzgoy.ASYMMETRIC_PUBLIC;
                        i10++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgpl.zza())}));
                    }
                }
            }
            if (i10 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z10 || z11) {
                zzgby zzgby = new zzgby(zzb2, (zzgbx) null);
                zzgby.zzc(this.zzc);
                for (int i11 = 0; i11 < this.zza.zza(); i11++) {
                    zzgpl zze = this.zza.zze(i11);
                    if (zze.zzk() == 3) {
                        zzghl zzghl = (zzghl) zzgbb;
                        Object zzg = zzg(zzghl, zze, zzb2);
                        Object zzj = this.zzb.get(i11) != null ? zzj(zzghl, ((zzgbr) this.zzb.get(i11)).zza(), zzb2) : null;
                        if (zzj == null && zzg == null) {
                            String obj = zzb2.toString();
                            String zzg2 = zze.zzc().zzg();
                            throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + zzg2);
                        } else if (zze.zza() == this.zza.zzc()) {
                            zzgby.zzb(zzj, zzg, zze);
                        } else {
                            zzgby.zza(zzj, zzg, zze);
                        }
                    }
                }
                return zzgif.zza().zzd(zzgby.zzd(), cls);
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
    }
}
