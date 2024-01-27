package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzhz implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzib zza;
    private final Handler zzb;

    public zzhz(zzib zzib, Handler handler) {
        this.zza = zzib;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int i10) {
        this.zzb.post(new zzhy(this, i10));
    }
}
