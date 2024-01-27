package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzkx {
    private final zzcs zza = new zzcs();
    private final zzcu zzb = new zzcu();
    private final zzmb zzc;
    private final zzei zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzku zzh;
    private zzku zzi;
    private zzku zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkx(zzmb zzmb, zzei zzei) {
        this.zzc = zzmb;
        this.zzd = zzei;
    }

    private final boolean zzA(zzcv zzcv, zztw zztw) {
        if (!zzC(zztw)) {
            return false;
        }
        int i10 = zzcv.zzn(zztw.zza, this.zza).zzd;
        if (zzcv.zze(i10, this.zzb, 0).zzq == zzcv.zza(zztw.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzB(zzcv zzcv) {
        zzku zzku = this.zzh;
        if (zzku == null) {
            return true;
        }
        int zza2 = zzcv.zza(zzku.zzb);
        while (true) {
            zza2 = zzcv.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                Objects.requireNonNull(zzku);
                if (zzku.zzg() == null || zzku.zzf.zzg) {
                    zzku zzg2 = zzku.zzg();
                } else {
                    zzku = zzku.zzg();
                }
            }
            zzku zzg22 = zzku.zzg();
            if (zza2 == -1 || zzg22 == null || zzcv.zza(zzg22.zzb) != zza2) {
                boolean zzm2 = zzm(zzku);
                zzku.zzf = zzg(zzcv, zzku.zzf);
            } else {
                zzku = zzg22;
            }
        }
        boolean zzm22 = zzm(zzku);
        zzku.zzf = zzg(zzcv, zzku.zzf);
        if (!zzm22) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zztw zztw) {
        return !zztw.zzb() && zztw.zze == -1;
    }

    private final long zzs(zzcv zzcv, Object obj, int i10) {
        zzcv.zzn(obj, this.zza);
        this.zza.zzi(i10);
        this.zza.zzk(i10);
        return 0;
    }

    private final zzkv zzt(zzcv zzcv, zzku zzku, long j10) {
        long j11;
        zzcv zzcv2 = zzcv;
        zzkv zzkv = zzku.zzf;
        long zze2 = (zzku.zze() + zzkv.zze) - j10;
        if (zzkv.zzg) {
            int zza2 = zzcv2.zza(zzkv.zza.zza);
            int i10 = this.zzf;
            boolean z10 = this.zzg;
            long j12 = 0;
            int zzi2 = zzcv.zzi(zza2, this.zza, this.zzb, i10, z10);
            if (zzi2 != -1) {
                int i11 = zzcv2.zzd(zzi2, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                Objects.requireNonNull(obj);
                long j13 = zzkv.zza.zzd;
                if (zzcv2.zze(i11, this.zzb, 0).zzp == zzi2) {
                    Pair zzm2 = zzcv.zzm(this.zzb, this.zza, i11, -9223372036854775807L, Math.max(0, zze2));
                    if (zzm2 != null) {
                        obj = zzm2.first;
                        long longValue = ((Long) zzm2.second).longValue();
                        zzku zzg2 = zzku.zzg();
                        if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                            j13 = this.zze;
                            this.zze = 1 + j13;
                        } else {
                            j13 = zzg2.zzf.zza.zzd;
                        }
                        j11 = longValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                zztw zzx = zzx(zzcv, obj, j11, j13, this.zzb, this.zza);
                if (!(j12 == -9223372036854775807L || zzkv.zzc == -9223372036854775807L)) {
                    zzcv2.zzn(zzkv.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcv, zzx, j12, j11);
            }
        } else {
            zztw zztw = zzkv.zza;
            zzcv2.zzn(zztw.zza, this.zza);
            if (zztw.zzb()) {
                int i12 = zztw.zzb;
                if (this.zza.zza(i12) != -1) {
                    int zzf2 = this.zza.zzf(i12, zztw.zzc);
                    if (zzf2 < 0) {
                        return zzv(zzcv, zztw.zza, i12, zzf2, zzkv.zzc, zztw.zzd);
                    }
                    long j14 = zzkv.zzc;
                    if (j14 == -9223372036854775807L) {
                        zzcu zzcu = this.zzb;
                        zzcs zzcs = this.zza;
                        Pair zzm3 = zzcv.zzm(zzcu, zzcs, zzcs.zzd, -9223372036854775807L, Math.max(0, zze2));
                        if (zzm3 != null) {
                            j14 = ((Long) zzm3.second).longValue();
                        }
                    }
                    zzs(zzcv2, zztw.zza, zztw.zzb);
                    return zzw(zzcv, zztw.zza, Math.max(0, j14), zzkv.zzc, zztw.zzd);
                }
            } else {
                int i13 = zztw.zze;
                if (i13 != -1) {
                    this.zza.zzm(i13);
                }
                zzcs zzcs2 = this.zza;
                int i14 = zztw.zze;
                int zze3 = zzcs2.zze(i14);
                zzcs2.zzn(i14);
                if (zze3 != this.zza.zza(zztw.zze)) {
                    return zzv(zzcv, zztw.zza, zztw.zze, zze3, zzkv.zze, zztw.zzd);
                }
                zzs(zzcv2, zztw.zza, zztw.zze);
                return zzw(zzcv, zztw.zza, 0, zzkv.zze, zztw.zzd);
            }
        }
        return null;
    }

    private final zzkv zzu(zzcv zzcv, zztw zztw, long j10, long j11) {
        zztw zztw2 = zztw;
        zzcv zzcv2 = zzcv;
        zzcv.zzn(zztw2.zza, this.zza);
        if (zztw.zzb()) {
            return zzv(zzcv, zztw2.zza, zztw2.zzb, zztw2.zzc, j10, zztw2.zzd);
        }
        return zzw(zzcv, zztw2.zza, j11, j10, zztw2.zzd);
    }

    private final zzkv zzv(zzcv zzcv, Object obj, int i10, int i11, long j10, long j11) {
        zztw zztw = new zztw(obj, i10, i11, j11);
        Object obj2 = zztw.zza;
        long zzh2 = zzcv.zzn(obj2, this.zza).zzh(zztw.zzb, zztw.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztw.zzb);
        long j12 = 0;
        if (zzh2 != -9223372036854775807L && zzh2 <= 0) {
            j12 = Math.max(0, -1 + zzh2);
        }
        return new zzkv(zztw, j12, j10, -9223372036854775807L, zzh2, false, false, false, false);
    }

    private final zzkv zzw(zzcv zzcv, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        zzcv zzcv2 = zzcv;
        Object obj2 = obj;
        long j16 = j10;
        zzcv2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j16);
        if (zzc2 != -1) {
            this.zza.zzm(zzc2);
        }
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc2);
        }
        zztw zztw = new zztw(obj2, j12, zzc2);
        boolean zzC = zzC(zztw);
        boolean zzA = zzA(zzcv2, zztw);
        boolean zzz = zzz(zzcv2, zztw, zzC);
        if (zzc2 != -1) {
            this.zza.zzn(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzi(zzc2);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = 0;
            j14 = 0;
        } else {
            j15 = j13;
            j14 = this.zza.zze;
        }
        if (j14 != -9223372036854775807L && j16 >= j14) {
            j16 = Math.max(0, j14 - 1);
        }
        return new zzkv(zztw, j16, j11, j15, j14, false, zzC, zzA, zzz);
    }

    private static zztw zzx(zzcv zzcv, Object obj, long j10, long j11, zzcu zzcu, zzcs zzcs) {
        zzcv zzcv2 = zzcv;
        Object obj2 = obj;
        long j12 = j10;
        zzcs zzcs2 = zzcs;
        zzcv.zzn(obj, zzcs2);
        zzcu zzcu2 = zzcu;
        zzcv.zze(zzcs2.zzd, zzcu, 0);
        zzcv.zza(obj);
        zzcs.zzb();
        zzcv.zzn(obj, zzcs2);
        int zzd2 = zzcs2.zzd(j10);
        if (zzd2 == -1) {
            long j13 = j11;
            return new zztw(obj, j11, zzcs2.zzc(j10));
        }
        long j14 = j11;
        return new zztw(obj, zzd2, zzcs2.zze(zzd2), j11);
    }

    private final void zzy() {
        zztw zztw;
        zzfvp zzfvp = new zzfvp();
        for (zzku zzku = this.zzh; zzku != null; zzku = zzku.zzg()) {
            zzfvp.zzf(zzku.zzf.zza);
        }
        zzku zzku2 = this.zzi;
        if (zzku2 == null) {
            zztw = null;
        } else {
            zztw = zzku2.zzf.zza;
        }
        this.zzd.zzh(new zzkw(this, zzfvp, zztw));
    }

    private final boolean zzz(zzcv zzcv, zztw zztw, boolean z10) {
        int zza2 = zzcv.zza(zztw.zza);
        if (!zzcv.zze(zzcv.zzd(zza2, this.zza, false).zzd, this.zzb, 0).zzj) {
            if (zzcv.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z10) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzku zza() {
        zzku zzku = this.zzh;
        if (zzku == null) {
            return null;
        }
        if (zzku == this.zzi) {
            this.zzi = zzku.zzg();
        }
        zzku.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzku zzku2 = this.zzh;
            this.zzl = zzku2.zzb;
            this.zzm = zzku2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzku zzb() {
        zzku zzku = this.zzi;
        zzdx.zzb(zzku);
        this.zzi = zzku.zzg();
        zzy();
        zzku zzku2 = this.zzi;
        zzdx.zzb(zzku2);
        return zzku2;
    }

    public final zzku zzc() {
        return this.zzj;
    }

    public final zzku zzd() {
        return this.zzh;
    }

    public final zzku zze() {
        return this.zzi;
    }

    public final zzkv zzf(long j10, zzlk zzlk) {
        zzku zzku = this.zzj;
        if (zzku != null) {
            return zzt(zzlk.zza, zzku, j10);
        }
        return zzu(zzlk.zza, zzlk.zzb, zzlk.zzc, zzlk.zzr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzkv zzg(com.google.android.gms.internal.ads.zzcv r19, com.google.android.gms.internal.ads.zzkv r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zztw r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zztw r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcs r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzcs r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            long r5 = r1.zze
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzcs r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzcs r4 = r0.zza
            r4.zzn(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzkv r15 = new com.google.android.gms.internal.ads.zzkv
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkx.zzg(com.google.android.gms.internal.ads.zzcv, com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzkv");
    }

    public final zztw zzh(zzcv zzcv, Object obj, long j10) {
        long j11;
        int zza2;
        int i10 = zzcv.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza2 = zzcv.zza(obj2)) == -1 || zzcv.zzd(zza2, this.zza, false).zzd != i10) {
            zzku zzku = this.zzh;
            while (true) {
                if (zzku == null) {
                    zzku zzku2 = this.zzh;
                    while (true) {
                        if (zzku2 != null) {
                            int zza3 = zzcv.zza(zzku2.zzb);
                            if (zza3 != -1 && zzcv.zzd(zza3, this.zza, false).zzd == i10) {
                                j11 = zzku2.zzf.zza.zzd;
                                break;
                            }
                            zzku2 = zzku2.zzg();
                        } else {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j11;
                            }
                        }
                    }
                } else if (zzku.zzb.equals(obj)) {
                    j11 = zzku.zzf.zza.zzd;
                    break;
                } else {
                    zzku = zzku.zzg();
                }
            }
        } else {
            j11 = this.zzm;
        }
        long j12 = j11;
        zzcv.zzn(obj, this.zza);
        zzcv.zze(this.zza.zzd, this.zzb, 0);
        int zza4 = zzcv.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcu zzcu = this.zzb;
            if (zza4 < zzcu.zzp) {
                return zzx(zzcv, obj3, j10, j12, zzcu, this.zza);
            }
            zzcv.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzcs zzcs = this.zza;
            if (zzcs.zzd(zzcs.zze) != -1) {
                obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
            }
            zza4--;
        }
    }

    public final void zzi() {
        if (this.zzk != 0) {
            zzku zzku = this.zzh;
            zzdx.zzb(zzku);
            this.zzl = zzku.zzb;
            this.zzm = zzku.zzf.zza.zzd;
            while (zzku != null) {
                zzku.zzn();
                zzku = zzku.zzg();
            }
            this.zzh = null;
            this.zzj = null;
            this.zzi = null;
            this.zzk = 0;
            zzy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfvp zzfvp, zztw zztw) {
        this.zzc.zzQ(zzfvp.zzi(), zztw);
    }

    public final void zzk(long j10) {
        zzku zzku = this.zzj;
        if (zzku != null) {
            zzku.zzm(j10);
        }
    }

    public final boolean zzl(zztu zztu) {
        zzku zzku = this.zzj;
        return zzku != null && zzku.zza == zztu;
    }

    public final boolean zzm(zzku zzku) {
        zzdx.zzb(zzku);
        boolean z10 = false;
        if (zzku.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzku;
        while (zzku.zzg() != null) {
            zzku = zzku.zzg();
            Objects.requireNonNull(zzku);
            if (zzku == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzku.zzn();
            this.zzk--;
        }
        zzku zzku2 = this.zzj;
        Objects.requireNonNull(zzku2);
        zzku2.zzo((zzku) null);
        zzy();
        return z10;
    }

    public final boolean zzn() {
        zzku zzku = this.zzj;
        if (zzku != null) {
            return !zzku.zzf.zzi && zzku.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzcv zzcv, long j10, long j11) {
        zzkv zzkv;
        long j12;
        boolean z10;
        zzcv zzcv2 = zzcv;
        zzku zzku = this.zzh;
        zzku zzku2 = null;
        while (zzku != null) {
            zzkv zzkv2 = zzku.zzf;
            if (zzku2 == null) {
                zzkv = zzg(zzcv2, zzkv2);
                long j13 = j10;
            } else {
                zzkv zzt = zzt(zzcv2, zzku2, j10);
                if (zzt == null) {
                    return !zzm(zzku2);
                }
                if (zzkv2.zzb != zzt.zzb || !zzkv2.zza.equals(zzt.zza)) {
                    return !zzm(zzku2);
                }
                zzkv = zzt;
            }
            zzku.zzf = zzkv.zza(zzkv2.zzc);
            long j14 = zzkv2.zze;
            int i10 = (j14 > -9223372036854775807L ? 1 : (j14 == -9223372036854775807L ? 0 : -1));
            long j15 = zzkv.zze;
            if (i10 == 0 || j14 == j15) {
                zzku2 = zzku;
                zzku = zzku.zzg();
            } else {
                zzku.zzq();
                long j16 = zzkv.zze;
                if (j16 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = j16 + zzku.zze();
                }
                if (zzku == this.zzi) {
                    boolean z11 = zzku.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= j12) {
                        z10 = true;
                        return zzm(zzku) && !z10;
                    }
                }
                z10 = false;
                if (zzm(zzku)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzcv zzcv, int i10) {
        this.zzf = i10;
        return zzB(zzcv);
    }

    public final boolean zzq(zzcv zzcv, boolean z10) {
        this.zzg = z10;
        return zzB(zzcv);
    }

    public final zzku zzr(zzlt[] zzltArr, zzxq zzxq, zzxz zzxz, zzlj zzlj, zzkv zzkv, zzxr zzxr) {
        long j10;
        zzku zzku = this.zzj;
        if (zzku == null) {
            j10 = 1000000000000L;
            zzkv zzkv2 = zzkv;
        } else {
            j10 = (zzku.zze() + zzku.zzf.zze) - zzkv.zzb;
        }
        zzku zzku2 = new zzku(zzltArr, j10, zzxq, zzxz, zzlj, zzkv, zzxr);
        zzku zzku3 = this.zzj;
        if (zzku3 != null) {
            zzku3.zzo(zzku2);
        } else {
            this.zzh = zzku2;
            this.zzi = zzku2;
        }
        this.zzl = null;
        this.zzj = zzku2;
        this.zzk++;
        zzy();
        return zzku2;
    }
}
