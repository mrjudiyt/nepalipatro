package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgse {
    static int zza(byte[] bArr, int i10, zzgsd zzgsd) {
        int zzh = zzh(bArr, i10, zzgsd);
        int i11 = zzgsd.zza;
        if (i11 < 0) {
            throw zzgul.zzf();
        } else if (i11 > bArr.length - zzh) {
            throw zzgul.zzj();
        } else if (i11 == 0) {
            zzgsd.zzc = zzgsr.zzb;
            return zzh;
        } else {
            zzgsd.zzc = zzgsr.zzv(bArr, zzh, i11);
            return zzh + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzgwc zzgwc, byte[] bArr, int i10, int i11, int i12, zzgsd zzgsd) {
        Object zze = zzgwc.zze();
        int zzl = zzl(zze, zzgwc, bArr, i10, i11, i12, zzgsd);
        zzgwc.zzf(zze);
        zzgsd.zzc = zze;
        return zzl;
    }

    static int zzd(zzgwc zzgwc, byte[] bArr, int i10, int i11, zzgsd zzgsd) {
        Object zze = zzgwc.zze();
        int zzm = zzm(zze, zzgwc, bArr, i10, i11, zzgsd);
        zzgwc.zzf(zze);
        zzgsd.zzc = zze;
        return zzm;
    }

    static int zze(zzgwc zzgwc, int i10, byte[] bArr, int i11, int i12, zzgui zzgui, zzgsd zzgsd) {
        int zzd = zzd(zzgwc, bArr, i11, i12, zzgsd);
        zzgui.add(zzgsd.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzgsd);
            if (i10 != zzgsd.zza) {
                break;
            }
            zzd = zzd(zzgwc, bArr, zzh, i12, zzgsd);
            zzgui.add(zzgsd.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzgui zzgui, zzgsd zzgsd) {
        zzgua zzgua = (zzgua) zzgui;
        int zzh = zzh(bArr, i10, zzgsd);
        int i11 = zzgsd.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzgsd);
            zzgua.zzh(zzgsd.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzgul.zzj();
    }

    static int zzg(int i10, byte[] bArr, int i11, int i12, zzgwu zzgwu, zzgsd zzgsd) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzk = zzk(bArr, i11, zzgsd);
                zzgwu.zzj(i10, Long.valueOf(zzgsd.zzb));
                return zzk;
            } else if (i13 == 1) {
                zzgwu.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzh = zzh(bArr, i11, zzgsd);
                int i14 = zzgsd.zza;
                if (i14 < 0) {
                    throw zzgul.zzf();
                } else if (i14 <= bArr.length - zzh) {
                    if (i14 == 0) {
                        zzgwu.zzj(i10, zzgsr.zzb);
                    } else {
                        zzgwu.zzj(i10, zzgsr.zzv(bArr, zzh, i14));
                    }
                    return zzh + i14;
                } else {
                    throw zzgul.zzj();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzgwu zzf = zzgwu.zzf();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i11, zzgsd);
                    int i17 = zzgsd.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzh2;
                        break;
                    }
                    int zzg = zzg(i16, bArr, zzh2, i12, zzf, zzgsd);
                    i16 = i17;
                    i11 = zzg;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzgul.zzg();
                }
                zzgwu.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zzgwu.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzgul.zzc();
            }
        } else {
            throw zzgul.zzc();
        }
    }

    static int zzh(byte[] bArr, int i10, zzgsd zzgsd) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzgsd);
        }
        zzgsd.zza = b10;
        return i11;
    }

    static int zzi(int i10, byte[] bArr, int i11, zzgsd zzgsd) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzgsd.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzgsd.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzgsd.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzgsd.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzgsd.zza = i20;
                return i21;
            }
        }
    }

    static int zzj(int i10, byte[] bArr, int i11, int i12, zzgui zzgui, zzgsd zzgsd) {
        zzgua zzgua = (zzgua) zzgui;
        int zzh = zzh(bArr, i11, zzgsd);
        zzgua.zzh(zzgsd.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzgsd);
            if (i10 != zzgsd.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgsd);
            zzgua.zzh(zzgsd.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i10, zzgsd zzgsd) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzgsd.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            byte b12 = b11;
            i12 = i14;
            b10 = b12;
        }
        zzgsd.zzb = j11;
        return i12;
    }

    static int zzl(Object obj, zzgwc zzgwc, byte[] bArr, int i10, int i11, int i12, zzgsd zzgsd) {
        int zzc = ((zzgvm) zzgwc).zzc(obj, bArr, i10, i11, i12, zzgsd);
        zzgsd.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzm(java.lang.Object r6, com.google.android.gms.internal.ads.zzgwc r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzgsd r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.ads.zzgul r6 = com.google.android.gms.internal.ads.zzgul.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgse.zzm(java.lang.Object, com.google.android.gms.internal.ads.zzgwc, byte[], int, int, com.google.android.gms.internal.ads.zzgsd):int");
    }

    static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
