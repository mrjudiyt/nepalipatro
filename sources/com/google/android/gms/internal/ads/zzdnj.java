package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnj extends zzblu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbez {
    private View zza;
    private zzdq zzb;
    private zzdje zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdnj(zzdje zzdje, zzdjj zzdjj) {
        this.zza = zzdjj.zzf();
        this.zzb = zzdjj.zzj();
        this.zzc = zzdje;
        if (zzdjj.zzs() != null) {
            zzdjj.zzs().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdje zzdje = this.zzc;
        if (zzdje != null && (view = this.zza) != null) {
            zzdje.zzz(view, Collections.emptyMap(), Collections.emptyMap(), zzdje.zzV(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbly zzbly, int i10) {
        try {
            zzbly.zze(i10);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzdq zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzcat.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbfl zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcat.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdje zzdje = this.zzc;
        if (zzdje == null || zzdje.zzc() == null) {
            return null;
        }
        return zzdje.zzc().zza();
    }

    public final void zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdje zzdje = this.zzc;
        if (zzdje != null) {
            zzdje.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdni(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbly zzbly) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcat.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbly, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzcat.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbly, 0);
        } else if (this.zze) {
            zzcat.zzg("Instream ad should not be used again.");
            zzi(zzbly, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            zzcbt.zza(this.zza, this);
            zzt.zzx();
            zzcbt.zzb(this.zza, this);
            zzg();
            try {
                zzbly.zzf();
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
