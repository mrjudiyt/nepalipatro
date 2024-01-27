package p1;

import androidx.work.m;
import androidx.work.t;
import java.util.HashMap;
import java.util.Map;
import v1.p;

/* compiled from: DelayedWorkTracker */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f10450d = m.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f10451a;

    /* renamed from: b  reason: collision with root package name */
    private final t f10452b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f10453c = new HashMap();

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* compiled from: DelayedWorkTracker */
    class C0178a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f10454h;

        C0178a(p pVar) {
            this.f10454h = pVar;
        }

        public void run() {
            m.c().a(a.f10450d, String.format("Scheduling work %s", new Object[]{this.f10454h.f12255a}), new Throwable[0]);
            a.this.f10451a.f(this.f10454h);
        }
    }

    public a(b bVar, t tVar) {
        this.f10451a = bVar;
        this.f10452b = tVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f10453c.remove(pVar.f12255a);
        if (remove != null) {
            this.f10452b.b(remove);
        }
        C0178a aVar = new C0178a(pVar);
        this.f10453c.put(pVar.f12255a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f10452b.a(pVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.f10453c.remove(str);
        if (remove != null) {
            this.f10452b.b(remove);
        }
    }
}
