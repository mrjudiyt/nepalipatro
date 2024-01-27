package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjc implements zzgjh {
    private final String zza;
    private final zzgrx zzb;
    private final zzgsr zzc;
    private final zzgoy zzd;
    private final zzgqf zze;
    private final Integer zzf;

    private zzgjc(String str, zzgsr zzgsr, zzgoy zzgoy, zzgqf zzgqf, Integer num) {
        this.zza = str;
        this.zzb = zzgjr.zza(str);
        this.zzc = zzgsr;
        this.zzd = zzgoy;
        this.zze = zzgqf;
        this.zzf = num;
    }

    public static zzgjc zza(String str, zzgsr zzgsr, zzgoy zzgoy, zzgqf zzgqf, Integer num) {
        if (zzgqf == zzgqf.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgjc(str, zzgsr, zzgoy, zzgqf, num);
    }

    public final zzgoy zzb() {
        return this.zzd;
    }

    public final zzgqf zzc() {
        return this.zze;
    }

    public final zzgrx zzd() {
        return this.zzb;
    }

    public final zzgsr zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
