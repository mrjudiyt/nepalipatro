package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzwo implements zzxd {
    public final /* synthetic */ zzww zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzwo(zzww zzww, String str) {
        this.zza = zzww;
        this.zzb = str;
    }

    public final List zza(int i10, zzcx zzcx, int[] iArr) {
        int i11 = zzxi.zzb;
        zzfvp zzfvp = new zzfvp();
        int i12 = 0;
        while (true) {
            int i13 = zzcx.zzb;
            if (i12 > 0) {
                return zzfvp.zzi();
            }
            int i14 = i10;
            zzcx zzcx2 = zzcx;
            int i15 = i12;
            zzfvp.zzf(new zzxc(i14, zzcx2, i15, this.zza, iArr[i12], this.zzb));
            i12++;
        }
    }
}
