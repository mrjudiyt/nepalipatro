package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzqg {
    final /* synthetic */ zzqi zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc;

    public zzqg(zzqi zzqi) {
        this.zza = zzqi;
        this.zzc = new zzqf(this, zzqi);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new zzqe(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages((Object) null);
    }
}
