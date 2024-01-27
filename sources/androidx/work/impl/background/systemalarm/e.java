package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import o1.i;
import w1.g;
import w1.j;
import w1.n;

/* compiled from: SystemAlarmDispatcher */
public class e implements o1.b {

    /* renamed from: r  reason: collision with root package name */
    static final String f4813r = m.f("SystemAlarmDispatcher");

    /* renamed from: h  reason: collision with root package name */
    final Context f4814h;

    /* renamed from: i  reason: collision with root package name */
    private final x1.a f4815i;

    /* renamed from: j  reason: collision with root package name */
    private final n f4816j;

    /* renamed from: k  reason: collision with root package name */
    private final o1.d f4817k;

    /* renamed from: l  reason: collision with root package name */
    private final i f4818l;

    /* renamed from: m  reason: collision with root package name */
    final b f4819m;

    /* renamed from: n  reason: collision with root package name */
    private final Handler f4820n;

    /* renamed from: o  reason: collision with root package name */
    final List<Intent> f4821o;

    /* renamed from: p  reason: collision with root package name */
    Intent f4822p;

    /* renamed from: q  reason: collision with root package name */
    private c f4823q;

    /* compiled from: SystemAlarmDispatcher */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.f4821o) {
                e eVar2 = e.this;
                eVar2.f4822p = eVar2.f4821o.get(0);
            }
            Intent intent = e.this.f4822p;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f4822p.getIntExtra("KEY_START_ID", 0);
                m c10 = m.c();
                String str = e.f4813r;
                c10.a(str, String.format("Processing command %s, %s", new Object[]{e.this.f4822p, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b10 = j.b(e.this.f4814h, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    m.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.f4819m.p(eVar3.f4822p, intExtra, eVar3);
                    m.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    m.c().a(e.f4813r, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b10}), new Throwable[0]);
                    b10.release();
                    e eVar4 = e.this;
                    eVar4.k(new d(eVar4));
                    throw th;
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    static class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final e f4825h;

        /* renamed from: i  reason: collision with root package name */
        private final Intent f4826i;

        /* renamed from: j  reason: collision with root package name */
        private final int f4827j;

        b(e eVar, Intent intent, int i10) {
            this.f4825h = eVar;
            this.f4826i = intent;
            this.f4827j = i10;
        }

        public void run() {
            this.f4825h.a(this.f4826i, this.f4827j);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher */
    static class d implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final e f4828h;

        d(e eVar) {
            this.f4828h = eVar;
        }

        public void run() {
            this.f4828h.d();
        }
    }

    e(Context context) {
        this(context, (o1.d) null, (i) null);
    }

    private void b() {
        if (this.f4820n.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f4821o) {
            for (Intent action : this.f4821o) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = j.b(this.f4814h, "ProcessCommand");
        try {
            b10.acquire();
            this.f4818l.r().b(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        m c10 = m.c();
        String str = f4813r;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f4821o) {
                if (!this.f4821o.isEmpty()) {
                    z10 = true;
                }
                this.f4821o.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    public void c(String str, boolean z10) {
        k(new b(this, b.d(this.f4814h, str, z10), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        m c10 = m.c();
        String str = f4813r;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f4821o) {
            if (this.f4822p != null) {
                m.c().a(str, String.format("Removing command %s", new Object[]{this.f4822p}), new Throwable[0]);
                if (this.f4821o.remove(0).equals(this.f4822p)) {
                    this.f4822p = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c11 = this.f4815i.c();
            if (!this.f4819m.o() && this.f4821o.isEmpty() && !c11.a()) {
                m.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f4823q;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f4821o.isEmpty()) {
                l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public o1.d e() {
        return this.f4817k;
    }

    /* access modifiers changed from: package-private */
    public x1.a f() {
        return this.f4815i;
    }

    /* access modifiers changed from: package-private */
    public i g() {
        return this.f4818l;
    }

    /* access modifiers changed from: package-private */
    public n h() {
        return this.f4816j;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        m.c().a(f4813r, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4817k.i(this);
        this.f4816j.a();
        this.f4823q = null;
    }

    /* access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f4820n.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f4823q != null) {
            m.c().b(f4813r, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4823q = cVar;
        }
    }

    e(Context context, o1.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4814h = applicationContext;
        this.f4819m = new b(applicationContext);
        this.f4816j = new n();
        iVar = iVar == null ? i.m(context) : iVar;
        this.f4818l = iVar;
        dVar = dVar == null ? iVar.o() : dVar;
        this.f4817k = dVar;
        this.f4815i = iVar.r();
        dVar.d(this);
        this.f4821o = new ArrayList();
        this.f4822p = null;
        this.f4820n = new Handler(Looper.getMainLooper());
    }
}
