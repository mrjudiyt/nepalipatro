package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzceh implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcen zze;

    zzceh(zzcen zzcen, String str, String str2, int i10, int i11, boolean z10) {
        this.zze = zzcen;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzcen.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
