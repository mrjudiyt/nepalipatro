package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzwk implements zzxd {
    public final /* synthetic */ zzxi zza;
    public final /* synthetic */ zzww zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzwk(zzxi zzxi, zzww zzww, boolean z10) {
        this.zza = zzxi;
        this.zzb = zzww;
        this.zzc = z10;
    }

    public final List zza(int i10, zzcx zzcx, int[] iArr) {
        zzwj zzwj = new zzwj(this.zza);
        zzfvp zzfvp = new zzfvp();
        int i11 = 0;
        while (true) {
            int i12 = zzcx.zzb;
            if (i11 > 0) {
                return zzfvp.zzi();
            }
            int i13 = i10;
            zzcx zzcx2 = zzcx;
            int i14 = i11;
            zzfvp.zzf(new zzwq(i13, zzcx2, i14, this.zzb, iArr[i11], this.zzc, zzwj));
            i11++;
        }
    }
}
