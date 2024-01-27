package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgth {
    private final zzgtg zza;

    private zzgth(zzgtg zzgtg) {
        byte[] bArr = zzguj.zzd;
        this.zza = zzgtg;
        zzgtg.zze = this;
    }

    public static zzgth zza(zzgtg zzgtg) {
        zzgth zzgth = zzgtg.zze;
        return zzgth != null ? zzgth : new zzgth(zzgtg);
    }

    public final void zzA(int i10, int i11) {
        this.zza.zzr(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzB(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzgtg.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                zzgtg zzgtg = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzgtg.zzs((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzgtg zzgtg2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzgtg2.zzr(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzC(int i10, long j10) {
        this.zza.zzt(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzD(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzgtg.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                zzgtg zzgtg = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzgtg.zzu((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzgtg zzgtg2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzgtg2.zzt(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    public final void zzE(int i10) {
        this.zza.zzq(i10, 3);
    }

    public final void zzF(int i10, String str) {
        this.zza.zzo(i10, str);
    }

    public final void zzG(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzgur) {
            zzgur zzgur = (zzgur) list;
            while (i11 < list.size()) {
                Object zzf = zzgur.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzo(i10, (String) zzf);
                } else {
                    this.zza.zzL(i10, (zzgsr) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzo(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzH(int i10, int i11) {
        this.zza.zzr(i10, i11);
    }

    public final void zzI(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzgtg.zzA(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzJ(int i10, long j10) {
        this.zza.zzt(i10, j10);
    }

    public final void zzK(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzgtg.zzB(((Long) list.get(i13)).longValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzt(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzK(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzJ(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzK(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void zzd(int i10, zzgsr zzgsr) {
        this.zza.zzL(i10, zzgsr);
    }

    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzL(i10, (zzgsr) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzq(i10, 4);
    }

    public final void zzi(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzgtg.zzx(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzk(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzo(int i10, float f10) {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void zzq(int i10, Object obj, zzgwc zzgwc) {
        zzgtg zzgtg = this.zza;
        zzgtg.zzq(i10, 3);
        zzgwc.zzm((zzgvj) obj, zzgtg.zze);
        zzgtg.zzq(i10, 4);
    }

    public final void zzr(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzgtg.zzx(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzt(int i10, long j10) {
        this.zza.zzt(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzgtg.zzB(((Long) list.get(i13)).longValue());
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzt(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzv(int i10, Object obj, zzgwc zzgwc) {
        this.zza.zzn(i10, (zzgvj) obj, zzgwc);
    }

    public final void zzw(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zzx(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzy(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }

    public final void zzz(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzq(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzs(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
