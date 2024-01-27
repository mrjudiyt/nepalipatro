package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class SearchAdView extends ViewGroup {
    private final zzea zza;

    public SearchAdView(Context context) {
        super(context);
        this.zza = new zzea(this);
    }

    public void destroy() {
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

    public void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.zza.zzm(dynamicHeightSearchAdRequest.zza());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
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
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zza = new zzea(this, attributeSet, false);
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.zza.zzm(searchAdRequest.zza());
    }
}
