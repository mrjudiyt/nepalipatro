package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzzo implements zzzn {
    private final WindowManager zza;

    private zzzo(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzzn zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzzo(windowManager);
        }
        return null;
    }

    public final void zza() {
    }

    public final void zzb(zzzk zzzk) {
        zzzr.zzb(zzzk.zza, this.zza.getDefaultDisplay());
    }
}
