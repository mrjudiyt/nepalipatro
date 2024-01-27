package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzagv implements zzagt {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagv(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1;
    }

    public static zzagv zzb(long j10, long j11, zzacg zzacg, zzfb zzfb) {
        int zzo;
        long j12 = j10;
        zzacg zzacg2 = zzacg;
        int i10 = zzacg2.zzg;
        int i11 = zzacg2.zzd;
        int zzf2 = zzfb.zzf();
        if ((zzf2 & 1) != 1 || (zzo = zzfb.zzo()) == 0) {
            return null;
        }
        int i12 = zzf2 & 6;
        long zzr = zzfk.zzr((long) zzo, ((long) i10) * 1000000, (long) i11);
        if (i12 != 6) {
            return new zzagv(j11, zzacg2.zzc, zzr, -1, (long[]) null);
        }
        long zzt = zzfb.zzt();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = (long) zzfb.zzl();
        }
        if (j12 != -1) {
            long j13 = j11 + zzt;
            if (j12 != j13) {
                zzer.zzf("XingSeeker", "XING data size mismatch: " + j12 + ", " + j13);
            }
        }
        return new zzagv(j11, zzacg2.zzc, zzr, zzt, jArr);
    }

    private final long zze(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    public final long zza() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    public final long zzd(long j10) {
        long j11;
        if (!zzh()) {
            return 0;
        }
        long j12 = j10 - this.zza;
        if (j12 <= ((long) this.zzb)) {
            return 0;
        }
        long[] jArr = this.zzf;
        zzdx.zzb(jArr);
        double d10 = (((double) j12) * 256.0d) / ((double) this.zzd);
        int zzc2 = zzfk.zzc(jArr, (long) d10, true, true);
        long zze2 = zze(zzc2);
        long j13 = jArr[zzc2];
        int i10 = zzc2 + 1;
        long zze3 = zze(i10);
        if (zzc2 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i10];
        }
        return zze2 + Math.round((j13 == j11 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d10 - ((double) j13)) / ((double) (j11 - j13))) * ((double) (zze3 - zze2)));
    }

    public final zzack zzg(long j10) {
        double d10;
        if (!zzh()) {
            zzacn zzacn = new zzacn(0, this.zza + ((long) this.zzb));
            return new zzack(zzacn, zzacn);
        }
        long max = Math.max(0, Math.min(j10, this.zzc));
        double d11 = (((double) max) * 100.0d) / ((double) this.zzc);
        double d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.zzf;
                zzdx.zzb(jArr);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        long j11 = this.zzd;
        zzacn zzacn2 = new zzacn(max, this.zza + Math.max((long) this.zzb, Math.min(Math.round((d12 / 256.0d) * ((double) j11)), j11 - 1)));
        return new zzack(zzacn2, zzacn2);
    }

    public final boolean zzh() {
        return this.zzf != null;
    }
}
