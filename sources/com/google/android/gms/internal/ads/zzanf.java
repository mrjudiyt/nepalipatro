package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzanf extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzanf(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.zza = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() {
        super.close();
        this.zza.disconnect();
    }
}
