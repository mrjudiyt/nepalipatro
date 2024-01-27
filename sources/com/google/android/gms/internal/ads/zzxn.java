package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzxn extends zzxq {
    private zzxm zza;

    /* access modifiers changed from: protected */
    public abstract Pair zzb(zzxm zzxm, int[][][] iArr, int[] iArr2, zztw zztw, zzcv zzcv);

    public final zzxr zzo(zzlt[] zzltArr, zzvx zzvx, zztw zztw, zzcv zzcv) {
        boolean z10;
        int[] iArr;
        zzvx zzvx2 = zzvx;
        int[] iArr2 = new int[3];
        zzcx[][] zzcxArr = new zzcx[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzvx2.zzc;
            zzcxArr[i10] = new zzcx[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzltArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzvx2.zzc) {
            zzcx zzb = zzvx2.zzb(i14);
            int i15 = zzb.zzd;
            int i16 = 0;
            int i17 = 2;
            int i18 = 0;
            boolean z11 = true;
            while (i16 < i12) {
                zzlt zzlt = zzltArr[i16];
                int i19 = 0;
                for (int i20 = 0; i20 <= 0; i20++) {
                    i19 = Math.max(i19, zzlt.zzV(zzb.zzb(i20)) & 7);
                }
                boolean z12 = iArr2[i16] == 0;
                if (i19 > i18) {
                    z11 = z12;
                    i17 = i16;
                    i18 = i19;
                } else if (i19 == i18 && i15 == 5 && !z11 && z12) {
                    i17 = i16;
                    i18 = i19;
                    z11 = true;
                }
                i16++;
                i12 = 2;
            }
            if (i17 == i12) {
                iArr = new int[1];
            } else {
                zzlt zzlt2 = zzltArr[i17];
                int[] iArr5 = new int[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr5[i21] = zzlt2.zzV(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i17];
            zzcxArr[i17][i22] = zzb;
            iArr3[i17][i22] = iArr;
            iArr2[i17] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzvx[] zzvxArr = new zzvx[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzvxArr[i23] = new zzvx((zzcx[]) zzfk.zzJ(zzcxArr[i23], i24));
            iArr3[i23] = (int[][]) zzfk.zzJ(iArr3[i23], i24);
            strArr[i23] = zzltArr[i23].zzR();
            iArr6[i23] = zzltArr[i23].zzb();
            i23++;
            i12 = 2;
        }
        zzxm zzxm = new zzxm(strArr, iArr6, zzvxArr, iArr4, iArr3, new zzvx((zzcx[]) zzfk.zzJ(zzcxArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzxm, iArr3, iArr4, zztw, zzcv);
        zzxo[] zzxoArr = (zzxo[]) zzb2.second;
        List[] listArr = new List[zzxoArr.length];
        for (int i25 = 0; i25 < zzxoArr.length; i25++) {
            zzxo zzxo = zzxoArr[i25];
            listArr[i25] = zzxo != null ? zzfvs.zzm(zzxo) : zzfvs.zzl();
        }
        zzfvp zzfvp = new zzfvp();
        for (int i26 = 0; i26 < 2; i26++) {
            zzvx zzd = zzxm.zzd(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < zzd.zzc; i27++) {
                zzcx zzb3 = zzd.zzb(i27);
                boolean z13 = zzxm.zza(i26, i27, false) != 0;
                int i28 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = zzxm.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzxo zzxo2 = (zzxo) list.get(i30);
                        if (zzxo2.zze().equals(zzb3) && zzxo2.zzb(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                zzfvp.zzf(new zzdf(zzb3, z13, iArr7, zArr));
            }
        }
        zzvx zze = zzxm.zze();
        for (int i31 = 0; i31 < zze.zzc; i31++) {
            zzcx zzb4 = zze.zzb(i31);
            int i32 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfvp.zzf(new zzdf(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzxr((zzlu[]) zzb2.first, (zzxk[]) zzb2.second, new zzdg(zzfvp.zzi()), zzxm);
    }

    public final void zzp(Object obj) {
        this.zza = (zzxm) obj;
    }
}
