package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcby implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzccg zzb;

    zzcby(zzccg zzccg, MediaPlayer mediaPlayer) {
        this.zzb = zzccg;
        this.zza = mediaPlayer;
    }

    public final void run() {
        zzccg.zzl(this.zzb, this.zza);
        zzccg zzccg = this.zzb;
        if (zzccg.zzq != null) {
            zzccg.zzq.zzf();
        }
    }
}
