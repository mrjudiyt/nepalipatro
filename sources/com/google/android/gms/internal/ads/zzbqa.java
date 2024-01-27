package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqa implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzbpd zza;
    private UnifiedNativeAdMapper zzb;
    private NativeCustomTemplateAd zzc;

    public zzbqa(zzbpd zzbpd) {
        this.zza = zzbpd;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzb;
        if (this.zzc == null) {
            if (unifiedNativeAdMapper == null) {
                zzcat.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzcat.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcat.zze("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final NativeCustomTemplateAd zza() {
        return this.zzc;
    }

    public final UnifiedNativeAdMapper zzb() {
        return this.zzb;
    }

    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(nativeCustomTemplateAd.getCustomTemplateId())));
        this.zzc = nativeCustomTemplateAd;
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zze(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzbgj) {
            try {
                this.zza.zzr(((zzbgj) nativeCustomTemplateAd).zza(), str);
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        } else {
            zzcat.zzj("Unexpected native custom template ad type.");
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        zzcat.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + code + ". ErrorMessage: " + message + ". ErrorDomain: " + domain);
        try {
            this.zza.zzh(adError.zza());
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzb;
        if (this.zzc == null) {
            if (unifiedNativeAdMapper == null) {
                zzcat.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzcat.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcat.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdLoaded.");
        this.zzb = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new zzbpn());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        zzcat.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + code + ". ErrorMessage: " + message + ". ErrorDomain: " + domain);
        try {
            this.zza.zzh(adError.zza());
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcat.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        zzcat.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + code + ". ErrorMessage: " + message + ". ErrorDomain: " + domain);
        try {
            this.zza.zzh(adError.zza());
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
