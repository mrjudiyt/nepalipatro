package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbrl implements zzo {
    final /* synthetic */ zzbrn zza;

    zzbrl(zzbrn zzbrn) {
        this.zza = zzbrn;
    }

    public final void zzbL() {
        zzcat.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbo() {
        zzcat.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzbu() {
        zzcat.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbv() {
        zzcat.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrn zzbrn = this.zza;
        zzbrn.zzb.onAdOpened(zzbrn);
    }

    public final void zzbx() {
    }

    public final void zzby(int i10) {
        zzcat.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrn zzbrn = this.zza;
        zzbrn.zzb.onAdClosed(zzbrn);
    }
}
