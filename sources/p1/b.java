package p1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.m;
import androidx.work.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o1.e;
import o1.i;
import r1.c;
import r1.d;
import v1.p;
import w1.f;
import x1.a;

/* compiled from: GreedyScheduler */
public class b implements e, c, o1.b {

    /* renamed from: p  reason: collision with root package name */
    private static final String f10456p = m.f("GreedyScheduler");

    /* renamed from: h  reason: collision with root package name */
    private final Context f10457h;

    /* renamed from: i  reason: collision with root package name */
    private final i f10458i;

    /* renamed from: j  reason: collision with root package name */
    private final d f10459j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<p> f10460k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    private a f10461l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10462m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f10463n;

    /* renamed from: o  reason: collision with root package name */
    Boolean f10464o;

    public b(Context context, androidx.work.b bVar, a aVar, i iVar) {
        this.f10457h = context;
        this.f10458i = iVar;
        this.f10459j = new d(context, aVar, this);
        this.f10461l = new a(this, bVar.k());
        this.f10463n = new Object();
    }

    private void g() {
        this.f10464o = Boolean.valueOf(f.b(this.f10457h, this.f10458i.k()));
    }

    private void h() {
        if (!this.f10462m) {
            this.f10458i.o().d(this);
            this.f10462m = true;
        }
    }

    private void i(String str) {
        synchronized (this.f10463n) {
            Iterator<p> it = this.f10460k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f12255a.equals(str)) {
                    m.c().a(f10456p, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f10460k.remove(next);
                    this.f10459j.d(this.f10460k);
                    break;
                }
            }
        }
    }

    public boolean a() {
        return false;
    }

    public void b(List<String> list) {
        for (String next : list) {
            m.c().a(f10456p, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f10458i.z(next);
        }
    }

    public void c(String str, boolean z10) {
        i(str);
    }

    public void d(String str) {
        if (this.f10464o == null) {
            g();
        }
        if (!this.f10464o.booleanValue()) {
            m.c().d(f10456p, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        m.c().a(f10456p, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        a aVar = this.f10461l;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f10458i.z(str);
    }

    public void e(List<String> list) {
        for (String next : list) {
            m.c().a(f10456p, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f10458i.w(next);
        }
    }

    public void f(p... pVarArr) {
        if (this.f10464o == null) {
            g();
        }
        if (!this.f10464o.booleanValue()) {
            m.c().d(f10456p, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f12256b == v.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f10461l;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f12264j.h()) {
                        m.c().a(f10456p, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f12264j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f12255a);
                    } else {
                        m.c().a(f10456p, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    m.c().a(f10456p, String.format("Starting work for %s", new Object[]{pVar.f12255a}), new Throwable[0]);
                    this.f10458i.w(pVar.f12255a);
                }
            }
        }
        synchronized (this.f10463n) {
            if (!hashSet.isEmpty()) {
                m.c().a(f10456p, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f10460k.addAll(hashSet);
                this.f10459j.d(this.f10460k);
            }
        }
    }
}
