package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbcn {
    /* JADX INFO: finally extract failed */
    public static Object zza(zzftm zzftm) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object zza = zzftm.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
