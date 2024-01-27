package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzep implements MediaContent {
    private final zzbfl zza;
    private final VideoController zzb = new VideoController();
    private final zzbgi zzc;

    public zzep(zzbfl zzbfl, zzbgi zzbgi) {
        this.zza = zzbfl;
        this.zzc = zzbgi;
    }

    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e10) {
            zzcat.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzb;
    }

    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final zzbgi zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return false;
        }
    }

    public final zzbfl zzc() {
        return this.zza;
    }
}
