package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzuo extends zztf {
    private static final zzbp zza;
    private final zzty[] zzb;
    private final zzcv[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfwo zzf;
    private int zzg = -1;
    private long[][] zzh;
    private zzun zzi;
    private final zzth zzj;

    static {
        zzar zzar = new zzar();
        zzar.zza("MergingMediaSource");
        zza = zzar.zzc();
    }

    public zzuo(boolean z10, boolean z11, zzty... zztyArr) {
        zzth zzth = new zzth();
        this.zzb = zztyArr;
        this.zzj = zzth;
        this.zzd = new ArrayList(Arrays.asList(zztyArr));
        this.zzc = new zzcv[zztyArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfww.zzb(8).zzb(2).zza();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzty zzty, zzcv zzcv) {
        int i10;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i10 = zzcv.zzb();
                this.zzg = i10;
            } else {
                int zzb2 = zzcv.zzb();
                int i11 = this.zzg;
                if (zzb2 != i11) {
                    this.zzi = new zzun(0);
                    return;
                }
                i10 = i11;
            }
            if (this.zzh.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzc.length;
                iArr[0] = i10;
                this.zzh = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.zzd.remove(zzty);
            this.zzc[((Integer) obj).intValue()] = zzcv;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    public final void zzG(zztu zztu) {
        zzum zzum = (zzum) zztu;
        int i10 = 0;
        while (true) {
            zzty[] zztyArr = this.zzb;
            if (i10 < zztyArr.length) {
                zztyArr[i10].zzG(zzum.zzn(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public final zztu zzI(zztw zztw, zzxz zzxz, long j10) {
        zzcv[] zzcvArr = this.zzc;
        int length = this.zzb.length;
        zztu[] zztuArr = new zztu[length];
        int zza2 = zzcvArr[0].zza(zztw.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zztuArr[i10] = this.zzb[i10].zzI(zztw.zza(this.zzc[i10].zzf(zza2)), zzxz, j10 - this.zzh[zza2][i10]);
        }
        return new zzum(this.zzj, this.zzh[zza2], zztuArr);
    }

    public final zzbp zzJ() {
        zzty[] zztyArr = this.zzb;
        return zztyArr.length > 0 ? zztyArr[0].zzJ() : zza;
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzhk zzhk) {
        super.zzn(zzhk);
        int i10 = 0;
        while (true) {
            zzty[] zztyArr = this.zzb;
            if (i10 < zztyArr.length) {
                zzB(Integer.valueOf(i10), zztyArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    public final void zzt(zzbp zzbp) {
        this.zzb[0].zzt(zzbp);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zztw zzy(Object obj, zztw zztw) {
        if (((Integer) obj).intValue() == 0) {
            return zztw;
        }
        return null;
    }

    public final void zzz() {
        zzun zzun = this.zzi;
        if (zzun == null) {
            super.zzz();
            return;
        }
        throw zzun;
    }
}
