package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzfk extends zzds {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzfk(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    public final void zze() {
        this.zza.onVideoEnd();
    }

    public final void zzf(boolean z10) {
        this.zza.onVideoMute(z10);
    }

    public final void zzg() {
        this.zza.onVideoPause();
    }

    public final void zzh() {
        this.zza.onVideoPlay();
    }

    public final void zzi() {
        this.zza.onVideoStart();
    }
}
