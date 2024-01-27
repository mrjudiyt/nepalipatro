package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.engine.f;
import e2.e;
import f2.d;
import java.util.Collections;
import java.util.List;
import l2.n;

/* compiled from: SourceGenerator */
class v implements f, f.a {

    /* renamed from: h  reason: collision with root package name */
    private final g<?> f5843h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a f5844i;

    /* renamed from: j  reason: collision with root package name */
    private int f5845j;

    /* renamed from: k  reason: collision with root package name */
    private c f5846k;

    /* renamed from: l  reason: collision with root package name */
    private Object f5847l;

    /* renamed from: m  reason: collision with root package name */
    private volatile n.a<?> f5848m;

    /* renamed from: n  reason: collision with root package name */
    private d f5849n;

    /* compiled from: SourceGenerator */
    class a implements d.a<Object> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n.a f5850h;

        a(n.a aVar) {
            this.f5850h = aVar;
        }

        public void c(Exception exc) {
            if (v.this.g(this.f5850h)) {
                v.this.i(this.f5850h, exc);
            }
        }

        public void f(Object obj) {
            if (v.this.g(this.f5850h)) {
                v.this.h(this.f5850h, obj);
            }
        }
    }

    v(g<?> gVar, f.a aVar) {
        this.f5843h = gVar;
        this.f5844i = aVar;
    }

    /* JADX INFO: finally extract failed */
    private void c(Object obj) {
        long b10 = a3.f.b();
        try {
            e2.d<X> p10 = this.f5843h.p(obj);
            e eVar = new e(p10, obj, this.f5843h.k());
            this.f5849n = new d(this.f5848m.f9918a, this.f5843h.o());
            this.f5843h.d().a(this.f5849n, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f5849n);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(p10);
                sb.append(", duration: ");
                sb.append(a3.f.a(b10));
            }
            this.f5848m.f9920c.b();
            this.f5846k = new c(Collections.singletonList(this.f5848m.f9918a), this.f5843h, this);
        } catch (Throwable th) {
            this.f5848m.f9920c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.f5845j < this.f5843h.g().size();
    }

    private void j(n.a<?> aVar) {
        this.f5848m.f9920c.d(this.f5843h.l(), new a(aVar));
    }

    public void a(e eVar, Exception exc, d<?> dVar, e2.a aVar) {
        this.f5844i.a(eVar, exc, dVar, this.f5848m.f9920c.e());
    }

    public boolean b() {
        Object obj = this.f5847l;
        if (obj != null) {
            this.f5847l = null;
            c(obj);
        }
        c cVar = this.f5846k;
        if (cVar != null && cVar.b()) {
            return true;
        }
        this.f5846k = null;
        this.f5848m = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List<n.a<?>> g10 = this.f5843h.g();
            int i10 = this.f5845j;
            this.f5845j = i10 + 1;
            this.f5848m = g10.get(i10);
            if (this.f5848m != null && (this.f5843h.e().c(this.f5848m.f9920c.e()) || this.f5843h.t(this.f5848m.f9920c.a()))) {
                j(this.f5848m);
                z10 = true;
            }
        }
        return z10;
    }

    public void cancel() {
        n.a<?> aVar = this.f5848m;
        if (aVar != null) {
            aVar.f9920c.cancel();
        }
    }

    public void d(e eVar, Object obj, d<?> dVar, e2.a aVar, e eVar2) {
        this.f5844i.d(eVar, obj, dVar, this.f5848m.f9920c.e(), eVar);
    }

    public void e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.f5848m;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    public void h(n.a<?> aVar, Object obj) {
        h2.a e10 = this.f5843h.e();
        if (obj == null || !e10.c(aVar.f9920c.e())) {
            f.a aVar2 = this.f5844i;
            e eVar = aVar.f9918a;
            d<Data> dVar = aVar.f9920c;
            aVar2.d(eVar, obj, dVar, dVar.e(), this.f5849n);
            return;
        }
        this.f5847l = obj;
        this.f5844i.e();
    }

    /* access modifiers changed from: package-private */
    public void i(n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f5844i;
        d dVar = this.f5849n;
        d<Data> dVar2 = aVar.f9920c;
        aVar2.a(dVar, exc, dVar2, dVar2.e());
    }
}
