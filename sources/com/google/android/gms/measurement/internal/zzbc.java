package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzbc {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    zzbc(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0, 0, 0, j12, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final zzbc zza(Long l10, Long l11, Boolean bool) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    zzbc(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z10 = true;
        Preconditions.checkArgument(j15 >= 0);
        Preconditions.checkArgument(j16 >= 0);
        Preconditions.checkArgument(j17 >= 0);
        Preconditions.checkArgument(j18 < 0 ? false : z10);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j15;
        this.zzd = j16;
        this.zze = j17;
        this.zzf = j13;
        this.zzg = j18;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    /* access modifiers changed from: package-private */
    public final zzbc zza(long j10, long j11) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    /* access modifiers changed from: package-private */
    public final zzbc zza(long j10) {
        return new zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
