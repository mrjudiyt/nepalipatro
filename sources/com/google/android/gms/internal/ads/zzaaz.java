package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaaz {
    public static void zza(long j10, zzfb zzfb, zzacs[] zzacsArr) {
        int i10;
        while (true) {
            boolean z10 = true;
            if (zzfb.zza() > 1) {
                int zzc = zzc(zzfb);
                int zzc2 = zzc(zzfb);
                int zzc3 = zzfb.zzc() + zzc2;
                if (zzc2 == -1 || zzc2 > zzfb.zza()) {
                    zzer.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzfb.zzd();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzl = zzfb.zzl();
                    int zzp = zzfb.zzp();
                    if (zzp == 49) {
                        i10 = zzfb.zzf();
                        zzp = 49;
                    } else {
                        i10 = 0;
                    }
                    int zzl2 = zzfb.zzl();
                    if (zzp == 47) {
                        zzfb.zzH(1);
                        zzp = 47;
                    }
                    boolean z11 = zzl == 181 && (zzp == 49 || zzp == 47) && zzl2 == 3;
                    if (zzp == 49) {
                        if (i10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        zzb(j10, zzfb, zzacsArr);
                    }
                }
                zzfb.zzG(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j10, zzfb zzfb, zzacs[] zzacsArr) {
        int zzl = zzfb.zzl();
        if ((zzl & 64) != 0) {
            int i10 = zzl & 31;
            zzfb.zzH(1);
            int zzc = zzfb.zzc();
            for (zzacs zzacs : zzacsArr) {
                int i11 = i10 * 3;
                zzfb.zzG(zzc);
                zzacs.zzr(zzfb, i11);
                if (j10 != -9223372036854775807L) {
                    zzacs.zzt(j10, 1, i11, 0, (zzacr) null);
                }
            }
        }
    }

    private static int zzc(zzfb zzfb) {
        int i10 = 0;
        while (zzfb.zza() != 0) {
            int zzl = zzfb.zzl();
            i10 += zzl;
            if (zzl != 255) {
                return i10;
            }
        }
        return -1;
    }
}
