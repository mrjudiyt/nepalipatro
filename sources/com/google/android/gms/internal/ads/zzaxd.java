package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxd {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzawz(this);
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public zzaxg zzd;
    private Context zze;
    /* access modifiers changed from: private */
    public zzaxj zzf;

    static /* bridge */ /* synthetic */ void zzh(zzaxd zzaxd) {
        synchronized (zzaxd.zzc) {
            zzaxg zzaxg = zzaxd.zzd;
            if (zzaxg != null) {
                if (zzaxg.isConnected() || zzaxd.zzd.isConnecting()) {
                    zzaxd.zzd.disconnect();
                }
                zzaxd.zzd = null;
                zzaxd.zzf = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzc
            monitor-enter(r0)
            android.content.Context r1 = r3.zze     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzaxg r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzaxb r1 = new com.google.android.gms.internal.ads.zzaxb     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzaxc r2 = new com.google.android.gms.internal.ads.zzaxc     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzaxg r1 = r3.zzd(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.zzd = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxd.zzl():void");
    }

    public final long zza(zzaxh zzaxh) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2;
            }
            if (this.zzd.zzp()) {
                try {
                    long zze2 = this.zzf.zze(zzaxh);
                    return zze2;
                } catch (RemoteException e10) {
                    zzcat.zzh("Unable to call into cache service.", e10);
                    return -2;
                }
            }
        }
    }

    public final zzaxe zzb(zzaxh zzaxh) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                zzaxe zzaxe = new zzaxe();
                return zzaxe;
            }
            try {
                if (this.zzd.zzp()) {
                    zzaxe zzg = this.zzf.zzg(zzaxh);
                    return zzg;
                }
                zzaxe zzf2 = this.zzf.zzf(zzaxh);
                return zzf2;
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call into cache service.", e10);
                return new zzaxe();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized zzaxg zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzaxg(this.zze, zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            android.content.Context r1 = r2.zze     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zze = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzeb     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.zzl()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbci.zzea     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzaxa r3 = new com.google.android.gms.internal.ads.zzaxa     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzavq r1 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ all -> 0x0048 }
            r1.zzc(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxd.zzi(android.content.Context):void");
    }

    public final void zzj() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzec)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcbg.zzd.schedule(this.zzb, ((Long) zzba.zzc().zzb(zzbci.zzed)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
