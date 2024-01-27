package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzflp extends BroadcastReceiver {
    zzflp() {
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                zzflq.zza = 1;
            } else if (intExtra == 1) {
                zzflq.zza = 2;
            }
        }
    }
}
