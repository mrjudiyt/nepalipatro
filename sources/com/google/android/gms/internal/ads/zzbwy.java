package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwy extends RewardedAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd = new zzbxh();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbwy(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzay.zza().zzq(context, str, new zzbou());
    }

    public final Bundle getAdMetadata() {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                return zzbwp.zzb();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    public final ResponseInfo getResponseInfo() {
        zzdn zzdn = null;
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzdn = zzbwp.zzc();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdn);
    }

    public final RewardItem getRewardItem() {
        try {
            zzbwp zzbwp = this.zzb;
            zzbwm zzd2 = zzbwp != null ? zzbwp.zzd() : null;
            if (zzd2 == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbwz(zzd2);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z10) {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzh(z10);
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbwp zzbwp = this.zzb;
                if (zzbwp != null) {
                    zzbwp.zzl(new zzbxd(serverSideVerificationOptions));
                }
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcat.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(zzdx zzdx, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzf(zzp.zza.zza(this.zzc, zzdx), new zzbxc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
