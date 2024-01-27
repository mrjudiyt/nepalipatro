package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzagu implements zzagt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzagu(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzagu zzb(long j10, long j11, zzacg zzacg, zzfb zzfb) {
        int i10;
        long j12 = j10;
        zzacg zzacg2 = zzacg;
        zzfb zzfb2 = zzfb;
        zzfb2.zzH(10);
        int zzf = zzfb.zzf();
        if (zzf <= 0) {
            return null;
        }
        int i11 = zzacg2.zzd;
        long zzr = zzfk.zzr((long) zzf, ((long) (i11 >= 32000 ? 1152 : 576)) * 1000000, (long) i11);
        int zzp = zzfb.zzp();
        int zzp2 = zzfb.zzp();
        int zzp3 = zzfb.zzp();
        zzfb2.zzH(2);
        long j13 = j11 + ((long) zzacg2.zzc);
        long[] jArr = new long[zzp];
        long[] jArr2 = new long[zzp];
        int i12 = 0;
        long j14 = j11;
        while (i12 < zzp) {
            int i13 = zzp2;
            jArr[i12] = (((long) i12) * zzr) / ((long) zzp);
            long j15 = j13;
            jArr2[i12] = Math.max(j14, j15);
            if (zzp3 == 1) {
                i10 = zzfb.zzl();
            } else if (zzp3 == 2) {
                i10 = zzfb.zzp();
            } else if (zzp3 == 3) {
                i10 = zzfb.zzn();
            } else if (zzp3 != 4) {
                return null;
            } else {
                i10 = zzfb.zzo();
            }
            int i14 = i13;
            j14 += ((long) i10) * ((long) i14);
            i12++;
            zzfb zzfb3 = zzfb;
            j13 = j15;
            zzp2 = i14;
            zzp = zzp;
        }
        if (!(j12 == -1 || j12 == j14)) {
            zzer.zzf("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j14);
        }
        return new zzagu(jArr, jArr2, zzr, j14);
    }

    public final long zza() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd(long j10) {
        return this.zza[zzfk.zzc(this.zzb, j10, true, true)];
    }

    public final zzack zzg(long j10) {
        long[] jArr = this.zza;
        int zzc2 = zzfk.zzc(jArr, j10, true, true);
        zzacn zzacn = new zzacn(jArr[zzc2], this.zzb[zzc2]);
        if (zzacn.zzb < j10) {
            long[] jArr2 = this.zza;
            if (zzc2 != jArr2.length - 1) {
                int i10 = zzc2 + 1;
                return new zzack(zzacn, new zzacn(jArr2[i10], this.zzb[i10]));
            }
        }
        return new zzack(zzacn, zzacn);
    }

    public final boolean zzh() {
        return true;
    }
}
