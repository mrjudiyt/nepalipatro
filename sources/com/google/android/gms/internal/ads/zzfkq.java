package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkq extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfko zzc;
    private float zzd;
    private final zzflb zze;

    public zzfkq(Handler handler, Context context, zzfko zzfko, zzflb zzflb) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzfko;
        this.zze = zzflb;
    }

    private final float zzc() {
        AudioManager audioManager = this.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void zzd() {
        this.zze.zze(this.zzd);
    }

    public final void onChange(boolean z10) {
        super.onChange(z10);
        float zzc2 = zzc();
        if (zzc2 != this.zzd) {
            this.zzd = zzc2;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
