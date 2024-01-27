package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfei {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            zzcat.zzi("This request is sent from a test device.");
            return;
        }
        zzay.zzb();
        String zzy = zzcam.zzy(context);
        zzcat.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzy + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th, String str) {
        zzcat.zzi("Ad failed to load : " + i10);
        zze.zzb(str, th);
        if (i10 != 3) {
            zzt.zzo().zzt(th, str);
        }
    }
}
