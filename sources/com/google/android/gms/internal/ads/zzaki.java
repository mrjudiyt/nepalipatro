package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaki {
    private final zzfi zza = new zzfi(0);
    private final zzfb zzb = new zzfb();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzaki(int i10) {
    }

    private final int zze(zzabn zzabn) {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzabn.zzj();
        return 0;
    }

    public final int zza(zzabn zzabn, zzacj zzacj, int i10) {
        if (i10 <= 0) {
            zze(zzabn);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzabn.zzd();
            int min = (int) Math.min(112800, zzd2);
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
            int zzd3 = zzfb.zzd();
            int i11 = zzd3 - 188;
            while (true) {
                if (i11 < zzc2) {
                    break;
                }
                byte[] zzI = zzfb.zzI();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * 188) + i11;
                    if (i14 < zzc2 || i14 >= zzd3 || zzI[i14] != 71) {
                        i13 = 0;
                    } else {
                        i13++;
                        if (i13 == 5) {
                            long zzb2 = zzaks.zzb(zzfb, i11, i10);
                            if (zzb2 != -9223372036854775807L) {
                                j10 = zzb2;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                i11--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzabn);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800, zzabn.zzd());
            if (zzabn.zzf() != 0) {
                zzacj.zza = 0;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabn.zzj();
            ((zzabc) zzabn).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfb2 = this.zzb;
            int zzc3 = zzfb2.zzc();
            int zzd4 = zzfb2.zzd();
            while (true) {
                if (zzc3 >= zzd4) {
                    break;
                }
                if (zzfb2.zzI()[zzc3] == 71) {
                    long zzb3 = zzaks.zzb(zzfb2, zzc3, i10);
                    if (zzb3 != -9223372036854775807L) {
                        j10 = zzb3;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzabn);
                return 0;
            }
            zzfi zzfi = this.zza;
            long zzb4 = zzfi.zzb(this.zzg) - zzfi.zzb(j12);
            this.zzh = zzb4;
            if (zzb4 < 0) {
                zzer.zzf("TsDurationReader", "Invalid duration: " + zzb4 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzabn);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
