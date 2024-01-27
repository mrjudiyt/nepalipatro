package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze = 0;

    /* synthetic */ zzbh(zzbf zzbf, zzbg zzbg) {
        int size = zzbf.zzb.size();
        this.zza = (String[]) zzbf.zza.toArray(new String[size]);
        this.zzb = zzc(zzbf.zzb);
        this.zzc = zzc(zzbf.zzc);
        this.zzd = new int[size];
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        zzbh zzbh = this;
        ArrayList arrayList = new ArrayList(zzbh.zza.length);
        int i10 = 0;
        while (true) {
            String[] strArr = zzbh.zza;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = zzbh.zzc;
            double[] dArr2 = zzbh.zzb;
            int[] iArr = zzbh.zzd;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new zzbe(str, d10, d11, ((double) i11) / ((double) zzbh.zze), i11));
            i10++;
            zzbh = this;
        }
    }

    public final void zzb(double d10) {
        this.zze++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i10 < dArr.length) {
                double d11 = dArr[i10];
                if (d11 <= d10 && d10 < this.zzb[i10]) {
                    int[] iArr = this.zzd;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (d10 >= d11) {
                    i10++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
