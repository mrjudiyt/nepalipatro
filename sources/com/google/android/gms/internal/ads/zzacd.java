package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzacd {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzacd(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = f10;
        this.zzg = str;
    }

    public static zzacd zza(zzfb zzfb) {
        int i10;
        int i11;
        int i12;
        zzfb zzfb2 = zzfb;
        try {
            zzfb2.zzH(21);
            int zzl = zzfb.zzl() & 3;
            int zzl2 = zzfb.zzl();
            int zzc2 = zzfb.zzc();
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < zzl2; i15++) {
                zzfb2.zzH(1);
                int zzp = zzfb.zzp();
                for (int i16 = 0; i16 < zzp; i16++) {
                    int zzp2 = zzfb.zzp();
                    i14 += zzp2 + 4;
                    zzfb2.zzH(zzp2);
                }
            }
            zzfb2.zzG(zzc2);
            byte[] bArr = new byte[i14];
            String str = null;
            int i17 = 0;
            int i18 = 0;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f10 = 1.0f;
            while (i17 < zzl2) {
                int zzl3 = zzfb.zzl() & 63;
                int zzp3 = zzfb.zzp();
                int i24 = 0;
                while (i24 < zzp3) {
                    int zzp4 = zzfb.zzp();
                    int i25 = zzl2;
                    System.arraycopy(zzfy.zza, i13, bArr, i18, 4);
                    int i26 = i18 + 4;
                    System.arraycopy(zzfb.zzI(), zzfb.zzc(), bArr, i26, zzp4);
                    int i27 = i26 + zzp4;
                    if (zzl3 == 33 && i24 == 0) {
                        zzfv zzc3 = zzfy.zzc(bArr, i26 + 2, i27);
                        i19 = zzc3.zzg;
                        i20 = zzc3.zzh;
                        i21 = zzc3.zzj;
                        int i28 = zzc3.zzk;
                        int i29 = zzc3.zzl;
                        i12 = i27;
                        i11 = zzl3;
                        i10 = zzp3;
                        str = zzdz.zzb(zzc3.zza, zzc3.zzb, zzc3.zzc, zzc3.zzd, zzc3.zze, zzc3.zzf);
                        f10 = zzc3.zzi;
                        i22 = i28;
                        i23 = i29;
                        i24 = 0;
                    } else {
                        i12 = i27;
                        i11 = zzl3;
                        i10 = zzp3;
                    }
                    zzfb2.zzH(zzp4);
                    i24++;
                    zzl2 = i25;
                    i18 = i12;
                    zzl3 = i11;
                    zzp3 = i10;
                    i13 = 0;
                }
                int i30 = zzl2;
                i17++;
                i13 = 0;
            }
            return new zzacd(i14 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzl + 1, i19, i20, i21, i22, i23, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcc.zza("Error parsing HEVC config", e10);
        }
    }
}
