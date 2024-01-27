package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzake implements zzakr {
    private final zzakd zza;
    private final zzfb zzb = new zzfb(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzake(zzakd zzakd) {
        this.zza = zzakd;
    }

    public final void zza(zzfb zzfb, int i10) {
        int i11 = i10 & 1;
        int zzc2 = i11 != 0 ? zzfb.zzc() + zzfb.zzl() : -1;
        if (this.zzf) {
            if (i11 != 0) {
                this.zzf = false;
                zzfb.zzG(zzc2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzfb.zza() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzl = zzfb.zzl();
                    zzfb.zzG(zzfb.zzc() - 1);
                    if (zzl == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfb.zza(), 3 - this.zzd);
                zzfb.zzC(this.zzb.zzI(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzG(0);
                    this.zzb.zzF(3);
                    this.zzb.zzH(1);
                    zzfb zzfb2 = this.zzb;
                    int zzl2 = zzfb2.zzl();
                    boolean z10 = (zzl2 & 128) != 0;
                    int zzl3 = zzfb2.zzl();
                    this.zze = z10;
                    this.zzc = (zzl3 | ((zzl2 & 15) << 8)) + 3;
                    int zzb2 = this.zzb.zzb();
                    int i14 = this.zzc;
                    if (zzb2 < i14) {
                        int zzb3 = this.zzb.zzb();
                        this.zzb.zzA(Math.min(4098, Math.max(i14, zzb3 + zzb3)));
                    }
                }
            } else {
                int min2 = Math.min(zzfb.zza(), this.zzc - i12);
                zzfb.zzC(this.zzb.zzI(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzF(i16);
                    } else if (zzfk.zzd(this.zzb.zzI(), 0, i16, -1) != 0) {
                        this.zzf = true;
                        return;
                    } else {
                        this.zzb.zzF(this.zzc - 4);
                    }
                    this.zzb.zzG(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    public final void zzb(zzfi zzfi, zzabp zzabp, zzakq zzakq) {
        this.zza.zzb(zzfi, zzabp, zzakq);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}
