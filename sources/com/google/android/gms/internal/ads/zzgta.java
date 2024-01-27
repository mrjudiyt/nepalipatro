package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgta implements zzgvu {
    private final zzgsz zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgta(zzgsz zzgsz) {
        byte[] bArr = zzguj.zzd;
        this.zza = zzgsz;
        zzgsz.zzc = this;
    }

    private final void zzP(Object obj, zzgwc zzgwc, zzgtl zzgtl) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgwc.zzh(obj, this, zzgtl);
            if (this.zzb != this.zzc) {
                throw zzgul.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzgwc zzgwc, zzgtl zzgtl) {
        zzgsz zzgsz = this.zza;
        int zzn = zzgsz.zzn();
        if (zzgsz.zza < zzgsz.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzgwc.zzh(obj, this, zzgtl);
            this.zza.zzz(0);
            zzgsz zzgsz2 = this.zza;
            zzgsz2.zza--;
            zzgsz2.zzA(zze);
            return;
        }
        throw new zzgul("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() != i10) {
            throw zzgul.zzj();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzgul.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw zzgul.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw zzgul.zzg();
        }
    }

    public static zzgta zzq(zzgsz zzgsz) {
        zzgta zzgta = zzgsz.zzc;
        return zzgta != null ? zzgta : new zzgta(zzgsz);
    }

    public final void zzA(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzguy.zzg(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzguy.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzB(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgts) {
            zzgts zzgts = (zzgts) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgts.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgts.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgul.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzgwc zzgwc, zzgtl zzgtl) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzgwc.zze();
                zzP(zze, zzgwc, zzgtl);
                zzgwc.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzgul.zza();
    }

    public final void zzD(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgua.zzh(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzgua.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzE(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzguy.zzg(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzguy.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzF(List list, zzgwc zzgwc, zzgtl zzgtl) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzgwc.zze();
                zzQ(zze, zzgwc, zzgtl);
                zzgwc.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzgul.zza();
    }

    public final void zzG(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgua.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgua.zzh(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzH(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzguy.zzg(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzguy.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzI(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgua.zzh(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzgua.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzJ(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzguy.zzg(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzguy.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzK(List list, boolean z10) {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgul.zza();
        } else if ((list instanceof zzgur) && !z10) {
            zzgur zzgur = (zzgur) list;
            do {
                zzgur.zzi(zzp());
                if (!this.zza.zzC()) {
                    zzm2 = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
        }
    }

    public final void zzL(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgua.zzh(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzgua.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzM(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzguy) {
            zzguy zzguy = (zzguy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzguy.zzg(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzguy.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO() {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzgsr zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzgwc zzgwc, zzgtl zzgtl) {
        zzS(3);
        zzP(obj, zzgwc, zzgtl);
    }

    public final void zzu(Object obj, zzgwc zzgwc, zzgtl zzgtl) {
        zzS(2);
        zzQ(obj, zzgwc, zzgtl);
    }

    public final void zzv(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgsf) {
            zzgsf zzgsf = (zzgsf) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgsf.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzgsf.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzgul.zza();
    }

    public final void zzx(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgti) {
            zzgti zzgti = (zzgti) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzgti.zze(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgti.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzy(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgua.zzh(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                zzgsz zzgsz = this.zza;
                int zzd2 = zzgsz.zzd() + zzgsz.zzn();
                do {
                    zzgua.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                zzgsz zzgsz2 = this.zza;
                int zzd3 = zzgsz2.zzd() + zzgsz2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgul.zza();
            }
        }
    }

    public final void zzz(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgua) {
            zzgua zzgua = (zzgua) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgua.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgua.zzh(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgul.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgul.zza();
            }
        }
    }
}
