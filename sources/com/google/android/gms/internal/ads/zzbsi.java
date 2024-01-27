package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsi {
    /* access modifiers changed from: private */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    /* access modifiers changed from: private */
    public final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbsi(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomFormatAd zzf(zzbgi zzbgi) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbsj zzbsj = new zzbsj(zzbgi);
        this.zzc = zzbsj;
        return zzbsj;
    }

    public final zzbgs zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbsf(this, (zzbse) null);
    }

    public final zzbgv zzb() {
        return new zzbsh(this, (zzbsg) null);
    }
}
