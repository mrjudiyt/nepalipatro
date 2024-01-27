package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgte extends zzgtb {
    private final OutputStream zzg;

    zzgte(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzG() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i10) {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    public final void zzI() {
        if (this.zzc > 0) {
            zzG();
        }
    }

    public final void zzJ(byte b10) {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    public final void zzK(int i10, boolean z10) {
        zzH(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : 0);
    }

    public final void zzL(int i10, zzgsr zzgsr) {
        zzs((i10 << 3) | 2);
        zzs(zzgsr.zzd());
        zzgsr.zzo(this);
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        zzp(bArr, i10, i11);
    }

    public final void zzh(int i10, int i11) {
        zzH(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    public final void zzi(int i10) {
        zzH(4);
        zzd(i10);
    }

    public final void zzj(int i10, long j10) {
        zzH(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    public final void zzk(long j10) {
        zzH(8);
        zze(j10);
    }

    public final void zzl(int i10, int i11) {
        zzH(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg((long) i11);
        }
    }

    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu((long) i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i10, zzgvj zzgvj, zzgwc zzgwc) {
        zzs((i10 << 3) | 2);
        zzs(((zzgsa) zzgvj).zzat(zzgwc));
        zzgwc.zzm(zzgvj, this.zze);
    }

    public final void zzo(int i10, String str) {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.zza, i13, i14);
        int i15 = i10 + i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzG();
        int i16 = i11 - i14;
        if (i16 <= this.zzb) {
            System.arraycopy(bArr, i15, this.zza, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    public final void zzq(int i10, int i11) {
        zzs((i10 << 3) | i11);
    }

    public final void zzr(int i10, int i11) {
        zzH(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    public final void zzs(int i10) {
        zzH(5);
        zzf(i10);
    }

    public final void zzt(int i10, long j10) {
        zzH(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    public final void zzu(long j10) {
        zzH(10);
        zzg(j10);
    }

    public final void zzv(String str) {
        int i10;
        int i11;
        try {
            int length = str.length() * 3;
            int zzA = zzgtg.zzA(length);
            int i12 = zzA + length;
            int i13 = this.zzb;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int zzd = zzgxi.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i12 > i13 - this.zzc) {
                zzG();
            }
            int zzA2 = zzgtg.zzA(str.length());
            i10 = this.zzc;
            if (zzA2 == zzA) {
                int i14 = i10 + zzA2;
                this.zzc = i14;
                int zzd2 = zzgxi.zzd(str, this.zza, i14, this.zzb - i14);
                this.zzc = i10;
                i11 = (zzd2 - i10) - zzA2;
                zzf(i11);
                this.zzc = zzd2;
            } else {
                i11 = zzgxi.zze(str);
                zzf(i11);
                this.zzc = zzgxi.zzd(str, this.zza, this.zzc, i11);
            }
            this.zzd += i11;
        } catch (zzgxh e10) {
            this.zzd -= this.zzc - i10;
            this.zzc = i10;
            throw e10;
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new zzgtd(e11);
        } catch (zzgxh e12) {
            zzE(str, e12);
        }
    }
}
