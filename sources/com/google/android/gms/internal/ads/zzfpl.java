package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzfpl implements zzfpm {
    public final /* synthetic */ URL zza;

    public /* synthetic */ zzfpl(URL url) {
        this.zza = url;
    }

    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}
