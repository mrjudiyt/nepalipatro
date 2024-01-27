package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzals extends Thread {
    private static final boolean zza = zzams.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzalq zzd;
    private volatile boolean zze = false;
    private final zzamt zzf;
    private final zzalx zzg;

    public zzals(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzalq zzalq, zzalx zzalx) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzalq;
        this.zzg = zzalx;
        this.zzf = new zzamt(this, blockingQueue2, zzalx);
    }

    private void zzc() {
        zzamg zzamg = (zzamg) this.zzb.take();
        zzamg.zzm("cache-queue-take");
        zzamg.zzt(1);
        try {
            zzamg.zzw();
            zzalp zza2 = this.zzd.zza(zzamg.zzj());
            if (zza2 == null) {
                zzamg.zzm("cache-miss");
                if (!this.zzf.zzc(zzamg)) {
                    this.zzc.put(zzamg);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzamg.zzm("cache-hit-expired");
                zzamg.zze(zza2);
                if (!this.zzf.zzc(zzamg)) {
                    this.zzc.put(zzamg);
                }
                zzamg.zzt(2);
                return;
            }
            zzamg.zzm("cache-hit");
            zzamm zzh = zzamg.zzh(new zzamc(zza2.zza, zza2.zzg));
            zzamg.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzamg.zzm("cache-parsing-failed");
                this.zzd.zzc(zzamg.zzj(), true);
                zzamg.zze((zzalp) null);
                if (!this.zzf.zzc(zzamg)) {
                    this.zzc.put(zzamg);
                }
                zzamg.zzt(2);
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzamg.zzm("cache-hit-refresh-needed");
                zzamg.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzamg)) {
                    this.zzg.zzb(zzamg, zzh, new zzalr(this, zzamg));
                } else {
                    this.zzg.zzb(zzamg, zzh, (Runnable) null);
                }
            } else {
                this.zzg.zzb(zzamg, zzh, (Runnable) null);
            }
            zzamg.zzt(2);
        } finally {
            zzamg.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzams.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzams.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
