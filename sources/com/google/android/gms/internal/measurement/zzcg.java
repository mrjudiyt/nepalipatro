package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzcg extends zzcd {
    private zzcg() {
    }

    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }
}
