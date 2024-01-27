package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzagk {
    private final zzfb zza = new zzfb(8);
    private int zzb;

    private final long zzb(zzabn zzabn) {
        int i10;
        zzabc zzabc = (zzabc) zzabn;
        int i11 = 0;
        zzabc.zzm(this.zza.zzI(), 0, 1, false);
        byte b10 = this.zza.zzI()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i10 = i13 + 1;
            if ((b10 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i10;
        }
        int i14 = b10 & (~i12);
        zzabc.zzm(this.zza.zzI(), 1, i13, false);
        while (i11 < i13) {
            i11++;
            i14 = (this.zza.zzI()[i11] & 255) + (i14 << 8);
        }
        this.zzb += i10;
        return (long) i14;
    }

    public final boolean zza(zzabn zzabn) {
        long zzb2;
        int i10;
        long zzd = zzabn.zzd();
        long j10 = 1024;
        int i11 = (zzd > -1 ? 1 : (zzd == -1 ? 0 : -1));
        if (i11 != 0 && zzd <= 1024) {
            j10 = zzd;
        }
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(this.zza.zzI(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i12 = (int) j10;
            int i13 = this.zzb + 1;
            this.zzb = i13;
            if (i13 == i12) {
                return false;
            }
            zzabc.zzm(this.zza.zzI(), 0, 1, false);
            zzt = ((zzt << 8) & -256) | ((long) (this.zza.zzI()[0] & 255));
        }
        long zzb3 = zzb(zzabn);
        long j11 = (long) this.zzb;
        if (zzb3 != Long.MIN_VALUE) {
            long j12 = j11 + zzb3;
            if (i11 == 0 || j12 < zzd) {
                while (true) {
                    int i14 = (((long) this.zzb) > j12 ? 1 : (((long) this.zzb) == j12 ? 0 : -1));
                    if (i14 < 0) {
                        if (zzb(zzabn) == Long.MIN_VALUE || zzb2 < 0) {
                            return false;
                        }
                        if (i10 != 0) {
                            int zzb4 = (int) (zzb2 = zzb(zzabn));
                            zzabc.zzl(zzb4, false);
                            this.zzb += zzb4;
                        }
                    } else if (i14 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
