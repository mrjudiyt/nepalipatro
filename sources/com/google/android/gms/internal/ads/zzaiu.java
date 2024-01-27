package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaiu implements zzaje {
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

    public zzaiu() {
        this((String) null);
    }

    public final void zza(zzfb zzfb) {
        zzdx.zzb(this.zze);
        while (zzfb.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (true) {
                    if (zzfb.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzfb.zzl() == 11;
                    } else {
                        int zzl2 = zzfb.zzl();
                        if (zzl2 == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzfb zzfb2 = this.zzb;
                            zzfb2.zzI()[0] = 11;
                            zzfb2.zzI()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzl2 == 11;
                    }
                }
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
                int min2 = Math.min(zzfb.zza(), 128 - this.zzg);
                zzfb.zzC(zzI, this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 == 128) {
                    this.zza.zzj(0);
                    zzaam zze2 = zzaan.zze(this.zza);
                    zzam zzam = this.zzj;
                    if (zzam == null || zze2.zzc != zzam.zzz || zze2.zzb != zzam.zzA || !zzfk.zzE(zze2.zza, zzam.zzm)) {
                        zzak zzak = new zzak();
                        zzak.zzJ(this.zzd);
                        zzak.zzU(zze2.zza);
                        zzak.zzy(zze2.zzc);
                        zzak.zzV(zze2.zzb);
                        zzak.zzM(this.zzc);
                        zzak.zzQ(zze2.zzf);
                        if ("audio/ac3".equals(zze2.zza)) {
                            zzak.zzx(zze2.zzf);
                        }
                        zzam zzac = zzak.zzac();
                        this.zzj = zzac;
                        this.zze.zzl(zzac);
                    }
                    this.zzk = zze2.zzd;
                    this.zzi = (((long) zze2.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzG(0);
                    this.zze.zzr(this.zzb, 128);
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

    public zzaiu(String str) {
        zzfa zzfa = new zzfa(new byte[128], 128);
        this.zza = zzfa;
        this.zzb = new zzfb(zzfa.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
