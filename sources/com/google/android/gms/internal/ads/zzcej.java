package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcej implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcen zzj;

    zzcej(zzcen zzcen, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zzj = zzcen;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", Long.toString(this.zze));
        hashMap.put("totalDuration", Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put("playerCount", Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcen.zze(this.zzj, "onPrecacheEvent", hashMap);
    }
}
