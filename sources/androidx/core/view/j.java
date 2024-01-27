package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f2530a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<l> f2531b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<l, a> f2532c = new HashMap();

    /* compiled from: MenuHostHelper */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final h f2533a;

        /* renamed from: b  reason: collision with root package name */
        private k f2534b;

        a(h hVar, k kVar) {
            this.f2533a = hVar;
            this.f2534b = kVar;
            hVar.a(kVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2533a.c(this.f2534b);
            this.f2534b = null;
        }
    }

    public j(Runnable runnable) {
        this.f2530a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(l lVar, m mVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            l(lVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(h.b bVar, l lVar, m mVar, h.a aVar) {
        if (aVar == h.a.f(bVar)) {
            c(lVar);
        } else if (aVar == h.a.ON_DESTROY) {
            l(lVar);
        } else if (aVar == h.a.d(bVar)) {
            this.f2531b.remove(lVar);
            this.f2530a.run();
        }
    }

    public void c(l lVar) {
        this.f2531b.add(lVar);
        this.f2530a.run();
    }

    public void d(l lVar, m mVar) {
        c(lVar);
        h lifecycle = mVar.getLifecycle();
        a remove = this.f2532c.remove(lVar);
        if (remove != null) {
            remove.a();
        }
        this.f2532c.put(lVar, new a(lifecycle, new h(this, lVar)));
    }

    @SuppressLint({"LambdaLast"})
    public void e(l lVar, m mVar, h.b bVar) {
        h lifecycle = mVar.getLifecycle();
        a remove = this.f2532c.remove(lVar);
        if (remove != null) {
            remove.a();
        }
        this.f2532c.put(lVar, new a(lifecycle, new i(this, bVar, lVar)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<l> it = this.f2531b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<l> it = this.f2531b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<l> it = this.f2531b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<l> it = this.f2531b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(l lVar) {
        this.f2531b.remove(lVar);
        a remove = this.f2532c.remove(lVar);
        if (remove != null) {
            remove.a();
        }
        this.f2530a.run();
    }
}
