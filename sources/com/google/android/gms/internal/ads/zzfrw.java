package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfrw {
    private static final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzfrl zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    /* access modifiers changed from: private */
    public final Object zzg = new Object();
    /* access modifiers changed from: private */
    public boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk = new zzfrn(this);
    /* access modifiers changed from: private */
    public final AtomicInteger zzl = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public ServiceConnection zzm;
    /* access modifiers changed from: private */
    public IInterface zzn;
    private final zzfqt zzo;

    public zzfrw(Context context, zzfrl zzfrl, String str, Intent intent, zzfqt zzfqt, zzfrr zzfrr) {
        this.zzb = context;
        this.zzc = zzfrl;
        this.zzd = "OverlayDisplayService";
        this.zzi = intent;
        this.zzo = zzfqt;
        this.zzj = new WeakReference((Object) null);
    }

    public static /* synthetic */ void zzj(zzfrw zzfrw) {
        zzfrw.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfrr zzfrr = (zzfrr) zzfrw.zzj.get();
        if (zzfrr != null) {
            zzfrw.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfrr.zza();
        } else {
            zzfrw.zzc.zzc("%s : Binder has died.", zzfrw.zzd);
            for (zzfrm zzc2 : zzfrw.zze) {
                zzc2.zzc(zzfrw.zzv());
            }
            zzfrw.zze.clear();
        }
        synchronized (zzfrw.zzg) {
            zzfrw.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(zzfrw zzfrw, TaskCompletionSource taskCompletionSource) {
        zzfrw.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new zzfro(zzfrw, taskCompletionSource));
    }

    static /* bridge */ /* synthetic */ void zzp(zzfrw zzfrw, zzfrm zzfrm) {
        if (zzfrw.zzn == null && !zzfrw.zzh) {
            zzfrw.zzc.zzc("Initiate binding to the service.", new Object[0]);
            zzfrw.zze.add(zzfrm);
            zzfrv zzfrv = new zzfrv(zzfrw, (zzfru) null);
            zzfrw.zzm = zzfrv;
            zzfrw.zzh = true;
            if (!zzfrw.zzb.bindService(zzfrw.zzi, zzfrv, 1)) {
                zzfrw.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfrw.zzh = false;
                for (zzfrm zzc2 : zzfrw.zze) {
                    zzc2.zzc(new zzfrx());
                }
                zzfrw.zze.clear();
            }
        } else if (zzfrw.zzh) {
            zzfrw.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfrw.zze.add(zzfrm);
        } else {
            zzfrm.run();
        }
    }

    static /* bridge */ /* synthetic */ void zzq(zzfrw zzfrw) {
        zzfrw.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfrw.zzn.asBinder().linkToDeath(zzfrw.zzk, 0);
        } catch (RemoteException e10) {
            zzfrw.zzc.zzb(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzfrw zzfrw) {
        zzfrw.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfrw.zzn.asBinder().unlinkToDeath(zzfrw.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void zzw() {
        for (TaskCompletionSource trySetException : this.zzf) {
            trySetException.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfrm zzfrm, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfrp(this, zzfrm.zzb(), taskCompletionSource, zzfrm));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfrq(this));
    }
}
