package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzxb {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxb(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static zzxb zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zzxb(audioManager.getSpatializer());
    }

    public final void zzb(zzxi zzxi, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxa(this, zzxi);
            Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new zzwz(handler), this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i10 = zzfk.zza;
            handler.removeCallbacksAndMessages((Object) null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzk, zzam zzam) {
        int i10;
        if (!"audio/eac3-joc".equals(zzam.zzm) || zzam.zzz != 16) {
            i10 = zzam.zzz;
        } else {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzfk.zzg(i10));
        int i11 = zzam.zzA;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.zza.canBeSpatialized(zzk.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
