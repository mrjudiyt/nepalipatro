package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepl implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzepl(zzgad zzgad, Context context) {
        this.zza = zzgad;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final e zzb() {
        return this.zza.zzb(new zzepk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepm zzc() {
        int i10;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i11 = -1;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkb)).booleanValue()) {
            i10 = zzt.zzq().zzk(audioManager);
            i11 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
        }
        return new zzepm(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i10, i11, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }
}
