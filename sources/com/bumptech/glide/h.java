package com.bumptech.glide;

import a3.k;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r2.c;
import t2.c;
import t2.i;
import t2.m;
import t2.n;
import t2.p;
import w2.g;
import x2.d;

/* compiled from: RequestManager */
public class h implements ComponentCallbacks2, i {

    /* renamed from: t  reason: collision with root package name */
    private static final w2.h f5614t = ((w2.h) w2.h.X(Bitmap.class).J());

    /* renamed from: u  reason: collision with root package name */
    private static final w2.h f5615u = ((w2.h) w2.h.X(c.class).J());

    /* renamed from: v  reason: collision with root package name */
    private static final w2.h f5616v = ((w2.h) ((w2.h) w2.h.Y(h2.a.f8938c).L(f.LOW)).R(true));

    /* renamed from: h  reason: collision with root package name */
    protected final b f5617h;

    /* renamed from: i  reason: collision with root package name */
    protected final Context f5618i;

    /* renamed from: j  reason: collision with root package name */
    final t2.h f5619j;

    /* renamed from: k  reason: collision with root package name */
    private final n f5620k;

    /* renamed from: l  reason: collision with root package name */
    private final m f5621l;

    /* renamed from: m  reason: collision with root package name */
    private final p f5622m;

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f5623n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f5624o;

    /* renamed from: p  reason: collision with root package name */
    private final t2.c f5625p;

    /* renamed from: q  reason: collision with root package name */
    private final CopyOnWriteArrayList<g<Object>> f5626q;

    /* renamed from: r  reason: collision with root package name */
    private w2.h f5627r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5628s;

    /* compiled from: RequestManager */
    class a implements Runnable {
        a() {
        }

        public void run() {
            h hVar = h.this;
            hVar.f5619j.a(hVar);
        }
    }

    /* compiled from: RequestManager */
    private class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final n f5630a;

        b(n nVar) {
            this.f5630a = nVar;
        }

        public void a(boolean z10) {
            if (z10) {
                synchronized (h.this) {
                    this.f5630a.e();
                }
            }
        }
    }

    public h(b bVar, t2.h hVar, m mVar, Context context) {
        this(bVar, hVar, mVar, new n(), bVar.g(), context);
    }

    private void v(d<?> dVar) {
        boolean u10 = u(dVar);
        w2.d i10 = dVar.i();
        if (!u10 && !this.f5617h.p(dVar) && i10 != null) {
            dVar.c((w2.d) null);
            i10.clear();
        }
    }

    public <ResourceType> g<ResourceType> d(Class<ResourceType> cls) {
        return new g<>(this.f5617h, this, cls, this.f5618i);
    }

    public g<Bitmap> e() {
        return d(Bitmap.class).a(f5614t);
    }

    public void k(d<?> dVar) {
        if (dVar != null) {
            v(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public List<g<Object>> l() {
        return this.f5626q;
    }

    /* access modifiers changed from: package-private */
    public synchronized w2.h m() {
        return this.f5627r;
    }

    /* access modifiers changed from: package-private */
    public <T> i<?, T> n(Class<T> cls) {
        return this.f5617h.i().d(cls);
    }

    public synchronized void o() {
        this.f5620k.c();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f5622m.onDestroy();
        for (d<?> k10 : this.f5622m.e()) {
            k(k10);
        }
        this.f5622m.d();
        this.f5620k.b();
        this.f5619j.b(this);
        this.f5619j.b(this.f5625p);
        this.f5624o.removeCallbacks(this.f5623n);
        this.f5617h.s(this);
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        r();
        this.f5622m.onStart();
    }

    public synchronized void onStop() {
        q();
        this.f5622m.onStop();
    }

    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f5628s) {
            p();
        }
    }

    public synchronized void p() {
        o();
        for (h o10 : this.f5621l.a()) {
            o10.o();
        }
    }

    public synchronized void q() {
        this.f5620k.d();
    }

    public synchronized void r() {
        this.f5620k.f();
    }

    /* access modifiers changed from: protected */
    public synchronized void s(w2.h hVar) {
        this.f5627r = (w2.h) ((w2.h) hVar.clone()).b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void t(d<?> dVar, w2.d dVar2) {
        this.f5622m.k(dVar);
        this.f5620k.g(dVar2);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5620k + ", treeNode=" + this.f5621l + "}";
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean u(d<?> dVar) {
        w2.d i10 = dVar.i();
        if (i10 == null) {
            return true;
        }
        if (!this.f5620k.a(i10)) {
            return false;
        }
        this.f5622m.l(dVar);
        dVar.c((w2.d) null);
        return true;
    }

    h(b bVar, t2.h hVar, m mVar, n nVar, t2.d dVar, Context context) {
        this.f5622m = new p();
        a aVar = new a();
        this.f5623n = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f5624o = handler;
        this.f5617h = bVar;
        this.f5619j = hVar;
        this.f5621l = mVar;
        this.f5620k = nVar;
        this.f5618i = context;
        t2.c a10 = dVar.a(context.getApplicationContext(), new b(nVar));
        this.f5625p = a10;
        if (k.p()) {
            handler.post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(a10);
        this.f5626q = new CopyOnWriteArrayList<>(bVar.i().b());
        s(bVar.i().c());
        bVar.o(this);
    }
}
