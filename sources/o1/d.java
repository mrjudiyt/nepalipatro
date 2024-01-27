package o1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o1.j;
import w1.j;

/* compiled from: Processor */
public class d implements b, u1.a {

    /* renamed from: s  reason: collision with root package name */
    private static final String f10291s = m.f("Processor");

    /* renamed from: h  reason: collision with root package name */
    private PowerManager.WakeLock f10292h;

    /* renamed from: i  reason: collision with root package name */
    private Context f10293i;

    /* renamed from: j  reason: collision with root package name */
    private b f10294j;

    /* renamed from: k  reason: collision with root package name */
    private x1.a f10295k;

    /* renamed from: l  reason: collision with root package name */
    private WorkDatabase f10296l;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, j> f10297m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private Map<String, j> f10298n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private List<e> f10299o;

    /* renamed from: p  reason: collision with root package name */
    private Set<String> f10300p;

    /* renamed from: q  reason: collision with root package name */
    private final List<b> f10301q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f10302r;

    /* compiled from: Processor */
    private static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private b f10303h;

        /* renamed from: i  reason: collision with root package name */
        private String f10304i;

        /* renamed from: j  reason: collision with root package name */
        private e<Boolean> f10305j;

        a(b bVar, String str, e<Boolean> eVar) {
            this.f10303h = bVar;
            this.f10304i = str;
            this.f10305j = eVar;
        }

        public void run() {
            boolean z10;
            try {
                z10 = this.f10305j.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f10303h.c(this.f10304i, z10);
        }
    }

    public d(Context context, b bVar, x1.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f10293i = context;
        this.f10294j = bVar;
        this.f10295k = aVar;
        this.f10296l = workDatabase;
        this.f10299o = list;
        this.f10300p = new HashSet();
        this.f10301q = new ArrayList();
        this.f10292h = null;
        this.f10302r = new Object();
    }

    private static boolean e(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            m.c().a(f10291s, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        m.c().a(f10291s, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.f10302r) {
            if (!(!this.f10297m.isEmpty())) {
                try {
                    this.f10293i.startService(androidx.work.impl.foreground.a.f(this.f10293i));
                } catch (Throwable th) {
                    m.c().b(f10291s, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f10292h;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f10292h = null;
                }
            }
        }
    }

    public void a(String str, g gVar) {
        synchronized (this.f10302r) {
            m.c().d(f10291s, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            j remove = this.f10298n.remove(str);
            if (remove != null) {
                if (this.f10292h == null) {
                    PowerManager.WakeLock b10 = j.b(this.f10293i, "ProcessorForegroundLck");
                    this.f10292h = b10;
                    b10.acquire();
                }
                this.f10297m.put(str, remove);
                androidx.core.content.a.p(this.f10293i, androidx.work.impl.foreground.a.d(this.f10293i, str, gVar));
            }
        }
    }

    public void b(String str) {
        synchronized (this.f10302r) {
            this.f10297m.remove(str);
            m();
        }
    }

    public void c(String str, boolean z10) {
        synchronized (this.f10302r) {
            this.f10298n.remove(str);
            m.c().a(f10291s, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z10)}), new Throwable[0]);
            for (b c10 : this.f10301q) {
                c10.c(str, z10);
            }
        }
    }

    public void d(b bVar) {
        synchronized (this.f10302r) {
            this.f10301q.add(bVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f10302r) {
            contains = this.f10300p.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f10302r) {
            if (!this.f10298n.containsKey(str)) {
                if (!this.f10297m.containsKey(str)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f10302r) {
            containsKey = this.f10297m.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f10302r) {
            this.f10301q.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, (WorkerParameters.a) null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f10302r) {
            if (g(str)) {
                m.c().a(f10291s, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f10293i, this.f10294j, this.f10295k, this, this.f10296l, str).c(this.f10299o).b(aVar).a();
            e<Boolean> b10 = a10.b();
            b10.addListener(new a(this, str, b10), this.f10295k.a());
            this.f10298n.put(str, a10);
            this.f10295k.c().execute(a10);
            m.c().a(f10291s, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.f10302r) {
            boolean z10 = true;
            m.c().a(f10291s, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f10300p.add(str);
            j remove = this.f10297m.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f10298n.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.f10302r) {
            m.c().a(f10291s, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e10 = e(str, this.f10297m.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.f10302r) {
            m.c().a(f10291s, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e10 = e(str, this.f10298n.remove(str));
        }
        return e10;
    }
}
