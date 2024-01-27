package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzqf extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqi zza;
    final /* synthetic */ zzqg zzb;

    zzqf(zzqg zzqg, zzqi zzqi) {
        this.zzb = zzqg;
        this.zza = zzqi;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzqi zzqi = this.zzb.zza;
            if (zzqi.zzp != null && zzqi.zzQ) {
                zzqi.zzp.zzb();
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzqi zzqi = this.zzb.zza;
            if (zzqi.zzp != null && zzqi.zzQ) {
                zzqi.zzp.zzb();
            }
        }
    }
}
