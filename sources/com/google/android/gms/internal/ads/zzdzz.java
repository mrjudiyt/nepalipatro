package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdzz extends zzeaf {
    private zzbuo zzh;

    zzdzz(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r4 = r3.zzc     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x0037
            r4 = 1
            r3.zzc = r4     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzbuj r0 = r3.zzd     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzbuw r0 = r0.zzp()     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzbuo r1 = r3.zzh     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzeae r2 = new com.google.android.gms.internal.ads.zzeae     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r0.zze(r1, r2)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            monitor-exit(r3)
            return
        L_0x001a:
            r4 = move-exception
            java.lang.String r0 = "RemoteAdsServiceProxyClientTask.onConnected"
            com.google.android.gms.internal.ads.zzcac r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0039 }
            r1.zzu(r4, r0)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzcbl r0 = r3.zza     // Catch:{ all -> 0x0039 }
            r0.zzd(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x002b:
            com.google.android.gms.internal.ads.zzcbl r0 = r3.zza     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzdyo r1 = new com.google.android.gms.internal.ads.zzdyo     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            r0.zzd(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzz.onConnected(android.os.Bundle):void");
    }

    public final synchronized e zza(zzbuo zzbuo, long j10) {
        if (this.zzb) {
            return zzfzt.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbuo;
        zzb();
        e zzo = zzfzt.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new zzdzy(this), zzcbg.zzf);
        return zzo;
    }
}
