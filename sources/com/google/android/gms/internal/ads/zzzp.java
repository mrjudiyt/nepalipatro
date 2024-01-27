package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzzp implements DisplayManager.DisplayListener, zzzn {
    private final DisplayManager zza;
    private zzzk zzb;

    private zzzp(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzzn zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzzp(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    public final void onDisplayAdded(int i10) {
    }

    public final void onDisplayChanged(int i10) {
        zzzk zzzk = this.zzb;
        if (zzzk != null && i10 == 0) {
            zzzr.zzb(zzzk.zza, zzd());
        }
    }

    public final void onDisplayRemoved(int i10) {
    }

    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    public final void zzb(zzzk zzzk) {
        this.zzb = zzzk;
        this.zza.registerDisplayListener(this, zzfk.zzv((Handler.Callback) null));
        zzzr.zzb(zzzk.zza, zzd());
    }
}
