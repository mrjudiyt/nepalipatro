package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaan {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return zzb[i10] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & 63);
    }

    public static zzam zzc(zzfb zzfb, String str, String str2, zzad zzad) {
        zzfa zzfa = new zzfa();
        zzfa.zzh(zzfb);
        int i10 = zzc[zzfa.zzd(2)];
        zzfa.zzl(8);
        int i11 = zze[zzfa.zzd(3)];
        if (zzfa.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzfa.zzd(5)] * 1000;
        zzfa.zze();
        zzfb.zzG(zzfa.zzb());
        zzak zzak = new zzak();
        zzak.zzJ(str);
        zzak.zzU("audio/ac3");
        zzak.zzy(i11);
        zzak.zzV(i10);
        zzak.zzD(zzad);
        zzak.zzM(str2);
        zzak.zzx(i12);
        zzak.zzQ(i12);
        return zzak.zzac();
    }

    public static zzam zzd(zzfb zzfb, String str, String str2, zzad zzad) {
        String str3;
        zzfa zzfa = new zzfa();
        zzfa.zzh(zzfb);
        int zzd2 = zzfa.zzd(13) * 1000;
        zzfa.zzl(3);
        int i10 = zzc[zzfa.zzd(2)];
        zzfa.zzl(10);
        int i11 = zze[zzfa.zzd(3)];
        if (zzfa.zzd(1) != 0) {
            i11++;
        }
        zzfa.zzl(3);
        int zzd3 = zzfa.zzd(4);
        zzfa.zzl(1);
        if (zzd3 > 0) {
            zzfa.zzl(6);
            if (zzfa.zzd(1) != 0) {
                i11 += 2;
            }
            zzfa.zzl(1);
        }
        if (zzfa.zza() > 7) {
            zzfa.zzl(7);
            if (zzfa.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfa.zze();
                zzfb.zzG(zzfa.zzb());
                zzak zzak = new zzak();
                zzak.zzJ(str);
                zzak.zzU(str3);
                zzak.zzy(i11);
                zzak.zzV(i10);
                zzak.zzD(zzad);
                zzak.zzM(str2);
                zzak.zzQ(zzd2);
                return zzak.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfa.zze();
        zzfb.zzG(zzfa.zzb());
        zzak zzak2 = new zzak();
        zzak2.zzJ(str);
        zzak2.zzU(str3);
        zzak2.zzy(i11);
        zzak2.zzV(i10);
        zzak2.zzD(zzad);
        zzak2.zzM(str2);
        zzak2.zzQ(zzd2);
        return zzak2.zzac();
    }

    public static zzaam zze(zzfa zzfa) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzfa zzfa2 = zzfa;
        int zzc2 = zzfa.zzc();
        zzfa2.zzl(40);
        int zzd2 = zzfa2.zzd(5);
        zzfa2.zzj(zzc2);
        int i21 = -1;
        if (zzd2 > 10) {
            zzfa2.zzl(16);
            int zzd3 = zzfa2.zzd(2);
            if (zzd3 == 0) {
                i21 = 0;
            } else if (zzd3 == 1) {
                i21 = 1;
            } else if (zzd3 == 2) {
                i21 = 2;
            }
            zzfa2.zzl(3);
            int zzd4 = zzfa2.zzd(11) + 1;
            int zzd5 = zzfa2.zzd(2);
            if (zzd5 == 3) {
                i18 = zzd[zzfa2.zzd(2)];
                i17 = 3;
                i16 = 6;
            } else {
                int zzd6 = zzfa2.zzd(2);
                int i22 = zzb[zzd6];
                i17 = zzd6;
                i18 = zzc[zzd5];
                i16 = i22;
            }
            int i23 = zzd4 + zzd4;
            int i24 = (i23 * i18) / (i16 * 32);
            int zzd7 = zzfa2.zzd(3);
            boolean zzn = zzfa.zzn();
            int i25 = zze[zzd7] + (zzn ? 1 : 0);
            zzfa2.zzl(10);
            if (zzfa.zzn()) {
                zzfa2.zzl(8);
            }
            if (zzd7 == 0) {
                zzfa2.zzl(5);
                if (zzfa.zzn()) {
                    zzfa2.zzl(8);
                }
                i19 = 0;
                zzd7 = 0;
            } else {
                i19 = zzd7;
            }
            if (i21 == 1) {
                if (zzfa.zzn()) {
                    zzfa2.zzl(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzfa.zzn()) {
                if (i19 > 2) {
                    zzfa2.zzl(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzfa2.zzl(6);
                }
                if ((i19 & 4) != 0) {
                    zzfa2.zzl(6);
                }
                if (zzn && zzfa.zzn()) {
                    zzfa2.zzl(5);
                }
                if (i20 == 0) {
                    if (zzfa.zzn()) {
                        zzfa2.zzl(6);
                    }
                    if (i19 == 0 && zzfa.zzn()) {
                        zzfa2.zzl(6);
                    }
                    if (zzfa.zzn()) {
                        zzfa2.zzl(6);
                    }
                    int zzd8 = zzfa2.zzd(2);
                    if (zzd8 == 1) {
                        zzfa2.zzl(5);
                    } else if (zzd8 == 2) {
                        zzfa2.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfa2.zzd(5);
                        if (zzfa.zzn()) {
                            zzfa2.zzl(5);
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                zzfa2.zzl(4);
                            }
                            if (zzfa.zzn()) {
                                if (zzfa.zzn()) {
                                    zzfa2.zzl(4);
                                }
                                if (zzfa.zzn()) {
                                    zzfa2.zzl(4);
                                }
                            }
                        }
                        if (zzfa.zzn()) {
                            zzfa2.zzl(5);
                            if (zzfa.zzn()) {
                                zzfa2.zzl(7);
                                if (zzfa.zzn()) {
                                    zzfa2.zzl(8);
                                }
                            }
                        }
                        zzfa2.zzl((zzd9 + 2) * 8);
                        zzfa.zze();
                    }
                    if (i19 < 2) {
                        if (zzfa.zzn()) {
                            zzfa2.zzl(14);
                        }
                        if (zzd7 == 0 && zzfa.zzn()) {
                            zzfa2.zzl(14);
                        }
                    }
                    if (zzfa.zzn()) {
                        if (i17 == 0) {
                            zzfa2.zzl(5);
                            i20 = 0;
                            i17 = 0;
                        } else {
                            for (int i26 = 0; i26 < i16; i26++) {
                                if (zzfa.zzn()) {
                                    zzfa2.zzl(5);
                                }
                            }
                        }
                    }
                    i20 = 0;
                }
            }
            if (zzfa.zzn()) {
                zzfa2.zzl(5);
                if (i19 == 2) {
                    zzfa2.zzl(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzfa2.zzl(2);
                }
                if (zzfa.zzn()) {
                    zzfa2.zzl(8);
                }
                if (i19 == 0 && zzfa.zzn()) {
                    zzfa2.zzl(8);
                }
                if (zzd5 < 3) {
                    zzfa.zzk();
                }
            }
            if (i20 == 0 && i17 != 3) {
                zzfa.zzk();
            }
            if (i20 == 2 && (i17 == 3 || zzfa.zzn())) {
                zzfa2.zzl(6);
            }
            str = (zzfa.zzn() && zzfa2.zzd(6) == 1 && zzfa2.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i15 = i21;
            i12 = i23;
            i13 = i18;
            i11 = i16 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            i10 = i24;
            i14 = i25;
        } else {
            zzfa2.zzl(32);
            int zzd10 = zzfa2.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfa2.zzd(6);
            int i27 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfa2.zzl(8);
            int zzd12 = zzfa2.zzd(3);
            if (!((zzd12 & 1) == 0 || zzd12 == 1)) {
                zzfa2.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfa2.zzl(2);
            }
            if (zzd12 == 2) {
                zzfa2.zzl(2);
            }
            str = str2;
            i10 = i27;
            i12 = zzf2;
            i13 = zzd10 < 3 ? zzc[zzd10] : -1;
            i14 = zze[zzd12] + (zzfa.zzn() ? 1 : 0);
            i15 = -1;
            i11 = 1536;
        }
        return new zzaam(str, i15, i14, i13, i12, i11, i10, (zzaal) null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
