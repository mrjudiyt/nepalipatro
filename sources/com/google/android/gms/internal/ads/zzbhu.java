package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbhu implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbu zzb;
    final /* synthetic */ zzbhv zzc;

    zzbhu(zzbhv zzbhv, AdManagerAdView adManagerAdView, zzbu zzbu) {
        this.zzc = zzbhv;
        this.zza = adManagerAdView;
        this.zzb = zzbu;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            zzbhv zzbhv = this.zzc;
            zzbhv.zza.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzcat.zzj("Could not bind.");
    }
}
