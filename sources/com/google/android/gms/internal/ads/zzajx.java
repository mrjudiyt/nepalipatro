package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzajx implements zzaax {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();

    /* synthetic */ zzajx(zzfi zzfi, zzajw zzajw) {
        this.zza = zzfi;
    }

    public final zzaaw zza(zzabn zzabn, long j10) {
        int zzh;
        long j11;
        long zzf = zzabn.zzf();
        int min = (int) Math.min(20000, zzabn.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabc) zzabn).zzm(this.zzb.zzI(), 0, min, false);
        int i10 = -1;
        long j12 = -9223372036854775807L;
        int i11 = -1;
        while (true) {
            zzfb zzfb = this.zzb;
            if (zzfb.zza() < 4) {
                return j12 != -9223372036854775807L ? zzaaw.zzf(j12, zzf + ((long) i10)) : zzaaw.zza;
            }
            if (zzajy.zzh(zzfb.zzI(), zzfb.zzc()) != 442) {
                zzfb.zzH(1);
            } else {
                zzfb.zzH(4);
                long zzc = zzajz.zzc(zzfb);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j10) {
                        if (j12 == -9223372036854775807L) {
                            return zzaaw.zzd(zzb2, zzf);
                        }
                        j11 = (long) i11;
                    } else if (100000 + zzb2 > j10) {
                        j11 = (long) zzfb.zzc();
                        break;
                    } else {
                        i11 = zzfb.zzc();
                        j12 = zzb2;
                    }
                }
                int zzd = zzfb.zzd();
                if (zzfb.zza() >= 10) {
                    zzfb.zzH(9);
                    int zzl = zzfb.zzl() & 7;
                    if (zzfb.zza() >= zzl) {
                        zzfb.zzH(zzl);
                        if (zzfb.zza() >= 4) {
                            if (zzajy.zzh(zzfb.zzI(), zzfb.zzc()) == 443) {
                                zzfb.zzH(4);
                                int zzp = zzfb.zzp();
                                if (zzfb.zza() < zzp) {
                                    zzfb.zzG(zzd);
                                } else {
                                    zzfb.zzH(zzp);
                                }
                            }
                            while (true) {
                                if (zzfb.zza() < 4 || (zzh = zzajy.zzh(zzfb.zzI(), zzfb.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzfb.zzH(4);
                                if (zzfb.zza() < 2) {
                                    zzfb.zzG(zzd);
                                    break;
                                }
                                zzfb.zzG(Math.min(zzfb.zzd(), zzfb.zzc() + zzfb.zzp()));
                            }
                        } else {
                            zzfb.zzG(zzd);
                        }
                    } else {
                        zzfb.zzG(zzd);
                    }
                } else {
                    zzfb.zzG(zzd);
                }
                i10 = zzfb.zzc();
            }
        }
        return zzaaw.zze(zzf + j11);
    }

    public final void zzb() {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
