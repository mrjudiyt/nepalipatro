package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzact {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzacs zzacs, zzacr zzacr) {
        if (this.zzc > 0) {
            zzacs.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzacr);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzacs zzacs, long j10, int i10, int i11, int i12, zzacr zzacr) {
        if (this.zzg > i11 + i12) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzacs, zzacr);
            }
        }
    }

    public final void zzd(zzabn zzabn) {
        if (!this.zzb) {
            zzabn.zzh(this.zza, 0, 10);
            zzabn.zzj();
            byte[] bArr = this.zza;
            int i10 = zzaan.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
