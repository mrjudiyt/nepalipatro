package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqq extends zzawo {
    private final zzcqp zza;
    private final zzbu zzb;
    private final zzeyp zzc;
    private boolean zzd = ((Boolean) zzba.zzc().zzb(zzbci.zzaF)).booleanValue();
    private final zzdso zze;

    public zzcqq(zzcqp zzcqp, zzbu zzbu, zzeyp zzeyp, zzdso zzdso) {
        this.zza = zzcqp;
        this.zzb = zzbu;
        this.zzc = zzeyp;
        this.zze = zzdso;
    }

    public final zzbu zze() {
        return this.zzb;
    }

    public final zzdn zzf() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    public final void zzh(zzdg zzdg) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdg.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e10) {
                zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzn(zzdg);
        }
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzaww zzaww) {
        try {
            this.zzc.zzq(zzaww);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzaww, this.zzd);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
