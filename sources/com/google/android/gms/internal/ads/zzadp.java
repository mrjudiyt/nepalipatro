package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzadp implements zzaax {
    private final zzabz zza;
    private final int zzb;
    private final zzabu zzc = new zzabu();

    /* synthetic */ zzadp(zzabz zzabz, int i10, zzado zzado) {
        this.zza = zzabz;
        this.zzb = i10;
    }

    private final long zzc(zzabn zzabn) {
        zzabn zzabn2 = zzabn;
        while (zzabn.zze() < zzabn.zzd() - 6) {
            zzabz zzabz = this.zza;
            int i10 = this.zzb;
            zzabu zzabu = this.zzc;
            long zze = zzabn.zze();
            byte[] bArr = new byte[2];
            zzabc zzabc = (zzabc) zzabn2;
            zzabc.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzabn.zzj();
                zzabc.zzl((int) (zze - zzabn.zzf()), false);
            } else {
                zzfb zzfb = new zzfb(16);
                System.arraycopy(bArr, 0, zzfb.zzI(), 0, 2);
                zzfb.zzF(zzabq.zza(zzabn2, zzfb.zzI(), 2, 14));
                zzabn.zzj();
                zzabc.zzl((int) (zze - zzabn.zzf()), false);
                if (zzabv.zzc(zzfb, zzabz, i10, zzabu)) {
                    break;
                }
            }
            zzabc.zzl(1, false);
        }
        if (zzabn.zze() < zzabn.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzabc) zzabn2).zzl((int) (zzabn.zzd() - zzabn.zze()), false);
        return this.zza.zzj;
    }

    public final zzaaw zza(zzabn zzabn, long j10) {
        int i10 = this.zza.zzc;
        long zzf = zzabn.zzf();
        long zzc2 = zzc(zzabn);
        long zze = zzabn.zze();
        ((zzabc) zzabn).zzl(Math.max(6, i10), false);
        int i11 = (zzc2 > j10 ? 1 : (zzc2 == j10 ? 0 : -1));
        long zzc3 = zzc(zzabn);
        long zze2 = zzabn.zze();
        if (i11 > 0 || zzc3 <= j10) {
            return zzc3 <= j10 ? zzaaw.zzf(zzc3, zze2) : zzaaw.zzd(zzc2, zzf);
        }
        return zzaaw.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
