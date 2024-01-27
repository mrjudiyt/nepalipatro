package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfci extends zzbwo {
    private final zzfce zza;
    private final zzfbu zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zzfdf zzd;
    private final Context zze;
    private final zzcaz zzf;
    private final zzaro zzg;
    private final zzdso zzh;
    /* access modifiers changed from: private */
    public zzdox zzi;
    private boolean zzj = ((Boolean) zzba.zzc().zzb(zzbci.zzaC)).booleanValue();

    public zzfci(String str, zzfce zzfce, Context context, zzfbu zzfbu, zzfdf zzfdf, zzcaz zzcaz, zzaro zzaro, zzdso zzdso) {
        this.zzc = str;
        this.zza = zzfce;
        this.zzb = zzfbu;
        this.zzd = zzfdf;
        this.zze = context;
        this.zzf = zzcaz;
        this.zzg = zzaro;
        this.zzh = zzdso;
    }

    private final synchronized void zzu(zzl zzl, zzbww zzbww, int i10) {
        boolean z10 = false;
        if (((Boolean) zzbdz.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.zzf.zzc < ((Integer) zzba.zzc().zzb(zzbci.zzkn)).intValue() || !z10) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbww);
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zze)) {
            if (zzl.zzs == null) {
                zzcat.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zzbF(zzfeo.zzd(4, (String) null, (zze) null));
                return;
            }
        }
        if (this.zzi == null) {
            zzfbw zzfbw = new zzfbw((String) null);
            this.zza.zzj(i10);
            this.zza.zzb(zzl, this.zzc, zzfbw, new zzfch(this));
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdox = this.zzi;
        return zzdox != null ? zzdox.zza() : new Bundle();
    }

    public final zzdn zzc() {
        zzdox zzdox;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgJ)).booleanValue() && (zzdox = this.zzi) != null) {
            return zzdox.zzl();
        }
        return null;
    }

    public final zzbwm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdox = this.zzi;
        if (zzdox != null) {
            return zzdox.zzc();
        }
        return null;
    }

    public final synchronized String zze() {
        zzdox zzdox = this.zzi;
        if (zzdox == null || zzdox.zzl() == null) {
            return null;
        }
        return zzdox.zzl().zzg();
    }

    public final synchronized void zzf(zzl zzl, zzbww zzbww) {
        zzu(zzl, zzbww, 2);
    }

    public final synchronized void zzg(zzl zzl, zzbww zzbww) {
        zzu(zzl, zzbww, 3);
    }

    public final synchronized void zzh(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    public final void zzi(zzdd zzdd) {
        if (zzdd == null) {
            this.zzb.zzg((OnAdMetadataChangedListener) null);
        } else {
            this.zzb.zzg(new zzfcg(this, zzdd));
        }
    }

    public final void zzj(zzdg zzdg) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdg.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzi(zzdg);
    }

    public final void zzk(zzbws zzbws) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbws);
    }

    public final synchronized void zzl(zzbxd zzbxd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfdf zzfdf = this.zzd;
        zzfdf.zza = zzbxd.zza;
        zzfdf.zzb = zzbxd.zzb;
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper) {
        zzn(iObjectWrapper, this.zzj);
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzcat.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzp(zzfeo.zzd(9, (String) null, (zze) null));
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z10, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdox = this.zzi;
        return zzdox != null && !zzdox.zzf();
    }

    public final void zzp(zzbwx zzbwx) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwx);
    }
}
