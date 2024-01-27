package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzccp implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzccq zzb;

    zzccp(zzccq zzccq, boolean z10) {
        this.zzb = zzccq;
        this.zza = z10;
    }

    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
