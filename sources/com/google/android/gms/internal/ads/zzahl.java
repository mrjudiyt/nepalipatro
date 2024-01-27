package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzahl {
    public final zzacs zza;
    public final zzahx zzb = new zzahx();
    public final zzfb zzc = new zzfb();
    public zzahy zzd;
    public zzahh zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzfb zzj = new zzfb(1);
    private final zzfb zzk = new zzfb();
    /* access modifiers changed from: private */
    public boolean zzl;

    public zzahl(zzacs zzacs, zzahy zzahy, zzahh zzahh) {
        this.zza = zzacs;
        this.zzd = zzahy;
        this.zze = zzahh;
        zzh(zzahy, zzahh);
    }

    public final int zza() {
        int i10;
        if (!this.zzl) {
            i10 = this.zzd.zzg[this.zzf];
        } else {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        }
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzfb zzfb;
        zzahw zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i12 = zzf2.zzd;
        if (i12 != 0) {
            zzfb = this.zzb.zzn;
        } else {
            byte[] bArr = zzf2.zze;
            int i13 = zzfk.zza;
            zzfb zzfb2 = this.zzk;
            int length = bArr.length;
            zzfb2.zzE(bArr, length);
            zzfb = this.zzk;
            i12 = length;
        }
        boolean zzb2 = this.zzb.zzb(this.zzf);
        boolean z10 = zzb2 || i11 != 0;
        zzfb zzfb3 = this.zzj;
        zzfb3.zzI()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        zzfb3.zzG(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzfb, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        if (!zzb2) {
            this.zzc.zzD(8);
            zzfb zzfb4 = this.zzc;
            byte[] zzI = zzfb4.zzI();
            zzI[0] = 0;
            zzI[1] = 1;
            zzI[2] = 0;
            zzI[3] = (byte) i11;
            zzI[4] = (byte) ((i10 >> 24) & 255);
            zzI[5] = (byte) ((i10 >> 16) & 255);
            zzI[6] = (byte) ((i10 >> 8) & 255);
            zzI[7] = (byte) (i10 & 255);
            this.zza.zzs(zzfb4, 8, 1);
            return i12 + 9;
        }
        int i14 = i12 + 1;
        zzfb zzfb5 = this.zzb.zzn;
        int zzp = zzfb5.zzp();
        zzfb5.zzH(-2);
        int i15 = (zzp * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzD(i15);
            byte[] zzI2 = this.zzc.zzI();
            zzfb5.zzC(zzI2, 0, i15);
            int i16 = (((zzI2[2] & 255) << 8) | (zzI2[3] & 255)) + i11;
            zzI2[2] = (byte) ((i16 >> 8) & 255);
            zzI2[3] = (byte) (i16 & 255);
            zzfb5 = this.zzc;
        }
        this.zza.zzs(zzfb5, i15, 1);
        return i14 + i15;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzahx zzahx = this.zzb;
        return zzahx.zzi[this.zzf];
    }

    public final zzahw zzf() {
        if (!this.zzl) {
            return null;
        }
        zzahx zzahx = this.zzb;
        zzahh zzahh = zzahx.zza;
        int i10 = zzfk.zza;
        int i11 = zzahh.zza;
        zzahw zzahw = zzahx.zzm;
        if (zzahw == null) {
            zzahw = this.zzd.zza.zza(i11);
        }
        if (zzahw == null || !zzahw.zza) {
            return null;
        }
        return zzahw;
    }

    public final void zzh(zzahy zzahy, zzahh zzahh) {
        this.zzd = zzahy;
        this.zze = zzahh;
        this.zza.zzl(zzahy.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahx zzahx = this.zzb;
        zzahx.zzd = 0;
        zzahx.zzp = 0;
        zzahx.zzq = false;
        zzahx.zzk = false;
        zzahx.zzo = false;
        zzahx.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
