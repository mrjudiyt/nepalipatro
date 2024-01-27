package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfij {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfij(Context context, zzcaz zzcaz) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcaz.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, com.google.android.gms.ads.internal.util.zzt.zzr());
        map.put("app", this.zzb);
        zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zza);
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        map.put("is_lite_sdk", true != zzD ? str : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzbca zzbca = zzbci.zza;
        List zzb2 = zzba.zza().zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgQ)).booleanValue()) {
            zzb2.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb2));
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkq)).booleanValue()) {
            zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzt.zzA(this.zza)) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            }
            map.put("is_bstar", str);
        }
    }
}
