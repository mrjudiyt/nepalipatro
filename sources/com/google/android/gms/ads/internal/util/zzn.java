package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfps;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzn implements Callable {
    public final /* synthetic */ Uri zza;

    public /* synthetic */ zzn(Uri uri) {
        this.zza = uri;
    }

    public final Object call() {
        zzfps zzfps = zzt.zza;
        zzt.zzp();
        return zzt.zzO(this.zza);
    }
}
