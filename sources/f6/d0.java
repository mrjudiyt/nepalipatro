package f6;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzy;
import e6.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public final class d0 {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f14554o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f14555a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final s f14556b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14557c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f14558d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f14559e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f14560f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f14561g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f14562h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f14563i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f14564j = new v(this);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f14565k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f14566l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f14567m;

    /* renamed from: n  reason: collision with root package name */
    private final q f14568n;

    public d0(Context context, s sVar, String str, Intent intent, q qVar, y yVar) {
        this.f14555a = context;
        this.f14556b = sVar;
        this.f14557c = "AppUpdateService";
        this.f14562h = intent;
        this.f14568n = qVar;
        this.f14563i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(d0 d0Var) {
        d0Var.f14556b.d("reportBinderDeath", new Object[0]);
        y yVar = (y) d0Var.f14563i.get();
        if (yVar != null) {
            d0Var.f14556b.d("calling onBinderDied", new Object[0]);
            yVar.zza();
        } else {
            d0Var.f14556b.d("%s : Binder has died.", d0Var.f14557c);
            for (t c10 : d0Var.f14558d) {
                c10.c(d0Var.v());
            }
            d0Var.f14558d.clear();
        }
        synchronized (d0Var.f14560f) {
            d0Var.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        d0Var.f14559e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new u(d0Var, taskCompletionSource));
    }

    static /* bridge */ /* synthetic */ void p(d0 d0Var, t tVar) {
        if (d0Var.f14567m == null && !d0Var.f14561g) {
            d0Var.f14556b.d("Initiate binding to the service.", new Object[0]);
            d0Var.f14558d.add(tVar);
            c0 c0Var = new c0(d0Var, (b0) null);
            d0Var.f14566l = c0Var;
            d0Var.f14561g = true;
            if (!d0Var.f14555a.bindService(d0Var.f14562h, c0Var, 1)) {
                d0Var.f14556b.d("Failed to bind to the service.", new Object[0]);
                d0Var.f14561g = false;
                for (t c10 : d0Var.f14558d) {
                    c10.c(new zzy());
                }
                d0Var.f14558d.clear();
            }
        } else if (d0Var.f14561g) {
            d0Var.f14556b.d("Waiting to bind to the service.", new Object[0]);
            d0Var.f14558d.add(tVar);
        } else {
            tVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void q(d0 d0Var) {
        d0Var.f14556b.d("linkToDeath", new Object[0]);
        try {
            d0Var.f14567m.asBinder().linkToDeath(d0Var.f14564j, 0);
        } catch (RemoteException e10) {
            d0Var.f14556b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(d0 d0Var) {
        d0Var.f14556b.d("unlinkToDeath", new Object[0]);
        d0Var.f14567m.asBinder().unlinkToDeath(d0Var.f14564j, 0);
    }

    private final RemoteException v() {
        if (Build.VERSION.SDK_INT < 15) {
            return new RemoteException();
        }
        return new RemoteException(String.valueOf(this.f14557c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void w() {
        for (TaskCompletionSource trySetException : this.f14559e) {
            trySetException.trySetException(v());
        }
        this.f14559e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f14554o;
        synchronized (map) {
            if (!map.containsKey(this.f14557c)) {
                HandlerThread handlerThread = new HandlerThread(this.f14557c, 10);
                handlerThread.start();
                map.put(this.f14557c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f14557c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f14567m;
    }

    public final void s(t tVar, TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.b(), taskCompletionSource, tVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f14560f) {
            this.f14559e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f14560f) {
            this.f14559e.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}
