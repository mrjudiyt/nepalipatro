package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcek implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcen zzd;

    zzcek(zzcen zzcen, String str, String str2, int i10) {
        this.zzd = zzcen;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcen.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
