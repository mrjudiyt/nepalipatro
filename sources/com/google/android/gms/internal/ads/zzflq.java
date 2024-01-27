package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflq {
    /* access modifiers changed from: private */
    public static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzflp(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzflm.zza() != zzfki.CTV) {
            return 2;
        }
        return zza;
    }
}
