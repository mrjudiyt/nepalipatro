package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabv {
    public static int zza(zzfb zzfb, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzfb.zzl() + 1;
            case 7:
                return zzfb.zzp() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzabn zzabn, zzabz zzabz) {
        zzabn.zzj();
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzl(1, false);
        byte[] bArr = new byte[1];
        zzabc.zzm(bArr, 0, 1, false);
        byte b10 = bArr[0] & 1;
        boolean z10 = 1 == b10;
        zzabc.zzl(2, false);
        int i10 = 1 != b10 ? 6 : 7;
        zzfb zzfb = new zzfb(i10);
        zzfb.zzF(zzabq.zza(zzabn, zzfb.zzI(), 0, i10));
        zzabn.zzj();
        zzabu zzabu = new zzabu();
        if (zzd(zzfb, zzabz, z10, zzabu)) {
            return zzabu.zza;
        }
        throw zzcc.zza((String) null, (Throwable) null);
    }

    public static boolean zzc(zzfb zzfb, zzabz zzabz, int i10, zzabu zzabu) {
        int zza;
        zzfb zzfb2 = zzfb;
        zzabz zzabz2 = zzabz;
        int zzc = zzfb.zzc();
        long zzt = zzfb.zzt();
        long j10 = zzt >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = zzt >> 12;
        long j12 = zzt >> 8;
        long j13 = zzt >> 4;
        long j14 = zzt >> 1;
        long j15 = zzt & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzabz2.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzabz2.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzabz2.zzi) || j15 == 1 || !zzd(zzfb2, zzabz2, z10, zzabu) || (zza = zza(zzfb2, (int) (j11 & 15))) == -1 || zza > zzabz2.zzb) {
            return false;
        }
        int i13 = zzabz2.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzabz2.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzfb.zzl() * 1000 != i13) {
                    return false;
                }
            } else if (i14 > 14) {
                return false;
            } else {
                int zzp = zzfb.zzp();
                if (i14 == 14) {
                    zzp *= 10;
                }
                if (zzp != i13) {
                    return false;
                }
            }
        }
        return zzfb.zzl() == zzfk.zze(zzfb.zzI(), zzc, zzfb.zzc() + -1, 0);
    }

    private static boolean zzd(zzfb zzfb, zzabz zzabz, boolean z10, zzabu zzabu) {
        try {
            long zzv = zzfb.zzv();
            if (!z10) {
                zzv *= (long) zzabz.zzb;
            }
            zzabu.zza = zzv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
