package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvn implements zzgwc {
    private final zzgvj zza;
    private final zzgwt zzb;
    private final boolean zzc;
    private final zzgtm zzd;

    private zzgvn(zzgwt zzgwt, zzgtm zzgtm, zzgvj zzgvj) {
        this.zzb = zzgwt;
        this.zzc = zzgtm.zzh(zzgvj);
        this.zzd = zzgtm;
        this.zza = zzgvj;
    }

    static zzgvn zzc(zzgwt zzgwt, zzgtm zzgtm, zzgvj zzgvj) {
        return new zzgvn(zzgwt, zzgtm, zzgvj);
    }

    public final int zza(Object obj) {
        zzgwt zzgwt = this.zzb;
        int zzb2 = zzgwt.zzb(zzgwt.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        zzgvj zzgvj = this.zza;
        if (zzgvj instanceof zzgtz) {
            return ((zzgtz) zzgvj).zzaD();
        }
        return zzgvj.zzaP().zzan();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgwe.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    public final void zzh(Object obj, zzgvu zzgvu, zzgtl zzgtl) {
        boolean z10;
        zzgwt zzgwt = this.zzb;
        Object zzc2 = zzgwt.zzc(obj);
        zzgtm zzgtm = this.zzd;
        zzgtq zzb2 = zzgtm.zzb(obj);
        while (zzgvu.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzgvu.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzgtm.zzc(zzgtl, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzgtm.zzf(zzgvu, zzc3, zzgtl, zzb2);
                    } else {
                        z10 = zzgwt.zzp(zzc2, zzgvu);
                    }
                } else {
                    z10 = zzgvu.zzO();
                }
                if (!z10) {
                    zzgwt.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i10 = 0;
                Object obj2 = null;
                zzgsr zzgsr = null;
                while (true) {
                    try {
                        if (zzgvu.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzgvu.zzd();
                        if (zzd3 == 16) {
                            i10 = zzgvu.zzj();
                            obj2 = zzgtm.zzc(zzgtl, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgtm.zzf(zzgvu, obj2, zzgtl, zzb2);
                            } else {
                                zzgsr = zzgvu.zzp();
                            }
                        } else if (!zzgvu.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzgwt.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzgvu.zzd() != 12) {
                    throw zzgul.zzb();
                } else if (zzgsr != null) {
                    if (obj2 != null) {
                        zzgtm.zzg(zzgsr, obj2, zzgtl, zzb2);
                    } else {
                        zzgwt.zzk(zzc2, i10, zzgsr);
                    }
                }
            }
        }
        zzgwt.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgsd zzgsd) {
        zzgtz zzgtz = (zzgtz) obj;
        if (zzgtz.zzc == zzgwu.zzc()) {
            zzgtz.zzc = zzgwu.zzf();
        }
        zzgtw zzgtw = (zzgtw) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        zzgwt zzgwt = this.zzb;
        if (!zzgwt.zzd(obj).equals(zzgwt.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzm(Object obj, zzgth zzgth) {
        this.zzd.zza(obj);
        throw null;
    }
}
