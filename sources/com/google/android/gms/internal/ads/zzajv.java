package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajv implements zzakr {
    private final zzaje zza;
    private final zzfa zzb = new zzfa(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzajv(zzaje zzaje) {
        this.zza = zzaje;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzfb zzfb, byte[] bArr, int i10) {
        int min = Math.min(zzfb.zza(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfb.zzH(min);
        } else {
            zzfb.zzC(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void zza(zzfb zzfb, int i10) {
        int i11;
        long j10;
        int i12;
        zzfb zzfb2 = zzfb;
        zzdx.zzb(this.zze);
        int i13 = -1;
        int i14 = 2;
        boolean z10 = false;
        int i15 = 1;
        if ((i10 & 1) != 0) {
            int i16 = this.zzc;
            if (!(i16 == 0 || i16 == 1)) {
                if (i16 != 2) {
                    int i17 = this.zzj;
                    if (i17 != -1) {
                        zzer.zzf("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.zza.zzc(zzfb.zzd() == 0);
                } else {
                    zzer.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i18 = i10;
        while (zzfb.zza() > 0) {
            int i19 = this.zzc;
            if (i19 == 0) {
                zzfb2.zzH(zzfb.zza());
            } else if (i19 != i15) {
                if (i19 != i14) {
                    int zza2 = zzfb.zza();
                    int i20 = this.zzj;
                    int i21 = i20 == i13 ? 0 : zza2 - i20;
                    if (i21 > 0) {
                        zza2 -= i21;
                        zzfb2.zzF(zzfb.zzc() + zza2);
                    }
                    this.zza.zza(zzfb2);
                    int i22 = this.zzj;
                    if (i22 != i13) {
                        int i23 = i22 - zza2;
                        this.zzj = i23;
                        if (i23 == 0) {
                            this.zza.zzc(z10);
                            zzd(i15);
                        }
                    }
                } else {
                    if (zze(zzfb2, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfb2, (byte[]) null, this.zzi)) {
                        this.zzb.zzj(z10 ? 1 : 0);
                        if (this.zzf) {
                            this.zzb.zzl(4);
                            long zzd2 = (long) this.zzb.zzd(3);
                            this.zzb.zzl(i15);
                            int zzd3 = this.zzb.zzd(15) << 15;
                            this.zzb.zzl(i15);
                            long zzd4 = (long) this.zzb.zzd(15);
                            this.zzb.zzl(i15);
                            if (this.zzh || !this.zzg) {
                                i12 = zzd3;
                            } else {
                                this.zzb.zzl(4);
                                this.zzb.zzl(i15);
                                this.zzb.zzl(i15);
                                long zzd5 = (long) this.zzb.zzd(15);
                                this.zzb.zzl(i15);
                                i12 = zzd3;
                                this.zze.zzb((((long) this.zzb.zzd(3)) << 30) | ((long) (this.zzb.zzd(15) << 15)) | zzd5);
                                this.zzh = true;
                            }
                            j10 = this.zze.zzb((zzd2 << 30) | ((long) i12) | zzd4);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        i18 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j10, i18);
                        zzd(3);
                        i13 = -1;
                    }
                }
            } else if (zze(zzfb2, this.zzb.zza, 9)) {
                this.zzb.zzj(0);
                int zzd6 = this.zzb.zzd(24);
                if (zzd6 != 1) {
                    zzer.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i13 = -1;
                    this.zzj = -1;
                    i11 = 0;
                } else {
                    this.zzb.zzl(8);
                    zzfa zzfa = this.zzb;
                    int zzd7 = zzfa.zzd(16);
                    zzfa.zzl(5);
                    this.zzk = this.zzb.zzn();
                    this.zzb.zzl(2);
                    this.zzf = this.zzb.zzn();
                    this.zzg = this.zzb.zzn();
                    this.zzb.zzl(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                    } else {
                        int i24 = (zzd7 - 3) - zzd8;
                        this.zzj = i24;
                        if (i24 < 0) {
                            zzer.zzf("PesReader", "Found negative packet payload size: " + i24);
                            i13 = -1;
                            this.zzj = -1;
                            i11 = 2;
                        }
                    }
                    i13 = -1;
                    i11 = 2;
                }
                zzd(i11);
            } else {
                i13 = -1;
            }
            i14 = 2;
            z10 = false;
            i15 = 1;
        }
    }

    public final void zzb(zzfi zzfi, zzabp zzabp, zzakq zzakq) {
        this.zze = zzfi;
        this.zza.zzb(zzabp, zzakq);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
