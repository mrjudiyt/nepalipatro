package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbie implements zzfsk {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbie(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        zzbjj zzbjj = zzbji.zza;
        String str2 = this.zza;
        if (str != null) {
            if (((Boolean) zzbea.zzf.zze()).booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str2).getHost();
                int i10 = 0;
                while (true) {
                    if (i10 < 3) {
                        if (host.endsWith(strArr[i10])) {
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            String str3 = (String) zzbea.zza.zze();
            String str4 = (String) zzbea.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                str2 = str2.replace(str3, str);
            }
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str2);
                if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                    return parse.buildUpon().appendQueryParameter(str4, str).toString();
                }
            }
        }
        return str2;
    }
}
