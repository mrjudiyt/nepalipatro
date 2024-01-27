package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbco {
    private final String zza = ((String) zzbdv.zzb.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context, String str) {
        String str2;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, com.google.android.gms.ads.internal.util.zzt.zzr());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(context);
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        linkedHashMap.put("is_lite_sdk", true != zzD ? str3 : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        Future zzb2 = zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvl) zzb2.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvl) zzb2.get()).zzl));
        } catch (Exception e10) {
            zzt.zzo().zzu(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkq)).booleanValue()) {
            Map map = this.zzb;
            zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzA(context) ? AppEventsConstants.EVENT_PARAM_VALUE_YES : str3);
        }
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
