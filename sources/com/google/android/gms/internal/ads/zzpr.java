package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzpr implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzea zzb;

    public /* synthetic */ zzpr(AudioTrack audioTrack, zzea zzea) {
        this.zza = audioTrack;
        this.zzb = zzea;
    }

    public final void run() {
        zzqi.zzF(this.zza, this.zzb);
    }
}
