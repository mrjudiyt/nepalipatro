package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.f;
import e2.a;
import e2.e;
import f2.d;
import java.io.File;
import java.util.List;
import l2.n;

/* compiled from: DataCacheGenerator */
class c implements f, d.a<Object> {

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f5665h;

    /* renamed from: i  reason: collision with root package name */
    private final g<?> f5666i;

    /* renamed from: j  reason: collision with root package name */
    private final f.a f5667j;

    /* renamed from: k  reason: collision with root package name */
    private int f5668k;

    /* renamed from: l  reason: collision with root package name */
    private e f5669l;

    /* renamed from: m  reason: collision with root package name */
    private List<n<File, ?>> f5670m;

    /* renamed from: n  reason: collision with root package name */
    private int f5671n;

    /* renamed from: o  reason: collision with root package name */
    private volatile n.a<?> f5672o;

    /* renamed from: p  reason: collision with root package name */
    private File f5673p;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f5671n < this.f5670m.size();
    }

    public boolean b() {
        while (true) {
            boolean z10 = false;
            if (this.f5670m == null || !a()) {
                int i10 = this.f5668k + 1;
                this.f5668k = i10;
                if (i10 >= this.f5665h.size()) {
                    return false;
                }
                e eVar = this.f5665h.get(this.f5668k);
                File b10 = this.f5666i.d().b(new d(eVar, this.f5666i.o()));
                this.f5673p = b10;
                if (b10 != null) {
                    this.f5669l = eVar;
                    this.f5670m = this.f5666i.j(b10);
                    this.f5671n = 0;
                }
            } else {
                this.f5672o = null;
                while (!z10 && a()) {
                    List<n<File, ?>> list = this.f5670m;
                    int i11 = this.f5671n;
                    this.f5671n = i11 + 1;
                    this.f5672o = list.get(i11).b(this.f5673p, this.f5666i.s(), this.f5666i.f(), this.f5666i.k());
                    if (this.f5672o != null && this.f5666i.t(this.f5672o.f9920c.a())) {
                        this.f5672o.f9920c.d(this.f5666i.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
        }
    }

    public void c(Exception exc) {
        this.f5667j.a(this.f5669l, exc, this.f5672o.f9920c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f5672o;
        if (aVar != null) {
            aVar.f9920c.cancel();
        }
    }

    public void f(Object obj) {
        this.f5667j.d(this.f5669l, obj, this.f5672o.f9920c, a.DATA_DISK_CACHE, this.f5669l);
    }

    c(List<e> list, g<?> gVar, f.a aVar) {
        this.f5668k = -1;
        this.f5665h = list;
        this.f5666i = gVar;
        this.f5667j = aVar;
    }
}
