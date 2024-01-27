package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzaay {
    protected final zzaas zza;
    protected final zzaax zzb;
    protected zzaau zzc;
    private final int zzd;

    protected zzaay(zzaav zzaav, zzaax zzaax, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzaax;
        this.zzd = i10;
        this.zza = new zzaas(zzaav, j10, 0, j12, j13, j14, j15);
    }

    protected static final int zzf(zzabn zzabn, long j10, zzacj zzacj) {
        if (j10 == zzabn.zzf()) {
            return 0;
        }
        zzacj.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzabn zzabn, long j10) {
        long zzf = j10 - zzabn.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzabc) zzabn).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzabn zzabn, zzacj zzacj) {
        while (true) {
            zzaau zzaau = this.zzc;
            zzdx.zzb(zzaau);
            long zzb2 = zzaau.zzf;
            int i10 = this.zzd;
            long zzc2 = zzaau.zzh;
            if (zzaau.zzg - zzb2 <= ((long) i10)) {
                zzc(false, zzb2);
                return zzf(zzabn, zzb2, zzacj);
            } else if (!zzg(zzabn, zzc2)) {
                return zzf(zzabn, zzc2, zzacj);
            } else {
                zzabn.zzj();
                zzaaw zza2 = this.zzb.zza(zzabn, zzaau.zzb);
                int zza3 = zza2.zzb;
                if (zza3 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzabn, zzc2, zzacj);
                } else if (zza3 == -2) {
                    zzaau.zzh(zzaau, zza2.zzc, zza2.zzd);
                } else if (zza3 != -1) {
                    zzg(zzabn, zza2.zzd);
                    zzc(true, zza2.zzd);
                    return zzf(zzabn, zza2.zzd, zzacj);
                } else {
                    zzaau.zzg(zzaau, zza2.zzc, zza2.zzd);
                }
            }
        }
    }

    public final zzacm zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11 = j10;
        zzaau zzaau = this.zzc;
        if (zzaau == null || zzaau.zza != j11) {
            zzaas zzaas = this.zza;
            zzaau zzaau2 = r1;
            zzaau zzaau3 = new zzaau(j10, zzaas.zzf(j11), 0, zzaas.zzc, zzaas.zzd, zzaas.zze, zzaas.zzf);
            this.zzc = zzaau2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
