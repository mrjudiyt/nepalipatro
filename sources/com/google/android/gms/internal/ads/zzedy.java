package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzedy extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzl zzc;

    zzedy(zzedz zzedz, AlertDialog alertDialog, Timer timer, zzl zzl) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzl;
    }

    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        zzl zzl = this.zzc;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
