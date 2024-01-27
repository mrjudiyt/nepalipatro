package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaix implements zzaje {
    private final zzfa zza;
    private final zzfb zzb;
    private final String zzc;
    private String zzd;
    private zzacs zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzaix() {
        this((String) null);
    }

    public final void zza(zzfb zzfb) {
        int zzl2;
        byte b10;
        zzdx.zzb(this.zze);
        while (zzfb.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (true) {
                    if (zzfb.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzfb.zzl() == 172;
                    } else {
                        zzl2 = zzfb.zzl();
                        this.zzh = zzl2 == 172;
                        b10 = 64;
                        if (zzl2 == 64) {
                            break;
                        } else if (zzl2 == 65) {
                            zzl2 = 65;
                            break;
                        }
                    }
                }
                this.zzf = 1;
                zzfb zzfb2 = this.zzb;
                zzfb2.zzI()[0] = -84;
                if (zzl2 == 65) {
                    b10 = 65;
                }
                zzfb2.zzI()[1] = b10;
                this.zzg = 2;
            } else if (i10 != 1) {
                int min = Math.min(zzfb.zza(), this.zzk - this.zzg);
                this.zze.zzr(zzfb, min);
                int i11 = this.zzg + min;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 == i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zze.zzt(j10, 1, i12, 0, (zzacr) null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzI = this.zzb.zzI();
                int min2 = Math.min(zzfb.zza(), 16 - this.zzg);
                zzfb.zzC(zzI, this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 == 16) {
                    this.zza.zzj(0);
                    zzaap zza2 = zzaaq.zza(this.zza);
                    zzam zzam = this.zzj;
                    if (zzam == null || zzam.zzz != 2 || zza2.zza != zzam.zzA || !"audio/ac4".equals(zzam.zzm)) {
                        zzak zzak = new zzak();
                        zzak.zzJ(this.zzd);
                        zzak.zzU("audio/ac4");
                        zzak.zzy(2);
                        zzak.zzV(zza2.zza);
                        zzak.zzM(this.zzc);
                        zzam zzac = zzak.zzac();
                        this.zzj = zzac;
                        this.zze.zzl(zzac);
                    }
                    this.zzk = zza2.zzb;
                    this.zzi = (((long) zza2.zzc) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzG(0);
                    this.zze.zzr(this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        zzakq.zzc();
        this.zzd = zzakq.zzb();
        this.zze = zzabp.zzw(zzakq.zza(), 1);
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
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaix(String str) {
        zzfa zzfa = new zzfa(new byte[16], 16);
        this.zza = zzfa;
        this.zzb = new zzfb(zzfa.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
