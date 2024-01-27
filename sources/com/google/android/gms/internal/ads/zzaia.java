package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaia implements zzacm {
    final /* synthetic */ zzaib zza;

    /* synthetic */ zzaia(zzaib zzaib, zzahz zzahz) {
        this.zza = zzaib;
    }

    public final long zza() {
        zzaib zzaib = this.zza;
        return zzaib.zzd.zzf(zzaib.zzf);
    }

    public final zzack zzg(long j10) {
        zzaib zzaib = this.zza;
        long zzg = zzaib.zzd.zzg(j10);
        long zzb = zzaib.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaib zzaib2 = this.zza;
        long longValue = zzb + valueOf.multiply(BigInteger.valueOf(zzaib2.zzc - zzaib2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzaib zzaib3 = this.zza;
        zzacn zzacn = new zzacn(j10, Math.max(zzaib3.zzb, Math.min(longValue - 30000, zzaib3.zzc - 1)));
        return new zzack(zzacn, zzacn);
    }

    public final boolean zzh() {
        return true;
    }
}
