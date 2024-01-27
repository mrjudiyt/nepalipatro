package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbii implements zzbjj {
    public static final /* synthetic */ zzbii zza = new zzbii();

    private /* synthetic */ zzbii() {
    }

    public final void zza(Object obj, Map map) {
        zzchc zzchc = (zzchc) obj;
        zzbjj zzbjj = zzbji.zza;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhY)).booleanValue()) {
            zzcat.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzcat.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzchc.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        zze.zza("/canOpenApp;" + str + ";" + valueOf);
        ((zzbmd) zzchc).zzd("openableApp", hashMap);
    }
}
