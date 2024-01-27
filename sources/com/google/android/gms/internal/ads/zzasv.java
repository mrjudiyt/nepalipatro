package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzasv extends BroadcastReceiver {
    final /* synthetic */ zzasw zza;

    zzasv(zzasw zzasw) {
        this.zza = zzasw;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
