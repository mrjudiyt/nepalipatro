package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcgn {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcgb] */
    public static final zzcgb zza(Context context, zzchq zzchq, String str, boolean z10, boolean z11, zzaro zzaro, zzbdk zzbdk, zzcaz zzcaz, zzbda zzbda, zzl zzl, zza zza, zzaxv zzaxv, zzfcr zzfcr, zzfcv zzfcv, zzedz zzedz) {
        StrictMode.ThreadPolicy threadPolicy;
        zzbci.zza(context);
        try {
            zzcgk zzcgk = new zzcgk(context, zzchq, str, z10, z11, zzaro, zzbdk, zzcaz, (zzbda) null, zzl, zza, zzaxv, zzfcr, zzfcv, zzedz);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = zzcgk.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new zzcgm("Webview initialization failed.", th);
        }
    }
}
