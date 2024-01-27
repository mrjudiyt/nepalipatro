package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzqn implements zzpf {
    final /* synthetic */ zzqo zza;

    /* synthetic */ zzqn(zzqo zzqo, zzqm zzqm) {
        this.zza = zzqo;
    }

    public final void zza(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzqo zzqo = this.zza;
        if (zzqo.zzl != null) {
            zzqo.zzl.zzb();
        }
    }
}
