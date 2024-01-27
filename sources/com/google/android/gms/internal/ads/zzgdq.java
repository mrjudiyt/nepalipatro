package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgdq extends zzghv {
    zzgdq() {
        super(zzgnl.class, new zzgdo(zzgax.class));
    }

    public final zzghu zza() {
        return new zzgdp(this, zzgno.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgnl.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgnl zzgnl = (zzgnl) zzgvj;
        zzgrv.zzb(zzgnl.zza(), 0);
        zzgrv.zza(zzgnl.zzg().zzd());
        if (zzgnl.zzf().zza() != 12 && zzgnl.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
