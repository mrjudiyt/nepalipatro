package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgbg implements zzgbf {
    private final zzghv zza;
    private final Class zzb;

    public zzgbg(zzghv zzghv, Class cls) {
        if (zzghv.zzl().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzghv;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzghv.toString(), cls.getName()}));
    }

    public final zzgoz zza(zzgsr zzgsr) {
        try {
            zzghu zza2 = this.zza.zza();
            zzgvj zzb2 = zza2.zzb(zzgsr);
            zza2.zzd(zzb2);
            zzgvj zza3 = zza2.zza(zzb2);
            zzgow zza4 = zzgoz.zza();
            zza4.zzb(this.zza.zzd());
            zza4.zzc(zza3.zzau());
            zza4.zza(this.zza.zzb());
            return (zzgoz) zza4.zzal();
        } catch (zzgul e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final Object zzb(zzgsr zzgsr) {
        try {
            zzgvj zzc = this.zza.zzc(zzgsr);
            if (!Void.class.equals(this.zzb)) {
                this.zza.zze(zzc);
                return this.zza.zzk(zzc, this.zzb);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzgul e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e10);
        }
    }

    public final String zzc() {
        return this.zza.zzd();
    }
}
