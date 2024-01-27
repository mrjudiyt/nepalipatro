package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcco implements Runnable {
    final /* synthetic */ zzccq zza;

    zzcco(zzccq zzccq) {
        this.zza = zzccq;
    }

    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
