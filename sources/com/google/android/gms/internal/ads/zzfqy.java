package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqy {
    /* access modifiers changed from: private */
    public static final zzfrl zzb = new zzfrl("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfrw zza;
    /* access modifiers changed from: private */
    public final String zzd;

    zzfqy(Context context) {
        if (zzfrz.zza(context)) {
            this.zza = new zzfrw(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfqt.zza, (zzfrr) null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zza != null) {
            zzb.zzc("unbind LMD display overlay service", new Object[0]);
            this.zza.zzu();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzfqp zzfqp, zzfrd zzfrd) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfqv(this, taskCompletionSource, zzfqp, zzfrd, taskCompletionSource), taskCompletionSource);
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfra zzfra, zzfrd zzfrd) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else if (zzfra.zzg() == null) {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfrb zzc2 = zzfrc.zzc();
            zzc2.zzb(8160);
            zzfrd.zza(zzc2.zzc());
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfqu(this, taskCompletionSource, zzfra, zzfrd, taskCompletionSource), taskCompletionSource);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzfrf zzfrf, zzfrd zzfrd, int i10) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfqw(this, taskCompletionSource, zzfrf, i10, zzfrd, taskCompletionSource), taskCompletionSource);
    }
}
