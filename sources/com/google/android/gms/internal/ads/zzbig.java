package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbig implements zzbjj {
    public static final /* synthetic */ zzbig zza = new zzbig();

    private /* synthetic */ zzbig() {
    }

    public final void zza(Object obj, Map map) {
        zzchc zzchc = (zzchc) obj;
        zzbjj zzbjj = zzbji.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzcat.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzchc.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == null) {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str2, valueOf);
            zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
        }
        ((zzbmd) zzchc).zzd("openableURLs", hashMap);
    }
}
