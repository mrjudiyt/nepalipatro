package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzdfd;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzy extends zzbsu {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (!this.zzd) {
            zzo zzo = this.zza.zzc;
            if (zzo != null) {
                zzo.zzby(4);
            }
            this.zzd = true;
        }
    }

    public final boolean zzH() {
        return false;
    }

    public final void zzh(int i10, int i11, Intent intent) {
    }

    public final void zzi() {
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
    }

    public final void zzl(Bundle bundle) {
        zzo zzo;
        if (((Boolean) zzba.zzc().zzb(zzbci.zziD)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z10) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                zza zza2 = adOverlayInfoParcel.zzb;
                if (zza2 != null) {
                    zza2.onAdClicked();
                }
                zzdfd zzdfd = this.zza.zzu;
                if (zzdfd != null) {
                    zzdfd.zzbK();
                }
                if (!(this.zzb.getIntent() == null || !this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzo = this.zza.zzc) == null)) {
                    zzo.zzbv();
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzt.zzh();
            zzc zzc2 = adOverlayInfoParcel2.zza;
            if (!zza.zzb(activity, zzc2, adOverlayInfoParcel2.zzi, zzc2.zzi)) {
                this.zzb.finish();
            }
        }
    }

    public final void zzm() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    public final void zzo() {
        zzo zzo = this.zza.zzc;
        if (zzo != null) {
            zzo.zzbo();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    public final void zzq() {
    }

    public final void zzr() {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzo = this.zza.zzc;
        if (zzo != null) {
            zzo.zzbL();
        }
    }

    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    public final void zzt() {
    }

    public final void zzu() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    public final void zzv() {
        zzo zzo = this.zza.zzc;
        if (zzo != null) {
            zzo.zzbx();
        }
    }

    public final void zzx() {
        this.zze = true;
    }
}
