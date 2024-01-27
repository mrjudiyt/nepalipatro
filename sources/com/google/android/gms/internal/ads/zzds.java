package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzds {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzds(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = ((float) i10) / ((float) i12);
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = this.zzb * i10;
                i17 += Math.abs(sArr[i19 + i18] - sArr[(i19 + i11) + i18]);
            }
            int i20 = i17 * i15;
            int i21 = i13 * i11;
            if (i20 < i21) {
                i13 = i17;
            }
            if (i20 < i21) {
                i15 = i11;
            }
            int i22 = i17 * i14;
            int i23 = i16 * i11;
            if (i22 > i23) {
                i16 = i17;
            }
            if (i22 > i23) {
                i14 = i11;
            }
            i11++;
        }
        this.zzu = i13 / i15;
        this.zzv = i16 / i14;
        return i15;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] zzl2 = zzl(this.zzl, this.zzm, i11);
        this.zzl = zzl2;
        int i12 = this.zzm;
        int i13 = this.zzb;
        System.arraycopy(sArr, i10 * i13, zzl2, i12 * i13, i11 * i13);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.zzh / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.zzb;
                i12 = i16 * i11;
                if (i14 >= i12) {
                    break;
                }
                i15 += sArr[(i16 * i10) + (i12 * i13) + i14];
                i14++;
            }
            this.zzi[i13] = (short) (i15 / i12);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzk() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10 = this.zzc / this.zzd;
        double d10 = (double) f10;
        int i18 = (d10 > 1.00001d ? 1 : (d10 == 1.00001d ? 0 : -1));
        int i19 = this.zzm;
        if (i18 > 0 || d10 < 0.99999d) {
            int i20 = this.zzk;
            if (i20 >= this.zzh) {
                int i21 = 0;
                do {
                    int i22 = this.zzr;
                    if (i22 > 0) {
                        int min = Math.min(this.zzh, i22);
                        zzh(this.zzj, i21, min);
                        this.zzr -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i23 = this.zza;
                        int i24 = i23 > 4000 ? i23 / 4000 : 1;
                        if (this.zzb == 1 && i24 == 1) {
                            i14 = zzg(sArr, i21, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i21, i24);
                            int zzg2 = zzg(this.zzi, 0, this.zzf / i24, this.zzg / i24);
                            if (i24 != 1) {
                                int i25 = zzg2 * i24;
                                int i26 = i24 * 4;
                                int i27 = this.zzf;
                                int i28 = i25 - i26;
                                if (i28 >= i27) {
                                    i27 = i28;
                                }
                                int i29 = i25 + i26;
                                int i30 = this.zzg;
                                if (i29 > i30) {
                                    i29 = i30;
                                }
                                if (this.zzb == 1) {
                                    i14 = zzg(sArr, i21, i27, i29);
                                } else {
                                    zzi(sArr, i21, 1);
                                    i14 = zzg(this.zzi, 0, i27, i29);
                                }
                            } else {
                                i14 = zzg2;
                            }
                        }
                        int i31 = this.zzu;
                        int i32 = (i31 == 0 || (i17 = this.zzs) == 0 || this.zzv > i31 * 3 || i31 + i31 <= this.zzt * 3) ? i14 : i17;
                        int i33 = i21 + i32;
                        this.zzt = i31;
                        this.zzs = i14;
                        float f11 = (float) i32;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f12 = -1.0f + f10;
                            if (f10 >= 2.0f) {
                                i16 = (int) (f11 / f12);
                            } else {
                                this.zzr = (int) ((f11 * (2.0f - f10)) / f12);
                                i16 = i32;
                            }
                            short[] zzl2 = zzl(this.zzl, this.zzm, i16);
                            this.zzl = zzl2;
                            int i34 = i16;
                            zzj(i16, this.zzb, zzl2, this.zzm, sArr2, i21, sArr2, i33);
                            this.zzm += i34;
                            i21 += i32 + i34;
                        } else {
                            int i35 = i32;
                            short[] sArr3 = this.zzj;
                            float f13 = 1.0f - f10;
                            if (f10 < 0.5f) {
                                i15 = (int) ((f11 * f10) / f13);
                            } else {
                                this.zzr = (int) ((f11 * ((f10 + f10) - 4.0f)) / f13);
                                i15 = i35;
                            }
                            int i36 = i35 + i15;
                            short[] zzl3 = zzl(this.zzl, this.zzm, i36);
                            this.zzl = zzl3;
                            int i37 = this.zzb;
                            System.arraycopy(sArr3, i21 * i37, zzl3, this.zzm * i37, i37 * i35);
                            zzj(i15, this.zzb, this.zzl, this.zzm + i35, sArr3, i33, sArr3, i21);
                            this.zzm += i36;
                            i21 += i15;
                        }
                    }
                } while (this.zzh + i21 <= i20);
                int i38 = this.zzk - i21;
                short[] sArr4 = this.zzj;
                int i39 = this.zzb;
                System.arraycopy(sArr4, i21 * i39, sArr4, 0, i39 * i38);
                this.zzk = i38;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f14 = this.zze * this.zzd;
        if (f14 != 1.0f && this.zzm != i19) {
            int i40 = this.zza;
            int i41 = (int) (((float) i40) / f14);
            while (true) {
                if (i41 <= 16384 && i40 <= 16384) {
                    break;
                }
                i41 /= 2;
                i40 /= 2;
            }
            int i42 = this.zzm - i19;
            short[] zzl4 = zzl(this.zzn, this.zzo, i42);
            this.zzn = zzl4;
            short[] sArr5 = this.zzl;
            int i43 = this.zzb;
            System.arraycopy(sArr5, i19 * i43, zzl4, this.zzo * i43, i43 * i42);
            this.zzm = i19;
            this.zzo += i42;
            int i44 = 0;
            while (true) {
                i10 = this.zzo;
                i11 = i10 - 1;
                if (i44 >= i11) {
                    break;
                }
                while (true) {
                    i12 = this.zzp + 1;
                    int i45 = i12 * i41;
                    i13 = this.zzq;
                    if (i45 <= i13 * i40) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i46 = 0;
                    while (true) {
                        int i47 = this.zzb;
                        if (i46 >= i47) {
                            break;
                        }
                        short[] sArr6 = this.zzl;
                        int i48 = this.zzm * i47;
                        short[] sArr7 = this.zzn;
                        int i49 = (i44 * i47) + i46;
                        short s10 = sArr7[i49];
                        short s11 = sArr7[i49 + i47];
                        int i50 = this.zzp;
                        int i51 = i50 * i41;
                        int i52 = (i50 + 1) * i41;
                        int i53 = i52 - (this.zzq * i40);
                        int i54 = i52 - i51;
                        sArr6[i48 + i46] = (short) (((s10 * i53) + ((i54 - i53) * s11)) / i54);
                        i46++;
                    }
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i12;
                if (i12 == i40) {
                    this.zzp = 0;
                    zzdx.zzf(i13 == i41);
                    this.zzq = 0;
                }
                i44++;
            }
            if (i11 != 0) {
                short[] sArr8 = this.zzn;
                int i55 = this.zzb;
                System.arraycopy(sArr8, i11 * i55, sArr8, 0, (i10 - i11) * i55);
                this.zzo -= i11;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i10 = this.zzm - min;
        this.zzm = i10;
        int i11 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        int i12 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zze;
        float f12 = this.zzd;
        int i13 = i12 + ((int) ((((((float) i11) / (f10 / f12)) + ((float) this.zzo)) / (f11 * f12)) + 0.5f));
        int i14 = this.zzh;
        this.zzj = zzl(this.zzj, i11, i14 + i14 + i11);
        int i15 = 0;
        while (true) {
            int i16 = this.zzh;
            int i17 = this.zzb;
            i10 = i16 + i16;
            if (i15 >= i10 * i17) {
                break;
            }
            this.zzj[(i17 * i11) + i15] = 0;
            i15++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i13) {
            this.zzm = i13;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] zzl2 = zzl(this.zzj, this.zzk, i11);
        this.zzj = zzl2;
        shortBuffer.get(zzl2, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
