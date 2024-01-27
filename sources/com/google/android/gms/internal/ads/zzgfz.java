package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgfz extends zzghu {
    final /* synthetic */ zzgga zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgfz(zzgga zzgga, Class cls) {
        super(cls);
        this.zza = zzgga;
    }

    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvj) {
        zzgpz zzc = zzgqa.zzc();
        zzc.zza((zzgqd) zzgvj);
        zzc.zzb(0);
        return (zzgqa) zzc.zzal();
    }

    public final /* synthetic */ zzgvj zzb(zzgsr zzgsr) {
        return zzgqd.zze(zzgsr, zzgtl.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvj) {
        zzgqd zzgqd = (zzgqd) zzgvj;
        if (!zzgfx.zzb(zzgqd.zza().zzg())) {
            String zzg = zzgqd.zza().zzg();
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzg + ". Only Tink AEAD key types are supported.");
        } else if (zzgqd.zzf().isEmpty() || !zzgqd.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
