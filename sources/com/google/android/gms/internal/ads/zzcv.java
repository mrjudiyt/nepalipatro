package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzcv {
    public static final zzcv zza = new zzcq();
    public static final zzn zzb = zzcp.zza;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);

    protected zzcv() {
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcv)) {
            return false;
        }
        zzcv zzcv = (zzcv) obj;
        if (zzcv.zzc() == zzc() && zzcv.zzb() == zzb()) {
            zzcu zzcu = new zzcu();
            zzcs zzcs = new zzcs();
            zzcu zzcu2 = new zzcu();
            zzcs zzcs2 = new zzcs();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzcu, 0).equals(zzcv.zze(i10, zzcu2, 0))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzcs, true).equals(zzcv.zzd(i11, zzcs2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzcv.zzg(true) && (zzh = zzh(true)) == zzcv.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzcv.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzcu zzcu = new zzcu();
        zzcs zzcs = new zzcs();
        int zzc2 = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = zzc2 * 31;
            if (i11 >= zzc()) {
                break;
            }
            zzc2 = i10 + zze(i11, zzcu, 0).hashCode();
            i11++;
        }
        int zzb2 = i10 + zzb();
        for (int i12 = 0; i12 < zzb(); i12++) {
            zzb2 = (zzb2 * 31) + zzd(i12, zzcs, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcs zzd(int i10, zzcs zzcs, boolean z10);

    public abstract zzcu zze(int i10, zzcu zzcu, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzcs zzcs, zzcu zzcu, int i11, boolean z10) {
        int i12 = zzd(i10, zzcs, false).zzd;
        if (zze(i12, zzcu, 0).zzq != i10) {
            return i10 + 1;
        }
        int zzj = zzj(i12, i11, z10);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzcu, 0).zzp;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == zzh(z10) ? zzg(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == zzh(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzcu zzcu, zzcs zzcs, int i10, long j10) {
        Pair zzm = zzm(zzcu, zzcs, i10, j10, 0);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    public final Pair zzm(zzcu zzcu, zzcs zzcs, int i10, long j10, long j11) {
        zzdx.zza(i10, 0, zzc());
        zze(i10, zzcu, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzcu.zzn;
            j10 = 0;
        }
        int i11 = zzcu.zzp;
        zzd(i11, zzcs, false);
        while (i11 < zzcu.zzq) {
            long j13 = zzcs.zzf;
            int i12 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = zzd(i13, zzcs, false).zzf;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        zzd(i11, zzcs, true);
        long j15 = zzcs.zzf;
        long j16 = zzcs.zze;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0, j10);
        Object obj = zzcs.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcs zzn(Object obj, zzcs zzcs) {
        return zzd(zza(obj), zzcs, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
