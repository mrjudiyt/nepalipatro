package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbin implements zzbjj {
    zzbin() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        zzt.zzp();
        DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs((WindowManager) zzcgb.getContext().getSystemService("window"));
        int i10 = zzs.widthPixels;
        int i11 = zzs.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcgb).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcgb.zzd("locationReady", hashMap);
        zzcat.zzj("GET LOCATION COMPILED");
    }
}
