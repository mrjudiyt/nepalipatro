package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzzg extends HandlerThread implements Handler.Callback {
    private zzed zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzi zze;

    public zzzg() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                int i11 = message.arg1;
                zzed zzed = this.zza;
                Objects.requireNonNull(zzed);
                zzed.zzb(i11);
                this.zze = new zzzi(this, this.zza.zza(), i11 != 0, (zzzh) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e10) {
                zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.zzd = e10;
                synchronized (this) {
                    notify();
                }
            } catch (zzef e11) {
                zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.zzd = new IllegalStateException(e11);
                synchronized (this) {
                    notify();
                }
            } catch (Error e12) {
                try {
                    zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzc = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i10 != 2) {
            return true;
        } else {
            try {
                zzed zzed2 = this.zza;
                Objects.requireNonNull(zzed2);
                zzed2.zzc();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }

    public final zzzi zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzed(this.zzb, (zzec) null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzzi zzzi = this.zze;
                Objects.requireNonNull(zzzi);
                return zzzi;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
