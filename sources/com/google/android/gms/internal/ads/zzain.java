package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzain {
    private final zzaig zza = new zzaig();
    private zzacs zzb;
    private zzabp zzc;
    private zzaii zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzaik zzj = new zzaik();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzfb zzfb);

    /* access modifiers changed from: protected */
    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzaik();
            this.zzf = 0;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzc(zzfb zzfb, long j10, zzaik zzaik);

    /* access modifiers changed from: package-private */
    public final int zze(zzabn zzabn, zzacj zzacj) {
        zzabn zzabn2 = zzabn;
        zzdx.zzb(this.zzb);
        int i10 = zzfk.zza;
        int i11 = this.zzh;
        if (i11 == 0) {
            while (this.zza.zze(zzabn2)) {
                long zzf2 = zzabn.zzf();
                long j10 = this.zzf;
                this.zzk = zzf2 - j10;
                if (zzc(this.zza.zza(), j10, this.zzj)) {
                    this.zzf = zzabn.zzf();
                } else {
                    zzam zzam = this.zzj.zza;
                    this.zzi = zzam.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzam);
                        this.zzm = true;
                    }
                    zzaii zzaii = this.zzj.zzb;
                    if (zzaii != null) {
                        this.zzd = zzaii;
                    } else if (zzabn.zzd() == -1) {
                        this.zzd = new zzaim((zzail) null);
                    } else {
                        zzaih zzb2 = this.zza.zzb();
                        this.zzd = new zzaib(this, this.zzf, zzabn.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i11 == 1) {
            ((zzabc) zzabn2).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i11 != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzabn2);
            if (zzd2 >= 0) {
                zzacj.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzacm zze2 = this.zzd.zze();
                zzdx.zzb(zze2);
                this.zzc.zzO(zze2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzabn2)) {
                this.zzk = 0;
                zzfb zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j11 = this.zzg;
                    if (j11 + zza3 >= this.zze) {
                        long zzf3 = zzf(j11);
                        zzacq.zzb(this.zzb, zza2, zza2.zzd());
                        this.zzb.zzt(zzf3, 1, zza2.zzd(), 0, (zzacr) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzabp zzabp, zzacs zzacs) {
        this.zzc = zzabp;
        this.zzb = zzacs;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j10) {
        this.zzg = j10;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg2 = zzg(j11);
            this.zze = zzg2;
            zzaii zzaii = this.zzd;
            int i10 = zzfk.zza;
            zzaii.zzg(zzg2);
            this.zzh = 2;
        }
    }
}
