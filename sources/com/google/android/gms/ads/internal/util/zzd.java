package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbj;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzd {
    public static void zza(Context context) {
        int i10 = zzcas.zza;
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !zzcas.zzl()) {
                    e zzb = new zzc(context).zzb();
                    zzcat.zzi("Updating ad debug logging enablement.");
                    zzcbj.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e10) {
                zzcat.zzk("Fail to determine debug setting.", e10);
            }
        }
    }
}
