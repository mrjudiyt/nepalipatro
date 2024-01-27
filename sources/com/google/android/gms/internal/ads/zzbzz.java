package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbzz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcac zza;

    zzbzz(zzcac zzcac) {
        this.zza = zzcac;
    }

    public final void onAvailable(Network network) {
        this.zza.zzn.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzn.set(false);
    }
}
