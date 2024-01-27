package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbht {
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbht(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd zzf(zzbgi zzbgi) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbgj zzbgj = new zzbgj(zzbgi);
        this.zzc = zzbgj;
        return zzbgj;
    }

    public final zzbgs zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhq(this, (zzbhp) null);
    }

    public final zzbgv zze() {
        return new zzbhs(this, (zzbhr) null);
    }
}
