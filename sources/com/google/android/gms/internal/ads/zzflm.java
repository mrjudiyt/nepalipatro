package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflm {
    private static UiModeManager zza;

    public static zzfki zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfki.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType == 1) {
            return zzfki.MOBILE;
        }
        if (currentModeType != 4) {
            return zzfki.OTHER;
        }
        return zzfki.CTV;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
