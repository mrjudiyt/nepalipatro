package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzm implements ServiceConnection {
    int zza = 0;
    final Messenger zzb = new Messenger(new zzf(Looper.getMainLooper(), new zzf(this)));
    zzn zzc;
    final Queue<zzp<?>> zzd = new ArrayDeque();
    final SparseArray<zzp<?>> zze = new SparseArray<>();
    final /* synthetic */ zzs zzf;

    /* synthetic */ zzm(zzs zzs, zzl zzl) {
        this.zzf = zzs;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zzf.zzc.execute(new zzj(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf.zzc.execute(new zzg(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zza(int i10, String str) {
        zzb(i10, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i11 = this.zza;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
            zzq zzq = new zzq(i10, str, th);
            for (zzp zzc2 : this.zzd) {
                zzc2.zzc(zzq);
            }
            this.zzd.clear();
            for (int i12 = 0; i12 < this.zze.size(); i12++) {
                this.zze.valueAt(i12).zzc(zzq);
            }
            this.zze.clear();
        } else if (i11 == 3) {
            this.zza = 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        this.zzf.zzc.execute(new zzh(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(int i10) {
        zzp zzp = this.zze.get(i10);
        if (zzp != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i10);
            this.zze.remove(i10);
            zzp.zzc(new zzq(3, "Timed out waiting for response", (Throwable) null));
            zzf();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zza     // Catch:{ all -> 0x0030 }
            r1 = 2
            if (r0 != r1) goto L_0x002e
            java.util.Queue<com.google.android.gms.cloudmessaging.zzp<?>> r0 = r2.zzd     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r0 = r2.zze     // Catch:{ all -> 0x0030 }
            int r0 = r0.size()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0030 }
            r0 = 3
            r2.zza = r0     // Catch:{ all -> 0x0030 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.cloudmessaging.zzs r1 = r2.zzf     // Catch:{ all -> 0x0030 }
            android.content.Context r1 = r1.zzb     // Catch:{ all -> 0x0030 }
            r0.unbindService(r1, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzm.zzf():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzg(zzp<?> zzp) {
        int i10 = this.zza;
        if (i10 == 0) {
            this.zzd.add(zzp);
            Preconditions.checkState(this.zza == 0);
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                    zza(0, "Unable to bind to service");
                } else {
                    this.zzf.zzc.schedule(new zzi(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                zzb(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.zzd.add(zzp);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.zzd.add(zzp);
            zzc();
            return true;
        }
        return true;
    }
}
