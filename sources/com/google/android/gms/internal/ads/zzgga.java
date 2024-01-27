package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgga extends zzghv {
    zzgga() {
        super(zzgqa.class, new zzgfy(zzgax.class));
    }

    public final zzghu zza() {
        return new zzgfz(this, zzgqd.class);
    }

    public final zzgoy zzb() {
        return zzgoy.REMOTE;
    }

    public final /* synthetic */ zzgvj zzc(zzgsr zzgsr) {
        return zzgqa.zze(zzgsr, zzgtl.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvj) {
        zzgqa zzgqa = (zzgqa) zzgvj;
        zzgrv.zzb(zzgqa.zza(), 0);
        if (!zzgfx.zzb(zzgqa.zzf().zza().zzg())) {
            String zzg = zzgqa.zzf().zza().zzg();
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzg + ". Only Tink AEAD key types are supported.");
        }
    }
}
