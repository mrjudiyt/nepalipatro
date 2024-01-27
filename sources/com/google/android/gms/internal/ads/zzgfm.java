package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgfm extends zzghv {
    zzgfm() {
        super(zzgog.class, new zzgfk(zzgax.class));
    }

    public final zzghu zza() {
        return new zzgfl(this, zzgoj.class);
    }

    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgog.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgog zzgog = (zzgog) zzgvj;
        zzgrv.zzb(zzgog.zza(), 0);
        if (zzgog.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
