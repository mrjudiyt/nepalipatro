package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcfc implements zzgi {
    private final zzgi zza;
    private final long zzb;
    private final zzgi zzc;
    private long zzd;
    private Uri zze;

    zzcfc(zzgi zzgi, int i10, zzgi zzgi2) {
        this.zza = zzgi;
        this.zzb = (long) i10;
        this.zzc = zzgi2;
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza2 = this.zza.zza(bArr, i10, (int) Math.min((long) i11, j11 - j10));
            long j12 = this.zzd + ((long) zza2);
            this.zzd = j12;
            i12 = zza2;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.zzb) {
            return i12;
        }
        int zza3 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + zza3;
        this.zzd += (long) zza3;
        return i13;
    }

    public final long zzb(zzgn zzgn) {
        zzgn zzgn2;
        zzgn zzgn3 = zzgn;
        this.zze = zzgn3.zza;
        long j10 = this.zzb;
        long j11 = zzgn3.zzf;
        zzgn zzgn4 = null;
        if (j11 >= j10) {
            zzgn2 = null;
        } else {
            long j12 = zzgn3.zzg;
            long j13 = j10 - j11;
            if (j12 != -1) {
                j13 = Math.min(j12, j13);
            }
            zzgn2 = new zzgn(zzgn3.zza, (byte[]) null, j11, j11, j13, (String) null, 0);
        }
        long j14 = zzgn3.zzg;
        if (j14 == -1 || zzgn3.zzf + j14 > this.zzb) {
            long max = Math.max(this.zzb, zzgn3.zzf);
            long j15 = zzgn3.zzg;
            zzgn4 = new zzgn(zzgn3.zza, (byte[]) null, max, max, j15 != -1 ? Math.min(j15, (zzgn3.zzf + j15) - this.zzb) : -1, (String) null, 0);
        }
        long j16 = 0;
        long zzb2 = zzgn2 != null ? this.zza.zzb(zzgn2) : 0;
        if (zzgn4 != null) {
            j16 = this.zzc.zzb(zzgn4);
        }
        this.zzd = zzgn3.zzf;
        if (zzb2 == -1 || j16 == -1) {
            return -1;
        }
        return zzb2 + j16;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfvv.zzd();
    }

    public final void zzf(zzhk zzhk) {
    }
}
