package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.f;
import e2.a;
import e2.e;
import f2.d;
import java.io.File;
import java.util.List;
import l2.n;

/* compiled from: ResourceCacheGenerator */
class s implements f, d.a<Object> {

    /* renamed from: h  reason: collision with root package name */
    private final f.a f5822h;

    /* renamed from: i  reason: collision with root package name */
    private final g<?> f5823i;

    /* renamed from: j  reason: collision with root package name */
    private int f5824j;

    /* renamed from: k  reason: collision with root package name */
    private int f5825k = -1;

    /* renamed from: l  reason: collision with root package name */
    private e f5826l;

    /* renamed from: m  reason: collision with root package name */
    private List<n<File, ?>> f5827m;

    /* renamed from: n  reason: collision with root package name */
    private int f5828n;

    /* renamed from: o  reason: collision with root package name */
    private volatile n.a<?> f5829o;

    /* renamed from: p  reason: collision with root package name */
    private File f5830p;

    /* renamed from: q  reason: collision with root package name */
    private t f5831q;

    s(g<?> gVar, f.a aVar) {
        this.f5823i = gVar;
        this.f5822h = aVar;
    }

    private boolean a() {
        return this.f5828n < this.f5827m.size();
    }

    public boolean b() {
        List<e> c10 = this.f5823i.c();
        boolean z10 = false;
        if (c10.isEmpty()) {
            return false;
        }
        List<Class<?>> m10 = this.f5823i.m();
        if (!m10.isEmpty()) {
            while (true) {
                if (this.f5827m == null || !a()) {
                    int i10 = this.f5825k + 1;
                    this.f5825k = i10;
                    if (i10 >= m10.size()) {
                        int i11 = this.f5824j + 1;
                        this.f5824j = i11;
                        if (i11 >= c10.size()) {
                            return false;
                        }
                        this.f5825k = 0;
                    }
                    e eVar = c10.get(this.f5824j);
                    Class cls = m10.get(this.f5825k);
                    e eVar2 = eVar;
                    this.f5831q = new t(this.f5823i.b(), eVar2, this.f5823i.o(), this.f5823i.s(), this.f5823i.f(), this.f5823i.r(cls), cls, this.f5823i.k());
                    File b10 = this.f5823i.d().b(this.f5831q);
                    this.f5830p = b10;
                    if (b10 != null) {
                        this.f5826l = eVar;
                        this.f5827m = this.f5823i.j(b10);
                        this.f5828n = 0;
                    }
                } else {
                    this.f5829o = null;
                    while (!z10 && a()) {
                        List<n<File, ?>> list = this.f5827m;
                        int i12 = this.f5828n;
                        this.f5828n = i12 + 1;
                        this.f5829o = list.get(i12).b(this.f5830p, this.f5823i.s(), this.f5823i.f(), this.f5823i.k());
                        if (this.f5829o != null && this.f5823i.t(this.f5829o.f9920c.a())) {
                            this.f5829o.f9920c.d(this.f5823i.l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
        } else if (File.class.equals(this.f5823i.q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f5823i.i() + " to " + this.f5823i.q());
        }
    }

    public void c(Exception exc) {
        this.f5822h.a(this.f5831q, exc, this.f5829o.f9920c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f5829o;
        if (aVar != null) {
            aVar.f9920c.cancel();
        }
    }

    public void f(Object obj) {
        this.f5822h.d(this.f5826l, obj, this.f5829o.f9920c, a.RESOURCE_DISK_CACHE, this.f5831q);
    }
}
