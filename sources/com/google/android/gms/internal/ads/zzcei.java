package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcei implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcen zzk;

    zzcei(zzcen zzcen, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zzk = zzcen;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bufferedDuration", Long.toString(this.zzc));
        hashMap.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbO)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.zze));
            hashMap.put("qoeCachedBytes", Long.toString(this.zzf));
            hashMap.put("totalBytes", Long.toString(this.zzg));
            hashMap.put("reportTime", Long.toString(zzt.zzB().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.zzh ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put("playerCount", Integer.toString(this.zzi));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcen.zze(this.zzk, "onPrecacheEvent", hashMap);
    }
}
