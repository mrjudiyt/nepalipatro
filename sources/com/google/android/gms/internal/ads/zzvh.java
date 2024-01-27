package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzvh {
    private final zzfb zza = new zzfb(32);
    private zzvg zzb;
    private zzvg zzc;
    private zzvg zzd;
    private long zze;
    private final zzxz zzf;

    public zzvh(zzxz zzxz) {
        this.zzf = zzxz;
        zzvg zzvg = new zzvg(0, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        this.zzb = zzvg;
        this.zzc = zzvg;
        this.zzd = zzvg;
    }

    private final int zzi(int i10) {
        zzvg zzvg = this.zzd;
        if (zzvg.zzc == null) {
            zzxs zzb2 = this.zzf.zzb();
            zzvg zzvg2 = new zzvg(this.zzd.zzb, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            zzvg.zzc = zzb2;
            zzvg.zzd = zzvg2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvg zzj(zzvg zzvg, long j10) {
        while (j10 >= zzvg.zzb) {
            zzvg = zzvg.zzd;
        }
        return zzvg;
    }

    private static zzvg zzk(zzvg zzvg, long j10, ByteBuffer byteBuffer, int i10) {
        zzvg zzj = zzj(zzvg, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvg zzl(zzvg zzvg, long j10, byte[] bArr, int i10) {
        zzvg zzj = zzj(zzvg, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvg zzm(zzvg zzvg, zzht zzht, zzvj zzvj, zzfb zzfb) {
        zzvg zzvg2;
        int i10;
        zzht zzht2 = zzht;
        zzvj zzvj2 = zzvj;
        zzfb zzfb2 = zzfb;
        if (zzht.zzk()) {
            long j10 = zzvj2.zzb;
            zzfb2.zzD(1);
            zzvg zzl = zzl(zzvg, j10, zzfb.zzI(), 1);
            long j11 = j10 + 1;
            byte b10 = zzfb.zzI()[0];
            byte b11 = b10 & 128;
            byte b12 = b10 & Byte.MAX_VALUE;
            zzhq zzhq = zzht2.zzb;
            byte[] bArr = zzhq.zza;
            if (bArr == null) {
                zzhq.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = b11 != 0;
            zzvg2 = zzl(zzl, j11, zzhq.zza, b12);
            long j12 = j11 + ((long) b12);
            if (z10) {
                zzfb2.zzD(2);
                zzvg2 = zzl(zzvg2, j12, zzfb.zzI(), 2);
                j12 += 2;
                i10 = zzfb.zzp();
            } else {
                i10 = 1;
            }
            int[] iArr = zzhq.zzd;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhq.zze;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i11 = i10 * 6;
                zzfb2.zzD(i11);
                zzvg2 = zzl(zzvg2, j12, zzfb.zzI(), i11);
                j12 += (long) i11;
                zzfb2.zzG(0);
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr2[i12] = zzfb.zzp();
                    iArr4[i12] = zzfb.zzo();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvj2.zza - ((int) (j12 - zzvj2.zzb));
            }
            zzacr zzacr = zzvj2.zzc;
            int i13 = zzfk.zza;
            zzhq.zzc(i10, iArr2, iArr4, zzacr.zzb, zzhq.zza, zzacr.zza, zzacr.zzc, zzacr.zzd);
            long j13 = zzvj2.zzb;
            int i14 = (int) (j12 - j13);
            zzvj2.zzb = j13 + ((long) i14);
            zzvj2.zza -= i14;
        } else {
            zzvg2 = zzvg;
        }
        if (zzht.zze()) {
            zzfb2.zzD(4);
            zzvg zzl2 = zzl(zzvg2, zzvj2.zzb, zzfb.zzI(), 4);
            int zzo = zzfb.zzo();
            zzvj2.zzb += 4;
            zzvj2.zza -= 4;
            zzht2.zzi(zzo);
            zzvg zzk = zzk(zzl2, zzvj2.zzb, zzht2.zzc, zzo);
            zzvj2.zzb += (long) zzo;
            int i15 = zzvj2.zza - zzo;
            zzvj2.zza = i15;
            ByteBuffer byteBuffer = zzht2.zzf;
            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                zzht2.zzf = ByteBuffer.allocate(i15);
            } else {
                zzht2.zzf.clear();
            }
            return zzk(zzk, zzvj2.zzb, zzht2.zzf, zzvj2.zza);
        }
        zzht2.zzi(zzvj2.zza);
        return zzk(zzvg2, zzvj2.zzb, zzht2.zzc, zzvj2.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + ((long) i10);
        this.zze = j10;
        zzvg zzvg = this.zzd;
        if (j10 == zzvg.zzb) {
            this.zzd = zzvg.zzd;
        }
    }

    public final int zza(zzt zzt, int i10, boolean z10) {
        int zzi = zzi(i10);
        zzvg zzvg = this.zzd;
        int zza2 = zzt.zza(zzvg.zzc.zza, zzvg.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzvg zzvg;
        if (j10 != -1) {
            while (true) {
                zzvg = this.zzb;
                if (j10 < zzvg.zzb) {
                    break;
                }
                this.zzf.zzc(zzvg.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvg.zza) {
                this.zzc = zzvg;
            }
        }
    }

    public final void zzd(zzht zzht, zzvj zzvj) {
        zzm(this.zzc, zzht, zzvj, this.zza);
    }

    public final void zze(zzht zzht, zzvj zzvj) {
        this.zzc = zzm(this.zzc, zzht, zzvj, this.zza);
    }

    public final void zzf() {
        zzvg zzvg = this.zzb;
        if (zzvg.zzc != null) {
            this.zzf.zzd(zzvg);
            zzvg.zzb();
        }
        this.zzb.zze(0, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        zzvg zzvg2 = this.zzb;
        this.zzc = zzvg2;
        this.zzd = zzvg2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfb zzfb, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvg zzvg = this.zzd;
            zzfb.zzC(zzvg.zzc.zza, zzvg.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
