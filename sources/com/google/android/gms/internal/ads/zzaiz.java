package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaiz implements zzabm {
    public static final zzabt zza = zzaiy.zza;
    private final zzaja zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfa zze;
    private zzabp zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaiz() {
        this(0);
    }

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        zzdx.zzb(this.zzf);
        int zza2 = zzabn.zza(this.zzc.zzI(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzacl(-9223372036854775807L, 0));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzc(zzabp zzabp) {
        this.zzf = zzabp;
        this.zzb.zzb(zzabp, new zzakq(Integer.MIN_VALUE, 0, 1));
        zzabp.zzD();
    }

    public final void zzd(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    public final boolean zze(zzabn zzabn) {
        int i10 = 0;
        while (true) {
            zzabc zzabc = (zzabc) zzabn;
            zzabc.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if (this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int zzk = this.zzd.zzk();
            i10 += zzk + 10;
            zzabc.zzl(zzk, false);
        }
        zzabn.zzj();
        zzabc zzabc2 = (zzabc) zzabn;
        zzabc2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = (long) i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            zzabc2.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if (!zzaja.zzf(this.zzd.zzp())) {
                i11++;
                zzabn.zzj();
                zzabc2.zzl(i11, false);
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                zzabc2.zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int zzd2 = this.zze.zzd(13);
                if (zzd2 <= 6) {
                    i11++;
                    zzabn.zzj();
                    zzabc2.zzl(i11, false);
                } else {
                    zzabc2.zzl(zzd2 - 6, false);
                    i13 += zzd2;
                }
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    public zzaiz(int i10) {
        this.zzb = new zzaja(true, (String) null);
        this.zzc = new zzfb(2048);
        this.zzh = -1;
        zzfb zzfb = new zzfb(10);
        this.zzd = zzfb;
        byte[] zzI = zzfb.zzI();
        this.zze = new zzfa(zzI, zzI.length);
    }
}
