package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgj implements NativeCustomTemplateAd {
    private final zzbgi zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzd;

    public zzbgj(zzbgi zzbgi) {
        Context context;
        this.zza = zzbgi;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbgi.zzh());
        } catch (RemoteException | NullPointerException e10) {
            zzcat.zzh("", e10);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzs(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e11) {
                zzcat.zzh("", e11);
            }
        }
        this.zzb = mediaView;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return null;
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbfi(this.zza);
            }
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
        return this.zzd;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzbfo zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbfp(zzg);
            }
            return null;
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzdq zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e10) {
            zzcat.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzc;
    }

    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final zzbgi zza() {
        return this.zza;
    }
}
