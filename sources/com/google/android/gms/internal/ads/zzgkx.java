package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgkx extends zzghv {
    private static final zzgiu zza;
    private static final zzgiu zzb;

    static {
        Class<zzgks> cls = zzgks.class;
        zza = zzgiu.zzb(zzgkt.zza, cls, zzgkl.class);
        zzb = zzgiu.zzb(zzgku.zza, cls, zzgbv.class);
    }

    public zzgkx() {
        super(zzgoo.class, new zzgkv(zzgbv.class));
    }

    public static void zzh(boolean z10) {
        zzgcg.zzf(new zzgkx(), true);
        int i10 = zzgly.zza;
        zzgly.zzc(zzgii.zzb());
        zzgif.zza().zze(zza);
        zzgif.zza().zze(zzb);
    }

    public static final void zzm(zzgoo zzgoo) {
        zzgrv.zzb(zzgoo.zza(), 0);
        if (zzgoo.zzh().zzd() >= 16) {
            zzn(zzgoo.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* access modifiers changed from: private */
    public static void zzn(zzgou zzgou) {
        if (zzgou.zza() >= 10) {
            zzgol zzgol = zzgol.UNKNOWN_HASH;
            int ordinal = zzgou.zzc().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzgou.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzgou.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzgou.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzgou.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzgou.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzghu zza() {
        return new zzgkw(this, zzgor.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgoo.zzf(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzm((zzgoo) zzgvj);
    }

    public final int zzf() {
        return 2;
    }
}
