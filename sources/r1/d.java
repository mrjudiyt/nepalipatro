package r1;

import android.content.Context;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import s1.b;
import s1.c;
import s1.e;
import s1.f;
import s1.g;
import s1.h;
import v1.p;
import x1.a;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f10810d = m.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f10811a;

    /* renamed from: b  reason: collision with root package name */
    private final c<?>[] f10812b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f10813c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10811a = cVar;
        this.f10812b = new c[]{new s1.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new s1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a(List<String> list) {
        synchronized (this.f10813c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (c(next)) {
                    m.c().a(f10810d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            c cVar = this.f10811a;
            if (cVar != null) {
                cVar.e(arrayList);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.f10813c) {
            c cVar = this.f10811a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f10813c) {
            for (c<?> cVar : this.f10812b) {
                if (cVar.d(str)) {
                    m.c().a(f10810d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f10813c) {
            for (c<?> g10 : this.f10812b) {
                g10.g((c.a) null);
            }
            for (c<?> e10 : this.f10812b) {
                e10.e(iterable);
            }
            for (c<?> g11 : this.f10812b) {
                g11.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f10813c) {
            for (c<?> f10 : this.f10812b) {
                f10.f();
            }
        }
    }
}
