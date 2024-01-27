package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcn;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzexn implements Callable {
    public static final /* synthetic */ zzexn zza = new zzexn();

    private /* synthetic */ zzexn() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzba.zzc().zzb(zzbci.zzK);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zzb(zzbci.zzL)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzcn.zza(str2));
                }
            }
        }
        return new zzexp(hashMap);
    }
}
