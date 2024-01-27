package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgka extends zzghv {
    private static final zzgiu zza;
    private static final zzgiu zzb;

    static {
        Class<zzgjv> cls = zzgjv.class;
        zza = zzgiu.zzb(zzgjw.zza, cls, zzgkl.class);
        zzb = zzgiu.zzb(zzgjx.zza, cls, zzgbv.class);
    }

    zzgka() {
        super(zzgmn.class, new zzgjy(zzgbv.class));
    }

    public static void zzm(boolean z10) {
        zzgcg.zzf(new zzgka(), true);
        int i10 = zzgkk.zza;
        zzgkk.zza(zzgii.zzb());
        zzgif.zza().zze(zza);
        zzgif.zza().zze(zzb);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzgmt zzgmt) {
        if (zzgmt.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgmt.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzo(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzghu zza() {
        return new zzgjz(this, zzgmq.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgmn.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgmn zzgmn = (zzgmn) zzgvj;
        zzgrv.zzb(zzgmn.zza(), 0);
        zzo(zzgmn.zzg().zzd());
        zzn(zzgmn.zzf());
    }
}
