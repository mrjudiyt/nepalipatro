package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzhv extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzhx zza;
    private final zzhw zzb;
    private final Handler zzc;

    public zzhv(zzhx zzhx, Handler handler, zzhw zzhw) {
        this.zza = zzhx;
        this.zzc = handler;
        this.zzb = zzhw;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    public final void run() {
    }
}
