package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzku {
    public final zztu zza;
    public final Object zzb;
    public final zzvo[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkv zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlt[] zzi;
    private final zzxq zzj;
    private final zzlj zzk;
    private zzku zzl;
    private zzvx zzm = zzvx.zza;
    private zzxr zzn;
    private long zzo;

    public zzku(zzlt[] zzltArr, long j10, zzxq zzxq, zzxz zzxz, zzlj zzlj, zzkv zzkv, zzxr zzxr) {
        this.zzi = zzltArr;
        this.zzo = j10;
        this.zzj = zzxq;
        this.zzk = zzlj;
        zztw zztw = zzkv.zza;
        this.zzb = zztw.zza;
        this.zzf = zzkv;
        this.zzn = zzxr;
        this.zzc = new zzvo[2];
        this.zzh = new boolean[2];
        long j11 = zzkv.zzb;
        long j12 = zzkv.zzd;
        zztu zzp = zzlj.zzp(zztw, zzxz, j11);
        this.zza = j12 != -9223372036854775807L ? new zztb(zzp, true, 0, j12) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzxr zzxr = this.zzn;
                if (i10 < zzxr.zza) {
                    zzxr.zzb(i10);
                    zzxk zzxk = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzxr zzxr = this.zzn;
                if (i10 < zzxr.zza) {
                    zzxr.zzb(i10);
                    zzxk zzxk = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzxr zzxr, long j10, boolean z10) {
        return zzb(zzxr, j10, false, new boolean[2]);
    }

    public final long zzb(zzxr zzxr, long j10, boolean z10, boolean[] zArr) {
        zzxr zzxr2 = zzxr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzxr2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzxr.zza(this.zzn, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlt[] zzltArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzltArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzxr2;
        zzt();
        long zzf2 = this.zza.zzf(zzxr2.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzlt[] zzltArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzltArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzvo[] zzvoArr = this.zzc;
            if (i13 >= 2) {
                return zzf2;
            }
            if (zzvoArr[i13] != null) {
                zzdx.zzf(zzxr.zzb(i13));
                this.zzi[i13].zzb();
                this.zze = true;
            } else {
                zzdx.zzf(zzxr2.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb2 = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzf.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzku zzg() {
        return this.zzl;
    }

    public final zzvx zzh() {
        return this.zzm;
    }

    public final zzxr zzi() {
        return this.zzn;
    }

    public final zzxr zzj(float f10, zzcv zzcv) {
        zzxr zzo2 = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcv);
        for (zzxk zzxk : zzo2.zzc) {
        }
        return zzo2;
    }

    public final void zzk(long j10, float f10, long j11) {
        zzdx.zzf(zzu());
        long j12 = j10 - this.zzo;
        zzkq zzkq = new zzkq();
        zzkq.zze(j12);
        zzkq.zzf(f10);
        zzkq.zzd(j11);
        this.zza.zzo(new zzks(zzkq, (zzkr) null));
    }

    public final void zzl(float f10, zzcv zzcv) {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxr zzj2 = zzj(f10, zzcv);
        zzkv zzkv = this.zzf;
        long j10 = zzkv.zzb;
        long j11 = zzkv.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long zza2 = zza(zzj2, j10, false);
        long j12 = this.zzo;
        zzkv zzkv2 = this.zzf;
        this.zzo = j12 + (zzkv2.zzb - zza2);
        this.zzf = zzkv2.zzb(zza2);
    }

    public final void zzm(long j10) {
        zzdx.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zztu zztu = this.zza;
        try {
            boolean z10 = zztu instanceof zztb;
            zzlj zzlj = this.zzk;
            if (z10) {
                zzlj.zzi(((zztb) zztu).zza);
            } else {
                zzlj.zzi(zztu);
            }
        } catch (RuntimeException e10) {
            zzer.zzd("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzku zzku) {
        if (zzku != this.zzl) {
            zzs();
            this.zzl = zzku;
            zzt();
        }
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztu zztu = this.zza;
        if (zztu instanceof zztb) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zztb) zztu).zzn(0, j10);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
