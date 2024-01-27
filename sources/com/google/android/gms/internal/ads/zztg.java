package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zztg implements zzvq {
    protected final zzvq[] zza;

    public zztg(zzvq[] zzvqArr) {
        this.zza = zzvqArr;
    }

    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        for (zzvq zzb : this.zza) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb2);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (zzvq zzc : this.zza) {
            long zzc2 = zzc.zzc();
            if (zzc2 != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc2);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void zzm(long j10) {
        for (zzvq zzm : this.zza) {
            zzm.zzm(j10);
        }
    }

    public final boolean zzo(zzks zzks) {
        zzks zzks2 = zzks;
        boolean z10 = false;
        while (true) {
            long zzc = zzc();
            long j10 = Long.MIN_VALUE;
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            zzvq[] zzvqArr = this.zza;
            int length = zzvqArr.length;
            int i10 = 0;
            boolean z11 = false;
            while (i10 < length) {
                zzvq zzvq = zzvqArr[i10];
                long zzc2 = zzvq.zzc();
                boolean z12 = zzc2 != j10 && zzc2 <= zzks2.zza;
                if (zzc2 == zzc || z12) {
                    z11 |= zzvq.zzo(zzks2);
                }
                i10++;
                j10 = Long.MIN_VALUE;
            }
            z10 |= z11;
            if (!z11) {
                break;
            }
        }
        return z10;
    }

    public final boolean zzp() {
        for (zzvq zzp : this.zza) {
            if (zzp.zzp()) {
                return true;
            }
        }
        return false;
    }
}
