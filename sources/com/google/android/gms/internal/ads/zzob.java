package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzob {
    private final zzcs zza;
    /* access modifiers changed from: private */
    public zzfvs zzb = zzfvs.zzl();
    private zzfvv zzc = zzfvv.zzd();
    private zztw zzd;
    private zztw zze;
    private zztw zzf;

    public zzob(zzcs zzcs) {
        this.zza = zzcs;
    }

    private static zztw zzj(zzco zzco, zzfvs zzfvs, zztw zztw, zzcs zzcs) {
        zzcv zzn = zzco.zzn();
        int zze2 = zzco.zze();
        Object zzf2 = zzn.zzo() ? null : zzn.zzf(zze2);
        int zzc2 = (zzco.zzx() || zzn.zzo()) ? -1 : zzn.zzd(zze2, zzcs, false).zzc(zzfk.zzq(zzco.zzk()));
        for (int i10 = 0; i10 < zzfvs.size(); i10++) {
            zztw zztw2 = (zztw) zzfvs.get(i10);
            if (zzm(zztw2, zzf2, zzco.zzx(), zzco.zzb(), zzco.zzc(), zzc2)) {
                return zztw2;
            }
        }
        if (zzfvs.isEmpty() && zztw != null) {
            if (zzm(zztw, zzf2, zzco.zzx(), zzco.zzb(), zzco.zzc(), zzc2)) {
                return zztw;
            }
        }
        return null;
    }

    private final void zzk(zzfvu zzfvu, zztw zztw, zzcv zzcv) {
        if (zztw != null) {
            if (zzcv.zza(zztw.zza) != -1) {
                zzfvu.zza(zztw, zzcv);
                return;
            }
            zzcv zzcv2 = (zzcv) this.zzc.get(zztw);
            if (zzcv2 != null) {
                zzfvu.zza(zztw, zzcv2);
            }
        }
    }

    private final void zzl(zzcv zzcv) {
        zzfvu zzfvu = new zzfvu();
        if (this.zzb.isEmpty()) {
            zzk(zzfvu, this.zze, zzcv);
            if (!zzfsr.zza(this.zzf, this.zze)) {
                zzk(zzfvu, this.zzf, zzcv);
            }
            if (!zzfsr.zza(this.zzd, this.zze) && !zzfsr.zza(this.zzd, this.zzf)) {
                zzk(zzfvu, this.zzd, zzcv);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfvu, (zztw) this.zzb.get(i10), zzcv);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfvu, this.zzd, zzcv);
            }
        }
        this.zzc = zzfvu.zzc();
    }

    private static boolean zzm(zztw zztw, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zztw.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (!(zztw.zzb == i10 && zztw.zzc == i11)) {
                return false;
            }
        } else if (!(zztw.zzb == -1 && zztw.zze == i12)) {
            return false;
        }
        return true;
    }

    public final zzcv zza(zztw zztw) {
        return (zzcv) this.zzc.get(zztw);
    }

    public final zztw zzb() {
        return this.zzd;
    }

    public final zztw zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfvs zzfvs = this.zzb;
        if (!(zzfvs instanceof List)) {
            Iterator it = zzfvs.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzfvs.isEmpty()) {
            obj = zzfvs.get(zzfvs.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zztw) obj;
    }

    public final zztw zzd() {
        return this.zze;
    }

    public final zztw zze() {
        return this.zzf;
    }

    public final void zzg(zzco zzco) {
        this.zzd = zzj(zzco, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zztw zztw, zzco zzco) {
        this.zzb = zzfvs.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zztw) list.get(0);
            Objects.requireNonNull(zztw);
            this.zzf = zztw;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzco, this.zzb, this.zze, this.zza);
        }
        zzl(zzco.zzn());
    }

    public final void zzi(zzco zzco) {
        this.zzd = zzj(zzco, this.zzb, this.zze, this.zza);
        zzl(zzco.zzn());
    }
}
