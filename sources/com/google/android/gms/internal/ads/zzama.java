package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzama extends Thread {
    private final BlockingQueue zza;
    private final zzalz zzb;
    private final zzalq zzc;
    private volatile boolean zzd = false;
    private final zzalx zze;

    public zzama(BlockingQueue blockingQueue, zzalz zzalz, zzalq zzalq, zzalx zzalx) {
        this.zza = blockingQueue;
        this.zzb = zzalz;
        this.zzc = zzalq;
        this.zze = zzalx;
    }

    private void zzb() {
        zzamg zzamg = (zzamg) this.zza.take();
        SystemClock.elapsedRealtime();
        zzamg.zzt(3);
        try {
            zzamg.zzm("network-queue-take");
            zzamg.zzw();
            TrafficStats.setThreadStatsTag(zzamg.zzc());
            zzamc zza2 = this.zzb.zza(zzamg);
            zzamg.zzm("network-http-complete");
            if (!zza2.zze || !zzamg.zzv()) {
                zzamm zzh = zzamg.zzh(zza2);
                zzamg.zzm("network-parse-complete");
                if (zzh.zzb != null) {
                    this.zzc.zzd(zzamg.zzj(), zzh.zzb);
                    zzamg.zzm("network-cache-written");
                }
                zzamg.zzq();
                this.zze.zzb(zzamg, zzh, (Runnable) null);
                zzamg.zzs(zzh);
                zzamg.zzt(4);
                return;
            }
            zzamg.zzp("not-modified");
            zzamg.zzr();
        } catch (zzamp e10) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzamg, e10);
            zzamg.zzr();
        } catch (Exception e11) {
            zzams.zzc(e11, "Unhandled exception %s", e11.toString());
            zzamp zzamp = new zzamp((Throwable) e11);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzamg, zzamp);
            zzamg.zzr();
        } finally {
            zzamg.zzt(4);
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzams.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
