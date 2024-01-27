package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaja implements zzaje {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfa zzc = new zzfa(new byte[7], 7);
    private final zzfb zzd = new zzfb(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzacs zzg;
    private zzacs zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzacs zzu;
    private long zzv;

    public zzaja(boolean z10, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzacs zzacs, long j10, int i10, int i11) {
        this.zzi = 4;
        this.zzj = i10;
        this.zzu = zzacs;
        this.zzv = j10;
        this.zzs = i11;
    }

    private final boolean zzk(zzfb zzfb, byte[] bArr, int i10) {
        int min = Math.min(zzfb.zza(), i10 - this.zzj);
        zzfb.zzC(bArr, this.zzj, min);
        int i11 = this.zzj + min;
        this.zzj = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzfb zzfb, byte[] bArr, int i10) {
        if (zzfb.zza() < i10) {
            return false;
        }
        zzfb.zzC(bArr, 0, i10);
        return true;
    }

    public final void zza(zzfb zzfb) {
        int i10;
        byte b10;
        int i11;
        zzfb zzfb2 = zzfb;
        Objects.requireNonNull(this.zzg);
        int i12 = zzfk.zza;
        while (zzfb.zza() > 0) {
            int i13 = this.zzi;
            int i14 = 13;
            int i15 = 2;
            if (i13 == 0) {
                byte[] zzI = zzfb.zzI();
                int zzc2 = zzfb.zzc();
                int zzd2 = zzfb.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzfb2.zzG(zzc2);
                        break;
                    }
                    i10 = zzc2 + 1;
                    b10 = zzI[zzc2] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) b10)) {
                        if (this.zzm) {
                            break;
                        }
                        int i16 = i10 - 2;
                        zzfb2.zzG(i16 + 1);
                        if (zzm(zzfb2, this.zzc.zza, 1)) {
                            this.zzc.zzj(4);
                            int zzd3 = this.zzc.zzd(1);
                            int i17 = this.zzn;
                            if (i17 == -1 || zzd3 == i17) {
                                if (this.zzo != -1) {
                                    if (!zzm(zzfb2, this.zzc.zza, 1)) {
                                        break;
                                    }
                                    this.zzc.zzj(i15);
                                    if (this.zzc.zzd(4) == this.zzo) {
                                        zzfb2.zzG(i16 + 2);
                                    }
                                }
                                if (!zzm(zzfb2, this.zzc.zza, 4)) {
                                    break;
                                }
                                this.zzc.zzj(14);
                                int zzd4 = this.zzc.zzd(i14);
                                if (zzd4 >= 7) {
                                    byte[] zzI2 = zzfb.zzI();
                                    int zzd5 = zzfb.zzd();
                                    int i18 = i16 + zzd4;
                                    if (i18 < zzd5) {
                                        byte b11 = zzI2[i18];
                                        if (b11 != -1) {
                                            if (b11 == 73) {
                                                int i19 = i18 + 1;
                                                if (i19 != zzd5) {
                                                    if (zzI2[i19] == 68) {
                                                        int i20 = i18 + 2;
                                                        if (i20 != zzd5) {
                                                            if (zzI2[i20] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            int i21 = i18 + 1;
                                            if (i21 == zzd5) {
                                                break;
                                            }
                                            byte b12 = zzI2[i21];
                                            if (zzl((byte) -1, b12) && ((b12 & 8) >> 3) == zzd3) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i22 = this.zzk;
                    byte b13 = i22 | b10;
                    if (b13 == 329) {
                        i11 = 768;
                    } else if (b13 == 511) {
                        i11 = 512;
                    } else if (b13 != 836) {
                        if (b13 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzG(0);
                            zzfb2.zzG(i10);
                            break;
                        } else if (i22 != 256) {
                            this.zzk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            zzc2 = i10 - 1;
                            i14 = 13;
                            i15 = 2;
                        } else {
                            zzc2 = i10;
                            i14 = 13;
                            i15 = 2;
                        }
                    } else {
                        i11 = 1024;
                    }
                    this.zzk = i11;
                    zzc2 = i10;
                    i14 = 13;
                    i15 = 2;
                }
                this.zzp = (b10 & 8) >> 3;
                this.zzl = 1 == ((b10 & 1) ^ 1);
                if (!this.zzm) {
                    this.zzi = 1;
                    this.zzj = 0;
                } else {
                    zzi();
                }
                zzfb2.zzG(i10);
            } else if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        int min = Math.min(zzfb.zza(), this.zzs - this.zzj);
                        this.zzu.zzr(zzfb2, min);
                        int i23 = this.zzj + min;
                        this.zzj = i23;
                        int i24 = this.zzs;
                        if (i23 == i24) {
                            long j10 = this.zzt;
                            if (j10 != -9223372036854775807L) {
                                this.zzu.zzt(j10, 1, i24, 0, (zzacr) null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzfb2, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (!this.zzq) {
                                int zzd6 = this.zzc.zzd(2) + 1;
                                if (zzd6 != 2) {
                                    zzer.zzf("AdtsReader", "Detected audio object type: " + zzd6 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int zzd7 = this.zzc.zzd(3);
                                int i25 = this.zzo;
                                int i26 = zzaak.zza;
                                byte[] bArr = {(byte) (((i25 >> 1) & 7) | 16), (byte) (((zzd7 << 3) & 120) | ((i25 << 7) & 128))};
                                zzaaj zza2 = zzaak.zza(bArr);
                                zzak zzak = new zzak();
                                zzak.zzJ(this.zzf);
                                zzak.zzU("audio/mp4a-latm");
                                zzak.zzz(zza2.zzc);
                                zzak.zzy(zza2.zzb);
                                zzak.zzV(zza2.zza);
                                zzak.zzK(Collections.singletonList(bArr));
                                zzak.zzM(this.zze);
                                zzam zzac = zzak.zzac();
                                this.zzr = 1024000000 / ((long) zzac.zzA);
                                this.zzg.zzl(zzac);
                                this.zzq = true;
                            } else {
                                this.zzc.zzl(10);
                            }
                            this.zzc.zzl(4);
                            int zzd8 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd8 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzd8);
                        }
                    }
                } else if (zzk(zzfb2, this.zzd.zzI(), 10)) {
                    this.zzh.zzr(this.zzd, 10);
                    this.zzd.zzG(6);
                    zzj(this.zzh, 0, 10, 10 + this.zzd.zzk());
                }
            } else if (zzfb.zza() != 0) {
                zzfa zzfa = this.zzc;
                zzfa.zza[0] = zzfb.zzI()[zzfb.zzc()];
                zzfa.zzj(2);
                int zzd9 = this.zzc.zzd(4);
                int i27 = this.zzo;
                if (i27 == -1 || zzd9 == i27) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd9;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        zzakq.zzc();
        this.zzf = zzakq.zzb();
        zzacs zzw = zzabp.zzw(zzakq.zza(), 1);
        this.zzg = zzw;
        this.zzu = zzw;
        if (this.zzb) {
            zzakq.zzc();
            zzacs zzw2 = zzabp.zzw(zzakq.zza(), 5);
            this.zzh = zzw2;
            zzak zzak = new zzak();
            zzak.zzJ(zzakq.zzb());
            zzak.zzU("application/id3");
            zzw2.zzl(zzak.zzac());
            return;
        }
        this.zzh = new zzabl();
    }

    public final void zzc(boolean z10) {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzt = j10;
        }
    }

    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
