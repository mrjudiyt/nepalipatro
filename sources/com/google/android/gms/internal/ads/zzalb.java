package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzalb {
    public static Pair zza(zzabn zzabn) {
        zzabn.zzj();
        zzala zzd = zzd(1684108385, zzabn, new zzfb(8));
        ((zzabc) zzabn).zzo(8, false);
        return Pair.create(Long.valueOf(zzabn.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzakz zzb(zzabn zzabn) {
        byte[] bArr;
        zzfb zzfb = new zzfb(16);
        zzala zzd = zzd(1718449184, zzabn, zzfb);
        zzdx.zzf(zzd.zzb >= 16);
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(zzfb.zzI(), 0, 16, false);
        zzfb.zzG(0);
        int zzj = zzfb.zzj();
        int zzj2 = zzfb.zzj();
        int zzi = zzfb.zzi();
        int zzi2 = zzfb.zzi();
        int zzj3 = zzfb.zzj();
        int zzj4 = zzfb.zzj();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            zzabc.zzm(bArr, 0, i10, false);
        } else {
            bArr = zzfk.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzabc) zzabn).zzo((int) (zzabn.zze() - zzabn.zzf()), false);
        return new zzakz(zzj, zzj2, zzi, zzi2, zzj3, zzj4, bArr2);
    }

    public static boolean zzc(zzabn zzabn) {
        zzfb zzfb = new zzfb(8);
        int i10 = zzala.zza(zzabn, zzfb).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzabc) zzabn).zzm(zzfb.zzI(), 0, 4, false);
        zzfb.zzG(0);
        int zzf = zzfb.zzf();
        if (zzf == 1463899717) {
            return true;
        }
        zzer.zzc("WavHeaderReader", "Unsupported form type: " + zzf);
        return false;
    }

    private static zzala zzd(int i10, zzabn zzabn, zzfb zzfb) {
        zzala zza = zzala.zza(zzabn, zzfb);
        while (true) {
            int i11 = zza.zza;
            if (i11 == i10) {
                return zza;
            }
            zzer.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zza.zzb + 8;
            if (j10 <= 2147483647L) {
                ((zzabc) zzabn).zzo((int) j10, false);
                zza = zzala.zza(zzabn, zzfb);
            } else {
                int i12 = zza.zza;
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + i12);
            }
        }
    }
}
