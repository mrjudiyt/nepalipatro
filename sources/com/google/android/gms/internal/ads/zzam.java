package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzam {
    private static final zzam zzI = new zzam(new zzak());
    private static final String zzJ = Integer.toString(0, 36);
    private static final String zzK = Integer.toString(1, 36);
    private static final String zzL = Integer.toString(2, 36);
    private static final String zzM = Integer.toString(3, 36);
    private static final String zzN = Integer.toString(4, 36);
    private static final String zzO = Integer.toString(5, 36);
    private static final String zzP = Integer.toString(6, 36);
    private static final String zzQ = Integer.toString(7, 36);
    private static final String zzR = Integer.toString(8, 36);
    private static final String zzS = Integer.toString(9, 36);
    private static final String zzT = Integer.toString(10, 36);
    private static final String zzU = Integer.toString(11, 36);
    private static final String zzV = Integer.toString(12, 36);
    private static final String zzW = Integer.toString(13, 36);
    private static final String zzX = Integer.toString(14, 36);
    private static final String zzY = Integer.toString(15, 36);
    private static final String zzZ = Integer.toString(16, 36);
    public static final zzn zza = zzai.zza;
    private static final String zzaa = Integer.toString(17, 36);
    private static final String zzab = Integer.toString(18, 36);
    private static final String zzac = Integer.toString(19, 36);
    private static final String zzad = Integer.toString(20, 36);
    private static final String zzae = Integer.toString(21, 36);
    private static final String zzaf = Integer.toString(22, 36);
    private static final String zzag = Integer.toString(23, 36);
    private static final String zzah = Integer.toString(24, 36);
    private static final String zzai = Integer.toString(25, 36);
    private static final String zzaj = Integer.toString(26, 36);
    private static final String zzak = Integer.toString(27, 36);
    private static final String zzal = Integer.toString(28, 36);
    private static final String zzam = Integer.toString(29, 36);
    private static final String zzan = Integer.toString(30, 36);
    private static final String zzao = Integer.toString(31, 36);
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    private int zzap;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzby zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzs zzy;
    public final int zzz;

    private zzam(zzak zzak2) {
        this.zzb = zzak2.zza;
        this.zzc = zzak2.zzb;
        this.zzd = zzfk.zzB(zzak2.zzc);
        this.zze = zzak2.zzd;
        int i10 = 0;
        this.zzf = 0;
        int zzd2 = zzak2.zze;
        this.zzg = zzd2;
        int zzl2 = zzak2.zzf;
        this.zzh = zzl2;
        this.zzi = zzl2 != -1 ? zzl2 : zzd2;
        this.zzj = zzak2.zzg;
        this.zzk = zzak2.zzh;
        this.zzl = zzak2.zzi;
        this.zzm = zzak2.zzj;
        this.zzn = zzak2.zzk;
        this.zzo = zzak2.zzl == null ? Collections.emptyList() : zzak2.zzl;
        zzad zzv2 = zzak2.zzm;
        this.zzp = zzv2;
        this.zzq = zzak2.zzn;
        this.zzr = zzak2.zzo;
        this.zzs = zzak2.zzp;
        this.zzt = zzak2.zzq;
        this.zzu = zzak2.zzr == -1 ? 0 : zzak2.zzr;
        this.zzv = zzak2.zzs == -1.0f ? 1.0f : zzak2.zzs;
        this.zzw = zzak2.zzt;
        this.zzx = zzak2.zzu;
        this.zzy = zzak2.zzv;
        this.zzz = zzak2.zzw;
        this.zzA = zzak2.zzx;
        this.zzB = zzak2.zzy;
        this.zzC = zzak2.zzz == -1 ? 0 : zzak2.zzz;
        this.zzD = zzak2.zzA != -1 ? zzak2.zzA : i10;
        this.zzE = zzak2.zzB;
        this.zzF = zzak2.zzC;
        this.zzG = zzak2.zzD;
        this.zzH = (zzak2.zzE != 0 || zzv2 == null) ? zzak2.zzE : 1;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzam.class == obj.getClass()) {
            zzam zzam2 = (zzam) obj;
            int i11 = this.zzap;
            if ((i11 == 0 || (i10 = zzam2.zzap) == 0 || i11 == i10) && this.zze == zzam2.zze && this.zzg == zzam2.zzg && this.zzh == zzam2.zzh && this.zzn == zzam2.zzn && this.zzq == zzam2.zzq && this.zzr == zzam2.zzr && this.zzs == zzam2.zzs && this.zzu == zzam2.zzu && this.zzx == zzam2.zzx && this.zzz == zzam2.zzz && this.zzA == zzam2.zzA && this.zzB == zzam2.zzB && this.zzC == zzam2.zzC && this.zzD == zzam2.zzD && this.zzE == zzam2.zzE && this.zzF == zzam2.zzF && this.zzG == zzam2.zzG && this.zzH == zzam2.zzH && Float.compare(this.zzt, zzam2.zzt) == 0 && Float.compare(this.zzv, zzam2.zzv) == 0 && zzfk.zzE(this.zzb, zzam2.zzb) && zzfk.zzE(this.zzc, zzam2.zzc) && zzfk.zzE(this.zzj, zzam2.zzj) && zzfk.zzE(this.zzl, zzam2.zzl) && zzfk.zzE(this.zzm, zzam2.zzm) && zzfk.zzE(this.zzd, zzam2.zzd) && Arrays.equals(this.zzw, zzam2.zzw) && zzfk.zzE(this.zzk, zzam2.zzk) && zzfk.zzE(this.zzy, zzam2.zzy) && zzfk.zzE(this.zzp, zzam2.zzp) && zzd(zzam2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.zzap;
        if (i15 != 0) {
            return i15;
        }
        String str = this.zzb;
        int i16 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        String str2 = this.zzc;
        int hashCode = str2 != null ? str2.hashCode() : 0;
        int i17 = i10 + 527;
        String str3 = this.zzd;
        if (str3 == null) {
            i11 = 0;
        } else {
            i11 = str3.hashCode();
        }
        int i18 = (i17 * 31) + hashCode;
        int i19 = this.zze;
        int i20 = this.zzg;
        int i21 = this.zzh;
        String str4 = this.zzj;
        if (str4 == null) {
            i12 = 0;
        } else {
            i12 = str4.hashCode();
        }
        int i22 = ((((((((((i18 * 31) + i11) * 31) + i19) * 961) + i20) * 31) + i21) * 31) + i12) * 31;
        zzby zzby = this.zzk;
        if (zzby == null) {
            i13 = 0;
        } else {
            i13 = zzby.hashCode();
        }
        int i23 = (i22 + i13) * 31;
        String str5 = this.zzl;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.hashCode();
        }
        int i24 = (i23 + i14) * 31;
        String str6 = this.zzm;
        if (str6 != null) {
            i16 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((((((i24 + i16) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH;
        this.zzap = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzy);
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + ", " + valueOf + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i10;
        int i11 = this.zzr;
        if (i11 == -1 || (i10 = this.zzs) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzak zzb() {
        return new zzak(this, (zzaj) null);
    }

    public final zzam zzc(int i10) {
        zzak zzak2 = new zzak(this, (zzaj) null);
        zzak2.zzC(i10);
        return new zzam(zzak2);
    }

    public final boolean zzd(zzam zzam2) {
        if (this.zzo.size() != zzam2.zzo.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i10), (byte[]) zzam2.zzo.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
