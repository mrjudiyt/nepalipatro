package o1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.m;
import androidx.work.o;
import androidx.work.p;
import androidx.work.s;
import androidx.work.w;
import androidx.work.x;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import w1.e;
import w1.h;
import x1.a;

/* compiled from: WorkManagerImpl */
public class i extends w {

    /* renamed from: j  reason: collision with root package name */
    private static final String f10319j = m.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    private static i f10320k = null;

    /* renamed from: l  reason: collision with root package name */
    private static i f10321l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f10322m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f10323a;

    /* renamed from: b  reason: collision with root package name */
    private b f10324b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f10325c;

    /* renamed from: d  reason: collision with root package name */
    private a f10326d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f10327e;

    /* renamed from: f  reason: collision with root package name */
    private d f10328f;

    /* renamed from: g  reason: collision with root package name */
    private e f10329g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10330h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f10331i;

    public i(Context context, b bVar, a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(s.f4929a));
    }

    public static void g(Context context, b bVar) {
        synchronized (f10322m) {
            i iVar = f10320k;
            if (iVar != null) {
                if (f10321l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f10321l == null) {
                    f10321l = new i(applicationContext, bVar, new x1.b(bVar.l()));
                }
                f10320k = f10321l;
            }
        }
    }

    @Deprecated
    public static i l() {
        synchronized (f10322m) {
            i iVar = f10320k;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = f10321l;
            return iVar2;
        }
    }

    public static i m(Context context) {
        i l10;
        synchronized (f10322m) {
            l10 = l();
            if (l10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    g(applicationContext, ((b.c) applicationContext).a());
                    l10 = m(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return l10;
    }

    private void s(Context context, b bVar, a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10323a = applicationContext;
        this.f10324b = bVar;
        this.f10326d = aVar;
        this.f10325c = workDatabase;
        this.f10327e = list;
        this.f10328f = dVar;
        this.f10329g = new e(workDatabase);
        this.f10330h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f10326d.b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public p a(String str) {
        w1.a d10 = w1.a.d(str, this);
        this.f10326d.b(d10);
        return d10.e();
    }

    public p c(List<? extends x> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public p e(String str, f fVar, List<o> list) {
        return new g(this, str, fVar, list).a();
    }

    public p h(UUID uuid) {
        w1.a b10 = w1.a.b(uuid, this);
        this.f10326d.b(b10);
        return b10.e();
    }

    public List<e> i(Context context, b bVar, a aVar) {
        return Arrays.asList(new e[]{f.a(context, this), new p1.b(context, bVar, aVar, this)});
    }

    public Context j() {
        return this.f10323a;
    }

    public b k() {
        return this.f10324b;
    }

    public e n() {
        return this.f10329g;
    }

    public d o() {
        return this.f10328f;
    }

    public List<e> p() {
        return this.f10327e;
    }

    public WorkDatabase q() {
        return this.f10325c;
    }

    public a r() {
        return this.f10326d;
    }

    public void t() {
        synchronized (f10322m) {
            this.f10330h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f10331i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f10331i = null;
            }
        }
    }

    public void u() {
        if (Build.VERSION.SDK_INT >= 23) {
            q1.b.b(j());
        }
        q().B().u();
        f.b(k(), q(), p());
    }

    public void v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f10322m) {
            this.f10331i = pendingResult;
            if (this.f10330h) {
                pendingResult.finish();
                this.f10331i = null;
            }
        }
    }

    public void w(String str) {
        x(str, (WorkerParameters.a) null);
    }

    public void x(String str, WorkerParameters.a aVar) {
        this.f10326d.b(new h(this, str, aVar));
    }

    public void y(String str) {
        this.f10326d.b(new w1.i(this, str, true));
    }

    public void z(String str) {
        this.f10326d.b(new w1.i(this, str, false));
    }

    public i(Context context, b bVar, a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.s(context.getApplicationContext(), aVar.c(), z10));
    }

    public i(Context context, b bVar, a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        m.e(new m.a(bVar.j()));
        Context context2 = context;
        b bVar2 = bVar;
        a aVar2 = aVar;
        WorkDatabase workDatabase2 = workDatabase;
        List<e> i10 = i(applicationContext, bVar, aVar);
        s(context2, bVar2, aVar2, workDatabase2, i10, new d(context2, bVar2, aVar2, workDatabase2, i10));
    }
}
