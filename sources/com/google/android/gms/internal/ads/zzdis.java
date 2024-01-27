package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdis extends zzbfk {
    private final zzdjj zza;
    private IObjectWrapper zzb;

    public zzdis(zzdjj zzdjj) {
        this.zza = zzdjj;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final float zze() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgi)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e10) {
                zzcat.zzh("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        } else {
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzbfo zzm = this.zza.zzm();
            if (zzm == null) {
                return 0.0f;
            }
            float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : ((float) zzm.zzd()) / ((float) zzm.zzc());
            return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
        }
    }

    public final float zzf() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    public final float zzg() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    public final zzdq zzh() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    public final IObjectWrapper zzi() {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfo zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    public final boolean zzk() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue()) {
            return false;
        }
        return this.zza.zzaf();
    }

    public final boolean zzl() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue() && this.zza.zzj() != null) {
            return true;
        }
        return false;
    }

    public final void zzm(zzbgw zzbgw) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgj)).booleanValue() && (this.zza.zzj() instanceof zzcgx)) {
            ((zzcgx) this.zza.zzj()).zzv(zzbgw);
        }
    }
}
