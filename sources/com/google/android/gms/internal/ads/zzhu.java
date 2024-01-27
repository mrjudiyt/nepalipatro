package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzhu extends zzcv {
    private final int zzc;
    private final zzvr zzd;

    public zzhu(boolean z10, zzvr zzvr) {
        this.zzd = zzvr;
        this.zzc = zzvr.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zzd(i10);
        }
        if (i10 >= this.zzc - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    public final int zza(Object obj) {
        int zza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(zzp) + zza;
    }

    public final zzcs zzd(int i10, zzcs zzcs, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzcs, z10);
        zzcs.zzd += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzcs.zzc;
            Objects.requireNonNull(obj);
            zzcs.zzc = Pair.create(zzv, obj);
        }
        return zzcs;
    }

    public final zzcu zze(int i10, zzcu zzcu, long j10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzcu, j10);
        Object zzv = zzv(zzr);
        if (!zzcu.zza.equals(zzcu.zzc)) {
            zzv = Pair.create(zzv, zzcu.zzc);
        }
        zzcu.zzc = zzv;
        zzcu.zzp += zzs;
        zzcu.zzq += zzs;
        return zzcu;
    }

    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    public final int zzg(boolean z10) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z10 ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            zza = zzw(zza, z10);
            if (zza == -1) {
                return -1;
            }
        }
        return zzt(zza) + zzu(zza).zzg(z10);
    }

    public final int zzh(boolean z10) {
        int i10 = this.zzc;
        if (i10 == 0) {
            return -1;
        }
        int zzb = z10 ? this.zzd.zzb() : i10 - 1;
        while (zzu(zzb).zzo()) {
            zzb = zzx(zzb, z10);
            if (zzb == -1) {
                return -1;
            }
        }
        return zzt(zzb) + zzu(zzb).zzh(z10);
    }

    public final int zzj(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i10 - zzt, i11 == 2 ? 0 : i11, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z10);
        }
        if (i11 == 2) {
            return zzg(z10);
        }
        return -1;
    }

    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    public final zzcs zzn(Object obj, zzcs zzcs) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcs);
        zzcs.zzd += zzt;
        zzcs.zzc = obj;
        return zzcs;
    }

    /* access modifiers changed from: protected */
    public abstract int zzp(Object obj);

    /* access modifiers changed from: protected */
    public abstract int zzq(int i10);

    /* access modifiers changed from: protected */
    public abstract int zzr(int i10);

    /* access modifiers changed from: protected */
    public abstract int zzs(int i10);

    /* access modifiers changed from: protected */
    public abstract int zzt(int i10);

    /* access modifiers changed from: protected */
    public abstract zzcv zzu(int i10);

    /* access modifiers changed from: protected */
    public abstract Object zzv(int i10);
}
