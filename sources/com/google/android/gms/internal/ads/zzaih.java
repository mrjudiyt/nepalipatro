package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaih {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfb zzg = new zzfb(255);

    zzaih() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzabn zzabn, boolean z10) {
        zza();
        this.zzg.zzD(27);
        if (zzabq.zzc(zzabn, this.zzg.zzI(), 0, 27, z10) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzl() == 0) {
                this.zza = this.zzg.zzl();
                this.zzb = this.zzg.zzq();
                this.zzg.zzr();
                this.zzg.zzr();
                this.zzg.zzr();
                int zzl = this.zzg.zzl();
                this.zzc = zzl;
                this.zzd = zzl + 27;
                this.zzg.zzD(zzl);
                if (zzabq.zzc(zzabn, this.zzg.zzI(), 0, this.zzc, z10)) {
                    for (int i10 = 0; i10 < this.zzc; i10++) {
                        this.zzf[i10] = this.zzg.zzl();
                        this.zze += this.zzf[i10];
                    }
                    return true;
                }
            } else if (z10) {
                return false;
            } else {
                throw zzcc.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean zzc(zzabn zzabn, long j10) {
        int i10;
        zzdx.zzd(zzabn.zzf() == zzabn.zze());
        this.zzg.zzD(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || zzabn.zzf() + 4 < j10) && zzabq.zzc(zzabn, this.zzg.zzI(), 0, 4, true)) {
                this.zzg.zzG(0);
                if (this.zzg.zzt() != 1332176723) {
                    ((zzabc) zzabn).zzo(1, false);
                } else {
                    zzabn.zzj();
                    return true;
                }
            }
        }
        do {
            if ((i10 != 0 && zzabn.zzf() >= j10) || zzabn.zzc(1) == -1) {
                return false;
            }
            break;
        } while (zzabn.zzc(1) == -1);
        return false;
    }
}
