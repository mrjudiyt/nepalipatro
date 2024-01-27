package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzads implements zzabm {
    public static final zzabt zza = zzadr.zza;
    private final byte[] zzb;
    private final zzfb zzc;
    private final zzabu zzd;
    private zzabp zze;
    private zzacs zzf;
    private int zzg;
    private zzby zzh;
    private zzabz zzi;
    private int zzj;
    private int zzk;
    private zzadq zzl;
    private int zzm;
    private long zzn;

    public zzads() {
        this(0);
    }

    private final long zza(zzfb zzfb, boolean z10) {
        boolean z11;
        Objects.requireNonNull(this.zzi);
        int zzc2 = zzfb.zzc();
        while (zzc2 <= zzfb.zzd() - 16) {
            zzfb.zzG(zzc2);
            if (zzabv.zzc(zzfb, this.zzi, this.zzk, this.zzd)) {
                zzfb.zzG(zzc2);
                return this.zzd.zza;
            }
            zzc2++;
        }
        if (z10) {
            while (zzc2 <= zzfb.zzd() - this.zzj) {
                zzfb.zzG(zzc2);
                try {
                    z11 = zzabv.zzc(zzfb, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzfb.zzc() <= zzfb.zzd() && z11) {
                    zzfb.zzG(zzc2);
                    return this.zzd.zza;
                }
                zzc2++;
            }
            zzfb.zzG(zzfb.zzd());
            return -1;
        }
        zzfb.zzG(zzc2);
        return -1;
    }

    private final void zzf() {
        zzabz zzabz = this.zzi;
        int i10 = zzfk.zza;
        this.zzf.zzt((this.zzn * 1000000) / ((long) zzabz.zze), 1, this.zzm, 0, (zzacr) null);
    }

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        boolean zzn2;
        zzacm zzacm;
        zzabn zzabn2 = zzabn;
        int i10 = this.zzg;
        boolean z10 = true;
        if (i10 == 0) {
            zzabn.zzj();
            long zze2 = zzabn.zze();
            zzby zza2 = zzabw.zza(zzabn2, true);
            ((zzabc) zzabn2).zzo((int) (zzabn.zze() - zze2), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i10 == 1) {
            ((zzabc) zzabn2).zzm(this.zzb, 0, 42, false);
            zzabn.zzj();
            this.zzg = 2;
            return 0;
        } else if (i10 == 2) {
            zzfb zzfb = new zzfb(4);
            ((zzabc) zzabn2).zzn(zzfb.zzI(), 0, 4, false);
            if (zzfb.zzt() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzcc.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i10 == 3) {
            zzabz zzabz = this.zzi;
            do {
                zzabn.zzj();
                zzfa zzfa = new zzfa(new byte[4], 4);
                zzabc zzabc = (zzabc) zzabn2;
                zzabc.zzm(zzfa.zza, 0, 4, false);
                zzn2 = zzfa.zzn();
                int zzd2 = zzfa.zzd(7);
                int zzd3 = zzfa.zzd(24) + 4;
                if (zzd2 == 0) {
                    byte[] bArr = new byte[38];
                    zzabc.zzn(bArr, 0, 38, false);
                    zzabz = new zzabz(bArr, 4);
                } else if (zzabz == null) {
                    throw new IllegalArgumentException();
                } else if (zzd2 == 3) {
                    zzfb zzfb2 = new zzfb(zzd3);
                    zzabc.zzn(zzfb2.zzI(), 0, zzd3, false);
                    zzabz = zzabz.zzf(zzabw.zzb(zzfb2));
                } else if (zzd2 == 4) {
                    zzfb zzfb3 = new zzfb(zzd3);
                    zzabc.zzn(zzfb3.zzI(), 0, zzd3, false);
                    zzfb3.zzH(4);
                    zzabz = zzabz.zzg(Arrays.asList(zzacy.zzc(zzfb3, false, false).zzb));
                } else if (zzd2 == 6) {
                    zzfb zzfb4 = new zzfb(zzd3);
                    zzabc.zzn(zzfb4.zzI(), 0, zzd3, false);
                    zzfb4.zzH(4);
                    zzabz = zzabz.zze(zzfvs.zzm(zzaem.zzb(zzfb4)));
                } else {
                    zzabc.zzo(zzd3, false);
                }
                int i11 = zzfk.zza;
                this.zzi = zzabz;
            } while (!zzn2);
            Objects.requireNonNull(zzabz);
            this.zzj = Math.max(zzabz.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i10 != 4) {
            Objects.requireNonNull(this.zzf);
            zzabz zzabz2 = this.zzi;
            Objects.requireNonNull(zzabz2);
            zzadq zzadq = this.zzl;
            if (zzadq != null && zzadq.zze()) {
                return zzadq.zza(zzabn2, zzacj);
            }
            if (this.zzn == -1) {
                this.zzn = zzabv.zzb(zzabn2, zzabz2);
                return 0;
            }
            zzfb zzfb5 = this.zzc;
            int zzd4 = zzfb5.zzd();
            if (zzd4 < 32768) {
                int zza3 = zzabn2.zza(zzfb5.zzI(), zzd4, 32768 - zzd4);
                if (zza3 != -1) {
                    z10 = false;
                }
                if (!z10) {
                    this.zzc.zzF(zzd4 + zza3);
                } else if (this.zzc.zza() == 0) {
                    zzf();
                    return -1;
                }
            } else {
                z10 = false;
            }
            zzfb zzfb6 = this.zzc;
            int zzc2 = zzfb6.zzc();
            int i12 = this.zzm;
            int i13 = this.zzj;
            if (i12 < i13) {
                zzfb6.zzH(Math.min(i13 - i12, zzfb6.zza()));
            }
            long zza4 = zza(this.zzc, z10);
            zzfb zzfb7 = this.zzc;
            int zzc3 = zzfb7.zzc() - zzc2;
            zzfb7.zzG(zzc2);
            zzacq.zzb(this.zzf, this.zzc, zzc3);
            this.zzm += zzc3;
            if (zza4 != -1) {
                zzf();
                this.zzm = 0;
                this.zzn = zza4;
            }
            zzfb zzfb8 = this.zzc;
            if (zzfb8.zza() >= 16) {
                return 0;
            }
            int zza5 = zzfb8.zza();
            System.arraycopy(zzfb8.zzI(), zzfb8.zzc(), zzfb8.zzI(), 0, zza5);
            this.zzc.zzG(0);
            this.zzc.zzF(zza5);
            return 0;
        } else {
            zzabn.zzj();
            zzfb zzfb9 = new zzfb(2);
            ((zzabc) zzabn2).zzm(zzfb9.zzI(), 0, 2, false);
            int zzp = zzfb9.zzp();
            if ((zzp >> 2) == 16382) {
                zzabn.zzj();
                this.zzk = zzp;
                zzabp zzabp = this.zze;
                int i14 = zzfk.zza;
                long zzf2 = zzabn.zzf();
                long zzd5 = zzabn.zzd();
                zzabz zzabz3 = this.zzi;
                Objects.requireNonNull(zzabz3);
                if (zzabz3.zzk != null) {
                    zzacm = new zzabx(zzabz3, zzf2);
                } else if (zzd5 == -1 || zzabz3.zzj <= 0) {
                    zzacm = new zzacl(zzabz3.zza(), 0);
                } else {
                    zzadq zzadq2 = new zzadq(zzabz3, this.zzk, zzf2, zzd5);
                    this.zzl = zzadq2;
                    zzacm = zzadq2.zzb();
                }
                zzabp.zzO(zzacm);
                this.zzg = 5;
                return 0;
            }
            zzabn.zzj();
            throw zzcc.zza("First frame does not start with sync code.", (Throwable) null);
        }
    }

    public final void zzc(zzabp zzabp) {
        this.zze = zzabp;
        this.zzf = zzabp.zzw(0, 1);
        zzabp.zzD();
    }

    public final void zzd(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzadq zzadq = this.zzl;
            if (zzadq != null) {
                zzadq.zzd(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.zzn = j12;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    public final boolean zze(zzabn zzabn) {
        zzabw.zza(zzabn, false);
        zzfb zzfb = new zzfb(4);
        ((zzabc) zzabn).zzm(zzfb.zzI(), 0, 4, false);
        if (zzfb.zzt() == 1716281667) {
            return true;
        }
        return false;
    }

    public zzads(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzfb(new byte[32768], 0);
        this.zzd = new zzabu();
        this.zzg = 0;
    }
}
