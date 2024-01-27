package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzyh extends Handler implements Runnable {
    final /* synthetic */ zzym zza;
    private final zzyi zzb;
    private final long zzc;
    private zzye zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzyh(zzym zzym, Looper looper, zzyi zzyi, zzye zzye, int i10, long j10) {
        super(looper);
        this.zza = zzym;
        this.zzb = zzyi;
        this.zzd = zzye;
        this.zzc = j10;
    }

    private final void zzd() {
        this.zze = null;
        zzym zzym = this.zza;
        ExecutorService zzd2 = zzym.zze;
        zzyh zzc2 = zzym.zzf;
        Objects.requireNonNull(zzc2);
        zzd2.execute(zzc2);
    }

    public final void handleMessage(Message message) {
        long j10;
        if (!this.zzi) {
            int i10 = message.what;
            if (i10 == 0) {
                zzd();
            } else if (i10 != 3) {
                this.zza.zzf = null;
                long j11 = this.zzc;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = elapsedRealtime - j11;
                zzye zzye = this.zzd;
                Objects.requireNonNull(zzye);
                if (this.zzh) {
                    zzye.zzJ(this.zzb, elapsedRealtime, j12, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        zzye.zzK(this.zzb, elapsedRealtime, j12);
                    } catch (RuntimeException e10) {
                        zzer.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                        this.zza.zzg = new zzyl(e10);
                    }
                } else if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.zze = iOException;
                    int i12 = this.zzf + 1;
                    this.zzf = i12;
                    zzyg zzu = zzye.zzu(this.zzb, elapsedRealtime, j12, iOException, i12);
                    if (zzu.zza == 3) {
                        this.zza.zzg = this.zze;
                    } else if (zzu.zza != 2) {
                        if (zzu.zza == 1) {
                            this.zzf = 1;
                        }
                        if (zzu.zzb != -9223372036854775807L) {
                            j10 = zzu.zzb;
                        } else {
                            j10 = (long) Math.min((this.zzf - 1) * 1000, 5000);
                        }
                        zzc(j10);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                int i10 = zzfk.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                this.zzb.zzh();
                Trace.endSection();
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.zzi) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new zzyl(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new zzyl(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzye zzye = this.zzd;
            Objects.requireNonNull(zzye);
            zzye.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzdx.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
