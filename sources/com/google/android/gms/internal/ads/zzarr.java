package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzarr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzars zza;

    zzarr(zzars zzars) {
        this.zza = zzars;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzars.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzars.class) {
            this.zza.zza = null;
        }
    }
}
