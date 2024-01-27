package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeyp implements zzcxo, zzczk, zzfaf, zzo, zzczw, zzcyb, zzdfd {
    private final zzfew zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzeyp zzh = null;

    public zzeyp(zzfew zzfew) {
        this.zza = zzfew;
    }

    public static zzeyp zzi(zzeyp zzeyp) {
        zzeyp zzeyp2 = new zzeyp(zzeyp.zza);
        zzeyp2.zzh = zzeyp;
        return zzeyp2;
    }

    public final void zzbF(zze zze2) {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzbF(zze2);
            return;
        }
        zzezw.zza(this.zzb, new zzeyk(zze2));
        zzezw.zza(this.zzb, new zzeyl(zze2));
    }

    public final void zzbK() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzbK();
        } else {
            zzezw.zza(this.zzd, zzeyg.zza);
        }
    }

    public final void zzbL() {
    }

    public final void zzbo() {
    }

    public final void zzbu() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzbu();
        } else {
            zzezw.zza(this.zzf, zzeyd.zza);
        }
    }

    public final void zzbv() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzbv();
            return;
        }
        zzezw.zza(this.zzf, zzeyo.zza);
        zzezw.zza(this.zzd, zzeyb.zza);
        zzezw.zza(this.zzd, zzeyc.zza);
    }

    public final void zzbx() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzbx();
        } else {
            zzezw.zza(this.zzf, zzeyn.zza);
        }
    }

    public final void zzby(int i10) {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzby(i10);
        } else {
            zzezw.zza(this.zzf, new zzeyj(i10));
        }
    }

    public final void zzg() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzg();
        } else {
            zzezw.zza(this.zze, zzeym.zza);
        }
    }

    public final void zzh(zzs zzs) {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzh(zzs);
        } else {
            zzezw.zza(this.zzg, new zzeya(zzs));
        }
    }

    public final void zzj() {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzj();
            return;
        }
        this.zza.zza();
        zzezw.zza(this.zzc, zzeyh.zza);
        zzezw.zza(this.zzd, zzeyi.zza);
    }

    public final void zzk(zzawp zzawp) {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzk(zzawp);
        } else {
            zzezw.zza(this.zzb, new zzeyf(zzawp));
        }
    }

    public final void zzl(zzfaf zzfaf) {
        this.zzh = (zzeyp) zzfaf;
    }

    public final void zzm(zzo zzo) {
        this.zzf.set(zzo);
    }

    public final void zzn(zzdg zzdg) {
        this.zzg.set(zzdg);
    }

    public final void zzo(zzaws zzaws) {
        this.zzb.set(zzaws);
    }

    public final void zzp(zze zze2) {
        zzeyp zzeyp = this.zzh;
        if (zzeyp != null) {
            zzeyp.zzp(zze2);
        } else {
            zzezw.zza(this.zzd, new zzeye(zze2));
        }
    }

    public final void zzq(zzaww zzaww) {
        this.zzd.set(zzaww);
    }

    public final void zzs() {
    }
}
