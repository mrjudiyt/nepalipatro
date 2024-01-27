package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzax implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzax(zzay zzay, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
    }

    public final void run() {
        zzt.zzp();
        AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
        zzJ.setMessage(this.zzb);
        if (this.zzc) {
            zzJ.setTitle("Error");
        } else {
            zzJ.setTitle("Info");
        }
        if (this.zzd) {
            zzJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzJ.setPositiveButton("Learn More", new zzaw(this));
            zzJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzJ.create().show();
    }
}
