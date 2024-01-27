package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaig {
    private final zzaih zza = new zzaih();
    private final zzfb zzb = new zzfb(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzaig() {
    }

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzaih zzaih = this.zza;
            if (i14 >= zzaih.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzaih.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final zzfb zza() {
        return this.zzb;
    }

    public final zzaih zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzD(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfb zzfb = this.zzb;
        if (zzfb.zzI().length != 65025) {
            zzfb.zzE(Arrays.copyOf(zzfb.zzI(), Math.max(65025, zzfb.zzd())), this.zzb.zzd());
        }
    }

    public final boolean zze(zzabn zzabn) {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzD(0);
        }
        while (true) {
            boolean z10 = true;
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                if (!this.zza.zzc(zzabn, -1) || !this.zza.zzb(zzabn, true)) {
                    return false;
                }
                zzaih zzaih = this.zza;
                int i11 = zzaih.zzd;
                if ((zzaih.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i11 += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzabq.zze(zzabn, i11)) {
                    return false;
                }
                this.zzc = i10;
            }
            int zzf = zzf(i10);
            int i12 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzfb zzfb = this.zzb;
                zzfb.zzA(zzfb.zzd() + zzf);
                zzfb zzfb2 = this.zzb;
                if (!zzabq.zzd(zzabn, zzfb2.zzI(), zzfb2.zzd(), zzf)) {
                    return false;
                }
                zzfb zzfb3 = this.zzb;
                zzfb3.zzF(zzfb3.zzd() + zzf);
                if (this.zza.zzf[i12 - 1] == 255) {
                    z10 = false;
                }
                this.zze = z10;
            }
            if (i12 == this.zza.zzc) {
                i12 = -1;
            }
            this.zzc = i12;
        }
        return false;
    }
}
