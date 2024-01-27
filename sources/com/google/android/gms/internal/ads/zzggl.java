package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzggl extends zzghv {
    zzggl() {
        super(zzgql.class, new zzggj(zzgax.class));
    }

    public final zzghu zza() {
        return new zzggk(this, zzgqo.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgql.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgql zzgql = (zzgql) zzgvj;
        zzgrv.zzb(zzgql.zza(), 0);
        if (zzgql.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
