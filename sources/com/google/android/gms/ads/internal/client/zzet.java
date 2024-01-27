package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzet extends zzbm {
    final /* synthetic */ zzeu zza;

    /* synthetic */ zzet(zzeu zzeu, zzes zzes) {
        this.zza = zzeu;
    }

    public final String zze() {
        return null;
    }

    public final String zzf() {
        return null;
    }

    public final void zzg(zzl zzl) {
        zzh(zzl, 1);
    }

    public final void zzh(zzl zzl, int i10) {
        zzcat.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcam.zza.post(new zzer(this));
    }

    public final boolean zzi() {
        return false;
    }
}
