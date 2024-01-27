package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzajz {
    private final zzfi zza = new zzfi(0);
    private final zzfb zzb = new zzfb();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzajz() {
    }

    public static long zzc(zzfb zzfb) {
        zzfb zzfb2 = zzfb;
        int zzc2 = zzfb.zzc();
        if (zzfb.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfb2.zzC(bArr, 0, 9);
        zzfb2.zzG(zzc2);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = (long) b10;
                    long j11 = (long) bArr[1];
                    long j12 = (long) b11;
                    long j13 = (j12 & 3) << 13;
                    return j13 | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((j11 & 255) << 20) | (((j12 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzabn zzabn) {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzabn.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzabn zzabn, zzacj zzacj) {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzabn.zzd();
            int min = (int) Math.min(20000, zzd2);
            long j11 = zzd2 - ((long) min);
            if (zzabn.zzf() != j11) {
                zzacj.zza = j11;
                return 1;
            }
            this.zzb.zzD(min);
            zzabn.zzj();
            ((zzabc) zzabn).zzm(this.zzb.zzI(), 0, min, false);
            zzfb zzfb = this.zzb;
            int zzc2 = zzfb.zzc();
            int zzd3 = zzfb.zzd() - 4;
            while (true) {
                if (zzd3 < zzc2) {
                    break;
                }
                if (zzg(zzfb.zzI(), zzd3) == 442) {
                    zzfb.zzG(zzd3 + 4);
                    long zzc3 = zzc(zzfb);
                    if (zzc3 != -9223372036854775807L) {
                        j10 = zzc3;
                        break;
                    }
                }
                zzd3--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzabn);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000, zzabn.zzd());
            if (zzabn.zzf() != 0) {
                zzacj.zza = 0;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabn.zzj();
            ((zzabc) zzabn).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfb2 = this.zzb;
            int zzc4 = zzfb2.zzc();
            int zzd4 = zzfb2.zzd();
            while (true) {
                if (zzc4 >= zzd4 - 3) {
                    break;
                }
                if (zzg(zzfb2.zzI(), zzc4) == 442) {
                    zzfb2.zzG(zzc4 + 4);
                    long zzc5 = zzc(zzfb2);
                    if (zzc5 != -9223372036854775807L) {
                        j10 = zzc5;
                        break;
                    }
                }
                zzc4++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzabn);
                return 0;
            }
            zzfi zzfi = this.zza;
            long zzb2 = zzfi.zzb(this.zzg) - zzfi.zzb(j12);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                zzer.zzf("PsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzabn);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
