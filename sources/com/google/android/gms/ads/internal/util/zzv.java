package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcam;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzv extends zzu {
    static final boolean zzf(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeH)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeJ)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzay.zzb();
        int zzx = zzcam.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzcam.zzx(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzs = zzt.zzs((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i10 = zzs.heightPixels;
        int i11 = zzs.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzba.zzc().zzb(zzbci.zzeF)).intValue();
        if (!zzf(i10, zzx + dimensionPixelSize, round) || !zzf(i11, zzx2, round)) {
            return true;
        }
        return false;
    }
}
