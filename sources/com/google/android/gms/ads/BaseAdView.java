package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class BaseAdView extends ViewGroup {
    protected final zzea zza;

    protected BaseAdView(Context context, int i10) {
        super(context);
        this.zza = new zzea(this, i10);
    }

    public void destroy() {
        zzbci.zza(getContext());
        if (((Boolean) zzbdz.zze.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkj)).booleanValue()) {
                zzcai.zzb.execute(new zzd(this));
                return;
            }
        }
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isLoading() {
        return this.zza.zzA();
    }

    public void loadAd(AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(getContext());
        if (((Boolean) zzbdz.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new zzf(this, adRequest));
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        AdSize adSize;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                zzcat.zzh("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i12 = adSize.getHeightInPixels(context);
                i13 = widthInPixels;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void pause() {
        zzbci.zza(getContext());
        if (((Boolean) zzbdz.zzg.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkk)).booleanValue()) {
                zzcai.zzb.execute(new zze(this));
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbci.zza(getContext());
        if (((Boolean) zzbdz.zzh.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzki)).booleanValue()) {
                zzcai.zzb.execute(new zzc(this));
                return;
            }
        }
        this.zza.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == null) {
            this.zza.zzq((zza) null);
            return;
        }
        if (adListener instanceof zza) {
            this.zza.zzq((zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false, i10);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.zza = new zzea(this, attributeSet, false, i11);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11, boolean z10) {
        super(context, attributeSet, i10);
        this.zza = new zzea(this, attributeSet, z10, i11);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, z10);
    }
}
