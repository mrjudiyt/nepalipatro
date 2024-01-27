package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzegr extends zzbwg implements zzcyv {
    private zzbwh zza;
    private zzcyu zzb;
    private zzdfo zzc;

    public final synchronized void zza(zzcyu zzcyu) {
        this.zzb = zzcyu;
    }

    public final synchronized void zzc(zzbwh zzbwh) {
        this.zza = zzbwh;
    }

    public final synchronized void zzd(zzdfo zzdfo) {
        this.zzc = zzdfo;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            zzbwh.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) {
        zzcyu zzcyu = this.zzb;
        if (zzcyu != null) {
            zzcyu.zza(i10);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        zzcyu zzcyu = this.zzb;
        if (zzcyu != null) {
            zzcyu.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zza.zzbv();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) {
        zzdfo zzdfo = this.zzc;
        if (zzdfo != null) {
            zzcat.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzeju) zzdfo).zzc.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        zzdfo zzdfo = this.zzc;
        if (zzdfo != null) {
            Executor zzc2 = ((zzeju) zzdfo).zzd.zzb;
            zzeex zzeex = ((zzeju) zzdfo).zzc;
            zzfcr zzfcr = ((zzeju) zzdfo).zzb;
            zzc2.execute(new zzejt((zzeju) zzdfo, ((zzeju) zzdfo).zza, zzfcr, zzeex));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwi) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zzd.zza(zzbwi);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zzc.zze();
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzejv) zzbwh).zzd.zzc();
        }
    }
}
