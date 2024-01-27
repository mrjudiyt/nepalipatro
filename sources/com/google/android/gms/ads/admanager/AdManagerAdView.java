package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcai;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(getContext());
        if (((Boolean) zzbdz.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new zzb(this, adManagerAdRequest));
                return;
            }
        }
        this.zza.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.zza.zzw(z10);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e10) {
            zzbty.zza(getContext()).zzf(e10, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(zzbu zzbu) {
        return this.zza.zzz(zzbu);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
