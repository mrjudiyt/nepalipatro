package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajs implements zzaje {
    private final zzfb zza;
    private final zzacg zzb;
    private final String zzc;
    private zzacs zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzajs() {
        this((String) null);
    }

    public final void zza(zzfb zzfb) {
        zzdx.zzb(this.zzd);
        while (zzfb.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                byte[] zzI = zzfb.zzI();
                int zzc2 = zzfb.zzc();
                int zzd2 = zzfb.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzfb.zzG(zzd2);
                        break;
                    }
                    int i11 = zzc2 + 1;
                    byte b10 = zzI[zzc2];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzi && (b10 & 224) == 224;
                    this.zzi = z10;
                    if (z11) {
                        zzfb.zzG(i11);
                        this.zzi = false;
                        this.zza.zzI()[1] = zzI[zzc2];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    zzc2 = i11;
                }
            } else if (i10 != 1) {
                int min = Math.min(zzfb.zza(), this.zzk - this.zzg);
                this.zzd.zzr(zzfb, min);
                int i12 = this.zzg + min;
                this.zzg = i12;
                int i13 = this.zzk;
                if (i12 >= i13) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zzd.zzt(j10, 1, i13, 0, (zzacr) null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzfb.zza(), 4 - this.zzg);
                zzfb.zzC(this.zza.zzI(), this.zzg, min2);
                int i14 = this.zzg + min2;
                this.zzg = i14;
                if (i14 >= 4) {
                    this.zza.zzG(0);
                    if (!this.zzb.zza(this.zza.zzf())) {
                        this.zzg = 0;
                        this.zzf = 1;
                    } else {
                        zzacg zzacg = this.zzb;
                        this.zzk = zzacg.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzacg.zzg) * 1000000) / ((long) zzacg.zzd);
                            zzak zzak = new zzak();
                            zzak.zzJ(this.zze);
                            zzak.zzU(this.zzb.zzb);
                            zzak.zzN(4096);
                            zzak.zzy(this.zzb.zze);
                            zzak.zzV(this.zzb.zzd);
                            zzak.zzM(this.zzc);
                            this.zzd.zzl(zzak.zzac());
                            this.zzh = true;
                        }
                        this.zza.zzG(0);
                        this.zzd.zzr(this.zza, 4);
                        this.zzf = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        zzakq.zzc();
        this.zze = zzakq.zzb();
        this.zzd = zzabp.zzw(zzakq.zza(), 1);
    }

    public final void zzc(boolean z10) {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzajs(String str) {
        this.zzf = 0;
        zzfb zzfb = new zzfb(4);
        this.zza = zzfb;
        zzfb.zzI()[0] = -1;
        this.zzb = new zzacg();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
