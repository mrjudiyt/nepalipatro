package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzhc extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhd<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzgy zzd;

    public zzhc(zzgy zzgy, String str, BlockingQueue<zzhd<?>> blockingQueue) {
        this.zzd = zzgy;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        zzft zzu = this.zzd.zzj().zzu();
        String name = getName();
        zzu.zza(name + " was interrupted", interruptedException);
    }

    private final void zzb() {
        synchronized (this.zzd.zzh) {
            if (!this.zzc) {
                this.zzd.zzi.release();
                this.zzd.zzh.notifyAll();
                if (this == this.zzd.zzb) {
                    this.zzd.zzb = null;
                } else if (this == this.zzd.zzc) {
                    this.zzd.zzc = null;
                } else {
                    this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzc = true;
            }
        }
    }

    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.zzd.zzi.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zza(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhd zzhd = (zzhd) this.zzb.poll();
                if (zzhd != null) {
                    Process.setThreadPriority(zzhd.zza ? threadPriority : 10);
                    zzhd.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null && !this.zzd.zzj) {
                            try {
                                this.zza.wait(30000);
                            } catch (InterruptedException e11) {
                                zza(e11);
                            }
                        }
                    }
                    synchronized (this.zzd.zzh) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }
}
