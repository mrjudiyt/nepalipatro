package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaar {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaar(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = f10;
        this.zzi = str;
    }

    public static zzaar zza(zzfb zzfb) {
        String str;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            zzfb.zzH(4);
            int zzl = (zzfb.zzl() & 3) + 1;
            if (zzl != 3) {
                ArrayList arrayList = new ArrayList();
                int zzl2 = zzfb.zzl() & 31;
                for (int i15 = 0; i15 < zzl2; i15++) {
                    arrayList.add(zzb(zzfb));
                }
                int zzl3 = zzfb.zzl();
                for (int i16 = 0; i16 < zzl3; i16++) {
                    arrayList.add(zzb(zzfb));
                }
                if (zzl2 > 0) {
                    zzfx zze2 = zzfy.zze((byte[]) arrayList.get(0), zzl + 1, ((byte[]) arrayList.get(0)).length);
                    int i17 = zze2.zze;
                    int i18 = zze2.zzf;
                    int i19 = zze2.zzh;
                    int i20 = zze2.zzi;
                    int i21 = zze2.zzj;
                    float f11 = zze2.zzg;
                    str = zzdz.zza(zze2.zza, zze2.zzb, zze2.zzc);
                    i11 = i20;
                    i10 = i21;
                    f10 = f11;
                    i14 = i17;
                    i13 = i18;
                    i12 = i19;
                } else {
                    str = null;
                    i14 = -1;
                    i13 = -1;
                    i12 = -1;
                    i11 = -1;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new zzaar(arrayList, zzl, i14, i13, i12, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcc.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzfb zzfb) {
        int zzp = zzfb.zzp();
        int zzc2 = zzfb.zzc();
        zzfb.zzH(zzp);
        return zzdz.zzc(zzfb.zzI(), zzc2, zzp);
    }
}
